package com.fulan.learn.carproxy;
/**
 * Chapter 9: Image.java
 * Lets us include images in a program.
 */
public class Image {
    private boolean _selected; // attribute
    private java.awt.Image _image; // components
    private SmartRectangle _imageOutline;
    private javax.swing.JPanel _panel; // peer object (and container)

    public Image(String aFile,javax.swing.JPanel aPanel, int x, int y){
    	super();
    	_selected = false;
    	_image = java.awt.Toolkit.getDefaultToolkit().getImage(aFile);
    	_panel = aPanel;
    	java.awt.MediaTracker tracker = new java.awt.MediaTracker(_panel);
    	tracker.addImage(_image, 0);
    	try {
    		tracker.waitForAll();
    	}
    	catch(InterruptedException e) { }
    	if (tracker.isErrorAny()) {
    		System.out.println("Image failed to load.");
    		return;
    	}
    	// setting up the outline for the image
    	_imageOutline = new SmartRectangle(java.awt.Color.black);
    	_imageOutline.setSize(_image.getWidth(_panel), _image.getHeight(_panel));
    	this.setLocation(x, y);
    	_panel.repaint();
    }
    public void setSize (int aWidth, int aHeight) {
    	_imageOutline.setSize(aWidth, aHeight);
    	_image = _image.getScaledInstance(aWidth, aHeight, _image.SCALE_DEFAULT);
    	_panel.repaint();
    }
    public int  getWidth() {
    	return (int)_imageOutline.getWidth();
    }
    public int getHeight () {
    	return (int)_imageOutline.getHeight();
    }
    public void setLocation (int x, int y) {
    	_imageOutline.setLocation(x, y);
    }
    public int getX() {
    	return (int)_imageOutline.getX();
    }
    public int getY() {
    	return (int)_imageOutline.getY();
    }
    public boolean contains(java.awt.Point p) {
    	return _imageOutline.contains(p);
    }

    public void setSelected (boolean aValue) {
    	_selected = aValue;
    }
    public void paint(java.awt.Graphics2D aBetterBrush) {
    	aBetterBrush.drawImage(_image, (int)_imageOutline.getX(),
			       (int)_imageOutline.getY(), _panel);
    	if (_selected)
    		aBetterBrush.draw(_imageOutline);
    }

}