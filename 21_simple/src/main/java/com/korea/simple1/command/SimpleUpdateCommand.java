package com.korea.simple1.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.korea.simple1.dao.SimpleDao;
import com.korea.simple1.dto.SimpleDto;

public class SimpleUpdateCommand implements SimpleCommand {

	@Override
	public void execute(Model model) {

		Map<String, Object> map = model.asMap();
		
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		SimpleDto simpleDto = new SimpleDto();
		
		simpleDto.setNo(Integer.parseInt(request.getParameter("no")));
		simpleDto.setTitle(request.getParameter("title"));
		simpleDto.setContent(request.getParameter("content"));
		
		SimpleDao.getInsetance().simpleUpdate(simpleDto);
		
	}

}
