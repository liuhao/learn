package com.fulan.learn.snowcartoon;
import wheels.users.*;

public class HatPart extends Rectangle implements Draggable {

  private Hat _hat;

    public HatPart(Hat aHat) {
    	super(java.awt.Color.white);
    	_hat = aHat;
    }

    public void mousePressed(java.awt.event.MouseEvent e){
    	_hat.mousePressed(e);
    }

    public void mouseDragged(java.awt.event.MouseEvent e){
    	_hat.mouseDragged(e);
    }

   public void mouseReleased(java.awt.event.MouseEvent e){
	   _hat.mouseReleased(e);
   }
}
