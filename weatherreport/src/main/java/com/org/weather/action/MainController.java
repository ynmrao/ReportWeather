package com.org.weather.action;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.weather.bean.Place;
import com.org.weather.service.MainService;

@RestController
public class MainController {
	
	@Autowired
	private MainService myService;
	
	@RequestMapping("/hello")
	public String getHello()
	{
		
		return "hello";
	}

	@RequestMapping("/allplaces")
	public List<Place> getAllPlaces()
	{
		return myService.getAllPlace();
		
		
	}
	
	@RequestMapping("/place/{foo}")
	public Place getPlaceById(@PathVariable("foo") String name)
	{
		
		return myService.getPlace(name);
		
	}
	
}
