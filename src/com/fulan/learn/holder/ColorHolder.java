package com.fulan.learn.holder;
/**
 * Chapter 9: ColorHolder.java
 * Illustrates the Holder Pattern.
 */
public class ColorHolder implements Colorable {
    private java.awt.Color _color; // component

    public ColorHolder () {
        super();
        _color = java.awt.Color.red; // default
    }

    public void setColor (java.awt.Color color ) {
    	_color = color;
    }
    public java.awt.Color getColor () {
    	return _color;
    }
}