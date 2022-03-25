package com.hotelreservationsystem;

public class Hotel {
	

	private String hotelName;
	private int rating;
	private double regularCustomerRate;
	
	
	/**
	 * Default Constructor
	 */
	public Hotel() {
	}
	
	/**
	 * Parameterized Constructor
	 * @param hotelName - name of hotels
	 * @param rating - rating given to hotel
	 * @param regularCustomerRate - rates for regular customers
	 */
	public Hotel(String hotelName, int rating, double regularCustomerRate) {
		this.hotelName = hotelName;
		this.rating = rating;
		this.regularCustomerRate = regularCustomerRate;
	
	}


	/**
	 * Getter and setter methods
	 * 
	 */	
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public double getRegularCustomerRate() {
		return regularCustomerRate;
	}

	public void setRegularCustomerRate(double regularCustomerRate) {
		this.regularCustomerRate = regularCustomerRate;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * toString Method to print data in string form
	 */
	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", regularCustomerRate=" + regularCustomerRate + ", rating=" + rating
				+ "]";
	}


}
