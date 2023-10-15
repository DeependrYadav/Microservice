package com.masai.HotelService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.HotelService.entites.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
