package com.korea.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class TV {
	
	// field
	
	/*
	 	@Autowired
	 	이 애너테이션이 붙어 있는 객체 선언부(private Speaker speaker;)는 해당 Bean(객체)을 자동으로 찾아서 생성해준다.
	 	
	 	xml이라면 <bean id="speaker" class="com.korea.spring.Speaker /> 를 자동으로 찾고, 
	 	java라면 public Speaker speaker() { return new Speaker(); } 를 자동을 찾는다.
	 */
	
	@Autowired
	private Speaker speaker;
	
	// 아래 필드는 Autowired와 상관 없다
	private int channel;
	
	// method
	public void channelUp() {
		channel++;
		if (channel > 100) {
			channel = 0;
		}
		System.out.println("현재 채널 : " + channel);
	}
	
	public void channelDown() {
		channel--;
		if (channel < 0) {
			channel = 100;
		}
		System.out.println("현재 채널 : " + channel);
	}
	
	public void volumUp(int volume) {
		speaker.volumUp(volume);
	}
	
	public void volumDown(int volume) {
		speaker.volumeDown(volume);
	}

}
