package com.korea.spring;

public class MainClass {

	public static void main(String[] args) {

		Song song = new Song();
		song.setTitle("Dynamite");
		song.setGenre("Dance");
		
		Singer singer = new Singer();
		singer.setName("BTS");
		singer.setSong(song);
		
		singer.singerInfo();

	}

}
