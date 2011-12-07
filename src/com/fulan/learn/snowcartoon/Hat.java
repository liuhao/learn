package com.fulan.learn.snowcartoon;

public class Hat implements Draggable {
	private int _x, _y;
    private java.awt.Point _lastMousePosition;
    private HatPart _hatUpper, _hatBrim;

    public Hat(java.awt.Color aColor) {
    	_x = 80; 
    	_y = 100;
    	_hatUpper = new HatPart(this);
    	_hatBrim  = new HatPart(this);
    	_lastMousePosition = new java.awt.Point();
    	this.setSize();
    	this.setColor(aColor);
    	this.setLocation(80, 100);
    }

    public void setColor(java.awt.Color aColor) {
	_hatBrim.setColor(aColor);
	_hatUpper.setColor(aColor);
    }

    public void setLocation(int x, int y) {
	_x = x;
	_y = y;
	_hatBrim.setLocation(x, y + 50);
	_hatUpper.setLocation(x + 10, y);
    }

    public void setSize () {
	_hatBrim.setSize(80, 20);
	_hatUpper.setSize(60, 60);
    }

   public void mousePressed(java.awt.event.MouseEvent e) {
	_lastMousePosition = e.getPoint();
	this.setColor(java.awt.Color.blue);
   }

   public void mouseDragged(java.awt.event.MouseEvent e) {
	java.awt.Point currentPoint = e.getPoint();
	int diffX = currentPoint.x - _lastMousePosition.x;
	int diffY = currentPoint.y - _lastMousePosition.y;
	this.setLocation(_x + diffX, _y + diffY);
	_lastMousePosition = currentPoint;
    }

   public void mouseReleased(java.awt.event.MouseEvent e){
	this.setColor(java.awt.Color.black);
   }
}
