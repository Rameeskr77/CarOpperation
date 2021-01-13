/**
 * 
 */
package com.aitrich.corejava.oop.factory;

import com.aitrich.corejava.oop.domain.Car;
import com.aitrich.corejava.oop.domain.Engine;
import com.aitrich.corejava.oop.domain.Vehicle;
import com.aitrich.corejava.oop.domain.Wheel;

/**
 * Constructs a Car.
 * 
 * @author Shameer
 * @since 2nd Dec 2010
 *
 */
public abstract class CarBuilder implements VehicleBuilder {

	/**
	 * 
	 */
	public CarBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	private Car buildCar() {
		Car myCar = new Car(buildEngine(), buildWheels()); 
		setOtherAttributes(myCar);
		return myCar;
	}
	
	/* (non-Javadoc)
	 * @see com.aitrich.course.corejava.oo.factory.VehicleBuilder#build()
	 */
	public Vehicle build() {
		System.out.println("Building Car..");
		return buildCar();
	}
	
	protected abstract Wheel[] buildWheels();
	protected abstract Engine buildEngine();
	protected abstract void setOtherAttributes(Car car);

}
