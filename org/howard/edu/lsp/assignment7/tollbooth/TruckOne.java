package org.howard.edu.lsp.assignment7.tollbooth;

public class TruckOne extends Toll implements Truck 
{

	public TruckOne(int Axles, int Weight)
	{
		this.Axles = Axles;
		this.Weight = Weight;
	}
	public int getNumAxles()
	{
		return Axles;
	}
	public int getWeight()
	{
		return Weight;
	}
	int Axles;
	int Weight;


	
}
