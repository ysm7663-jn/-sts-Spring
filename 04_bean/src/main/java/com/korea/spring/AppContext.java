package com.korea.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

	/*
	 * @Configuration
	 * : app-context.xml과 같은 역할을 하는 클래스
	 */
	
	// 메소드 하나당 Bean 하나씩 만든다.
	// Bean을 만드는 메소드들은 @Bean 에너테이션을 추가해야 한다.
	
	/*
	 * <bean id="song" class="com.korea.spring.Song">
	 * 	<property name="title" value="Dynamite" />
	 *  <property name="genre" value="Dance" />
	 * </bean>
	 */
	
	@Bean
	public Song song1() {
		Song song = new Song();
		song.setTitle("Falling");
		song.setGenre("발라드");
		return song;
	}
	
	/*
	<bean id="song2" class="com.koreait.spring.Song">
		<constructor-arg value="Dynamite" />
		<constructor-arg value="댄스" />
	</bean>
	
	아래 메소드를 위 <bean>태그와 같은 일을 해요.
	 */
	@Bean(name="song2")		// @Bean(name="bean의 id")
	public Song zzzzz() {	// 메소드의 이름 zzzzz는 사용되지 않아요.
		return new Song("Dynamite", "댄스");
	}
	
	/*
	<bean id="singer1" class="com.koreait.spring.Singer">
		<property name="name" value="BTS" />
		<property name="song" ref="song1" />
	</bean>
	
	아래 메소드를 위 <bean>태그와 같은 일을 해요.
	*/
	@Bean
	public Singer singer1() {
		Singer singer = new Singer();
		singer.setName("존박");
		singer.setSong( song1() );	// public Song song1(){ } 메소드를 호출하면 song1이라는 Bean이 반환됩니다.
		return singer;
	}
	
	/*
	<bean id="singer2" class="com.koreait.spring.Singer">
		<constructor-arg value="BTS" />
		<constructor-arg ref="song2" />
	</bean>
	
	아래 메소드를 위 <bean>태그와 같은 일을 해요.
	*/
	@Bean
	public Singer singer2() {
		return new Singer("BTS", zzzzz());	// public Song zzzzz(){ } 메소드를 호출하면 song2라는 Bean이 반환됩니다.
	}
	
}
