package com.fulan.learn.composite;
import com.fulan.learn.gui.QuitButton;
/**
 * Chapter 9: ControlPanel.java
 * Contains buttons that control the movement of a space alien in
 * another panel.
 */
public class ControlPanel extends javax.swing.JPanel {
    private final int MAX_SPEED = 20; // attribute

    public ControlPanel (AlienPanel aPanel) {
    	super(new java.awt.GridLayout(0, 1));

    	// slider
    	Accelerator accelerator = aPanel.getAlien();
    	javax.swing.JPanel sliderRow = new javax.swing.JPanel();
    	sliderRow.add(new SpeedSlider(javax.swing.JSlider.HORIZONTAL, accelerator,
    			0, MAX_SPEED, 0));
    	// quit button
    	javax.swing.JPanel quitRow = new javax.swing.JPanel();
    	quitRow.add(new QuitButton());

    	// put it all together
    	this.add(sliderRow);
    	this.add(quitRow);
    }
}