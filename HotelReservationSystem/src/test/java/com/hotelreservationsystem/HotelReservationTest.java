package com.hotelreservationsystem;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for testing .
 */
public class HotelReservationTest {

	/**
	 * test case for testing hotel Details
	 */
	@Test
	public void hotelDetailsTestShouldReturnTrue() {
		HotelReservation hotelReservation = new HotelReservation();
		boolean result = hotelReservation.addHotel();
		Assert.assertEquals(true, result);
	}

	/*
	 * test case for testing cheapest hotel.
	 */
	@Test
	public void givenHotelDetailsShouldReturnCheapestHotel() {
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel();
		hotelReservation.addHotel();

		LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10);
		LocalDate endDate = LocalDate.of(2020, Month.SEPTEMBER, 11);

		ArrayList<Hotel> hotelName = hotelReservation.getCheapestHotel(startDate, endDate);
		Assert.assertEquals("Lakewood", hotelName);

	}
	
	/**
	 * test case for testing cheapest best rated hotel.
	 */
	@Test
	public void givenHotelDetailsShouldReturnCheapestBestRatedHotel() {
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel();
		hotelReservation.addHotel();

		LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10);
		LocalDate endDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
		
		Hotel hotel = hotelReservation.getCheapestBestRatedHotel(startDate, endDate);
		Assert.assertEquals("Bridgewood", hotel.getHotelName());
	}
}
