package com.example.catalog.model;

public class musicModel {

	private String albumName;
	private String artist;
	private int rating;
	
	
	public musicModel() {

	}
	
	public musicModel(String albumName, String artist, int rating) {
		this.albumName = albumName;
		this.artist = artist;
		this.rating = rating;
	}
	
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
}
