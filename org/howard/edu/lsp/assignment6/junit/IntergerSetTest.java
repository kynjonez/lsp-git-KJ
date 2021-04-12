package org.howard.edu.lsp.assignment6.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntergerSetTest {

	private final IntegerSet test1 = new IntegerSet();
	private final IntegerSet test2 = new IntegerSet();
	private final IntegerSet test3 = new IntegerSet();
		
	// Add methods
	
	@Test
	@DisplayName("Test #1: Add Method")
	public void testAdd1() {
		test1.add(6);
		
		assertFalse(test1.isEmpty());	
	};
	@Test
	@DisplayName("Test #2: Add Method with string")
	public void testAdd2() {
		test1.add('s');
		
		assertFalse(test1.isEmpty());	
	};
	
	// Equals Methods
		@Test
		@DisplayName("Test #1: Equal method for two equal integerSets")
		public void testEqual1() {
			test1.add(1);
			test1.add(2);
			test1.add(3);
			test1.add(4);
			test1.add(5);
			
			test2.add(1);
			test2.add(2);
			test2.add(3);
			test2.add(4);
			test2.add(5);
			
			assertTrue(test1.equals(test2));
		};
		@Test
		@DisplayName("Test #2: Equal Method on two non-equal integerSets")
		public void testEqual2() {
			test1.add(1);
			test1.add(2);
			test1.add(3);
			test1.add(4);
			test1.add(5);
			
			test2.add(1);
			test2.add(2);
			
			assertFalse(test1.equals(test2));
		};
		@Test
		@DisplayName("Test #3: Equal method for two non-equal length integerSets")
		public void testEqual3() {
			test1.add(1);
			test1.add(2);
			test1.add(3);
			test1.add(3);
			test1.add(4);
			
			test2.add(1);
			test2.add(2);
			test2.add(3);
			test2.add(4);
			
			assertFalse(test1.equals(test2));
		};
	
	// Length Methods
	
	@Test
	@DisplayName("Test #1: Length Method")
	public void testLength1() {
		test1.add(1);
		test1.add(2);
		test1.add(3);
		
		int test1_len = test1.length();
		assertTrue(test1_len == 3);	
	};

	@Test
	@DisplayName("Test #2: Length Method for empty intergerSet")
	public void testLength2() {
		int test1_len = test1.length();
		assertTrue(test1_len == 0);	
	};
	
	
	// Clear Methods
		
	@Test
	@DisplayName("Test #1: Clear Method")
	public void testClear1() {
		test1.add(1);
		test1.add(2);
		test1.add(3);
		test1.add(4);
		test1.add(5);
		
		test1.clear();
		assertTrue(test1.length() == 0);
	};
	@Test
	@DisplayName("Test #2: Clear Method on an empty integerSet")
	public void testClear2() {
		test1.clear();
		assertTrue(test1.length() == 0);
	};
	
	
	// isEmpty Methods
	@Test
	@DisplayName("Test #1: isEmpty Method")
	public void testisEmpty1() {
		test1.add(1);
		assertFalse(test1.isEmpty());
	};
	@Test
	@DisplayName("Test #2: isEmpty Method with empty integerSet")
	public void testisEmpty2() {
		assertTrue(test1.isEmpty());
	};
	@Test
	@DisplayName("Test #3: isEmpty Method from clearing integerSet")
	public void testisEmpty3() {
		test1.add(1);
		test1.clear();
		
		assertTrue(test1.isEmpty());
	};
	
	// Contains Mehtods
	
	@Test
	@DisplayName("Test #1: Contains Method using an integerSet number")
	public void testContains1() {
		test1.add(1);
		test1.add(2);
		test1.add(3);
		test1.add(4);
		test1.add(5);
		
		assertTrue(test1.contains(2));
	};
	@Test
	@DisplayName("Test #2: Contains Method using an integerSet number")
	public void testContains2() {
		test1.add(1);
		test1.add(2);
		test1.add(3);
		test1.add(4);
		test1.add(5);
		
		assertFalse(test1.contains(9));
	};
	
	
	// Largest Methods
	
	@Test
	@DisplayName("Test #1: Largest Method") // this one
	public void testLargest1() {
		test1.add(1);
		test1.add(2);
		test1.add(3);
		test1.add(4);
		test1.add(5);
		
		int largest_num = 0;
		
		assertTrue(test1.contains(2));
	};
	@Test
	@DisplayName("Test #2: Largest Method on equivalent numebrs in integerSet" ) // this one
	public void testLargest2() {
		test1.add(2);
		test1.add(2);
		
		//represents largest number 
		int largest = 0;
		
		try 
		{
			largest = test1.largest();
		}
		catch (IntegerSetException e)
		{
			System.out.println(e.getMessage());
		}
		
		assertTrue(largest == 2);
	};
	@Test
	@DisplayName("Test #3: Largest Method with negative number in integerSet") // this one
	public void testLargest3() {
		test1.add(-2);
		test1.add(-4);
		
		//represents largest number 
		int largest = 0;
		
		try 
		{
			largest = test1.largest();
		}
		catch (IntegerSetException e)
		{
			System.out.println(e.getMessage());
		}
		
		assertTrue(largest == 0);
	};
	@Test
	@DisplayName("Test #4: Largest Method with empty integerSet") // this one
	public void testLargest4() {
		int largest = 0;
		
		try 
		{
			largest = test1.largest();
		}
		catch (IntegerSetException e)
		{
			System.out.println(e.getMessage());
		}
		
		assertTrue(largest == 0);
	};
	
	// Smallest Methods
	@Test
	@DisplayName("Test #1: Smallest Method") // this one
	public void testSmallest1() {
		test1.add(1);
		test1.add(2);
		test1.add(3);
		test1.add(4);
		test1.add(5);
		int smallest = 0;
		
		try
		{
			smallest = test1.smallest();
;		}
		catch (IntegerSetException e) 
		{
			System.out.println(e.getMessage());

		}
		
		assertTrue(smallest == 1);
	};
	@Test
	@DisplayName("Test #2: Smallest Method with equivalent numbers") // this one
	public void testSmallest2() {
		test1.add(3);
		test1.add(3);
		
		int smallest = 0;
		
		try
		{
			smallest = test1.smallest();
;		}
		catch (IntegerSetException e) 
		{
			System.out.println(e.getMessage());

		}
		
		assertTrue(smallest == 3);
	};
	
	// Remove Methods
	
	@Test
	@DisplayName("Test #1: Removing Method")
	public void testRemoving1() {
		test1.add(1);
		test1.add(2);
		test1.add(3);
		test1.add(4);
		test1.add(5);
		
		test2.add(1);
		test2.add(2);
		test2.add(3);
		test2.add(4);
		test2.add(5);
		
		test2.remove(4);
		test2.remove(5);
		
		assertFalse(test1.equals(test2));
	};
	@Test
	@DisplayName("Test #2: Removing Method on duplicates")
	public void testRemoving2() {
		test1.add(1);
		test1.add(2);
		test1.add(3);
		test1.add(4);
		
		test2.add(1);
		test2.add(2);
		test2.add(3);
		test2.add(3);
		test2.add(4);
		
		test2.remove(3);
		
		assertTrue(test1.equals(test2));
	};
	@Test
	@DisplayName("Test #3: Removing Method on number not in integerSet") 
	public void testRemoving3() {
		test1.add(1);
		test1.add(2);
		test1.add(3);
		test1.add(4);
		
		test2.add(1);
		test2.add(2);
		test2.add(3);
		test2.add(4);
		
		test2.remove(8);
		
		assertTrue(test1.equals(test2));
	};
	
	// Union Method
	@Test
	@DisplayName("Test #1: Union Method")  
	public void testUnion1() {
		test1.add(8);
		test1.add(4);
		test1.add(3);
		test1.add(2);
		
		test2.add(8);
		test2.add(4);
		test2.add(11);
		test2.add(23);
		
		test1.union(test2);
		
		test3.add(8);
		test3.add(4);
		test3.add(3);
		test3.add(2);
		test3.add(11);
		test3.add(23);
		
				
		assertTrue(test1.equals(test3));
	};
	@Test
	@DisplayName("Test #2: Union Method with 2 equivalent numbers in intergerSet")  
	public void testUnion2() {
		test1.add(3);
		test1.add(2);
		
		test2.add(3);
		test2.add(2);
		
		
		test1.union(test2);
		
		test3.add(3);
		test3.add(2);
		
				
		assertTrue(test1.equals(test3));
	};
	@Test
	@DisplayName("Test #3: Union Method with empty & non-empty integerSet")  
	public void testUnion3() {
		test1.add(3);
		test1.add(2);
		
		test1.union(test2);
		
		test3.add(3);
		test3.add(2);
		
				
		assertTrue(test1.equals(test3));
	};
	
	// Intersect Method
	@Test
	@DisplayName("Test #1: Intersect Method")  // send this
	public void testIntersect1() {
		test1.add(8);
		test1.add(4);
		test1.add(3);
		test1.add(2);
		
		test2.add(8);
		test2.add(4);
		test2.add(11);
		test2.add(23);
		
		test1.intersect(test2);
		
		test3.add(8);
		test3.add(4);
		
		test2.remove(8);
		
		assertTrue(test1.equals(test2));
	};
	// Intersect Method
	@Test
	@DisplayName("Test #2: Intersect Method")  // send this
	public void testIntersect2() {
		test1.add(3);
		test1.add(2);
			
		test2.add(11);
		test2.add(23);
			
		test1.intersect(test2);
		
			
		assertTrue(test1.equals(test3));
	};
	
	// Difference Method
	@Test
	@DisplayName("Test #1: Difference Method")
	public void testDifference1() {
		test1.add(8);
		test1.add(4);
		test1.add(3);
		test1.add(2);
			
		test2.add(8);
		test2.add(4);
		test2.add(11);
		test2.add(23);
			
		test1.diff(test2);
		
		test2.add(3);
		test2.add(2);
		
			 
		assertTrue(test1.equals(test3));
	};
	@Test
	@DisplayName("Test #2: Difference Method with no common integers in integerSet")
	public void testDifference2() {
		test1.add(8);
		test1.add(4);
		test1.add(3);
		test1.add(2);
			 
		test2.add(6);
		test2.add(1);
		test2.add(11);
		test2.add(23);
			
		test1.diff(test2);
		
		test2.add(3);
		test2.add(2);
		
			
		assertTrue(test1.equals(test3));
	};
	
	// toString Method
	@Test
	@DisplayName("Test #1: toString Method")  
	public void testString1() {
		test1.add(8);
		test1.add(4);
		test1.add(3);
		test1.add(2);
	
		String str_1 = test1.toString();
		String str_2 = "[8, 4, 3. 2]";
		
				
		assertTrue(str_1.equals(str_2));
	};
	// toString Method
	@Test
	@DisplayName("Test #2 toString Method with empty integerSet")  
	public void testString2() {
		
		String str_1 = test1.toString();
		String str_2 = "[]";
			
		assertTrue(str_1.equals(str_2));
	};
};
	
	
	
	

