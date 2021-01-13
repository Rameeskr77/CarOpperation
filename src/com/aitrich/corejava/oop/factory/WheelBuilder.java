/**
 * 
 */
package com.aitrich.corejava.oop.factory;

import com.aitrich.corejava.oop.domain.Wheel;

/**
 * Specification for building a Wheel.
 * 
 * @author Shameer
 * @since 2nd Dec 2010
 *
 */
public class WheelBuilder {
	
	public static Wheel[] buildWheels(int wheelRadius, Wheel.WheelType wheelType,int n) {
		Wheel[] wheels = new Wheel[n];
		for (int i = 0; i < n; i++) {
			wheels[i] = new Wheel(wheelRadius, wheelType);
		}
		return wheels;
	}


}
