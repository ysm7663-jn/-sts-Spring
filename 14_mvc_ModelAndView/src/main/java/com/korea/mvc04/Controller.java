package com.korea.mvc04;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

	/*
	 	ModelAndView 클래스
	 	1. 스프링2 이전에 사용하던 클래스로 (아마도) 현재 많이 생산되어 있는 코드
	 	2. 앞으로 새로 만드는 프로젝트에서는 사용을 지양하는 것이 좋다
	 	(구글링하다 ModelAndView가 보인다면 뒤로 가기)
	 	3. Model과 View를 모두 처리하는 클래스
	 	4. Model은 request라고 생각하면 편리
	 		- Model은 Controller가 JSP에게 전달하고자 하는 데이터를 속성(attribute)으로 저장하는 클래스
	 		- attribute를 추가하는 메소드 : addObject()
	 	5. View는 JSP를 의미
	 		- view name을 추가하는 메소드 : setViewName()
	 */
	
	@RequestMapping("")
	public String goIndex() {
		return "index";
	}
	
	// ModelAndView 사용하기
	
	// 1. 단순 이동
	@RequestMapping("v01")	// Mapping과 이동경로가 달라도 전혀 상관 없다
	// URL 입력 : v01로 해야 결과가 나옴
	public ModelAndView goView01() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("view01");
		return mav;
	}
	
	// 지금까지 JSP로 이동하는 방식은 
	// 100% forward였다. redirect.하는 방법은 나중에
	
	// forward이기 때문에 JSP로 데이터를 보낼 수 있다.
	
	@RequestMapping("v02")
	public ModelAndView goView02() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("view02");
		
		// view02.jsp로 보낼 데이터를 저장
		mav.addObject("name","에밀리");
		mav.addObject("age", 20);
		
		return mav;
	}
}
