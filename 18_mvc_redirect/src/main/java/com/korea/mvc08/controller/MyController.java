package com.korea.mvc08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.korea.mvc08.dto.PersonDto;

@Controller
public class MyController {

	/*
	 	redirect >> 변화 O, 재사용 X  // DB에 변화가 생길 경우 사용
	 	ex) 회원가입 or 게시글 작성 >> 작성이 완료되었습니다(팝업) >> 홈 or 게시판으로 바로 이동 (POST + Redirect)
	 	
	 	RedirectAttributes 사용 (Session)
	 	Get 방식의 입력 페이지 >> Post 방식으로 입력 처리 >> 목록 페이지로 이동
	 	
	 	rttr.addFlashAttribute() : 아주 잠깐 데이터를 전송(일회성, 주소창에 남지 않음)
	 	rttr.addAttribute() : 데이터를 전송(주소창에 남음)
	 	
	 	forward  >> 변화 X, 재사용 O  // 단순 조회(select)
	 */
	
	
	/*
	 	@RequestMapping(value= {"/", "index"})
	 	연결되는 URLMapping 값이 2개 이상인 경우세 사용하면 된다.
	 */
	
	@RequestMapping(value= {"/", "index"}, method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="v01", method=RequestMethod.GET)
	public String goView01(PersonDto personDto, Model model) {
		
		model.addAttribute("personDto", personDto);
		
		return "view01";
	}

	@RequestMapping(value="v02", method=RequestMethod.GET)
	public String goView02(PersonDto personDto, Model model) {
		
		model.addAttribute("personDto", personDto);
		// model은 request에 데이터를 저장
		
		return "redirect:v03";	// redirect. redirect:매핑값(RequestMapping)
		// redirect는 기존의 request(model은 사용한  request)를 유지하지 않고 이동
	}
	
	@RequestMapping(value="v03")
	public String goView03() {

		// redirect:v03 으로 이동하면서 기존의 request는 다 버리고 온다.
		// 따라서, view03.jsp에는 표시되는 내용이 없다.
		
		return "view03";
	}
	
	/*
	 	redirect를 할 때 값을 전달하고 싶으면,
	 	새로운 파라미터를 만들지 말고,
	 	RedirectAttributes rttr을 선언하고, addFlashAttribute() 메소드로 값을 저장하면 된다.
	 */
	
	@RequestMapping(value="v04")
	public String goView04(PersonDto personDto, RedirectAttributes rttr) {
		
		rttr.addFlashAttribute("personDto", personDto);
		
		return "redirect:v05";
	}
	
	@RequestMapping(value="v05")
	public String goView05() {
		
		return "view05";
	}
	
}