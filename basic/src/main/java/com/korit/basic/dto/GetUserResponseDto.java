package com.korit.basic.dto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.korit.basic.entity.UserEntity;

import lombok.Getter;

@Getter
// ResponseDto의 code와 message를 이용하기 위해서 상속받음
public class GetUserResponseDto extends ResponseDto{
    private String userId;
    private String userName;
    private String userAddress;

    private GetUserResponseDto(UserEntity userEntity){
        super("SU","Success");
        this.userId = userEntity.getUserId();
        this.userName = userEntity.getUserName();
        this.userAddress = userEntity.getUserAddress();
    }

    public static ResponseEntity<GetUserResponseDto> success(UserEntity userEntity){
        GetUserResponseDto responseBody = new GetUserResponseDto(userEntity);
        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }
    
}

