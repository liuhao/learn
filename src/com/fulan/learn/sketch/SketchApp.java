/**
 * Chapter 5: SketchApp.java
 * Displays four buttons and a drawing
 * board and lets the user draw simple pictures.
 */

package com.fulan.learn.sketch;

import wheels.users.*;

public class SketchApp extends Frame {
	private Cursor _cursor; // components
	private DrawButton _upButton, _downButton;
	private DrawButton _leftButton, _rightButton;
	private DrawButton _upLeftButton, _upRightButton, _downLeftButton, _downRightButton;
	private DrawButton _cyanButton, _greenButton, _redButton;
	private DrawButton _thicknessUpButton, _thicknessDownButton;
	
	public SketchApp() {
		super();
		_cursor = new Cursor();
		_upButton = new UpButton(350, 400, _cursor);
		_upLeftButton = new UpLeftButton(330, 400, _cursor);
		_upRightButton = new UpRightButton(370, 400, _cursor);
		_downButton = new DownButton(350, 440, _cursor);
		_downLeftButton = new DownLeftButton(330, 440, _cursor);
		_downRightButton = new DownRightButton(370, 440, _cursor);
		_leftButton = new LeftButton(330, 420, _cursor);
		_rightButton = new RightButton(370, 420, _cursor);
		
		_cyanButton = new LineColorButton(300, 420, _cursor, java.awt.Color.cyan);
		_greenButton = new LineColorButton(270, 420, _cursor, java.awt.Color.green);
		_redButton = new LineColorButton(240, 420, _cursor, java.awt.Color.red);
		
		_thicknessUpButton = new LineThicknessButton(210, 440, _cursor, 1);
		_thicknessDownButton = new LineThicknessButton(210, 400, _cursor, -1);
	}
	
	public static void main(String[] args) {
		SketchApp app = new SketchApp();
	}

}
