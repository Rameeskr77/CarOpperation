/**
 * 
 */
package com.aitrich.corejava.oop.domain;

/**
 * @author Shameer
 * @since 2nd Dec 2010
 *
 */
public class Wheel {
	
	/**
	 * Attributes [private]
	 */
	
	/**
	 * In inches
	 */
	private int radius;
	private WheelType type;
	
	/**
	 * Default Constructor
	 */
	public Wheel() {
		this.radius = 10;
		System.out.println(this + " is instantiated !");
	}
	

	/**
	 * Another constructor, with attributes pre-loaded.
	 * 
	 * @param radius
	 * @param type
	 */
	public Wheel(int radius, WheelType type) {
		super();
		this.radius = radius;
		this.type = type;
		System.out.println(this + " is instantiated !");
	}


	/**
	 * Public retrospective methods - Getters and Setters.
	 * @return
	 */
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public WheelType getType() {
		return type;
	}

	public void setType(WheelType type) {
		this.type = type;
	}
	
	/**
	 * Behaviours - methods.
	 */
	public void roll() {
		System.out.println("Wheel[radius=" + radius + " inches; Type=" + type + "] is rolling...");
	}

	public void halt() {
		System.out.println("Wheel[radius=" + radius + " inches; Type=" + type + "] is halted !");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Wheel [radius=");
		builder.append(radius);
		builder.append(", ");
		if (type != null) {
			builder.append("type=");
			builder.append(type);
		}
		builder.append("]");
		return builder.toString();
	}

	/**
	 * Options for Wheel Types
	 *
	 */
	public enum WheelType {
		Iron,
		Chrome,
		Alloy,
		Plastic,
		Wooden,
		Hydraulic;
	}
	
}
