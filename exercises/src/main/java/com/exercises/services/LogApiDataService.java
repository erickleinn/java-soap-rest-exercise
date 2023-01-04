package com.exercises.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercises.persistence_entities.LogApiData;
import com.exercises.repositories.LogApiDataRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class LogApiDataService {

    @Autowired
    LogApiDataRepository repository;

    public LogApiData saveLog(String request, String response, String type, String status){
        LogApiData saveData = new LogApiData();
        saveData.setRequest(request);
        saveData.setResponse(response);
        saveData.setType(type);
        saveData.setStatus(status);
        log.info("Persisting request, response and API type on the database.");
        return repository.save(saveData);
    }
}
