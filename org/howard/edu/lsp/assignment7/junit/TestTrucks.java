package org.howard.edu.lsp.assignment7.junit;

import org.howard.edu.lsp.assignment7.tollbooth.Toll;
import org.howard.edu.lsp.assignment7.tollbooth.TruckOne;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestTrucks 
{
	@Test
	@DisplayName("Truck Test Cases")
	public static void main(String[] args)
	{
		Toll booth = new Toll();
		TruckOne Ford = new TruckOne(5, 120000);
		TruckOne Nissan = new TruckOne(2, 5000);
		TruckOne Daewoo = new TruckOne(6, 170000);
		
		// FORD TRUCK
		System.out.println("Ford Truck:");
		booth.tollCalculation(Ford);
		booth.Display();
		System.out.println("**************************************");
		
		// NISSAN TRUCK
		System.out.println("Nissan Truck:");
		booth.tollCalculation(Nissan);
		booth.Display();
		System.out.println("**************************************");
		
		// NISSAN TRUCK
		System.out.println("Daewoo Truck:");
		booth.tollCalculation(Daewoo);
		booth.Display();
		
	}
	
}
