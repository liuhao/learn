package com.fulan.learn.blob;


public class Winky extends Blob {
    public Winky (int x, int y) {
  	  super(x, y);
      }

     public void mousePressed(java.awt.event.MouseEvent e){
    	 super.mousePressed(e);
    	 _leftEye.setSize(30, 5);
    	 _leftEye.setLocation(_leftEye.getLocation().x, _leftEye.getLocation().y+15);
      }

     public void mouseReleased(java.awt.event.MouseEvent e){
       super.mouseReleased(e);
  	_leftEye.setSize(30, 30);
  	_leftEye.setLocation(_leftEye.getLocation().x, _leftEye.getLocation().y-15);
      }
}
