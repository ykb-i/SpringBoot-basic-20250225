package com.korit.basic.service;

import org.springframework.http.ResponseEntity;

import com.korit.basic.dto.PostUserRequestDto;
import com.korit.basic.dto.ResponseDto;
import com.korit.basic.dto.GetUserResponseDto;

public interface UserService {
    
    ResponseEntity <ResponseDto> postUser(PostUserRequestDto dto);
    ResponseEntity<? super GetUserResponseDto> getUser(String userId);
    ResponseEntity <ResponseDto> deleteUser(String userId);
} 

