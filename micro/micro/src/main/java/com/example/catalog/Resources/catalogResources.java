package com.example.catalog.Resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.catalog.model.Album;
import com.example.catalog.model.List_wrapper;
import com.example.catalog.model.musicModel;
import com.example.catalog.model.rating;
import com.example.catalog.service.Music_info;
import com.example.catalog.service.Rating_info;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@RestController
@RequestMapping(path="/album_catalog")
public class catalogResources {

	
	
	@Autowired
	private RestTemplate rt;
	
	@Autowired
	Rating_info RI;
	
	@Autowired
	Music_info MI;
	
	 @GetMapping(value = "/album_list")
	public List<musicModel> musicList(String userID){
	
	List<musicModel> final_list=RI.getRating().stream().map(rating->{
	Album ai=MI.getMusicInfo(rating.getAlbum_id());
	return new musicModel(ai.getAlbum_name(),ai.getAlbum_id(),rating.getRating());	}).collect(Collectors.toList());
		
		return final_list;
	}
	
	
}
