package com.fulan.learn.blob;


import wheels.users.ConversationBubble;

public class HappyBlob extends TalkativeBlob {
	public HappyBlob(int x, int y) {
		super(x, y, "I'm so Happy!");
	}
	
	public void mousePressed(java.awt.event.MouseEvent e) {
		   _bubble.hide();
	}

	public void mouseReleased(java.awt.event.MouseEvent e) {
		   _bubble.show();
	}
}
