package com.korea.simple3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.korea.simple3.command.SimpleInsertCommand;
import com.korea.simple3.command.SimpleListCommand;
import com.korea.simple3.command.SimpleViewCommand;
import com.korea.simple3.dao.SimpleDao;

/*
 	@Configuration
 	: root-context.xml 처럼 Bean을 만드는 자바 클래스
*/

@Configuration
public class AppContext {

	/*
	 	@Bean
	 	반환 타입 : SimpleListCommand -> <Bean class="SimpleListCommand">
	 	메소드 명 : listCommand -> <Bean id="listCommand">
	 */
	
	@Bean
	public SimpleDao simpleDao() {
		return new SimpleDao();
	}
	
	@Bean
	public SimpleListCommand listCommand() {
		return new SimpleListCommand();
	}
	
	@Bean
	public SimpleInsertCommand insertCommand() {
		return new SimpleInsertCommand();
	}
	
	@Bean
	public SimpleViewCommand viewCommand() {
		return new SimpleViewCommand();
	}
}
