package com.fulan.learn.ball;

import javax.swing.JPanel;
import javax.swing.JButton;

import com.fulan.learn.fish.MoveTimer;
import com.fulan.learn.fish.Mover;

public class BallPanel extends JPanel implements Mover {
	private final int INIT_X = 75; // attributes
    private final int INIT_Y = 75;
    private final int DIAMETER = 60;
    private final int INTERVAL = 10;
    private BouncingBall _bigBall, _smallBall; // component
    private MoveTimer _timer;

	public BallPanel() {
		super();
		this.setBackground(java.awt.Color.white);
		_bigBall = new BouncingBall(java.awt.Color.red, this);
		_bigBall.setLocation(INIT_X, INIT_Y);
		_bigBall.setSize(DIAMETER, DIAMETER);
		_smallBall = new BouncingBall(java.awt.Color.blue, this);
		_smallBall.setLocation(INIT_X*3, INIT_Y*3);
		_smallBall.setSize(DIAMETER/2, DIAMETER/2);
		_timer = new MoveTimer(INTERVAL, this);
		_timer.start();
		this.add(new JButton("yes"));
	}

	public void move() {
		_bigBall.move();
		_smallBall.move();
		this.repaint();
	}

	public void paintComponent(java.awt.Graphics aBrush) {
		super.paintComponent(aBrush);
		java.awt.Graphics2D betterBrush = (java.awt.Graphics2D) aBrush;
		_bigBall.fill(betterBrush);
		_smallBall.draw(betterBrush);
	}
}
