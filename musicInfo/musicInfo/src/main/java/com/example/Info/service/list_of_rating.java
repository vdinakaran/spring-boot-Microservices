package com.example.Info.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Info.model.Album;

@Service
public class list_of_rating implements info_service{

	@Override
	public Album getInfo(String id) {

		List <Album> info_list=new ArrayList<Album>();
		
		 info_list.add(new Album("1","college dropout"));
		 info_list.add(new Album("2","emotion"));
		 info_list.add(new Album("3","igor"));
		 info_list.add(new Album("4","life of pablo"));
		 
for(Album a:info_list) {
	if(a.getAlbum_id().equals(id)) {
		return a;
	}
}
	return null;
	}

}
