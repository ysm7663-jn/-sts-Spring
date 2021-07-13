package com.korea.simple3.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.ui.Model;

import com.korea.simple3.config.AppContext;
import com.korea.simple3.dao.SimpleDao;
import com.korea.simple3.dto.SimpleDto;

public class SimpleViewCommand implements SimpleCommand {

	@Override
	public void execute(Model model) {
		
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		SimpleDao simpleDao = ctx.getBean("simpleDao", SimpleDao.class);
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		SimpleDto simpleDto = simpleDao.simpleView(Integer.parseInt(request.getParameter("no")));
		model.addAttribute("simpleDto", simpleDto);
		
		ctx.close();

	}

}
