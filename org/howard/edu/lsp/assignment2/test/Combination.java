package org.howard.edu.lsp.assignment2.test;

import java.util.ArrayList;
import java.util.Arrays;


// calculation
public class Combination {

	public void calculate_combo(ArrayList<ArrayList<Integer>>Answer, int arr[], ArrayList<Integer> tmp, int currentTarget, int Start) {
		// sum of current set in TMP is greater than target 
		// if current target is < 0
		if (Start > arr.length || currentTarget < 0)
			return ;
		// means that sum of this set is = to target
		if (currentTarget == 0) {
			Answer.add(new ArrayList <Integer>(tmp));
				return;
		} else {
			for (int i = Start; i<arr.length; i++) {
				// adds value to temporary ANS
				tmp.add(i);
				// decrease current target by subtracting the added value
				calculate_combo(Answer, arr, tmp, currentTarget-arr[i], i+1);
				// remove TEMP added value from ANS
				tmp.remove(tmp.size()-1);
		}

	}

}
	
public void printSets(ArrayList<ArrayList<Integer>> Answer) {
	int n = Answer.size();
	// loop to print sequences of indexes in each set on a new line
	for(int i = 0; i<n; i++) {
		int m = Answer.get(i).size();
		System.out.print("[");
		
		for(int j = 0; j<m; j++) {
			System.out.print(Answer.get(i).get(j));
			if(j != m-1)
				System.out.print(",");
		}
		System.out.println("]");
	}
	
}}
