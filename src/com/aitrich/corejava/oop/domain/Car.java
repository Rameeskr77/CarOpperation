package com.aitrich.corejava.oop.domain;

import java.util.Arrays;

/**
 * Encapsulates a car.
 * 
 * 
 * @author Shameer
 * @since 2nd Dec 2010
 *
 */
public class Car extends MotorVehicle {

	public Car() {
		super();
	}

	public Car(Engine engine, Wheel[] wheels) {
		super(engine, wheels);
	}

	public void accelerate() {
		engine.accelerate();
	}

	public void slowDown() {
		engine.slowDown();
	}

	@Override
	public void applyBrakes() {
		slowDown();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [");
		if (engine != null) {
			builder.append("engine=");
			builder.append(engine);
			builder.append(", ");
		}
		if (wheels != null) {
			builder.append("wheels=");
			builder.append(Arrays.toString(wheels));
			builder.append(", ");
		}
		/*if (starter != null) {
			builder.append("starter=");
			builder.append(starter);
		}*/
		builder.append("]");
		return builder.toString();
	}
}
