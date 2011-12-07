package com.fulan.learn.snowcartoon;
import wheels.users.*;

public class SnowCartoon extends Frame {
	private Snowman _snowman;
	private Hat _hat;
	private Ellipse _sun;
	private ConversationBubble _bubble;
	
	public SnowCartoon() {
		_snowman = new Snowman();
		_hat = new Hat(java.awt.Color.red);
		_hat.setLocation(20, 180);
		_sun = new Sun(300, 300);
		_bubble = new ConversationBubble("Happy snow day!", ConversationBubble.TAIL_DIR_LEFT);
		_bubble.setLocation(110, 110);
	}
	
	/**
	 * @param args
	 */
	
	public static void main (String[] args) {
		SnowCartoon snowCartoon = new SnowCartoon();
	}

}
