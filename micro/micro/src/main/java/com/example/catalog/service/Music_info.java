package com.example.catalog.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.catalog.model.Album;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class Music_info {

	@Autowired
	private RestTemplate rt;
	
	@HystrixCommand(fallbackMethod ="Info_fallback")
	public Album getMusicInfo(String album_id) {
		Album ai=rt.getForObject("http://Music-Info/albums/"+album_id,Album.class);
		return ai;
	}
	public Album Info_fallback(String album_id) {
		return new Album("100","no album");
	}
	
		
}
