package com.korea.simple1.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.korea.simple1.dao.SimpleDao;
import com.korea.simple1.dto.SimpleDto;

public class SimpleInsertCommand implements SimpleCommand {

	@Override
	public void execute(Model model) {

		// 전달 받은 model에는 request가 들어 있고
		// 그걸 꺼내야 한다.
		
		// model에 저장된 속성을 직접 꺼내는 방법은 없다.
		// 대신 model은 Map으로 바꾸는 것이 가능 (asMap() 메소드)
		
		// Map으로 바꾸고 나면 Map에서 꺼내는 메소드인 get() 메소드를 이용해서 꺼내면 된다.
		
		Map<String, Object> map = model.asMap();
		
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		// model에 저장된 속성(attribute)을 키 값으로 사용하면 된다.
		
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		SimpleDto simpleDto = new SimpleDto();
		simpleDto.setWriter(writer);
		simpleDto.setTitle(title);
		simpleDto.setContent(content);
		
		SimpleDao.getInsetance().simpleInsert(simpleDto);
		
	}

}
