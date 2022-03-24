package com.hotelreservationsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservation {

	/**
	 * variables hotelName - name of the hotel rating - rating given to hotel
	 * regularCustomerRate - rates for regular customers
	 */
	String hotelName;
	int rating;
	double regularCustomerRate;

	/**
	 * Scanner class object to get data from user
	 */
	Scanner sc = new Scanner(System.in);

	/**
	 * ArrayList of hotelName list of hotels
	 */
	ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	/**
	 * Method to add new hotel to list using ArrayList
	 * 
	 * @return - added hotel to hotelList
	 */
	public boolean addHotel() {
		System.out.println("Enter the Hotel Name : ");
		hotelName = sc.next();
		System.out.println("Enter Rating for hotel : ");
		rating = sc.nextInt();
		System.out.println("Enter rates for regular customer : ");
		regularCustomerRate = sc.nextDouble();
		/**
		 * Instance of Hotel
		 */
		Hotel hotel = new Hotel(hotelName, rating, regularCustomerRate);
		/**
		 * add new hotel to hotelList
		 */
		return hotelList.add(hotel);
	}

	/**
	 * Method to print list of hotels
	 */
	public void printHotelList() {
		System.out.println(hotelList);
	}
}
