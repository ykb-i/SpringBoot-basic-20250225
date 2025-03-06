package com.korit.basic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korit.basic.dto.GetUserResponseDto;
<<<<<<< HEAD
=======
import com.korit.basic.dto.GetUserListResponseDto;
>>>>>>> ada7c51 (2025-03-06)
import com.korit.basic.dto.PostUserRequestDto;
import com.korit.basic.dto.ResponseDto;
import com.korit.basic.service.UserService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping()
    public ResponseEntity<ResponseDto> postUser(
        @RequestBody @Valid PostUserRequestDto requestBody
    ){
        ResponseEntity<ResponseDto> response = userService.postUser(requestBody);
        return response;
    }

<<<<<<< HEAD
=======
    @GetMapping()
    public ResponseEntity<? super GetUserListResponseDto> getUserList(){
        ResponseEntity<? super GetUserListResponseDto> response = 
    }

>>>>>>> ada7c51 (2025-03-06)
    // controller에서 무엇을 반환하는지 한눈에 보이게 해야됨
    // super : 자기 혹은 자기자신의 부모를 받을 수 있음
    @GetMapping("/{userId}")
    // <? extends ResponseDto>
    public ResponseEntity<? super GetUserResponseDto> getUser(
        @PathVariable("userId") String userId
    ){
        ResponseEntity<? super GetUserResponseDto> response = userService.getUser(userId);
        return response;
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<ResponseDto> deleteUser(
        @PathVariable("userId") String userId
    ){
        ResponseEntity<ResponseDto> response = userService.deleteUser(userId);
        return response;
    }
}
