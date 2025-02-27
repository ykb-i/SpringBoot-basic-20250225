package com.korit.basic.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.korit.basic.service.BasicService;
import org.springframework.http.HttpStatus;

// @Component: 해당 클래스를 Spring Bean으로 등록해서 인스턴스 생성 작업을
//             Spring에게 위임 할 수 있도록 함

// @Component

// @Service : 실제 기능은 @Component와 동일하나 가독성을 위해 이름을 Service로 지정한 어노테이션
@Service
public class BasicServiceImplement implements BasicService{
    
    @Override
    public ResponseEntity<String> getService(){
        return ResponseEntity.status(HttpStatus.OK).body("서비스호출!");
    }
}
