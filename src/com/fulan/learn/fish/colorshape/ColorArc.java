package com.fulan.learn.fish.colorshape;
/**
 * Chapter 7.6*: alternative design for ColorArc
 */
public class ColorArc extends ColorShape {
    public ColorArc (double aStart, double anExtent, int aType,java.awt.Color aColor){
    	super (new java.awt.geom.Arc2D.Double(0, 0, 0, 0, aStart, anExtent, aType));
    	this.setFillColor(aColor);
    	this.setBorderColor(aColor);
    }
}