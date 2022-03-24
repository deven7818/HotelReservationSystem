package com.hotelreservationsystem;

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
		hotelReservation.printHotelList();
	}
}