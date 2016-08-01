package com.hospital;

import java.awt.CardLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private LoginPanel loginPanel;
	public MainFrame() {
		init();
	}
	private void init(){
		setResizable(false);
		getContentPane().setLayout(new CardLayout());
		loginPanel=new LoginPanel();
		getContentPane().add(loginPanel, "LoginScreen");
        getRootPane().setWindowDecorationStyle(javax.swing.JRootPane.NONE);
		setVisible(false);
		this.setTitle("Hospital Management System");
		
		
		
	}
	public void showHomePage(){
		System.out.println("++++++++++++++++++");
		homePage=new HomePage();
		getContentPane().add(homePage, "HomePage");
		((CardLayout)getContentPane().getLayout()).show(getContentPane(),"HomePage");
		this.setTitle("Hospital Management System");
	}

	private HomePage homePage;
}
