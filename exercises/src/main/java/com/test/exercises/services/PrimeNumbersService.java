package com.test.exercises.services;

import org.springframework.stereotype.Service;

@Service
public class PrimeNumbersService {
    public Integer findAndSumPrimes(Integer prime){
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
