package com.fulan.learn.gui;

import javax.swing.JButton;

public class MoverButton extends JButton implements Mover {
	public MoverButton (String text) {
		super(text);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		this.setLabel(this.getLabel()+1);
	}

}
