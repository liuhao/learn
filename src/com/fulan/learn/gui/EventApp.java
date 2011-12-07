package com.fulan.learn.gui;

import javax.swing.*;

public class EventApp extends JFrame {
	ColorPanel _panel;
	ColorButton _blackRadioButton, _blueRadioButton, _redRadioButton;
	ButtonGroup _buttonGroup;
	LocationSlider _slider;
	MoverButton _moverButton;

	public EventApp (String title) {
		super(title);
		this.setSize(600, 450);
		this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		_panel = new ColorPanel();
		_buttonGroup = new ButtonGroup();
		_blackRadioButton = new ColorButton(java.awt.Color.black, _panel, _buttonGroup, false);
		_blueRadioButton = new ColorButton(java.awt.Color.blue, _panel, _buttonGroup, false);
		_redRadioButton = new ColorButton(java.awt.Color.red, _panel, _buttonGroup, false);
		_moverButton = new MoverButton("Change");
		_slider = new LocationSlider(javax.swing.JSlider.VERTICAL, _moverButton, 0, 5, 0);
		this.add(_panel);
		_panel.add(_slider);
		_panel.add(_moverButton);
		_panel.add(_blackRadioButton);
		_panel.add(_blueRadioButton);
		_panel.add(_redRadioButton);
		this.setVisible(true);
	}

		  public static void main (String [ ] args) {
		    EventApp app = new EventApp ("Chapter 7: BallApp");
		  }

}
