package com.test.exercises.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.exercises.entity.ApiData;
import com.test.exercises.repositories.ApiDataRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ApiDataService {

    @Autowired
    ApiDataRepository repository;

    public ApiData saveLog(String request, String response, String type){
        ApiData saveData = new ApiData();
        saveData.setRequest(request);
        saveData.setResponse(response);
        saveData.setType(type);
        log.info("Persisting request, response and API type on the database.");
        return repository.save(saveData);
    }
}
