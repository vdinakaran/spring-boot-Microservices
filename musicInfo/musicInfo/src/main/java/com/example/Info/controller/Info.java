package com.example.Info.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Info.model.Album;
import com.example.Info.service.info_service;

@RestController
@RequestMapping(path="/albums")
public class Info {

	@Autowired
	info_service is;
	
	@RequestMapping(path= "/{album_id}")
	public Album getAlbumInfo(@PathVariable("album_id") String album_id ) {
		
		Album al=is.getInfo(album_id);
		return al;
	}
	
	
	
	
	
}
