package com.fulan.learn.carproxy;
/**
 * Chapter 9: CarProxy.java
 * A window that contains two panels, one with two pictures of cars,
 * and one with buttons that control the cars through a proxy.
 */
public class CarProxyApp extends javax.swing.JFrame {
	public CarProxyApp (String title) {
		super(title);
		this.setSize(600, 450);
		CarProxy proxy = new CarProxy();
		CarProxyPanel carProxyPanel = new CarProxyPanel(proxy);
		ControlPanel controlPanel = new ControlPanel(proxy);
		this.add(carProxyPanel, java.awt.BorderLayout.CENTER);
		this.add(controlPanel, java.awt.BorderLayout.SOUTH);
		this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		carProxyPanel.startTimer();
	}

	public static void main(String[] args) {
		CarProxyApp app = new CarProxyApp("Design Patterns II: Proxy");
	}
}