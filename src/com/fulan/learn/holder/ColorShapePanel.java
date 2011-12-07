package com.fulan.learn.holder;
/**
 * Chapter 9: ColorShapePanel.java
 * The panel that contains the shapes for ColorHolderApp.
 */
public class ColorShapePanel extends javax.swing.JPanel {
	private SmartEllipse _ellipse; // components
	private SmartRectangle _rectangle;
	private ColorHolder _holder; // peer object

	public ColorShapePanel (ColorHolder aHolder) {
		super();
		_ellipse = new SmartEllipse(java.awt.Color.blue);
		_rectangle = new SmartRectangle(java.awt.Color.red);
		_holder = aHolder;
		_ellipse.setSize(60, 60);
		_ellipse.setLocation(200, 200);
		_rectangle.setSize(20, 100);
		_rectangle.setLocation(100, 130);
		this.setBackground(java.awt.Color.white);
		this.addMouseListener(new MyMouseListener(this));
    }

    public void paintComponent (java.awt.Graphics aBrush) {
    	super.paintComponent(aBrush);
        java.awt.Graphics2D betterBrush = (java.awt.Graphics2D) aBrush;
        _ellipse.fill(betterBrush);
        _ellipse.draw(betterBrush);
        _rectangle.fill(betterBrush);
        _rectangle.draw(betterBrush);
    }

    private class MyMouseListener extends javax.swing.event.MouseInputAdapter {
    	private ColorShapePanel _panel;

    	public MyMouseListener (ColorShapePanel aPanel) {
    		_panel = aPanel;
    	}

    	public void mouseClicked (java.awt.event.MouseEvent e){
    		if (_ellipse.contains(e.getPoint())) {
    			_ellipse.setColor(_holder.getColor());
    			_ellipse.setBorderColor(java.awt.Color.black);
    			_rectangle.setBorderColor(getBackground());
    			_panel.repaint();
    		}
    		else if (_rectangle.contains(e.getPoint())) {
    			_rectangle.setColor(_holder.getColor());
    			_rectangle.setBorderColor(java.awt.Color.black);
    			_ellipse.setBorderColor(getBackground());
    			_panel.repaint();
    		}
    	}
    }
}