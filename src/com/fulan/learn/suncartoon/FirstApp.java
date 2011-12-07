package com.fulan.learn.suncartoon;

/* 
 * Chapter 1: FirstApp.java 
   *   Displays a red circle on a white background.
   *  The keyword extends will be explained in Chapter 3. 
 */
public class FirstApp extends wheels.users.Frame { 
	private wheels.users.Ellipse _ellipse;
	private wheels.users.Rectangle _rectangle;
//	private wheels.users.RectangularShape _rectangle;

	public FirstApp () {
	   _rectangle = new wheels.users.Rectangle();
	   _ellipse = new wheels.users.Ellipse(13,34);
	   _rectangle.hide();
	}

	//magic to let FirstApp execute
	public static void main(String[] args) {
		FirstApp app = new FirstApp();
	}
}