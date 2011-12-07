package com.fulan.learn.gui;

import java.awt.event.*;
import com.fulan.learn.fish.SmartEllipse;
import com.fulan.learn.fish.SmartRectangle;

public class ColorShapePanel extends javax.swing.JPanel {
	private SmartEllipse _ellipse; // components
	private SmartRectangle _rectangle;

	public ColorShapePanel (ColorHolder aHolder) {
		super();
		_ellipse = new SmartEllipse(java.awt.Color.blue);
		_rectangle = new SmartRectangle(java.awt.Color.red);
		_ellipse.setSize(60, 60);
		_ellipse.setLocation(200, 200);
		_rectangle.setSize(20, 100);
		_rectangle.setLocation(100, 130);
		this.setBackground(java.awt.Color.white);
		this.addMouseListener(new MyMouseListener());
	}

	public void paintComponent(java.awt.Graphics aBrush) {
		super.paintComponent(aBrush);
		java.awt.Graphics2D betterBrush = (java.awt.Graphics2D) aBrush;
		_ellipse.fill(betterBrush);
		_ellipse.draw(betterBrush);
		_rectangle.fill(betterBrush);
		_rectangle.draw(betterBrush);
	}

	private class MyMouseListener extends javax.swing.event.MouseInputAdapter {
		public void mouseClicked (java.awt.event.MouseEvent e) {
			if (_ellipse.contains(e.getPoint()))
				_ellipse.setFillColor(java.awt.Color.yellow);
			else if (_rectangle.contains(e.getPoint()))
				_rectangle.setFillColor(java.awt.Color.yellow);
		}
	}
}

