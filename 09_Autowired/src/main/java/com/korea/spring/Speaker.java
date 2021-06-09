package com.korea.spring;

public class Speaker {

	// field
	private int volume;
	
	// method
	public void volumUp(int volume) {
		this.volume += volume;
		if (this.volume > 100) {
			this.volume = 100;
		}
		System.out.println("현재 볼륨 : " + this.volume);
	}
	
	public void volumeDown(int volume) {
		this.volume -= volume;
		if (this.volume < 0) {
			this.volume = 0;
		}
		System.out.println("현재 볼륨 : " + this.volume);
	}
	
}
