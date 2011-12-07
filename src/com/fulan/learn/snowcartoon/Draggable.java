/**
 * Chapter 4: Draggable.java
 * An interface for objects that can be dragged with a mouse.
 */

package com.fulan.learn.snowcartoon;

public interface Draggable {
	public void setColor(java.awt.Color aColor);
	public void setLocation(int x, int y);
	public void mousePressed(java.awt.event.MouseEvent e);
	public void mouseDragged(java.awt.event.MouseEvent e);
	public void mouseReleased(java.awt.event.MouseEvent e);
}
