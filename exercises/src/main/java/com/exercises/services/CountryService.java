package com.exercises.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercises.soap_configuration.CountryClient;
import com.test.utils.soap_methods.FullCountryInfoAllCountriesResponse;
import com.test.utils.soap_methods.TCountryInfo;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class CountryService {
    @Autowired CountryClient client;

    public String getCurrencyISOCode(String countryName){
        log.info("Acessing the SOAP webservice to get all countries info");
        FullCountryInfoAllCountriesResponse res = client.getCountries();
		List<TCountryInfo> list = res.getFullCountryInfoAllCountriesResult().getTCountryInfo();
		Optional<TCountryInfo> find = list.stream().filter(l -> l.getSName().equals(countryName)).findFirst();
        log.info("Filtering the given country list to get the Currency Country ISO code of: " + countryName);
        return find.get().getSCurrencyISOCode();
    }
}