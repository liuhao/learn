package com.fulan.learn.composite;
import com.fulan.learn.gui.SmartEllipse;
/**
 * Chapter 9: SpaceAlien.java
 * Models a space alien.
 */
public class SpaceAlien implements Mover, Accelerator {
	private final int HEIGHT = 96; // attributes
    private final int WIDTH = 48;
    private int _changeX, _changeY;
    private SmartEllipse _face, _leftEye, _rightEye; // components
    private javax.swing.JPanel _panel; // peer object (and container)

    public SpaceAlien (javax.swing.JPanel aPanel) {
    	super();
    	_changeX = 0; _changeY = 0;
    	_face = new SmartEllipse(java.awt.Color.green);
    	_leftEye = new SmartEllipse(java.awt.Color.black);
    	_rightEye = new SmartEllipse(java.awt.Color.black);
    	_panel = aPanel;
    	this.setSize(WIDTH, HEIGHT);
    }
    public void setLocation(int x, int y) {
    	_face.setLocation(x, y);
    	_leftEye.setLocation(x+8, y+18);
    	_rightEye.setLocation(x+24, y+18);
    }
    public int getX() {
    	return (int)_face.getX();
    }
    public int getY() {
    	return (int)_face.getY();
    }
    public double getMaxX() {
    	return _face.getMaxX();
    }
    public double getMaxY() {
    	return _face.getMaxY();
    }
    public void setSize (int width, int height) {
    	_face.setSize(width, height);
    	_leftEye.setSize(width/4, height/3);
    	_rightEye.setSize(width/4, height/3);
    }
    public double getWidth () {
    	return _face.getWidth();
    }
    public double getHeight() {
    	return _face.getHeight();
    }
    public void move() {
    	int nextX = (int)this.getX() + _changeX;
    	int nextY = (int)this.getY() +  _changeY;
    	if (nextX <= this.getMinBoundX()) {
    		_changeX *= -1;
    		nextX = this.getMinBoundX();
    	}
    	else if (nextX >= this.getMaxBoundX()) {
    		_changeX *= -1;
    		nextX = this.getMaxBoundX();
    	}
    	if (nextY <= this.getMinBoundY()) {
    		_changeY *= -1;
    		nextY  = this.getMinBoundY();
    	}
    	else if (nextY > this.getMaxBoundY()){
    		_changeY *= -1;
    		nextY = this.getMaxBoundY();
    	}
    	this.setLocation(nextX, nextY);
    }

    public void setSpeed (int aSpeed) {
    	_changeX = aSpeed;
    	_changeY = aSpeed;
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

    public void fill(java.awt.Graphics2D aPaintBrush) {
    	_face.fill(aPaintBrush);
    	_leftEye.fill(aPaintBrush);
    	_rightEye.fill(aPaintBrush);
    }
    public void draw(java.awt.Graphics2D aPaintBrush) {
    	_face.draw(aPaintBrush);
    	_leftEye.draw(aPaintBrush);
    	_rightEye.draw(aPaintBrush);
    }
}