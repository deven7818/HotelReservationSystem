package com.hotelreservationsystem;

public class Hotel {
	
	private String hotelName;
	private String customerType;
	private int rating;
	private int rates;
	private String day;
	
	/**
	 * Default Constructor
	 */
	public Hotel() {
	}
	
	/**
	 * Parameterized Constructor
	 * @param hotelName - name of hotels
	 * @param rating - rating given to hotel
	 * @param rates - rates 
	 */
	public Hotel(String hotelName,String customerType, int rating, int rates, String day) {
		this.hotelName = hotelName;
		this.customerType = customerType;
		this.rating = rating;
		this.rates = rates;
		this.day = day;
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

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getRates() {
		return rates;
	}

	public void setRates(int rates) {
		this.rates = rates;
	}
	
	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	
	
	
	

}
