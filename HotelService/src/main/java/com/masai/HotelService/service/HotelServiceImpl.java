package com.masai.HotelService.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.HotelService.entites.Hotel;
import com.masai.HotelService.exception.ResourceNotFoundException;
import com.masai.HotelService.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{

	// Auto wiring bean of hotel repository
	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel createHotel(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setHotelId(hotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotelById(String Id) {
		
		return hotelRepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException("Hotel with give ID not found :"+Id));
	}

}
