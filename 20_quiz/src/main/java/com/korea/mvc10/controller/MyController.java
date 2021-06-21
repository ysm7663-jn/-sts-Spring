package com.korea.mvc10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.korea.mvc10.dto.Calculator;

@Controller
public class MyController {
	
	@RequestMapping(value= {"/", "index"}, method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="calc", method=RequestMethod.GET)
	public String calc(Calculator calculator, Model model) {
		
		// 뷰(JSP)로 전달할 데이터를 model에 저장
		// 저장할 때 속성(attribute)으로 저장 (파라미터가 아니다)
		model.addAttribute("calculator", calculator);
		
		calculator.setResult();	// 연산이 수행됨
		if (calculator.getViewName().equals("result")) {
			return calculator.getViewName();	// forward (result.jsp가 뷰인 경우)
		} else {
			return "redirect: " + calculator.getViewName();	// index.jsp로 이동하는 매핑값(index)를 이용
			// return "redirect:/";	// index.jsp로 이동하는 매핑값(/)을 이용
		}
	}

}
