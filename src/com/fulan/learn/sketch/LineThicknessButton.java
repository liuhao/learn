package com.fulan.learn.sketch;

import java.awt.Point;


public class LineThicknessButton extends DrawButton {
	private Cursor _cursor;
	private int _step;

	public LineThicknessButton(int x, int y, Cursor cursor, int step) {
		super(x, y, cursor);
		_cursor = cursor;
		_step = step;
		this.setColor(java.awt.Color.black);
	}
	
	public void mousePressed(java.awt.event.MouseEvent e) {
		int lastSize = _cursor.getSize();
		int nextSize = lastSize + _step;
		if (nextSize <= 1) {
			_cursor.setSize(1);
		} else {
			_cursor.setSize(nextSize);
		}
		
	}
	
	public Point computeNextPoint(Point lastPoint) {
		return new java.awt.Point(lastPoint.x, lastPoint.y);
	}

}
