package com.hotelreservationsystem;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HotelReservation {

	/**
	 * variables hotelName - name of the hotel, rating - rating given to hotel
	 * regularCustomerRate - rates for regular customers
	 * weekdayRegularCustomerRate - rate for regular customers on week days
	 * weekendRegularCustomerRate - rate for regular customers on week end
	 */
	String hotelName;
	int rating;
	double weekdayRegularCustomerRate;
	double weekendRegularCustomerRate;

	/**
	 * Scanner class object to get data from user
	 */
	Scanner sc = new Scanner(System.in);

	/**
	 * ArrayList of hotelName list of hotels
	 */
	static ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	Hotel hotel;
	/**
	 * Method to add new hotel to list using ArrayList Taking Hotel name , rating,
	 * rates for regular customers on weekdays and weekends as input add hotel to
	 * list
	 * 
	 * @return - added hotel to hotelList
	 */
	public boolean addHotel() {
		System.out.println("Enter the Hotel Name : ");
		hotelName = sc.next();
		System.out.println("Enter Rating for hotel : ");
		rating = sc.nextInt();
		System.out.println("Enter rates for regular customer on weekdays : ");
		weekdayRegularCustomerRate = sc.nextDouble();
		System.out.println("Enter rates for regular customer on weekends : ");
		weekendRegularCustomerRate = sc.nextDouble();
		/**
		 * Instance of Hotel
		 */
		Hotel hotel = new Hotel(hotelName, rating, weekdayRegularCustomerRate, weekendRegularCustomerRate);
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

	/**
	 * Method to find cheapest hotel 
	 * comparing rate finding weekend and weekdays
	 * @param startData - checked-in date in hotel
	 * @param endData - checked-out date from hotel
	 * @return - cheapest hotel
	 */
	
	public ArrayList<Hotel> getCheapestHotel(LocalDate startData, LocalDate endData) {
		//Optional<Hotel> cheapHotelList = hotelList.stream().mapToDouble(V -> getCheapestHotel(startData, endData).min()));
		
		int numberOfDays = (int) ChronoUnit.DAYS.between(startData, endData);
		int weekends = 0;
		
		while(startData.compareTo(endData) != 0) {
			switch(DayOfWeek.of(startData.get(ChronoField.DAY_OF_WEEK))) {
			
				case SATURDAY :
					 ++weekends;
					 break;
					 
				case SUNDAY :
					++weekends;
					break;
					
				case FRIDAY:
					break;
					
				case MONDAY:
					break;
					
				case THURSDAY:
					break;
					
				case TUESDAY:
					break;
					
				case WEDNESDAY:
					break;
					
				default:
					break;	
			
			}
		}
		
		final int weekdaysNumber = numberOfDays - weekends;
		final int weekendNumber = weekends;
		
		final double cheapestPrice = hotelList.stream()
									.mapToDouble(hotel ->((hotel.getWeekendRegularCustomerRate()*weekendNumber) + hotel.getWeekdayRegularCustomerRate()*weekdaysNumber))
									.min()
									.orElse(Double.MAX_VALUE);		
		
		
		ArrayList<Hotel> cheapestHotel = hotelList.stream()
							.filter(hotel -> (hotel.getWeekendRegularCustomerRate()*weekendNumber + hotel.getWeekdayRegularCustomerRate()* weekdaysNumber) == cheapestPrice)
							.collect(Collectors.toCollection(ArrayList::new));
		
	/*	List<Hotel> cheapHotel = hotelList.stream()
			    .collect(Collectors.groupingBy(Hotel::getWeekdayRegularCustomerRate, TreeMap::new, Collectors.toList()))
			    .firstEntry()
			    .getValue();
		*/
		if(cheapestPrice != Double.MAX_VALUE) {
			System.out.println("Cheapest Hotel :" + cheapestHotel.get(0).getHotelName() + "Total rates :" + cheapestPrice);
			return cheapestHotel;
		}

		return null;
	}

	/**
	 * Method to find cheapest best rated hotel
	 * created array list of hotels calling getCheapestHotel() method to get cheapest hotel
	 * then filter the array list to get cheapest best rated hotel
	 * @param startData - checked-in date in hotel
	 * @param endData - checked-out date from hotel
	 * @return - sorted list of cheapest best rated hotel
	 */
	public Hotel getCheapestBestRatedHotel(LocalDate startDate, LocalDate endDate) {
		//ArrayList<Hotel> cheapestRateHptel = getCheapestHotel(startDate, endDate);
		Optional<Hotel> sortedHotelList = hotelList.stream().max(Comparator.comparing(Hotel::getRating));
		System.out.println("Cheapest Best rated hotel :" + sortedHotelList.get().getHotelName());
		return sortedHotelList.get();
	}
}
