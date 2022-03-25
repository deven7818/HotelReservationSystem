package com.hotelreservationsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

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
	static ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

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
	
	public static Hotel getCheapestHotel(LocalDate startData, LocalDate endData) {
		//Optional<Hotel> cheapHotelList = hotelList.stream().mapToDouble(V -> getCheapestHotel(startData, endData).min()));
		
		List<Hotel> cheapHotelList = hotelList.stream()
			    .collect(Collectors.groupingBy(Hotel::getRegularCustomerRate, TreeMap::new, Collectors.toList()))
			    .firstEntry()
			    .getValue();

		return cheapHotelList.get(0);
	}
	
	
	
}
