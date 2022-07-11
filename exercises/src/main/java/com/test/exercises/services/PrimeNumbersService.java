package com.test.exercises.services;

import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class PrimeNumbersService {
    public Integer findAndSumPrimes(Integer prime){
        log.info("Calculating the sum of all prime numbers until the given number: " + prime);
        int count, result = 0; 
        for(int i = 1; i <= prime; i++) {  
            count = 0;  
            for (int j = 2; j <= i/2; j++) {      
                if(i % j== 0) {   
                    count++;  
                    break;  
                }  
            }
            if(count == 0 && i != 1 ) {       
                result += i;  
            }  
        }
       return result; 
    }
}
