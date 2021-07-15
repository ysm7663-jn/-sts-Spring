package com.korea.mybatis2.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.korea.mybatis2.command.SimpleCommand;
import com.korea.mybatis2.command.SimpleDeleteCommand;
import com.korea.mybatis2.command.SimpleInsertCommand;
import com.korea.mybatis2.command.SimpleListCommand;
import com.korea.mybatis2.command.SimpleUpdateCommand;
import com.korea.mybatis2.command.SimpleViewCommand;
import com.korea.mybatis2.dto.SimpleDto;

@Controller
public class SimpleController {
	
	// field로 SqlSession sqlSession을 만들어 둡니다.
	
	// root-context.xml을 참고해서 그대로 만들자면
	// SqlSessionTemplate sqlSession; 이것을 생성해야 하지만,
	// SqlSession sqlSession; 으로 바꿔서 생성하고 있습니다.

	@Autowired
	private SqlSession sqlSession;
	
	private SimpleCommand command;
	
	@RequestMapping(value="/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="simpleListPage.do", method=RequestMethod.GET)
	public String simpleListPage(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		command = new SimpleListCommand();
		command.execute(sqlSession, model);
		return "simple/simpleListPage";
	}
	
	@RequestMapping(value="simpleInsertPage.do", method=RequestMethod.GET)
	public String simpleInsertPage() {
		return "simple/simpleInsertPage";
	}
	
	@RequestMapping(value="simpleInsert.do", method=RequestMethod.POST)
	public String simpleInsert(HttpServletRequest request, Model model, RedirectAttributes rttr) {
		model.addAttribute("request", request);
		model.addAttribute("rttr", rttr);
		command = new SimpleInsertCommand();
		command.execute(sqlSession, model);
		return "redirect:simpleListPage.do";
	}
	
	@RequestMapping(value="simpleViewPage.do", method=RequestMethod.GET)
	public String simpleViewPage(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		command = new SimpleViewCommand();
		command.execute(sqlSession, model);
		return "simple/simpleViewPage";
	}
	
	@RequestMapping(value="simpleUpdatePage.do", method=RequestMethod.POST)
	public String simpleUpdatePage(@ModelAttribute("simpleDto") SimpleDto simpleDto) {
		return "simple/simpleUpdatePage";
	}
	
	@RequestMapping(value="simpleUpdate.do", method=RequestMethod.POST)
	public String simpleUpdate(HttpServletRequest request, RedirectAttributes rttr, Model model) {
		model.addAttribute("request", request);
		model.addAttribute("rttr",rttr);
		command = new SimpleUpdateCommand();
		command.execute(sqlSession, model);
		return "redirect:simpleViewPage.do?no=" + request.getParameter("no");
	}
	
	@RequestMapping(value="simpleDelete.do", method=RequestMethod.POST)
	public String simpleDelete(HttpServletRequest request, RedirectAttributes rttr, Model model) {
		model.addAttribute("request", request);
		model.addAttribute("rttr", rttr);
		command = new SimpleDeleteCommand();
		command.execute(sqlSession, model);
		return "redirect:simpleListPage.do";
	}

	
}
