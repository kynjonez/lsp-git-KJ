package org.howard.edu.lsp.assignment6.junit;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author kynjonez
 *
 */

public class IntegerSet {
	// Hint: probably best to use an array list.  You will need to do a little research
    private List<Integer> set = new ArrayList<Integer>();
    
	public List<Integer> getSet(List<Integer> set) {
		return this.set;
	}

	// Clears the internal representation of the set

    public void clear() {
        set.clear();
    }
    // Returns the length of the set
    public int length() {
        return set.size();
    }
    /*
     * Returns true if the 2 sets are equal, false otherwise;
     * Two sets are equal if they contain all of the same values in ANY order.
     */
    public boolean equals(IntegerSet b) {
    	Collections.sort(set);
    	if (set.equals(b.getSet(set))) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
 	// Returns true if the set contains the value, otherwise false
    
    public boolean contains(int value) {
    	if (set.contains(value)) {
    		return true;
    	}
    	return false;
    };    

    // Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
    public int largest() throws IntegerSetException {
    	int largestItem = Collections.max(set);
    	if (set.isEmpty()) {
    		IntegerSetException();
    		throw new IntegerSetException("Error! This is an empty set.");
    	}
    	return largestItem;
    }  
    	
	// TODO Auto-generated method stub
	
private void IntegerSetException() {
	// TODO Auto-generated method stub
	
}
	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
    public int smallest() throws IntegerSetException {
    	int smallestItem = Collections.min(set);
    	if (set.isEmpty()) {
    		IntegerSetException();
    		throw new IntegerSetException("Error! This is an empty set.");
    	}
    	return smallestItem;
    } 
   
    // Adds an item to the set or does nothing it already there	
    public void add(int item) {
    	boolean exists = false;
    	for (int i=0;i<set.size();i++) {
    		if(set.get(i)==item) {
    			exists = true;
    		}
    	}
    		if(exists==false)
    			set.add(item);
    	} // adds item to s or does nothing if it is in set
    // Removes an item from the set or does nothing if not there
    public void remove(int item) {
    	for (int i=0;i<set.size();i++) {
    		if (set.get(i)==item) {
    			set.remove(i);
    		}
    	}
    }
    // Set union
    public void union(IntegerSet intSetb) {
    	set.addAll(intSetb.getSet(set));
    	set.toString();
    }
    	// Set intersection
    public void intersect(IntegerSet intSetb) { 
    	set.retainAll(intSetb.getSet(set));
    	set.toString();			       
    }
   // Set difference, i.e., s1 –s2
    public void diff(IntegerSet intSetb) {
    	set.removeAll(intSetb.getSet(set));
    	set.toString();
    }  
  
    // Returns true if the set is empty, false otherwise
    public boolean isEmpty() {
    	if (set.isEmpty()) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public String toString() {
    	return set.toString();
    }

}



