package com.fulan.learn.composite;
/**
 * Chapter 9: AlienApp.java
 * A window that contains two panels, one with a picture of an alien and one
 * with buttons that control the movement of the picture.
 */
public class AlienApp extends javax.swing.JFrame {
	public AlienApp (String title) {
		super(title);
		this.setSize(600, 450);

		AlienPanel alienPanel = new AlienPanel();
		ControlPanel controlPanel = new ControlPanel(alienPanel);
        this.add(alienPanel, java.awt.BorderLayout.CENTER);
        this.add(controlPanel, java.awt.BorderLayout.SOUTH);
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main (String [ ] args) {
    	AlienApp app = new AlienApp("Design Patterns III: Composite");
    }
}