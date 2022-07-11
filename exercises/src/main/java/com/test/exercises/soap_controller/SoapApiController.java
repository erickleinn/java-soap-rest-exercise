package com.test.exercises.soap_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.test.exercises.services.LogApiDataService;
import com.test.exercises.services.CountryService;
import com.test.exercises.services.PrimeNumbersService;
import com.test.utils.soap_test.Currency;
import com.test.utils.soap_test.GetCountryCurrencyRequest;
import com.test.utils.soap_test.GetCountryCurrencyResponse;
import com.test.utils.soap_test.GetPrimeNumberRequest;
import com.test.utils.soap_test.GetPrimeNumberResponse;

import lombok.extern.log4j.Log4j2;


@Endpoint
@Log4j2
public class SoapApiController {

    private static final String NAMESPACE_URI = "http://com/test/utils/soap_test";

    @Autowired
    CountryService countryService;

    @Autowired
    PrimeNumbersService primeNumbersService;

    @Autowired
    LogApiDataService logApiDataService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryCurrencyRequest")
    @ResponsePayload
    public GetCountryCurrencyResponse getCountryCurrency(@RequestPayload GetCountryCurrencyRequest request) {
        GetCountryCurrencyResponse response = new GetCountryCurrencyResponse();
        Currency currency = new Currency();
        String currencyISOCode = countryService.getCurrencyISOCode(request.getCountryName());
        currency.setCurrencyISOCode(currencyISOCode != null && !currencyISOCode.isBlank() ? currencyISOCode : "");
        response.setCurrency(currency);
        log.info("Returning the Currency ISO Code of the following country: " + request.getCountryName());
        logApiDataService.saveLog(request.getCountryName(), currency.getCurrencyISOCode(), "SOAP", "SUCCESS");
        return response;

    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPrimeNumberRequest")
    @ResponsePayload
    public GetPrimeNumberResponse findSumPrimeNumbers(@RequestPayload GetPrimeNumberRequest request) {
        GetPrimeNumberResponse response = new GetPrimeNumberResponse();
        response.setResult(primeNumbersService.findAndSumPrimes(request.getNumber()));
        log.info("Returning the sum of all the prime numbers until: " + request);
        logApiDataService.saveLog(String.valueOf(request.getNumber()), String.valueOf(response.getResult()), "SOAP", "SUCCESS");
        return response;
    }
}