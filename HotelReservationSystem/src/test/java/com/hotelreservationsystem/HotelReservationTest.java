package com.hotelreservationsystem;

import org.junit.Assert;
import org.junit.Test;


/**
 * Unit test for testing .
 */
public class HotelReservationTest{
    
	/**
	 * test case for testing hotel Details
	 */
    @Test
    public void hotelDetailsTestShouldReturnTrue(){
    	HotelReservation hotelReservation = new HotelReservation();
    	boolean result = hotelReservation.addHotel();
    	Assert.assertEquals(true, result);

    }
}
