package com.fulan.learn.sketch;

public class Cursor {
	private java.awt.Point _location; // component
	private java.awt.Color _color;
	private int _size;
	
	public Cursor() {
		super();
		_location = new java.awt.Point(350, 250);
		_color = java.awt.Color.black;
		_size = 2;
	}
	
	public void setLocation(java.awt.Point point) {
		_location = point;
	}
	
	public java.awt.Point getLocation() {
		return _location;
	}
	
	public void setColor(java.awt.Color color) {
		_color = color;
	}
	
	public java.awt.Color getColor() {
		return _color;
	}
	
	public void setSize(int size) {
		_size = size;
	}
	
	public int getSize() {
		return _size;
	}
}
