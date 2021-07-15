package com.korea.mybatis2.command;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.korea.mybatis2.dao.SimpleDao;
import com.korea.mybatis2.dto.SimpleDto;

public class SimpleListCommand implements SimpleCommand {

	@Override
	public void execute(SqlSession sqlSession, Model model) {
		
		SimpleDao simpleDao = sqlSession.getMapper(SimpleDao.class);
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		List<SimpleDto> list = simpleDao.simpleList();
		
		model.addAttribute("list", list);
	

	}

}
