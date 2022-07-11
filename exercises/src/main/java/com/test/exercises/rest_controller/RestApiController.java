package com.test.exercises.rest_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.exercises.entities.FindSumPrimeNumbersDTO;
import com.test.exercises.services.LogApiDataService;
import com.test.exercises.services.CountryService;
import com.test.exercises.services.PrimeNumbersService;
import com.test.utils.soap_test.Currency;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/rest")
@Log4j2
public class RestApiController {
    
	@Autowired
    CountryService countryService;

    @Autowired
    PrimeNumbersService primeNumbersService;

	@Autowired
	LogApiDataService logApiDataService;

	@GetMapping("/findCountryCurrency")
	ResponseEntity<Currency> getCountryCurrency(String countryName){
		if(countryName == null || countryName.isBlank()){
			log.info("CountryName must not be null or blank.");
			logApiDataService.saveLog(countryName, "CountryName must not be null or blank.", "REST", "400");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		String currencyISOCode = countryService.getCurrencyISOCode(countryName);
		Currency currency = new Currency();
		currency.setCurrencyISOCode(currencyISOCode != null && !currencyISOCode.isBlank() ? currencyISOCode : "");
		log.info("Returning the Currency ISO Code of the following country: " + countryName);
		logApiDataService.saveLog(countryName, currency.getCurrencyISOCode(), "REST", "200");
		return ResponseEntity.ok(currency);
	}

	@PostMapping("/findSumPrimeNumber")
	ResponseEntity<FindSumPrimeNumbersDTO> findSumPrimeNumbers(@RequestBody FindSumPrimeNumbersDTO request){
		if(request.getNumber() == null){
			log.info("Number must not be null.");
			logApiDataService.saveLog(null, "Number must not be null.", "REST", "400");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		FindSumPrimeNumbersDTO response = new FindSumPrimeNumbersDTO();
		response.setNumber(primeNumbersService.findAndSumPrimes(request.getNumber()));
		log.info("Returning the sum of all the prime numbers until: " + request.getNumber());
		logApiDataService.saveLog(request.getNumber().toString(), response.getNumber().toString(), "REST", "200");
		return ResponseEntity.ok(response);
	}
    
}
