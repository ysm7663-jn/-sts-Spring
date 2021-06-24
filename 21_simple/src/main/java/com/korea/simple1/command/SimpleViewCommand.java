package com.korea.simple1.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.korea.simple1.dao.SimpleDao;
import com.korea.simple1.dto.SimpleDto;

public class SimpleViewCommand implements SimpleCommand {

	@Override
	public void execute(Model model) {
		
		// model을 Map으로 바꿔준다
		Map<String, Object> map = model.asMap();
		
		// map에서 request를 뺀다
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		// request에서 no를 뺀다
		int no = Integer.parseInt(request.getParameter("no"));
		
		// no값을 가진 simpleDto를 가져온다
		SimpleDto simpleDto = SimpleDao.getInsetance().simpleView(no);
		
		// 결과인 simpleDto를 simpleViewPage.jsp로 전달해야 한다.
		// JSP로 보내는 데이터는 model에 저장해준다.
		model.addAttribute("simpleDto", simpleDto);

	}

}
