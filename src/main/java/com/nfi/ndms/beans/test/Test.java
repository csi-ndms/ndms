/**
 * 
 */
package com.nfi.ndms.beans.test;

/**
 * @author Leucippus
 * @since 2017 08 29 12:44:51 Tuesday
 * @version 0.1
 */
public class Test {
	private int id;

	public Test() {
	}	

	/**
	 * @param id
	 */
	public Test(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "This is a test Object for Testing and my id is : " + this.id;
	}

}
