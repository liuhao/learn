package com.fulan.learn.suncartoon;
import wheels.users.*;

public class SunCartoon extends Frame{
	private Ellipse _sun; // components
	private ConversationBubble _bubble;
	
	public SunCartoon() {
		_sun = new Ellipse(java.awt.Color.YELLOW);
		_bubble = new ConversationBubble("Here comes the sun !", ConversationBubble.TAIL_DIR_LEFT);
	}
	
	public static void main (String[] args) {
		SunCartoon cartoon = new SunCartoon();
		//cartoon._bubble.setLocation(130, 150);
	}
}
