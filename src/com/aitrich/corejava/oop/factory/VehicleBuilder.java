/**
 * 
 */
package com.aitrich.corejava.oop.factory;

import com.aitrich.corejava.oop.domain.Vehicle;

/**
 * Specification for assembling a {@link Vehicle}.
 * 
 * @author Shameer
 * @since 2nd Dec 2010
 *
 */
public interface VehicleBuilder {

	Vehicle build();
	
}
