package com.korea.mybatis1.dao;

import java.util.List;

import com.korea.mybatis1.dto.UserDto;

public interface UserDao {
	
	public List<UserDto> userList();
	
	public void userInsert(UserDto userDto);
	
	public UserDto userView(int no);

	public void userUpdate(UserDto userDto);
	
	public void userDelete(int no);
}
