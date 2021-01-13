/**
 * 
 */
package com.aitrich.corejava.oop.domain;

/**
 * Encapsulates the common attributes of 
 * 
 * @author Shameer
 * @since 2nd Dec 2010
 *
 */
public abstract class MotorVehicle implements Vehicle {
	
	protected Engine engine;
	protected Wheel[] wheels;
	//protected Starter starter;
	
	private String brand;
	private int year;
	private String model;

	/**
	 * 
	 */
	public MotorVehicle() {
		System.out.println(this + " is instantiated !");
	}
	
	public MotorVehicle(Engine engine, Wheel[] wheels) {
 		super();
		this.engine = engine;
		this.wheels = wheels;
		//this.starter = starter;
		System.out.println(this + " is instantiated !");
	}

	/**
	 * @return the engine
	 */
	public Engine getEngine() {
		return engine;
	}

	/**
	 * @param engine the engine to set
	 */
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	/**
	 * @return the wheels
	 */
	public Wheel[] getWheels() {
		return wheels;
	}

	/**
	 * @param wheels the wheels to set
	 */
	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/* (non-Javadoc)
	 * @see com.aitrich.course.corejava.oo.domain.Vehicle#move()
	 */
	public void move() {
		engine.run();
		moveOnWheels();
		System.out.println(this + " is running now.");
	}

	/* (non-Javadoc)
	 * @see com.aitrich.course.corejava.oo.domain.Startable#stop()
	 */
	public boolean stop() {
		
		applyBrakes();

		boolean isStopped = engine.stop();
		
		if(isStopped) {
			System.out.println(this + " is stopped successfully.");
		} else {
			System.out.println(this + " could not be stopped.");
		}
		
		return isStopped;
	}
	
	public boolean start() {
		boolean isStarted = engine.start();
		
		
		if(isStarted) {
			System.out.println(this + " is started successfully.");
		} else {
			System.out.println(this + " could not be started.");
		}
		
		return isStarted;
	}

	public void moveOnWheels() {
		System.out.println(this + " moves on wheels..");
		for (Wheel wheel : wheels) {
			wheel.roll();
		}
	}
	
	public abstract void applyBrakes();

}
