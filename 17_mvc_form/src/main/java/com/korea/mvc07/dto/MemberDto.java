package com.korea.mvc07.dto;

public class MemberDto {
	
	private String id;
	private String pw;
	
	public MemberDto(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public MemberDto() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
}
