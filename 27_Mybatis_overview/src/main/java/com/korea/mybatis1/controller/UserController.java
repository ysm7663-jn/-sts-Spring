package com.korea.mybatis1.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.korea.mybatis1.dao.UserDao;
import com.korea.mybatis1.dto.UserDto;

@Controller
public class UserController {
	
	// Mybatis를 사용하는 경우에는
	// SqlSession 클래스를 사용한다.
	
	// field
	@Autowired
	private SqlSession sqlsession;
	
	// method
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	/*
		UsersDao와 users.xml이 연결되어 있습니다.
		UsersDao의 특정 메소드를 호출하면 연결된 users.xml의 쿼리가 실행됩니다.
	 */
	
	@RequestMapping(value="userListPage.do", method=RequestMethod.GET)
	public String userListPage(Model model) {
		UserDao userDao = sqlsession.getMapper(UserDao.class);
		model.addAttribute("list", userDao.userList());
		return "user/userListPage";
	}	
	
	@RequestMapping(value="userInsertPage.do", method=RequestMethod.GET)
	public String userInsertPage() {
		return "user/userInsertPage";
	}
	
	@RequestMapping(value="userInsert.do", method=RequestMethod.POST)
	public String userInsert(UserDto userDto) {
		UserDao userDao = sqlsession.getMapper(UserDao.class);
		userDao.userInsert(userDto);
		return "redirect:userListPage.do";
	}
	
	@RequestMapping(value="userViewPage.do", method=RequestMethod.GET)
	public String userViewPage(@RequestParam("no") int no, Model model) {
		UserDao userDao = sqlsession.getMapper(UserDao.class);
		model.addAttribute("userDto", userDao.userView(no));
		return "user/userViewPage";
	}
	
	@RequestMapping(value="userUpdate.do", method=RequestMethod.POST)
	public String userUpdate(UserDto userDto) {
		UserDao userDao = sqlsession.getMapper(UserDao.class);
		userDao.userUpdate(userDto);
		return "redirect:userViewPage.do?no=" + userDto.getNo();
	}
	
	@RequestMapping(value="userDelete.do", method=RequestMethod.POST)
	public String userDelete(@RequestParam("no") int no) {
		UserDao userDao = sqlsession.getMapper(UserDao.class);
		userDao.userDelete(no);
		return "redirect:userListPage.do";
	}
	
	
}
