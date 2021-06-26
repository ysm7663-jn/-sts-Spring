package com.korea.simple2.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.korea.simple2.dao.SimpleDao;
import com.korea.simple2.dto.SimpleDto;

public class SimpleInsertCommand implements SimpleCommand {
	
	private SimpleDao simpleDao;

	@Override
	public void execute(Model model) {

		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		SimpleDto simpleDto = new SimpleDto();
		simpleDto.setWriter(writer);
		simpleDto.setTitle(title);
		simpleDto.setContent(content);
		
		simpleDao.simpleInsert(simpleDto);
		
	}

}
