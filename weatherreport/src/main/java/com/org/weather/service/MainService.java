package com.org.weather.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.org.weather.bean.Place;

@Service
public class MainService {
	private List<Place> allTopics=Arrays.asList(
			new Place("banagalore", "101.67", 1),
			new Place("hyderabad", "104.67", 2),
			new Place("chennai", "106.67", 3)		
			);

	public List<Place> getAllPlace()
	{
		return allTopics;
	}

	public Place getPlace(String id) {
		// TODO Auto-generated method stub
		
		return allTopics.stream().filter(t -> t.getName().equals(id)).findFirst().get();
	}

}
