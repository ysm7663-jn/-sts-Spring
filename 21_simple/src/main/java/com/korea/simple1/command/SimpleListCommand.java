package com.korea.simple1.command;

import org.springframework.ui.Model;

import com.korea.simple1.dao.SimpleDao;

public class SimpleListCommand implements SimpleCommand {

	@Override
	public void execute(Model model) {

		// JSP와 달리 command는 데이터만 처리하면 된다.
		// VIEW는 컨트롤러가 처리한다.
		model.addAttribute("list", SimpleDao.getInsetance().simpleList());
		
	}

}
