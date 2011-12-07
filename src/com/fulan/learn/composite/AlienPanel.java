package com.fulan.learn.composite;
/**
 * Chapter 9: AlienPanel.java
 * A panel that contains a picture of a space alien.
 */
public class AlienPanel extends javax.swing.JPanel implements Mover {
	private SpaceAlien _alien;
	private SnowMan _snowman;
    private final int INIT_X = 75;
    private final int INIT_Y = 75;
    private MoveTimer _timer;
    private final int INTERVAL = 100;

    public AlienPanel () {
    	super();
    	this.setBackground(java.awt.Color.white);
    	_alien = new SpaceAlien (this);
    	_alien.setLocation(INIT_X, INIT_Y);
    	_snowman = new SnowMan (this);
    	_timer = new MoveTimer(INTERVAL, this);
    	_timer.start();
    }
    public void move () {
    	_alien.move();
    	this.repaint();
    }

    public SpaceAlien getAlien() {
    	return _alien;
    }
    public void paintComponent (java.awt.Graphics aBrush) {
    	super.paintComponent(aBrush);
    	java.awt.Graphics2D aBetterBrush = (java.awt.Graphics2D) aBrush;
    	_alien.fill(aBetterBrush);
    	_snowman.fill(aBetterBrush);
    }
}