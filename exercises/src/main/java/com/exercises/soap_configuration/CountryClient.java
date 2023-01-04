package com.exercises.soap_configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
    
    @Value("${COUNTRIES_EXTERNAL_WSDL_LINK}")
    private String wsdlLink;

    public FullCountryInfoAllCountriesResponse getCountries(){
        template = new WebServiceTemplate(marshaller);
        FullCountryInfoAllCountries request = new FullCountryInfoAllCountries();
        FullCountryInfoAllCountriesResponse response = (FullCountryInfoAllCountriesResponse) template.marshalSendAndReceive(wsdlLink, request);
        return response;
    }
}   
