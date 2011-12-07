package com.fulan.learn.blob;


import wheels.users.*;

public class BlobApp extends Frame {

    private Winky _winky;
    private TalkativeBlob _talky;
    private HappyBlob _happy;

    public BlobApp() {
       _winky = new Winky(300, 300);
	   _talky = new TalkativeBlob(400, 200, "I'm so Happy!");
	   _happy = new HappyBlob(150,130);

    }

    public static void main (String[] argv) {
    	new BlobApp();
    }
}

