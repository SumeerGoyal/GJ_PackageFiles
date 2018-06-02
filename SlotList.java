package com.sumeer.ParkingLot;

public class SlotList {
	int slotNumbers;
	Slots[] slotList;
	
	SlotList(){
		
	}
	SlotList(int noOfSlots){
		slotNumbers = noOfSlots;
		slotList = new Slots[slotNumbers];
		for (int i =0; i < slotNumbers; i++) {
			int j = i+1;
			slotList[i] = new Slots(j); // we want the slot numbers to start from 1
			System.out.println("added slot at pos " + i + " with number " + j); 
		}
	}
	
	public int findEmptySlot() {
		for (int i = 0; i< slotNumbers; i++) {
			if ((slotList[i].isSlotFree() == false))
				return i;
			
		}
		return 0;
	}
	public int changeStateToOccupied(int slotNumber, String regNumber, String color) {
		Slots freeSlot = slotList[slotNumber];
		freeSlot.AddVehicle(regNumber, color);
		return slotNumber;
	}
	public void changeStateToFree(int slotNumber) {
		Slots freeSlot = slotList[slotNumber];
		freeSlot.EmptySlot();
	}
	public int CI_Vehicle (String regNumber, String color) {
		// find the nearest slot
		int freeSlot = findEmptySlot();
		changeStateToOccupied(freeSlot, regNumber, color);
		System.out.println("adding vehicle " + regNumber + " " + color + " " + freeSlot);
		return freeSlot;
	}
	public int CO_Vehicle (int slotNumber) {
		// find the nearest slot

		changeStateToFree(slotNumber);
		return slotNumber;
	}
	
	public String getParkingSlotStatus() {
		// this should go into a string, but for the time being
		System.out.println("Slot No. " +  "Registration No " + " Colour");
		for (int i = 0; i< slotNumbers; i++) {
			if ((slotList[i].isSlotFree())== true) 	{
				Slots s = slotList[i];
				System.out.println(s.slotNumber + " " + s.regNumber + " "+ s.color);
	
				}
		
		}
		return "";
	}
}
