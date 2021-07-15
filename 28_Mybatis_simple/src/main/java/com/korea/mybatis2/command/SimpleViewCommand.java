package com.korea.mybatis2.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.korea.mybatis2.dao.SimpleDao;

public class SimpleViewCommand implements SimpleCommand {

	@Override
	public void execute(SqlSession sqlSession, Model model) {
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		int no = Integer.parseInt(request.getParameter("no"));
		
		SimpleDao simpleDao = sqlSession.getMapper(SimpleDao.class);
		
		model.addAttribute("simpleDto", simpleDao.simpleView(no));
		
	}

}
