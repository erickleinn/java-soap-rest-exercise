package com.test.exercises.services;

import org.springframework.stereotype.Service;

@Service
public class PrimeNumbersService {

    public Integer findAndSumPrimes(Integer prime){
        Integer result = 0;
        for(int i = 2; i <= prime; i++){
            if(isPrime(i))
                result += i;
        }
        return result;
    }

    public Boolean isPrime(Integer number){
        for(int i = 2; i < number ; i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
