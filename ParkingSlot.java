package com.sumeer.ParkingLot;
import java.util.*;

public class ParkingSlot {
	
	public SlotList parkingSlot;
	
	public ParkingSlot() {
		System.out.println("test");
	}
	public ParkingSlot(int number) {
		System.out.println("Created a parking lot with " + number + " slots");
		parkingSlot = new SlotList(number);
		
	}
	public void removeVehicle(int slotNumber) {
		parkingSlot.CO_Vehicle(slotNumber - 1);
	}
	public int AddVehicle(String regNo, String color) {
		int slotNumber = parkingSlot.CI_Vehicle(regNo, color);
		return slotNumber + 1;
	}
	public void pushBack() {
		// whichStack.push(whichObject);
	}
	
	public void popSlot() {
		// return (Slots) whichStack.pop();
	}
	public String getParkingStatus() {
		return parkingSlot.getParkingSlotStatus();
	}
	public String handle_registration_number_for_cars_with_color(String color){
		return "";
	}
	public String handle_slot_number_for_cars_with_color(String color){
		return "";
	}
	public String handle_slot_number_for_registration_number(String regNo){
		return "";
	}
	
	/*
	public void checkOutVehicle(String vehicleNumber){
		// remove the slot corresponding to the vehicle number
		Slots removedSlot = occupiedSlots.remove(vehicleNumber);
		String slotSize = removedSlot.getSlotSize();//small, ....
		vehicles parkedVehicle = removedSlot.getVehicle();
		removedSlot.removeVehicle();
		//find slot of this size or next bigger size
		if (slotSize.compareTo("small") == 0) {
			//put it back in the small bucket
			pushBack(small, removedSlot);
			System.out.println("checked out " + vehicleNumber);
		}
		else {
			// ....
		}
		
	}
	
	public void checkInVehicle(vehicles vehicleToBeParked) {
		//get size of vehicle
		String size = vehicleToBeParked.size;  // S, M, L, XL
		//find slot of this size or next bigger size
		if (size.compareTo("S") == 0) {
			String carNumber = vehicleToBeParked.numberPlate;
			Slots getSlot = popSlot(small);
			getSlot.AddVehicle(vehicleToBeParked);
			System.out.println("added vehicle of size small " + carNumber);
			occupiedSlots.put(carNumber,  getSlot);
		}
		else {
			// ....
		}
		
	}
	*/
}
