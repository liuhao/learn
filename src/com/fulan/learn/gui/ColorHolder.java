package com.fulan.learn.gui;

import java.awt.Color;

public class ColorHolder implements Colorable {
	private java.awt.Color _color; // component

	public ColorHolder() {
		super();
		_color = java.awt.Color.red; //default
	}

	public void setColor(Color aColor) {
		_color = aColor;
	}

	public java.awt.Color getColor(Color aColor) {
		return _color;
	}

}
