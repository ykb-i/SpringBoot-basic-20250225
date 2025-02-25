package com.korit.basic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




// Controller 레이어: 
// - 클라이언트와 서버간의 접점
// - 클라이언트의 요청을 받고 해당 요청에 대한 응답을 처리
// - 각 요청의 HTTP method와 url에 해당하는 메서드를 작성하는 공간

// @RestController: JSON 형태의 ResponseBody를 반환하는
// Controller일을 명시
// @Controller + @ResponseBody
// @Controller : 해당 클래스가 HTML 형태의 ResponseBody를 반환하는 Controller임을 명시
// @ResponseBody: 컨트롤러의 응답형태를 직접 조작할 수 있도록 함

@RestController

// @RequestMapping : HTTP 요청에 클래스 혹은 메서드를 URL 및 HTTP Method 등으로
// 매핑하기 위한 어노테이션
// HTTP GET 127.0.0.1:8080/basic/** 의 정보를 받아옴

@RequestMapping("/basic")
public class BasicController {
    
    // GET http://localhost:8080/basic/first
    @RequestMapping(value = "/first", method = RequestMethod.GET)
    public String firstMethod(){
        return "Spring Boot 첫번째 메소드";
    }

    // @GetMapping : RequestMapping을 GET method에 한정시킨 어노테이션
    // GET method - 클라이언트가 데이터를 받기위한 메소드
    // Request Body X / Response Body O / HTML form 사용가능

    @GetMapping("")
    public String getMethod() {
        return "GET Method";
    }

    // @PostMapping : RequestMapping을 POST method에 한정시킨 어노테이션
    // POST method - 클라이언트가 서버에 데이터를 전송하기위한 메소드
    //             - 클라이언트가 서버에 데이터를 작성하기위한 메소드
    // Request Body O / Response Body O / HTML form 사용가능

    @PostMapping("")
    public String postMethod() {
        return "POST method";
    }
    
    // @PutMapping : RequestMapping을 PUT method에 한정시킨 어노테이션
    // PUT method - 클라이언트가 서버에 데이터를 생성 혹은 수정하기 위한 메소드
    //            - 만약 전송한 데이터와 동일한 데이터가 있다면 수정
    //            - 만약 전송한 데이터와 동일한 데이터가 없다면 생성
    // Request Body O / Response Body X / HTML form 사용 못함

    @PutMapping("")
    public String putMethod() {
        return "PUT method";
    }

    // @PatchMapping : RequestMapping을 PATCH에 한정시킨 어노테이션
    // PATCH method - 클라이언트가 서버의 일부 데이터를 수정하기 위한 메소드
    // Request Body O / Response Body O / HTML form 사용 못함 

    @PatchMapping("")
    public String patchMethod(){
        return "PATCH method";
    }

    // @DeleteMapping : RequestMapping을 DELETE에 한정시킨 어노테이션
    // DELETE method - 클라이언트가 서버에 데이터를 삭제하기 위한 메소드
    // RequestBody X / ResponseBody X / HTML form 사용 못함

    @DeleteMapping("")
    public String deleteMethod(){
        return "DELETE method";
    }

    // ! 주의 HTTP Method + URL 패턴이 중복되면 런타임 에러가 발생함
    @GetMapping("/duplicate")
    public void duplicate1(){}
    
    // @GetMapping("/duplicate")
    // public void duplicate2(){}
}
