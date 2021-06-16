package com.korea.mvc06.dto;

import java.sql.Date;

public class BoardDto {
	
	private String title;
	private int hit;
	private Date data;
	
	public BoardDto(String title, int hit, Date data) {
		this.title = title;
		this.hit = hit;
		this.data = data;
	}

	public BoardDto() {
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}
