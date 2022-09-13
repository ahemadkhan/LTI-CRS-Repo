/**
 * 
 */
package com.lti.exception;

/**
 * Exception to check if grade is already marked by professor
 * @author Group-02
 *
 */
public class GradeAlreadyMarked extends Exception {
	
	private int studentID;
	
	/**
	 * Constructor
	 * @param sid: StudentID
	 */
	public GradeAlreadyMarked(int sid)
	{
		this.studentID = sid;
	} 
	
	/**
	 * Getter method
	 * @return studentID
	 */
	public int getSid()
	{
		return studentID;
	}

}
