package com.korea.quiz1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
	
	/*
	<bean id="gun" class="com.koreait.quiz1.Gun">
		<constructor-arg value="K1" />
		<constructor-arg value="10" />
	</bean>
	*/
	
	@Bean
	public Gun gun() {
		return new Gun("k1", 10);
	}
	
}
