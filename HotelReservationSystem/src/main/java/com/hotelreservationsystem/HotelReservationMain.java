package com.hotelreservationsystem;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 * PROCEDURE 
 * 1. Add Hotel in a Hotel Reservation System with Name and rates for Regular Customer. 
 * 2. find the cheapest Hotel for a given Date Range . 
 * 3. Add weekday and weekend rates for each Hotel .
 * 4. find the cheapest Hotel for a given Date Range based on weekday and weekend . 
 * 5. Added ratings to each hotel . 
 * 6. Find cheapest best rated hotel . 
 * 7. Find best rated hotel for given date range. 
 * 9. Add special rates for reward customers . 
 * 10. Find cheapest best rated hotel for given date of range for a reward customer.
 * 11. Find cheapest best rated hotel for given date of range for a reward customer using java stream.
 *
 */
public class HotelReservationMain {
	public static void main(String args[]) {
		System.out.println("Welcom to Hotel Reservation System ");

		/**
		 * 1. Created instance of HotelReservation class 2. called addHotel to add new
		 * hotel 3. print the list of hotel
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

		Hotel hotel = hotelReservation.getCheapestBestRatedHotel(startDate, endDate);
		System.out.println("The Cheapest best rated hotel is \n : " + hotel);

		/**
		 * calling getBestRatedHote() method from hotelREservation to get best rated
		 * hotel
		 */
		Hotel bestRatedHotel = hotelReservation.getBestRatedHotel(startDate, endDate);
		System.out.println("\nBest Rated hotel is \n" + bestRatedHotel);
		// Hotel hotel = hotelReservation.getCheapestHotel(startDate, endDate);
		// System.out.println("The cheapest hotel is : " + hotel);

		/**
		 * calling getCheapestBestRateedHotelForRewardCustomer() method for getting best
		 * cheapest rating hotel for reward customers
		 */
		ArrayList<Hotel> cheapestRewardHotel = hotelReservation.getCheapestBestRateedHotelForRewardCustomer(startDate,
				endDate);
		System.out.println("The cheapest hotel for reward customers is : " + cheapestRewardHotel);
	}
}