package com.fulan.learn.sketch;
import java.awt.Point;


public class LineColorButton extends DrawButton {
	private Cursor _cursor;
	private java.awt.Color _color;

	public LineColorButton(int x, int y, Cursor cursor, java.awt.Color color) {
		super(x, y, cursor);
		_cursor = cursor;
		_color = color;
		this.setColor(color);
	}
	
	public void mousePressed(java.awt.event.MouseEvent e) {
		_cursor.setColor(_color);
	}
	
	public Point computeNextPoint(Point lastPoint) {
		return new java.awt.Point(lastPoint.x, lastPoint.y);
	}
}
