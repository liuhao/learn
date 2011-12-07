package com.fulan.learn.daisy;
import wheels.users.*;

public class Daisy {
    private ConversationBubble _bubble;
    private byte _numPetalsPlucked;
    private Ellipse _center;
    private Rectangle _stem;

    public Daisy(int x, int y, ConversationBubble aBubble) {
	_bubble = aBubble;
	_stem = new Rectangle(java.awt.Color.green);
	_stem.setSize(10, 100);
	_stem.setLocation(x+15, y+40);
	_numPetalsPlucked = 0;
	new Petal(x-20, y-30, 0, this);
	new Petal(x, y-30, 40, this);
	new Petal(x+20, y-30, 80, this);
	new Petal(x-30, y, 120, this);
	new Petal(x+30, y, 160, this);
	new Petal(x-30, y+25, 200, this);
	new Petal(x-10, y+30, 240, this);
	new Petal(x+10, y+30, 280, this);
	new Petal(x+30, y+25, 320, this);
	_center = new Ellipse(java.awt.Color.yellow);
	_center.setSize(40, 40);
	_center.setLocation(x, y);
    }

    public void petalPlucked () {
	_numPetalsPlucked++;
	if (_numPetalsPlucked % 2 == 0) 
	    _bubble.setText("Loves me not.");
	else
	    _bubble.setText("Loves me.");
    }
}
