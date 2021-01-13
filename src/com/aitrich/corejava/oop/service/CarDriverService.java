/**
 * 
 */
package com.aitrich.corejava.oop.service;

import com.aitrich.corejava.oop.domain.Car;
import com.aitrich.corejava.oop.domain.Vehicle;
import com.aitrich.corejava.oop.factory.SandroBuilder;
import com.aitrich.corejava.oop.factory.VehicleBuilder;

/**
 * 
 * This class drives a {@link Car} some distance and then stops it, from the {@link #main(String[])} method.
 * It constructs a car by delegating to the appropriate {@link VehicleBuilder} class.
 * 
 * You can add more methods and hence build more {@link Vehicle}s.
 * 
 * @author Shameer
 * @since 2nd Dec 2010
 *
 */
public class CarDriverService {

	/**
	 * 
	 */
	public CarDriverService() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VehicleBuilder carBuilder = new SandroBuilder();
		Car sandroCar = (Car)carBuilder.build();
		
		sandroCar.start();
		sandroCar.move();
		sandroCar.accelerate();
		sandroCar.stop();

	}

}
