/**
 * Chapter 4: Sun.java
 * A class that implements the Draggable interface.
 */

package com.fulan.learn.snowcartoon;
import wheels.users.*;

public class Sun extends Ellipse implements Draggable {
	private java.awt.Point _lastMousePosition; // attribute
	
	public Sun(int x, int y) {
		super(java.awt.Color.yellow);
		_lastMousePosition = new java.awt.Point();
		this.setLocation(x, y);
	}
	
	public void mousePressed(java.awt.event.MouseEvent e) {
		_lastMousePosition = e.getPoint();
		this.setColor(java.awt.Color.blue);
	}
	
	public void mouseDragged(java.awt.event.MouseEvent e) {
		java.awt.Point currentPoint = e.getPoint();
		int diffX = currentPoint.x - _lastMousePosition.x;
		int diffY = currentPoint.y - _lastMousePosition.y;
		this.setLocation(this.getLocation().x + diffX, 
				this.getLocation().y + diffY);
		_lastMousePosition = currentPoint;
	}
	
	public void mouseReleased(java.awt.event.MouseEvent e) {
		this.setColor(java.awt.Color.yellow);
	}
}
