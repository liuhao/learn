package com.fulan.learn.carproxy;
/**
 * Chapter 9: CarProxy.java
 * Illustrates the Proxy Pattern.
 */
public class CarProxy implements Mover, Accelerator {
	private Car _car; // peer object

	public CarProxy () {
		super();
		_car = null; // default
    }
    public void setCar (Car car) {
    	_car = car;
    }

    // methods for forwarding messages
    public void move () {
    	if (null != _car)
    		_car.move();
    }
    public void setSpeed (int xSpeed, int ySpeed) {
    	if (null != _car)
    		_car.setSpeed(xSpeed, ySpeed);
    }
    public void setSelected (boolean aValue) {
    	if (null != _car)
    		_car.setSelected(aValue);
    }
    public int getMinBoundX() {
    	if (null != _car)
    		return _car.getMinBoundX();
    	else return 0;
    }
    public int getMaxBoundX() {
    	if (null != _car)
    		return _car.getMaxBoundX();
    	else return 0;
    }
    public int getMinBoundY() {
    	if (null != _car)
    		return _car.getMinBoundY();
    	else return 0;
    }
    public int getMaxBoundY() {
    	if (null != _car)
    		return _car.getMaxBoundY();
    	else return 0;
    }
}