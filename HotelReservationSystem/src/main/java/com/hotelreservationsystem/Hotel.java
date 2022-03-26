package com.hotelreservationsystem;

public class Hotel {

	private String hotelName;
	private int rating;
	private double weekdayRegularCustomerRate;
	private double weekendRegularCustomerRate;
	private double weekdayRewardCustomerRate;
	private double weekendRewardCustomerRate;

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
	 * @param weekdayRewardCustomerRate  - rates for reward customers on weekdays
	 * @param weekendRewardCustomerRate  - rates for reward customers on weekend
	 */
	public Hotel(String hotelName, int rating, double weekdayRegularCustomerRate, double weekendRegularCustomerRate,
			double weekdayRewardCustomerRate, double weekendRewardCustomerRate) {
		this.hotelName = hotelName;
		this.rating = rating;
		this.weekdayRegularCustomerRate = weekdayRegularCustomerRate;
		this.weekendRegularCustomerRate = weekendRegularCustomerRate;
		this.weekdayRewardCustomerRate = weekdayRewardCustomerRate;
		this.weekendRewardCustomerRate = weekendRewardCustomerRate;
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

	public double getWeekdayRewardCustomerRate() {
		return weekdayRewardCustomerRate;
	}

	public void setWeekdayRewardCustomerRate(double weekdayRewardCustomerRate) {
		this.weekdayRewardCustomerRate = weekdayRewardCustomerRate;
	}

	public double getWeekendRewardCustomerRate() {
		return weekendRewardCustomerRate;
	}

	public void setWeekendRewardCustomerRate(double weekendRewardCustomerRate) {
		this.weekendRewardCustomerRate = weekendRewardCustomerRate;
	}

	/**
	 * toString Method to print data in string form
	 */

	@Override
	public String toString() {
		return "Hotel [hotelName = " + hotelName + ", rating = " + rating + ", weekdayRegularCustomerRate = "
				+ weekdayRegularCustomerRate + ", weekendRegularCustomerRate = " + weekendRegularCustomerRate
				+ ", weekdayRewardCustomerRate = " + weekdayRewardCustomerRate + ", weekendRewardCustomerRate = "
				+ weekendRewardCustomerRate + "]";
	}

}
