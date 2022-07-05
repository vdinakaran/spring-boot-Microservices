package com.example.Rating.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Rating.model.rating;

@Service
public class list_of_rating implements Rating_service{

	@Override
	public List<rating> getRatings() {

		List  rating_list=new ArrayList<rating>();
		
		 rating_list.add(new rating("1",10));
		 rating_list.add(new rating("2",10));
		 rating_list.add(new rating("3",9));
		 rating_list.add(new rating("4",8));

		return rating_list;
	}

}
