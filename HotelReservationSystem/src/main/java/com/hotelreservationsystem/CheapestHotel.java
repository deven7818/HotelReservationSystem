package com.hotelreservationsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CheapestHotel {
	
	private HashMap<String, List<Integer>> lakeWood = new HashMap<>();
	private HashMap<String, List<Integer>> bridgeWood = new HashMap<>();
	private HashMap<String, List<Integer>> ridgeWood = new HashMap<>();
	private static int lakeWoodRating;
	private static int bridgeWoodRating;
	private static int ridgeWoodRating;
	
	public void HotelReservation() {
		setLakeWood();
		setBridgeWood();
		setRidgeWood();
	}
	
	private void setLakeWood() {

		List<Integer> lakeWoodReguler = new ArrayList<>();
		lakeWoodReguler.add(110);
		lakeWoodReguler.add(90);
		
		List<Integer> lakeWoodRewards = new ArrayList<>();
		lakeWoodRewards.add(80);
		lakeWoodRewards.add(80);		

		lakeWood.put("Reguler", lakeWoodReguler);
		lakeWood.put("Rewards", lakeWoodRewards);
		lakeWoodRating = 3;
	}
	
	private void setBridgeWood() {
		List<Integer> bridgeWoodReguler = new ArrayList<>();
		bridgeWoodReguler.add(160);
		bridgeWoodReguler.add(60);
		
		List<Integer> birdgeWoodRewards = new ArrayList<>();
		bridgeWoodReguler.add(110);
		bridgeWoodReguler.add(50);
		
		bridgeWood.put("Reguler", birdgeWoodRewards);
		bridgeWood.put("Rewards", birdgeWoodRewards);
		bridgeWoodRating = 4;
	}
	
	private void setRidgeWood() {
		List<Integer> ridgeWoodReguler = new ArrayList<>();
		ridgeWoodReguler.add(220);
		ridgeWoodReguler.add(150);
		
		List<Integer> ridgeWoodRewards = new ArrayList<>();
		ridgeWoodRewards.add(100);
		ridgeWoodRewards.add(40);
		
		bridgeWood.put("Reguler", ridgeWoodReguler);
		bridgeWood.put("Rewards", ridgeWoodRewards);
		ridgeWoodRating = 5;
	}
	
	   public String findCheapHotel(String input) {
	        
	        String[] arr = input.split(",");
	        String customerType = "";
	        if (arr.length > 0) {
	            String tempArr[] = arr[0].split(":");
	            customerType = tempArr[0];
	            arr[0] = tempArr[1];
	        }
	        String hotel = cheapestHotel(customerType, arr);
	        return hotel;
	    }

	private String cheapestHotel(String customerType,String[] arr) {
		int numOfWeekdays = 0;
		int numOfWeekends = 0;
		int lakeWoodCost = 0;
		int bridgeWoodCost = 0;
		int ridgeWoodCost = 0;
		for(int i =0; i<arr.length; i++) {
			String day = arr[i];
			System.out.println(day);
			if(day.contains("mon") || day.contains("tue") || day.contains("wed") || day.contains("thu") || day.contains("fri")) {
				numOfWeekdays ++;
			}else {
				numOfWeekends ++;
			}		
		}
		List<Integer> valueForLakeWood = lakeWood.get(customerType);
		List<Integer> valueForBridgeWood = bridgeWood.get(customerType);
		List<Integer> valueForRidgeWood = ridgeWood.get(customerType);
		
		lakeWoodCost = numOfWeekdays * valueForLakeWood.get(0) + numOfWeekends * valueForLakeWood.get(1);
	    bridgeWoodCost = numOfWeekdays * valueForBridgeWood.get(0) + numOfWeekends * valueForBridgeWood.get(1);
	    ridgeWoodCost = numOfWeekdays * valueForRidgeWood.get(0) + numOfWeekends * valueForRidgeWood.get(1);
	    
	    String hotel = minCost(lakeWoodCost, bridgeWoodCost, ridgeWoodCost);
	    System.out.println(lakeWoodCost +" " + bridgeWoodCost + " "+ ridgeWoodCost);
		return hotel;
	}
   
	private String minCost(int lakeWoodCost, int bridgeWoodCost, int ridgeWoodCost) {
        int minCost = Math.min(lakeWoodCost, Math.min(bridgeWoodCost, ridgeWoodCost));
        if (minCost == lakeWoodCost && minCost == bridgeWoodCost) {
            return bridgeWoodRating > lakeWoodRating ? "BridgeWood" : "LakeWood";
        } else if (minCost == bridgeWoodCost && minCost == ridgeWoodCost) {
            return bridgeWoodRating > ridgeWoodCost ? "BridgeWood" : "RidgeWood";
        } else if (minCost == lakeWoodCost && minCost == ridgeWoodCost) {
            return lakeWoodCost > ridgeWoodCost ? "LakeWood" : "RidgeWood";
        } else {
            if (minCost == lakeWoodCost) {
                return "LakeWood";
            } else if (minCost == bridgeWoodCost) {
                return "BridgeWood";
            } else {
                return "RidgeWood";
            }
        }
    }
}






