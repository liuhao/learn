package com.fulan.learn.sketch;


public class DownRightButton extends DrawButton {

	public DownRightButton(int x, int y, Cursor cursor) {
		super(x, y, cursor);
	}
	
	public java.awt.Point computeNextPoint(java.awt.Point lastPoint) {
		return new java.awt.Point(lastPoint.x+5, lastPoint.y+5);
	}

}
