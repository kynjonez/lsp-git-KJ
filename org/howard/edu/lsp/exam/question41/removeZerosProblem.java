package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;

public class removeZerosProblem {

	public static void main(String[] args) 
	{
		// array list og type integers
		ArrayList<Integer>numList = new ArrayList<Integer> ();
		
		
		// add elements to ArrayList
		numList.add(0);
		numList.add(7);
		numList.add(2);
		numList.add(0);
		numList.add(0);
		numList.add(4);
		numList.add(0);
		
		System.out.println("Elements before calling 'removeZeros' method: ");
		System.out.println(numList);
		
		
		removeZeros(numList);
		
		System.out.println("Elements after calling 'removeZeros' method: ");
		System.out.println(numList);
		

	}
	
	private static void removeZeros (ArrayList<Integer>numberList)
	{
		if (numberList.size()==0) 
		{
			System.out.println("This is an empty list!");
			System.exit(0);
		}
		else
		{
			// this gets the length of the integer array
			int length = numberList.size();
			for (int i=0; i<length; i++)
				if (numberList.get(i)==0) 
				{
					numberList.remove(i);
					length = length - 1;
					i = 0;
				}
		}
	}

}
