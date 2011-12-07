package com.fulan.learn.snowcartoon;
import wheels.users.*;

public class Snowman {
	private Ellipse _head, _body, _leftEye, _rightEye;
	
	public Snowman() {
		_head = new Ellipse(java.awt.Color.white);
		_head.setSize(80, 80);
		_head.setLocation(20, 240);
		_body = new Ellipse(java.awt.Color.white);
		_body.setSize(100, 100);
		_body.setLocation(10, 300);
		_leftEye = new Ellipse(java.awt.Color.black);
		_leftEye.setSize(15, 15);
		_leftEye.setLocation(35, 265);
		_rightEye = new Ellipse(java.awt.Color.black);
		_rightEye.setSize(15, 15);
		_rightEye.setLocation(75, 265);
		this.setOutline(java.awt.Color.black, 2);
	}
	
	public void setOutline (java.awt.Color color, int thickness) {
		_body.setFrameColor(color);
		_body.setFrameThickness(thickness);
		_head.setFrameColor(color);
		_head.setFrameThickness(thickness);
	}
}
