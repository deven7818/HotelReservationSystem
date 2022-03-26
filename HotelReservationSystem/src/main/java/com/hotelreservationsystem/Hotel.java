package com.hotelreservationsystem;

public class Hotel {

	private String hotelName;
	private int rating;
	private double weekdayRegularCustomerRate;
	private double weekendRegularCustomerRate;

	/**
	 * Default Constructor
	 */
	public Hotel() {
	}

	/**
	 * Parameterized Constructor
	 * 
	 * @param hotelName                  - name of hotels
	 * @param rating                     - rating given to hotel
	 * @param weekdayRegularCustomerRate - rates for weekday regular customers
	 * @param weekendRegularCustomerRate - rates for weekend regular customers
	 */
	public Hotel(String hotelName, int rating, double weekdayRegularCustomerRate, double weekendRegularCustomerRate) {
		this.hotelName = hotelName;
		this.rating = rating;
		this.weekdayRegularCustomerRate = weekdayRegularCustomerRate;
		this.weekendRegularCustomerRate = weekendRegularCustomerRate;

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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public double getWeekdayRegularCustomerRate() {
		return weekdayRegularCustomerRate;
	}

	public void setWeekdayRegularCustomerRate(double weekdayRegularCustomerRate) {
		this.weekdayRegularCustomerRate = weekdayRegularCustomerRate;
	}

	public double getWeekendRegularCustomerRate() {
		return weekendRegularCustomerRate;
	}

	public void setWeekendRegularCustomerRate(double weekendRegularCustomerRate) {
		this.weekendRegularCustomerRate = weekendRegularCustomerRate;
	}


	/**
	 * toString Method to print data in string form
	 */
	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", rating=" + rating + ", weekdayRegularCustomerRate="
				+ weekdayRegularCustomerRate + ", weekendRegularCustomerRate=" + weekendRegularCustomerRate + "]";
	}

}
