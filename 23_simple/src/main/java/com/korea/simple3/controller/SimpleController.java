package com.korea.simple3.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.korea.simple3.command.SimpleInsertCommand;
import com.korea.simple3.command.SimpleListCommand;
import com.korea.simple3.command.SimpleViewCommand;
import com.korea.simple3.config.AppContext;

@Controller
public class SimpleController {
	
	// field
	private AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
	
	@RequestMapping(value="/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="simpleListPage.do")
	public String simpleListPage(Model model) {
		SimpleListCommand simpleListCommand = ctx.getBean("listCommand", SimpleListCommand.class);
		simpleListCommand.execute(model);
		
		return "simple/simpleListPage";
	}
	
	@RequestMapping(value="simpleInsertPage.do")
	public String simpleInsertPage() {
		return "simple/simpleInsertPage";
	}
	
	@RequestMapping(value="simpleInsert.do")
	public String simpleInsert(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		SimpleInsertCommand simpleInsertCommand = ctx.getBean("insertCommand", SimpleInsertCommand.class);
		simpleInsertCommand.execute(model);
		return "redirect:simpleListPage.do";
	}
	
	@RequestMapping(value="simpleViewPage.do")
	public String simpleViewPage(HttpServletRequest request, Model model) {
	
		model.addAttribute("request", request);
		SimpleViewCommand simpleViewCommand = ctx.getBean("viewCommand", SimpleViewCommand.class);
		simpleViewCommand.execute(model);
		return "simple/simpleViewPage";
		
	}

}
