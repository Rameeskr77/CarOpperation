/**
 * 
 */
package com.aitrich.corejava.oop.domain;

/**
 * This abstract implementation of {@link Engine} covers the common
 * features of an Engine. Sub classes implement the specific features such as the {@link Engine#run()} method.
 *  
 * @author Shameer
 * @since 2nd Dec 2010
 *
 */
public abstract class AbstractEngine implements Engine {

	private String name;
	private String modelNumber;
	private String manufacturer;
	
	private State state;
	
	/**
	 * 
	 */
	public AbstractEngine() {
		this.state = State.Stopped;
		System.out.println(this + " is instantiated !");
	}

	public AbstractEngine(String name, String modelNumber, String manufacturer) {
		super();
		this.name = name;
		this.modelNumber = modelNumber;
		this.manufacturer = manufacturer;
		this.state = State.Stopped;
		System.out.println(this + " is instantiated !");
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the modelNumber
	 */
	public String getModelNumber() {
		return modelNumber;
	}

	/**
	 * @param modelNumber the modelNumber to set
	 */
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(State state) {
		this.state = state;
	}

	/* (non-Javadoc)
	 * @see com.aitrich.course.corejava.oo.domain.Engine#start()
	 */
	public boolean start() {
		this.state = State.Running;
		System.out.println(this + " is started !");
		return true;
	}

	/* (non-Javadoc)
	 * @see com.aitrich.course.corejava.oo.domain.Engine#accelerate()
	 */
	public void accelerate() {
		System.out.println(this + " is accelerated ! Running faster now");
	}

	/* (non-Javadoc)
	 * @see com.aitrich.course.corejava.oo.domain.Engine#slowDown()
	 */
	public void slowDown() {
		System.out.println(this + " is slowed down !");
	}

	/* (non-Javadoc)
	 * @see com.aitrich.course.corejava.oo.domain.Engine#stop()
	 */
	public boolean stop() {
		System.out.println(this + " is stopped !");
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AbstractEngine [");
		if (name != null) {
			builder.append("name=");
			builder.append(name);
			builder.append(", ");
		}
		if (modelNumber != null) {
			builder.append("modelNumber=");
			builder.append(modelNumber);
			builder.append(", ");
		}
		if (manufacturer != null) {
			builder.append("manufacturer=");
			builder.append(manufacturer);
		}
		builder.append("]");
		return builder.toString();
	}

	public enum State {
		Running,
		Stopped;
	}
}
