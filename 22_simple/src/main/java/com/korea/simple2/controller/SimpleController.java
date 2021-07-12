package com.korea.simple2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.korea.simple2.command.SimpleDeleteCommand;
import com.korea.simple2.command.SimpleInsertCommand;
import com.korea.simple2.command.SimpleListCommand;
import com.korea.simple2.command.SimpleUpdateCommand;
import com.korea.simple2.command.SimpleViewCommand;
import com.korea.simple2.dto.SimpleDto;

@Controller
public class SimpleController {
	
	private SimpleListCommand simpleListCommand;
	private SimpleInsertCommand simpleInsertCommand;
	private SimpleViewCommand simpleViewCommand;
	private SimpleDeleteCommand simpleDeleteCommand;
	private SimpleUpdateCommand simpleUpdateCommand;
	
	@Autowired
	public void setCommand(SimpleListCommand simpleListCommand, 
			SimpleInsertCommand simpleInsertCommand, 
			SimpleViewCommand simpleViewCommand, 
			SimpleDeleteCommand simpleDeleteCommand, 
			SimpleUpdateCommand simpleUpdateCommand) {
		this.simpleListCommand = simpleListCommand;
		this.simpleInsertCommand = simpleInsertCommand;
		this.simpleViewCommand = simpleViewCommand;
		this.simpleDeleteCommand = simpleDeleteCommand;
		this.simpleUpdateCommand = simpleUpdateCommand;
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
	
	@RequestMapping(value="simpleViewPage.do") 
	public String simpleViewPage(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		simpleViewCommand.execute(model);
		return "simple/simpleViewPage";
	}
	
	@RequestMapping(value="simpleDelete.do", method=RequestMethod.POST)
	public String simpleDelete (HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		simpleDeleteCommand.execute(model);
		return "redirect:simpleListPage.do";
	}
	
	@RequestMapping(value="simpleUpdatePage.do", method=RequestMethod.POST)
	public String simpleUpdatePage(SimpleDto simpleDto, Model model) {
		model.addAttribute("simpleDto", simpleDto);
		return "simple/simpleUpdatePage";
	}
	
	@RequestMapping(value="simpleUpdate.do", method=RequestMethod.POST)
	public String simpleUpdate(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		simpleUpdateCommand.execute(model);
		return "redirect:simpleViewPage.do?no=" + request.getParameter("no");
	}
	
}
