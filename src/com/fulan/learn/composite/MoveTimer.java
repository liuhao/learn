package com.fulan.learn.composite;
/**
 * Chapter 9: MoveTimer.java
 * A timer that controls the motion of some Mover object.
 * Also illustrates the event-handler recipe.
 * Same as in CarProxyApp.
 */
public class MoveTimer extends javax.swing.Timer {
	Mover _mover;

    public MoveTimer (int anInterval, Mover aMover) {
    	super(anInterval, null);
    	_mover = aMover;
    	this.addActionListener(new MoveListener());
    }
    private class MoveListener implements java.awt.event.ActionListener {
    	public void actionPerformed (java.awt.event.ActionEvent e) {
    		_mover.move();
    	}
    }
}
