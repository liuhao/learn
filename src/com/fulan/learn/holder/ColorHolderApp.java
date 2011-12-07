package com.fulan.learn.holder;
/**
 * Chapter 9: ColorHolderApp.java
 * Creates a window that holds a mini-drawing program.
 */
public class ColorHolderApp extends javax.swing.JFrame {
	public ColorHolderApp (String title) {
		super(title);
		this.setSize(600, 450);
		ColorHolder holder = new ColorHolder();
		ColorShapePanel shapePanel =new ColorShapePanel(holder);
		ControlPanel controlPanel = new ControlPanel(holder);
		this.add(shapePanel, java.awt.BorderLayout.CENTER);
		this.add(controlPanel, java.awt.BorderLayout.SOUTH);
		this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main (String [ ] args) {
		ColorHolderApp app = new ColorHolderApp("Design Patterns I: Holder");
	}
}
