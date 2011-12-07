package com.fulan.learn.carproxy;
/**
 * Chapter 9: SpeedButton.java
 * Controls the speed of some Accelerator object.
 * Illustrates the event-handler recipe.
 */
public class SpeedButton extends javax.swing.JButton {
    private int _xSpeed, _ySpeed; // attributes
    private Accelerator _accelerator; // peer object

    public SpeedButton (String aLabel, int xSpeed, int ySpeed,
			Accelerator anAccelerator){
    	super(aLabel);
    	_xSpeed = xSpeed;
    	_ySpeed = ySpeed;
    	_accelerator = anAccelerator;
    	this.addActionListener(new SpeedListener());
    }

    private class SpeedListener implements java.awt.event.ActionListener {
    	public void actionPerformed(java.awt.event.ActionEvent e) {
    		_accelerator.setSpeed(_xSpeed, _ySpeed);
    	}
    }
}
