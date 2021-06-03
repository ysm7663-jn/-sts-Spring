package com.korea.spring;

public class Song {
	
	// field
	private String title;
	private String genre;


	// constructor
	public Song() {
		
	}
	
	// method
	public Song(String title, String genre) {
		super();
		this.title = title;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	public void songInfo() {
		System.out.println(title + "(" + genre + ")");
	}

}
