package com.korea.quiz1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		String resourceLocation = "app-context.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(resourceLocation);
		
		Soldier s = ctx.getBean("soldier1", Soldier.class);
		System.out.println("이름 : " + s.getName());
		System.out.println("부대명 : " + s.getArmyInfo().get("armyName"));
		System.out.println("부대위치 : " + s.getArmyInfo().get("armyLocation"));
		System.out.println("총기 모델 : " + s.getGun().getModel());
		System.out.println("발수 : " + s.getGun().getBullet() + "발");
			
		ctx.close();
		
	}

}
