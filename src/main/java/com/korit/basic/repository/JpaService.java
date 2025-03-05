package com.korit.basic.repository;

import org.springframework.http.ResponseEntity;

public interface JpaService {
    ResponseEntity<String> createSampleTable1();
    
}
