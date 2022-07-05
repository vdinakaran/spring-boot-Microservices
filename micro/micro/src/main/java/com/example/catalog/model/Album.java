package com.example.catalog.model;

public class Album {

	private String album_id;
	private String album_name;
	
	
	
	public Album(String album_id, String album_name) {
		this.album_id = album_id;
		this.album_name = album_name;
	}
	
	public String getAlbum_id() {
		return album_id;
	}
	public void setAlbum_id(String album_id) {
		this.album_id = album_id;
	}
	public String getAlbum_name() {
		return album_name;
	}
	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}

	public Album() {
		// TODO Auto-generated constructor stub
	}
	
	
}
