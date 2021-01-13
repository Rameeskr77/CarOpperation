/**
 * 
 */
package com.aitrich.corejava.oop.domain;

/**
 * Represents a Petrol engine.
 * 
 * @author Shameer
 * @since 2nd Dec 2010
 *
 */
public class PetrolEngine extends AbstractEngine {

	/**
	 * 
	 */
	public PetrolEngine() {
		super();
	}

	/**
	 * @param name
	 * @param modelNumber
	 * @param manufacturer
	 */
	public PetrolEngine(String name, String modelNumber, String manufacturer) {
		super(name, modelNumber, manufacturer);
	}

	/* (non-Javadoc)
	 * @see com.aitrich.course.corejava.oo.domain.Engine#run()
	 */
	public void run() {
		System.out.println(this + " is running on petrol now !");
	}
	
	

}
