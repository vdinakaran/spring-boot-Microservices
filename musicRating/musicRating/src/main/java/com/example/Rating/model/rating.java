package com.example.Rating.model;

public class rating {

	private String album_id;
	private int rating;
	
	
	public rating(String album_id, int rating) {
		this.album_id = album_id;
		this.rating = rating;
	}
	
	public String getAlbum_id() {
		return album_id;
	}
	public void setAlbum_id(String album_id) {
		this.album_id = album_id;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	public rating() {
		// TODO Auto-generated constructor stub
	}
	
	
}
