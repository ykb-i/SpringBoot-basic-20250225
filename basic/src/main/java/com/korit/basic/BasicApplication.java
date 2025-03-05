package com.korit.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.korit.basic.dto.Lombok;

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicApplication.class, args);
	}

	void method(){
		// 회식배경에 회색글씨면 IDE가 리터럴 형태로 변수에 어떤값이 들어가있는지 알려주는 것이다.(헷갈리지 말것)
		Lombok lombok1 = new Lombok("a", 1, false, true);
		Lombok lombok2 = new Lombok("a", 1);

		// 참조형은 get, 객체형은 is로 시작한다.
		lombok1.getField1();
		lombok1.getField2();
		lombok1.isField3();

		lombok2.setField3(false);
		lombok2.setField4(null);
	}
}
