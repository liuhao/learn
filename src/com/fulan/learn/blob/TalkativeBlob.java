package com.fulan.learn.blob;

import wheels.users.*;

public class TalkativeBlob extends Blob {
    ConversationBubble _bubble;

    public TalkativeBlob(int x, int y, String speech) {
    	super(x, y);
    	_bubble = new ConversationBubble(speech);
    	_bubble.setLocation(x-100, y-100);
    	_bubble.hide();
    }

   public void mousePressed(java.awt.event.MouseEvent e){
	   _bubble.show();
    }

   public void mouseReleased(java.awt.event.MouseEvent e){
	   _bubble.hide();
    }
}
