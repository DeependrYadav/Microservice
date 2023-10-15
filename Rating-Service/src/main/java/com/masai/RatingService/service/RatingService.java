package com.masai.RatingService.service;

import java.util.List;

import com.masai.RatingService.entites.Rating;

public interface RatingService {

	// create rating
	Rating createRating(Rating rating);
	
	// get all rating
	List<Rating> getAllRating();
	
	//get all by UserId
	List<Rating> getRatingByUserId(String userId);
	
	// get all by hotelId
	List<Rating> getRatingByHotelId(String hotelId);
}
