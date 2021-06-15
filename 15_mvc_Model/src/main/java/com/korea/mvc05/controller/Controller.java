package com.korea.mvc05.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.korea.mvc05.dto.PersonDto;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("/")
	public String goIndex() {
		return "index";
	}
	
	/*
	 	Model 클래스
	 	
	 	1. 스프링2 이전에는 ModelAndView 클래스를 사용했음
	 	2. 스프링2 이후에는 Model 클래스를 사용
	 	3. Model 클래스는 request의 attribute를 이용하는 클래스
	 	
	 	4. JSP	HttpServeletRequest request;
	 			requset.setAttribute(속성이름, 값);
	 			
	 	5. Spring Model model
	 			  model.addAttribute(속성이름, 값);
	 			  
	 	6. Model 클래스는 Controller에서 View(JSP)로 데이터를 넘길 때 사용
	 	7. new Model()을 하지 않고, 매개변수에 선언해서 사용 (마지막 매개변수로 선언) 
	 
	 */
	
	// 1. 단순 변수 넘기기
	@RequestMapping("v01")
	public String goView(Model model) {	// 매개변수에 Model을 선언
		
		// model에 View(JSP)로 보낼 데이터를 저장
		model.addAttribute("name", "데이빗");
		model.addAttribute("age", 25);
		
		return "view01";
		
	}
	
	// 2. Map 넘기기
	@RequestMapping("v02")
	public String goView02(Model model) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "제임스");
		map.put("age", 22);
		
		// map을 model에 저장
		model.addAttribute("map", map);
		
		return "view02";
	}
	
	// 3. PersonDto 1개 넘기기
	// com.korea.mvc05.dto 패키지에 PersonDto 생성(name, age)
	
	@RequestMapping("v03")
	public String goView03(Model model) {
		
		PersonDto personDto = new PersonDto();
		personDto.setName("아만다");
		personDto.setAge(23);
		
		model.addAttribute("personDto", personDto);
		
		return "view03";
	}
	
	// 4. PersonDto 2개를 ArrayList에 담아서 넘기기
	
	// @Autowired는 필드, 메소드에 추가할 수 있다.
	// @Autowired는 지역변수에는 추가할 수 없다
	
	// root-context.xml에 두 개의 Bean을 생성해 두었다.
	
	@Autowired // id가 person1이고, class가 PersonDto인 Bean을 자동생성
	private PersonDto person1;
	
	@Autowired // id가 person2이고, class가 PersonDto인 Bean을 자동생성
	private PersonDto person2;
	
	@RequestMapping("v04")
	public String goView04(Model model) {
		
		ArrayList<PersonDto> list = new ArrayList<PersonDto>();
		
		list.add(person1);
		list.add(person2);
		
		model.addAttribute("list", list);
		
		return "view04";
		
	}
}
