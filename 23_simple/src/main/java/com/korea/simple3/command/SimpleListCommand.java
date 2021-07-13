package com.korea.simple3.command;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.ui.Model;

import com.korea.simple3.config.AppContext;
import com.korea.simple3.dao.SimpleDao;

public class SimpleListCommand implements SimpleCommand {

	@Override
	public void execute(Model model) {
		
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		
		SimpleDao simpleDao = ctx.getBean("simpleDao", SimpleDao.class);
		
		model.addAttribute("list", simpleDao.simpleList());
		
		ctx.close();

	}

}
