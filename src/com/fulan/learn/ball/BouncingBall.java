package com.fulan.learn.ball;

import com.fulan.learn.fish.Mover;
import com.fulan.learn.fish.SmartEllipse;

public class BouncingBall extends SmartEllipse implements Mover {
	private int _changeX, _changeY; // attribute
	private final int MOVE_LEN = 1;
	private javax.swing.JPanel _panel; // peer ojbect (and container)

	public BouncingBall(java.awt.Color aColor, javax.swing.JPanel aPanel) {
		super(aColor);
		_changeX = MOVE_LEN;
		_changeY = MOVE_LEN;
		_panel = aPanel;
	}

	public void move() {
		int nextX = (int)this.getX() + _changeX;
		int nextY = (int)this.getY() +  _changeY;
		if (nextX <= this.getMinBoundX()) {
		    _changeX *= -1;
		    nextX = this.getMinBoundX();
		}
		else if (nextX >= this.getMaxBoundX()) {
		    _changeX *= -1;
		    nextX = this.getMaxBoundX();
		}
		if (nextY <= this.getMinBoundY()) {
		    _changeY *= -1;
		    nextY  = this.getMinBoundY();
		}
		else if (nextY > this.getMaxBoundY()){
		    _changeY *= -1;
		    nextY = this.getMaxBoundY();
		}
		this.setLocation(nextX, nextY);
    }

    public int getMinBoundX() {
		return (int) _panel.getX();
	}

    public int getMinBoundY() {
		return (int) _panel.getY();
	}

	public int getMaxBoundX() {
	     	return (int) (_panel.getX() + _panel.getWidth()
			      - this.getWidth());
	}

	public int getMaxBoundY() {
		return (int) (_panel.getY() + _panel.getHeight()
			      - this.getHeight());
	}
}
