package com.example.catalog.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.catalog.model.List_wrapper;
import com.example.catalog.model.rating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class Rating_info {

	@Autowired
	private RestTemplate rt;
	
	
	
	 @HystrixCommand(fallbackMethod ="musicList_fallback")
	public List<rating> getRating(){
	List_wrapper lw=rt.getForObject("http://Music-Ratings/ratings/album_id",List_wrapper.class);
	System.out.println(lw.getWrapper());
	return lw.getWrapper();
	}
	public List<rating> musicList_fallback(){
		return Arrays.asList(new rating("1",1000));
	}
	
}
