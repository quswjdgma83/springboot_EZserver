package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AjjaxWorkspace3Application {

	public static void main(String[] args) {
		SpringApplication.run(AjjaxWorkspace3Application.class, args);
	}

}

//package com.example.demo;
//
//import java.util.HashMap;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///*
// * @RestController : 자바 객체를 JSON 형태로 바꿔준다.
// * 자동 임포트 : command + shift + o
// * HashMap, Dictionary, JSON 모두 동일한 구조
// * 키와 값 쌍으로 구성되는 데이터를 저장해서 데이터를 읽고 쓸 때 키 값을 찾아서 읽고 쓴다.
// * */
//@RestController
//@RequestMapping(value="")
//public class HelloController {
//	@GetMapping("getUserInfo")
//	public HashMap<String, String> getUserInfo(){
//		HashMap<String, String> map = new HashMap<String, String>();
//
//		map.put("name", "홍길동");
//		map.put("phone", "010-9999-1111");
//		map.put("address", "서울시 관악");
//	}
//}
