/**
 * 
 */
package com.algorithms.utils;

/**
 * 
 * Simple timer to time algorithm implementations
 * @author neildcruz
 *
 */
public class Timer {

	private long start = 0l;
	private long stop = 0l;
	
	public void start() {
		if(start != 0) {
			throw new RuntimeException("Timer already started.");
		}
		start = System.nanoTime();
	}
	
	public void stop() {
		if(stop != 0) {
			throw new RuntimeException("Timer already stopped.");
		}
		stop = System.nanoTime();
	}
	
	public void reset() {
		start = 0l;
		stop = 0l;
	}
	
	/**
	 * Reset and start timer again
	 */
	public void resetAndStart() {
		reset();
		start();
	}
	
	/**
	 * Get time taken in nano seconds
	 */
	public void getTimeNano() {
		System.out.println("Time :" + (stop-start) + " nanoSec.");
	}
	
	/**
	 * Get time taken in milli seconds
	 */
	public void getTimeMilli() {
		System.out.println("Time :" + ((stop-start)/1000000) + " ms.");
	}
}
