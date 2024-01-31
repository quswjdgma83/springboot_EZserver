package com.example.demo;

import java.util.HashMap;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

/*
 * @RestController : 자바 객체를 JSON 형태로 바꿔준다.
 * 자동 임포트 : command + shift + o
 * HashMap, Dictionary, JSON 모두 동일한 구조
 * 키와 값 쌍으로 구성되는 데이터를 저장해서 데이터를 읽고 쓸 때 키 값을 찾아서 읽고 쓴다.
 * {"name":"홍길동", "phone":"010-9999-1111"} 형태
 * 기본포트 번호가 8080
 * */

@CrossOrigin("*")
@RestController
@RequestMapping(value="")
public class HelloController {
	
	@GetMapping("getUserInfo")
	public HashMap<String, String> getUserInfo(){
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("name", "홍길동");
		map.put("phone", "010-9999-1111");
		map.put("address", "서울시 관악구");
		
		return map;
	}
	
	// GET /add1?x=5&y=7
	@GetMapping("add1")
	public HashMap<String, Object> add1(
			@RequestParam("x") int x,
			@RequestParam("y") int y
	){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("x", x);
		map.put("y", y);
		map.put("result", x+y);
		return map;
	}
	
	// GET /add2/5/7
	@GetMapping("add2/{x}/{y}")
	public HashMap<String, Object> add2(
			@PathVariable("x") int x,
			@PathVariable("y") int y
	){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("x", x);
		map.put("y", y);
		map.put("result", x+y);
		return map;
	}
	
	// POST /add3
	@PostMapping("add3")
	public HashMap<String, Object> add3(
			@RequestParam("x") int x,
			@RequestParam("y") int y
	){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("x", x);
		map.put("y", y);
		map.put("result", x+y);
		return map;
	}
	
	// POST /add4
	@PostMapping("/add4")
	public HashMap<String, Object> add4(
			@RequestBody HashMap<String, String> map
	){
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		
		int x = Integer.parseInt(map.get("x").toString());
		int y = Integer.parseInt(map.get("y").toString());
		
		resultMap.put("x", x);
		resultMap.put("y", y);
		
		resultMap.put("result", x+y);
		
		return resultMap;
	}
	
	// POST /payment
	@PostMapping("payment")
	public HashMap<String, Object> payment(
			@RequestBody HashMap<String, String> map
	){
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		
		String name = map.get("name").toString();
		int workTime = Integer.parseInt(map.get("workTime").toString());
		int payPerTime = Integer.parseInt(map.get("payPerTime").toString());
		
		resultMap.put("name", name);
		resultMap.put("workTime", workTime);
		resultMap.put("payPerTime", payPerTime);
		
		resultMap.put("result", workTime*payPerTime);
		
		return resultMap;
	}
}
