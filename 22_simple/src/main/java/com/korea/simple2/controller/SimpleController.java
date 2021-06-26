package com.korea.simple2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.korea.simple2.command.SimpleInsertCommand;
import com.korea.simple2.command.SimpleListCommand;

@Controller
public class SimpleController {
	
	private SimpleListCommand simpleListCommand;
	private SimpleInsertCommand simpleInsertCommand;
	
	@Autowired
	public void setCommand(SimpleListCommand simpleListCommand, SimpleInsertCommand simpleInsertCommand) {
		this.simpleListCommand = simpleListCommand;
		this.simpleInsertCommand = simpleInsertCommand;
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="simpleListPage.do")
	public String simpleListPage(Model model) {
		simpleListCommand.execute(model);
		return "simple/simpleListPage";
	}
	
	@RequestMapping(value="simpleInsertPage.do", method=RequestMethod.GET)
	public String simpleInsertPage() {
		return "simple/simpleInsertPage";
	}
	
	@RequestMapping(value="simpleInsert.do")
	public String simpleInsert(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		simpleInsertCommand.execute(model);
		return "redirect:simpleListPage.do";
		
	}

}
