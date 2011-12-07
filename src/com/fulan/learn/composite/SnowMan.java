package com.fulan.learn.composite;
import com.fulan.learn.gui.*;

public class SnowMan implements Mover, Accelerator {
	private SmartEllipse _head, _body, _leftEye, _rightEye;

	public SnowMan(javax.swing.JPanel aPanel) {
		_head = new SmartEllipse(java.awt.Color.yellow);
		_head.setSize(80, 80);

		_body = new SmartEllipse(java.awt.Color.yellow);
		_body.setSize(100, 100);

		_leftEye = new SmartEllipse(java.awt.Color.black);
		_leftEye.setSize(15, 15);

		_rightEye = new SmartEllipse(java.awt.Color.black);
		_rightEye.setSize(15, 15);
		this.setLocation(300, 30);
	}

	public void setLocation(int x, int y) {
    	_head.setLocation(x, y);
    	_body.setLocation(x-10, y+60);
    	_leftEye.setLocation(x+15, y+25);
    	_rightEye.setLocation(x+55, y+25);
    }

	public void fill(java.awt.Graphics2D aPaintBrush) {
    	_head.fill(aPaintBrush);
    	_body.fill(aPaintBrush);
    	_leftEye.fill(aPaintBrush);
    	_rightEye.fill(aPaintBrush);
    }
    public void draw(java.awt.Graphics2D aPaintBrush) {
    	_head.draw(aPaintBrush);
    	_body.fill(aPaintBrush);
    	_leftEye.draw(aPaintBrush);
    	_rightEye.draw(aPaintBrush);
    }

	public void move() {
    	;
    }

    public void setSpeed (int aSpeed) {
    	;
    }
}