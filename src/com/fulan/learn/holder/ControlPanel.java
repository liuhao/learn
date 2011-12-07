package com.fulan.learn.holder;
/**
 * Chapter 9: ControlPanel.java
 * Contains the buttons that control the ColorHolderApp's shapes.
 */
public class ControlPanel extends javax.swing.JPanel {

    public ControlPanel (Colorable aColorable) {
    	super(new java.awt.GridLayout(0, 1));

    	// radio buttons
    	javax.swing.ButtonGroup group = new javax.swing.ButtonGroup();
    	aColorable.setColor(java.awt.Color.blue); // match holder, button
    	ColorButton blueButton = new ColorButton(java.awt.Color.blue, aColorable, group, true);
    	ColorButton greenButton = new ColorButton(java.awt.Color.green, aColorable, group, false);
    	ColorButton redButton = new ColorButton(java.awt.Color.red, aColorable, group, false);
    	ColorButton yellowButton = new ColorButton(java.awt.Color.yellow, aColorable, group, false);
    	javax.swing.JPanel radioRow = new javax.swing.JPanel();
    	radioRow.add(greenButton);
    	radioRow.add(blueButton);
    	radioRow.add(redButton);
    	radioRow.add(yellowButton);

    	// quit button
    	javax.swing.JPanel quitRow = new javax.swing.JPanel();
    	quitRow.add(new QuitButton());

    	// put colorbutton row above quitbutton row
    	this.add(radioRow);
    	this.add(quitRow);
    }
}