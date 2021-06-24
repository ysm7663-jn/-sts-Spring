package com.korea.simple1.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor	// 디폴트 생성자를 자동으로 생성해 준다
@AllArgsConstructor	// 필드를 이용한 생성자를 자동으로 생성해 준다.
@Data				// lombok의 에너테이션, getter/setter등을 자동으로 생성해준다.
					// Window - Show View - Outline 에서 확인 가능

public class SimpleDto {
	
	private int no;
	private String title;
	private String writer;
	private String content;
	private Date regDate;

}
