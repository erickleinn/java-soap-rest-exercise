package com.test.exercises.rest_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.exercises.services.CountryService;
import com.test.exercises.services.PrimeNumbersService;
import com.test.utils.soap_test.Currency;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/rest")
@Log4j2
public class RestEndpoint {
    
	@Autowired
    CountryService countryService;

    @Autowired
    PrimeNumbersService primeNumbersService;

	@GetMapping("/findCountryCurrency")
	ResponseEntity<Currency> getCountryCurrency(@RequestParam("countryName") String countryName){
		if(countryName == null || countryName.isBlank()){
			log.info("CountryName must not be null or blank.");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		String currencyISOCode = countryService.getCurrencyISOCode(countryName);
		Currency currency = new Currency();
		currency.setCurrencyISOCode(currencyISOCode != null && !currencyISOCode.isBlank() ? currencyISOCode : "");
		log.info("Returning the Currency ISO Code of the following country: " + countryName);
		return ResponseEntity.ok(currency);
	}

	@GetMapping("/findSumPrimeNumber")
	ResponseEntity<Integer> findSumPrimeNumbers(@RequestParam("number") Integer number){
		if(number == null){
			log.info("Number must not be null");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		log.info("Returning the sum of all the prime numbers until: " + number);
		return ResponseEntity.ok(primeNumbersService.findAndSumPrimes(number));
	}
    
}
