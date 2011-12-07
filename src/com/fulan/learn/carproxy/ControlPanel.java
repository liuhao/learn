package com.fulan.learn.carproxy;

import com.fulan.learn.holder.QuitButton;

/**
 * Chapter 9: ControlPanel.java
 * Contains buttons for CarProxyApp.
 */
public class ControlPanel extends javax.swing.JPanel {
    private final int REVERSE = -5; // attributes, both x-speeds
    private final int FORWARD = 5;   // (y-speeds are 0)

    public ControlPanel (Accelerator anAccelerator) {
	super(new java.awt.GridLayout(0, 1));

	// speed buttons (all connected to CarProxy)
	SpeedButton reverseButton = new SpeedButton("Reverse", REVERSE, 0, anAccelerator);
	SpeedButton stopButton = new SpeedButton("Stop", 0, 0, anAccelerator);
	SpeedButton forwardButton = new SpeedButton("Forward", FORWARD, 0, anAccelerator);
	stopButton.setBackground(java.awt.Color.red);
	javax.swing.JPanel buttonRow = new javax.swing.JPanel();
	buttonRow.add(reverseButton);
	buttonRow.add(stopButton);
	buttonRow.add(forwardButton);

	// quit button
	javax.swing.JPanel quitRow = new javax.swing.JPanel();
	quitRow.add(new QuitButton());

	// put it all together
	this.add(buttonRow);
	this.add(quitRow);

	}
}