package com.fulan.learn.carproxy;
/**
 * Chapter 9: CarProxyPanel.java
 * Panel that contains images for the CarProxyApp.
 */
public class CarProxyPanel extends javax.swing.JPanel implements Mover {
	private final int INTERVAL = 100; // attribute
    private Car _car1, _car2; // components
    private MoveTimer _timer;
    private CarProxy _proxy; // peer object

    public CarProxyPanel (CarProxy aProxy) {
    	super();
    	_car1 = new Car("/home/d06lh/Workspaces/MyEclipse for Spring 8.6/learn/accessory/redCar.jpg", this, 100, 10);
    	_car2 = new Car("/home/d06lh/Workspaces/MyEclipse for Spring 8.6/learn/accessory/car2.jpg", this, 10, 160);
    	_timer = new MoveTimer(INTERVAL, this);
    	_proxy = aProxy;
    	_car1.setSize(137, 50); // originally 1372 x 500
    	_car2.setSize(137, 50); // originally 1372 x 500
    	_proxy.setCar(_car1); //car1 is selected at first
    	_proxy.setSelected(true);
    	this.setBackground(java.awt.Color.white);
    	this.addMouseListener (new MyMouseListener(this));
    }
    public void startTimer () {
    	_timer.start();
    }
    public void move() {
    	_car1.move();
    	_car2.move();
    	this.repaint();
    }
    public void paintComponent (java.awt.Graphics aBrush) {
    	super.paintComponent(aBrush);
    	java.awt.Graphics2D betterBrush = (java.awt.Graphics2D) aBrush;
    	_car1.paint(betterBrush);
    	_car2.paint(betterBrush);
    }
    private class MyMouseListener extends javax.swing.event.MouseInputAdapter {
    	private CarProxyPanel _panel; // peer object

    	public MyMouseListener (CarProxyPanel aPanel) {
    		_panel = aPanel;
    	}
    	public void mouseClicked(java.awt.event.MouseEvent e){
    		_proxy.setSelected(false); // unselect old image
    		if (_car1.contains(e.getPoint())) {
    			_proxy.setCar(_car1); // reset proxy
    			_proxy.setSelected(true); // select new image
    		}
    		else if (_car2.contains(e.getPoint())) {
    			_proxy.setCar(_car2); // reset proxy
    			_proxy.setSelected(true); // select new image
    		} else { // click outside both cars
    			_proxy.setCar(null); // reset proxy
    		}
    		_panel.repaint();
    	}
    }
}