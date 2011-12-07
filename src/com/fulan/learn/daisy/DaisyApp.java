package com.fulan.learn.daisy;
import wheels.users.*;

public class DaisyApp extends Frame {
	private ConversationBubble _bubble; // components
	private Daisy _daisy;
	
	public DaisyApp() {
		super();
		_bubble = new ConversationBubble("Click on a petal to remove it.");
		_daisy = new Daisy(210, 280, _bubble);
		_bubble.setLocation(110, 110);
	}
	
	public static void main(String[] args) {
		DaisyApp app = new DaisyApp();
	}
}
