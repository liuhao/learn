package com.fulan.learn.composite;
import wheels.users.Rectangle;

public class HatPart extends Rectangle {

  private Hat _hat;

    public HatPart(Hat aHat) {
    	super(java.awt.Color.white);
    	_hat = aHat;
    }
}