package com.korea.mybatis2.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SimpleDto {
	
	private int no;
	private String title;
	private String writer;
	private String content;
	private Date regDate;

}
