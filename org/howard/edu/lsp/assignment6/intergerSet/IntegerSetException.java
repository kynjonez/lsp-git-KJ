package org.howard.edu.lsp.assignment6.intergerSet;
	/** 
	 * 
	 * @author kynjonez
	 *
	 */
public class IntegerSetException extends Exception {
	/** throws an exception called "IntegerSetException"
	 *  @param Exception message, defines error message that will
	 * be printed by smallest() and largest()
	 *
	 */ 
	
	public IntegerSetException(String exceptionMessage) {
		super(exceptionMessage);
		// this is defined under largest() and smallest() methods in
		// IntegerSet.java
	}

}
 