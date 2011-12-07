package com.fulan.learn.sketch;

import wheels.users.*;

public abstract class DrawButton extends Ellipse {
	private Cursor _cursor; // peer object
	
	public DrawButton (int x, int y, Cursor cursor) {
		super(x, y);
		_cursor = cursor; // store reference to peer cursor
		this.setSize(20, 20);
	}
	
	public void mousePressed(java.awt.event.MouseEvent e) {
		java.awt.Point lastPoint = _cursor.getLocation();
		java.awt.Point nextPoint = computeNextPoint(lastPoint);
		Line line = new Line(lastPoint, nextPoint);
		line.setColor(_cursor.getColor());
		line.setThickness(_cursor.getSize());
		_cursor.setLocation(nextPoint);
		//this.setFillColor(java.awt.Color.red);
	}
	
	public abstract java.awt.Point computeNextPoint(java.awt.Point lastPoint);
}
