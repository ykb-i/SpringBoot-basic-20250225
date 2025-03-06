package com.korit.basic.service;

import org.springframework.http.ResponseEntity;

import com.korit.basic.dto.PostUserRequestDto;
import com.korit.basic.dto.ResponseDto;
import com.korit.basic.dto.GetUserListResponseDto;
import com.korit.basic.dto.GetUserResponseDto;
import com.korit.basic.dto.PatchUserRequestDto;

public interface UserService {
    
    ResponseEntity <ResponseDto> postUser(PostUserRequestDto dto);
    ResponseEntity<? super GetUserListResponseDto> getUserList();
    ResponseEntity<? super GetUserResponseDto> getUser(String userId);
    ResponseEntity<ResponseDto> patchUser(String userId, PatchUserRequestDto dto);
    ResponseEntity<ResponseDto> deleteUser(String userId);
    
} 

