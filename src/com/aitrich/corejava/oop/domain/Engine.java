/**
 * 
 */
package com.aitrich.corejava.oop.domain;

/**
 * Specification for engine. Defines the behaviors as methods.
 * 
 * @author Shameer
 * @since 2nd Dec 2010
 *
 */
public interface Engine  {
	boolean start();
	boolean stop();
	void run();
	void accelerate();
	void slowDown();
}
