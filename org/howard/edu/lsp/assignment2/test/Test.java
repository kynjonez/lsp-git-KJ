package org.howard.edu.lsp.assignment2.test;

import java.util.ArrayList;

public class Test {
	
	public static void main(String args[]) {
		// calculates object
		Combination cl = new Combination();
		// stores answer
		ArrayList<ArrayList<Integer>> Answer = new ArrayList<ArrayList<Integer>>();
		
		
		// declare 1st array
		int arr1[] = {5, 5, 15, 10};
		int targ1 = 15; // assigns the target number
		
		//n find sets and store in answer
		cl.calculate_combo(Answer, arr1, new ArrayList<Integer>(), targ1, 0);
		// print answers
		System.out.println("For array 1: ");
		cl.printSets(Answer);
		
		// declare 2nd array
		int arr2[] = {1, 2, 3, 4, 5, 6};
		int targ2 = 6; // target number
		Answer.clear(); // clears answer
		
		// find sets and store in answer
		cl.calculate_combo(Answer, arr2, new ArrayList<Integer>(), targ2, 0);
		// print answers
		System.out.println("\nFor Array 2: ");
		cl.printSets(Answer);
	}

}