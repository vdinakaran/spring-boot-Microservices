package com.example.Rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Rating.model.List_wrapper;
import com.example.Rating.model.rating;
import com.example.Rating.service.Rating_service;

@RestController
@RequestMapping("/ratings")
public class Album_rating {

	@Autowired
	Rating_service rs;
	
	
	@RequestMapping("/{album_id}")
	public List_wrapper getRating(@PathVariable("album_id") String album_id) {
		
		List<rating> rating_list=rs.getRatings();
		List_wrapper lw=new List_wrapper(rating_list);
		
		
		return lw;
	}
}
