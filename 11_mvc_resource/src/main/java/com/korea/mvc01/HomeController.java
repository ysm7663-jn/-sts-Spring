package com.korea.mvc01;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Controller
 * : 일반 Java Class로 만들면 된다.
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * @RequestMapping
	 * : URLMapping값을 처리하는 메소드
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );	/* 뷰(JSP)에 전달하는 값 */
		
		return "home";	/* 뷰(JSP)의 이름 */
		
		// servlet-context.xml에 정의되어 있는 뷰 리졸버가 return "home"; 을 처리한다.
		// 1. 앞에 /WEB-INF/views를 추가한다.
		// 2. 뒤에 .jsp를 추가한다.
		
		// return "home"은
		// return "/WEB-INF/views/home.jsp"를 의미
		
	}
	
}
