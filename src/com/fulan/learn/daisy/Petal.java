package com.fulan.learn.daisy;
import java.awt.event.*;
import wheels.users.*;

public class Petal extends Ellipse {
	private boolean _plucked; // attribute
	private Daisy _daisy; // peer object
	
	public Petal(int x, int y, int degrees, Daisy daisy) {
		super(degrees);
		_plucked = false;
		_daisy = daisy;
		this.setColor(java.awt.Color.white);
		this.setSize(20, 40);
		this.setLocation(x, y);
		this.setFrameColor(java.awt.Color.black);
	}
	
	public void mouseClicked(MouseEvent e) {
		if(!_plucked) {
			this.hide(); // remove petal from screen
			_daisy.petalPlucked();
			_plucked = true;
		}
	}
}
