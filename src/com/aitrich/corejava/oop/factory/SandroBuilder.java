/**
 * 
 */
package com.aitrich.corejava.oop.factory;

import com.aitrich.corejava.oop.domain.Car;
import com.aitrich.corejava.oop.domain.Engine;
import com.aitrich.corejava.oop.domain.PetrolEngine;
import com.aitrich.corejava.oop.domain.Wheel;
import com.aitrich.corejava.oop.domain.Wheel.WheelType;

/**
 * Constructs a Hyundai Sandro Car.
 * 
 * @author Shameer
 * @since 2nd Dec 2010
 *
 */
public class SandroBuilder extends CarBuilder {

	/**
	 * 
	 */
	public SandroBuilder() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.aitrich.course.corejava.oo.factory.CarBuilder#buildWheels()
	 */
	@Override
	protected Wheel[] buildWheels() {
		return WheelBuilder.buildWheels(6, WheelType.Chrome,4);
	}

	/* (non-Javadoc)
	 * @see com.aitrich.course.corejava.oo.factory.CarBuilder#buildEngine()
	 */
	@Override
	protected Engine buildEngine() {
		return new PetrolEngine("1.1L 63bhp e-RLX", "HY-SANTRO-May2010-123", "Hyundai Corp, S. Korea");
	}

	/* (non-Javadoc)
	 * @see com.aitrich.course.corejava.oo.factory.CarBuilder#setOtherAttributes(com.aitrich.course.corejava.oo.domain.Car)
	 */
	@Override
	protected void setOtherAttributes(Car car) {
		car.setBrand("Hyundai");
		car.setModel("Santro Xing GLS");
		car.setYear(2010);
	}

}
