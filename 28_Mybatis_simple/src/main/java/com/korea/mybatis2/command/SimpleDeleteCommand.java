package com.korea.mybatis2.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.korea.mybatis2.dao.SimpleDao;

public class SimpleDeleteCommand implements SimpleCommand {

	@Override
	public void execute(SqlSession sqlSession, Model model) {
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		RedirectAttributes rttr = (RedirectAttributes) map.get("rttr");
		
		int no = Integer.parseInt(request.getParameter("no"));
		
		SimpleDao simpleDao = sqlSession.getMapper(SimpleDao.class);
		
		int deleteResult = simpleDao.simpleDelete(no);
		
		rttr.addFlashAttribute("deleteResult", deleteResult);
		rttr.addFlashAttribute("afterDelete", true);

	}

}
