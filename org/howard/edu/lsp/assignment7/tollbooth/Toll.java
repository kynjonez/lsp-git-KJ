package org.howard.edu.lsp.assignment7.tollbooth;

public class Toll implements TollBooth 
{
	public Toll() 
	{
		// counts number of trucks
		count = 0;
		receipts = 0;
	}

	public void tollCalculation(Truck T) 
	{
		int Axles = T.getNumAxles();
		int Weight = T.getWeight();
		int amountDue = 5*Axles + ((Weight/1000)/2);
		
		System.out.println("Number of Axles: " + Axles);
		System.out.println("Truck Weight: " + Weight + "kg ");
		
		count = count + 1;
		receipts = receipts + amountDue;
		
		System.out.println("Amount Due for Truck " + count + ":");
		System.out.println(amountDue);
		
	}
	public void Display() 
	{
		System.out.println("Number of Trucks Passing Toll: " + count);
		System.out.println("Total Receips when " + count + " Truck Passes Toll: " + receipts);
	}
	
	int receipts;
	int count;
	
	
}
