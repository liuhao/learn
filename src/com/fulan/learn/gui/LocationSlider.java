package com.fulan.learn.gui;

public class LocationSlider extends javax.swing.JSlider {
    private Mover _mover;

    public LocationSlider (int anOrientation, Mover aMover,
    		int aMinLocation, int aMaxLocation, int aCurrentLocation) {
    	super(anOrientation, aMinLocation, aMaxLocation, aCurrentLocation);
    	_mover = aMover;
    	this.setValue(0);
    	this.setMinimum(0);
    	this.setMaximum(aMaxLocation);
    	this.setMajorTickSpacing(5);
    	this.setMinorTickSpacing(1);
    	this.setPaintTicks(true);
    	this.setPaintLabels(true);
    	this.addChangeListener(new LocationListener(this));
    }

    private class LocationListener implements javax.swing.event.ChangeListener {
    	private LocationSlider _slider;
    	private int _value;

    	public LocationListener (LocationSlider aSlider) {
    		_slider = aSlider;
    	}

    	public void stateChanged (javax.swing.event.ChangeEvent e) {
    		_mover.move();
    	}
    }
}


