package com.korea.mybatis2.dao;

import java.util.List;

import com.korea.mybatis2.dto.SimpleDto;

public interface SimpleDao {
	
	
	public List<SimpleDto> simpleList();
	
	public int simpleInsert(String writer, String title, String content);

}
