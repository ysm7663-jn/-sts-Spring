package com.korea.simple2.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.korea.simple2.dao.SimpleDao;

public class SimpleDeleteCommand implements SimpleCommand {

	@Autowired
	private SimpleDao simpleDao;
	
	@Override
	public void execute(Model model) {
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		simpleDao.simpleDelete(Integer.parseInt(request.getParameter("no")));

	}

}
