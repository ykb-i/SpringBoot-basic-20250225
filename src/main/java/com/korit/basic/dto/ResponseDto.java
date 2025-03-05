package com.korit.basic.dto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ResponseDto {
    private String code;
    private String message;

    public static ResponseEntity<ResponseDto> success(HttpStatus status){
        ResponseDto responseBody = new ResponseDto("SU", "Success.");
        return ResponseEntity.status(status).body(responseBody);
    }

    public static ResponseEntity<ResponseDto> databaseError(){
        ResponseDto responseBody = new ResponseDto("DE", "Database Error.");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseBody);
    }

    public static ResponseEntity<ResponseDto> duplicatedId(){
        ResponseDto responseBody = new ResponseDto("DI", "Duplicated Id.");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }

    public static ResponseEntity<ResponseDto> duplicatedTelNumber(){
        ResponseDto responseBody = new ResponseDto("DT", "Duplicated Tel Number.");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }

    public static ResponseEntity<ResponseDto> noExistUser(){
        ResponseDto responseBody = new ResponseDto("NU", "No Exist User.");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }
}
