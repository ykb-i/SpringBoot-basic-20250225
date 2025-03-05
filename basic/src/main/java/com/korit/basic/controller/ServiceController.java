package com.korit.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korit.basic.service.BasicService;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/service")
// 생성자를 이용한 의존성 주입 방법은 @Autowired를 생략할 수 있기 때문에
// lombok으로 생성자를 자동 생성하여 응용할 수 있다.
// @AllArgsConstructor
// 만약, 의존성을 선택적으로 주입하려면 의존성을 final로 지정하여
// RequiredArgsConstructor를 이용할 수 있다.
@RequiredArgsConstructor
public class ServiceController {

    // 의존성 주입(DI):
    // - 해당 모듈에 필요한 의존성을 클래스의 인스턴스를 생성하는 위치에서 주입
    // - Spring framework에서 @AutoWired을 이용하여 의존성 주입을
    //   Spring에게 위임할 수 있다.(IoC, DI)
    // - 필드를 이용한 의존성 주입, setter 메서드를 이용한 의존성 주입, 생성자를 이용한 의존성 주입
    // - 생성자를 이용한 의존성 주입 방법이 가장 안정적이므로 Spring Framework에서는 생성자를 이용한 의존성 주입을 권장
    // - 주의!: IoC를 통해 Spring에게 의존성 주입을 위임하려면 주입하려는 클래스가 Spring Bean으로 등록되어 있어야한다.

    // @AutoWired : 의존성 주입을 Spring에 위임
    // - 주입할 의존성이 반드시 Spring Bean으로 등록되어 있어야함
    
    // 1. 필드를 이용한 의존성 주입 방법
    // @Autowired
    // public BasicService basicService;

    // 2. setter 메서드를 이용한 의존성 주입 방법
    // private BasicService basicService;

    // @Autowired
    // public void setBasicService(BasicService basicService){
    //     this.basicService = basicService;
    // }

    // 3. 생성자를 이용한 의존성 주입 방법(권장 사항)
    // 생성자를 이용한 의존성 주입 방법을 사용할 땐 @Autowired를 생략해도 됨
    private final BasicService basicService;

    // @Autowired
    // public ServiceController(BasicService basicService){
    //     this.basicService = basicService;
    // }

    @GetMapping("")
    public ResponseEntity<String> getService(){
        return basicService.getService();
    }
}
