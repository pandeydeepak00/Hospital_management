package com.hospital;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class SingUpPanel extends JPanel {
	public SingUpPanel() {
		init();
	}
	private void init(){
		this.setLayout(null);
		fNameLabel=new JLabel("First Name");
		fNameLabel.setBounds(50, 50, fNameLabel.getText().length(), 20);
		this.add(fNameLabel);
		fnameField=new JTextField();
		lNameLabel=new JLabel("Last Name");
		lNameField=new JTextField();
		userNameLabel=new JLabel("User Name");
		userNameField=new JTextField();
		passwordLabel=new JLabel("Password");
		passwordField=new JPasswordField();
		mobileLabel=new JLabel("Mobile Number");
		mobileField=new JTextField();
		isAdminLabel=new JLabel("is Admin");
		checkBox=new JCheckBox();
		this.setBounds(230, 100, 440, 315);
		this.setVisible(true);
	}
	private JLabel fNameLabel,lNameLabel,userNameLabel,passwordLabel,mobileLabel,isAdminLabel;
	private JTextField fnameField,lNameField,userNameField,mobileField;
	private JPasswordField passwordField;
	private JCheckBox checkBox;
	
}
