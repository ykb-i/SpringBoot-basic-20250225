package com.korit.basic.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// RestController : 객체를 json 형태로 변경해서 보내줌
//                  클래스에 대한 인스턴스 생성이 가능함
@RestController
@RequestMapping("/response-data")
public class ResponseDataController {
    
    @GetMapping("/{name}")
    public ResponseDto getResponseBody(
        @PathVariable ("name") String name
    ){
        ResponseDto response = new ResponseDto(name, new Date());
        return response;
    }
        
    // ResponseEntity:
    // - Response의 Header, Status code, Status message, Body를 직접 조작할 수 있도록 도와주는 클래스 
    // - 메서드의 반환타입을 ResponseEntity로 지정
    // - ResponseEntity의 제너릭을 이용하여 Response Body의 타입을 지정해야함

    @GetMapping("/response-entity/{name}")
    public ResponseEntity<ResponseDto> responseEntity(
        @PathVariable ("name") String name
    ){
        ResponseDto response = new ResponseDto(name, new Date());
        // return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(response);
    }
}

// Getter가 없으면 값을 읽을 수 없다.
@Getter
@AllArgsConstructor
class ResponseDto{
    private String name;
    private Date now;
}

