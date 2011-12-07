package com.fulan.learn.gui;

import java.awt.Color;

import javax.swing.JPanel;

public class ColorPanel extends JPanel implements Colorable {

	public ColorPanel() {
		super();
	}
	@Override
	public void setColor(Color aColor) {
		this.setBackground(aColor);

	}

}
