package com.test.exercises.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.exercises.entity.ApiData;

public interface ApiDataRepository extends JpaRepository<ApiData, Long> {
    
}
