package com.hotelreservationsystem;

import java.time.LocalDate;
import java.time.Month;

public class HotelReservationMain {
	public static void main(String args[]) {
		System.out.println("Welcom to Hotel Reservation System ");
		
		/**
		 * 1. Created instance of HotelReservation class
		 * 2. called addHotel to add new hotel
		 * 3. print the list of hotel 
		 */
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel();
		hotelReservation.addHotel();
		hotelReservation.addHotel();
		hotelReservation.printHotelList();
		
		/**
		 * Start date and end Date
		 */
		LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10);
		LocalDate endDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
		
		/**
		 * called getCheapestHotel method with parameters start date and end date
		 * printing cheapest hotel
		 */
		@SuppressWarnings("static-access")
		Hotel hotel = hotelReservation.getCheapestHotel(startDate, endDate);
		System.out.println("The Cheapest hotel is : "+ hotel);
	}
}