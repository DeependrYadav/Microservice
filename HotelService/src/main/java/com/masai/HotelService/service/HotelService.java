package com.masai.HotelService.service;

import java.util.List;

import com.masai.HotelService.entites.Hotel;

public interface HotelService {

	// create
	
	Hotel createHotel(Hotel hotel);
	
	// get all hotel
	
	List<Hotel> getAllHotel();
	
	// Find hotel by id
	
	Hotel getHotelById(String Id);
}
