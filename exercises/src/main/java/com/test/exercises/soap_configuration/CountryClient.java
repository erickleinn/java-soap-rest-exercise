package com.test.exercises.soap_configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.test.utils.soap_methods.FullCountryInfoAllCountries;
import com.test.utils.soap_methods.FullCountryInfoAllCountriesResponse;


@Service
public class CountryClient {

    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;

    public FullCountryInfoAllCountriesResponse getCountries(){
        template = new WebServiceTemplate(marshaller);
        FullCountryInfoAllCountries request = new FullCountryInfoAllCountries();
        FullCountryInfoAllCountriesResponse response = (FullCountryInfoAllCountriesResponse) template.marshalSendAndReceive("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso", request);
        return response;
    }

    /*public CurrencyNameResponse getCurrency(String isoCode){
        template = new WebServiceTemplate(marshaller);
        CurrencyName request = new CurrencyName();
        request.setSCurrencyISOCode(isoCode);
        CurrencyNameResponse response = (CurrencyNameResponse) template.marshalSendAndReceive("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso", request);
        return response;
    }*/


}   
