package com.korea.mybatis2.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.korea.mybatis2.command.SimpleCommand;

@Controller
public class SimpleController {
	
	// field로 SqlSession sqlSession을 만들어 둡니다.
	
	// root-context.xml을 참고해서 그대로 만들자면
	// SqlSessionTemplate sqlSession; 이것을 생성해야 하지만,
	// SqlSession sqlSession; 으로 바꿔서 생성하고 있습니다.

	@Autowired
	private SqlSession sqlSession;
	
	private SimpleCommand simpleCommand;
	

	@RequestMapping(value="/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="simpleListPage.do")
	public String simpleListPage(Model model) {
		
		
		
		return "simple/simpleListPage";
	}
	
	
}
