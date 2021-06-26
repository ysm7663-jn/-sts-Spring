package com.korea.simple2.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.korea.simple2.dao.SimpleDao;

public class SimpleListCommand implements SimpleCommand {
	
	@Autowired
	private SimpleDao simpleDao;

	@Override
	public void execute(Model model) {
		
		model.addAttribute("list", simpleDao.simpleList());

	}

}
