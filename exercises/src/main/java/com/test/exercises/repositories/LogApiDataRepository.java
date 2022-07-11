package com.test.exercises.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.exercises.persistence_entities.LogApiData;

public interface LogApiDataRepository extends JpaRepository<LogApiData, Long> {
    
}
