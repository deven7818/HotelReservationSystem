package com.hotelreservationsystem;


public class HotelReservation {
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Hotel Reservation System...!!!" );
        String input = "10Sep2020(mon)";
        CheapestHotel cheapHotel = new CheapestHotel();
        String hotel = cheapHotel.findCheapHotel(input);
        System.out.println(hotel);
    }
}
