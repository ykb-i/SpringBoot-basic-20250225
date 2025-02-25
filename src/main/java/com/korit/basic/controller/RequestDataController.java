package com.korit.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/request-data")
public class RequestDataController {

    // @RequestParam(): Query String Parameter로 매개변수를 받는 방법
    // Query String Parameter - URL에 쿼리를 추가하여 데이터를 전송하는 방법(/path?name=value&name=value)
    
    // GET http://127.0.0.1:8080/request-data/reqeust-param
    // null이 올 수도 있기 때문에 데이터 타입은 참조형으로 사용한다.
    @GetMapping("/request-param")
    public String requestParam(
        @RequestParam("name") String name,
        @RequestParam(name = "age", required = false) Integer age
    ){
        return "이름: " + name + " 나이: " + age;
    }
}
