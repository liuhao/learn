package com.fulan.learn.holder;
/**
 * Chapter 9: QuitButton.java
 * Lets the user quit a program.
 */
public class QuitButton extends javax.swing.JButton {
    public QuitButton() {
    	super("Quit");
    	this.addActionListener(new QuitListener());
    }

    private class QuitListener implements java.awt.event.ActionListener {
    	public void actionPerformed(java.awt.event.ActionEvent e) {
    		System.exit(0);
    	}
    }
}