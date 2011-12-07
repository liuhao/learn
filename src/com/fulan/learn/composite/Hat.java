package com.fulan.learn.composite;

public class Hat implements Mover, Accelerator {
	private int _x, _y;
    private java.awt.Point _lastMousePosition;
    private HatPart _hatUpper, _hatBrim;

    public Hat(java.awt.Color aColor) {
    	_x = 80;
    	_y = 100;
    	_hatUpper = new HatPart(this);
    	_hatBrim  = new HatPart(this);
    	_lastMousePosition = new java.awt.Point();
    	this.setColor(aColor);
    	this.setLocation(80, 100);
    }

    public void setColor(java.awt.Color aColor) {
	_hatBrim.setColor(aColor);
	_hatUpper.setColor(aColor);
    }

    public void setLocation(int x, int y) {
	_x = x;
	_y = y;
	_hatBrim.setLocation(x, y + 50);
	_hatUpper.setLocation(x + 10, y);
    }

    public void move() {
    	;
    }

    public void setSpeed (int aSpeed) {
    	;
    }
}