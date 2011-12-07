package com.fulan.learn.carproxy;
/**
 * Chapter 9: Car.java
 * A subclass of Image with the capability of moving right and left.
 */
public class Car extends Image implements Mover {
    private int _changeX, _changeY;  // attributes
    private javax.swing.JPanel _panel; // peer object (and container)

    public Car (String aFilePath, javax.swing.JPanel aPanel, int x, int y) {
    	super(aFilePath, aPanel, x, y);
    	_changeX = 0; _changeY = 0;
    	_panel = aPanel;
    }
    public void setSpeed(int x, int y) {
    	_changeX = x;
    	_changeY = y;
    }

    // stops moving at edge of frame
    public void move() {
        int nextX = (int)this.getX() + _changeX;
        int nextY = (int)this.getY() +  _changeY;
        if (nextX <= this.getMinBoundX()) {
        	_changeX = 0;
        	nextX = this.getMinBoundX();
        }
        else if (nextX >= this.getMaxBoundX()) {
        	_changeX = 0;
        	nextX = this.getMaxBoundX();
        }
        if (nextY <= this.getMinBoundY()) {
        	_changeY = 0;
        	nextY  = this.getMinBoundY();
        }
        else if (nextY > this.getMaxBoundY()){
        	_changeY = 0;
        	nextY = this.getMaxBoundY();
        }
        this.setLocation(nextX, nextY);
    }
    public int getMinBoundX() {
    	return (int) _panel.getX();
    }
    public int getMaxBoundX() {
    	return (int) (_panel.getX() + _panel.getWidth() - this.getWidth());
    }
    public int getMinBoundY() {
    	return (int) _panel.getY();
    }
    public int getMaxBoundY() {
    	return (int) (_panel.getY() + _panel.getHeight() - this.getHeight());
    }
}