package com.fulan.learn.composite;

import com.fulan.learn.carproxy.Car;

public class ObjProxy implements Mover, Accelerator {
	private Mover _mover; // peer object
	private Car _car;

	public ObjProxy () {
		super();
		_mover = null; // default
    }
    public void setCar (Mover mover) {
    	_mover = mover;
    }

    // methods for forwarding messages
    public void move () {
    	if (null != _mover)
    		_mover.move();
    }
    public void setSpeed (int aSpeed) {
    	if (null != _mover)
    		//_mover.setSpeed(xSpeed);
        ;
    }
    public void setSelected (boolean aValue) {
    	if (null != _mover)
    		_car.setSelected(aValue);
    }
    public int getMinBoundX() {
    	if (null != _mover)
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
