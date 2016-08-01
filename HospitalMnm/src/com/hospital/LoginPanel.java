package com.hospital;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class LoginPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JPanel loginPanel;
	private JLabel userNameLbl;
	private JLabel passwordLbl;
	private JTextField userNameField;
	private JPasswordField passwordField;
	private JButton loginBttn;

	public LoginPanel() {
		init();
	}

	private void init() {
		loginPanel = new JPanel();
		userNameLbl = new JLabel();
		passwordLbl = new JLabel();
		userNameField = new JTextField();
		passwordField = new JPasswordField();
		loginBttn = new JButton();
		loginBttn.setBorder(null);
		loginBttn.setContentAreaFilled(false);
		loginBttn.setOpaque(false);

		setLayout(null);
		// ======== desktopPane1 ========
		{
			loginPanel.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION, new Font("Cambria", Font.ITALIC, 14)));

			loginPanel.setLayout(null);

			// ---- userNameLbl ----
			userNameLbl.setHorizontalAlignment(SwingConstants.CENTER);
			userNameLbl.setText("Username");
			loginPanel.add(userNameLbl, JLayeredPane.DEFAULT_LAYER);
			userNameLbl.setBounds(80, 150, 110, 30);

			// ---- passwordLbl ----
			passwordLbl.setHorizontalAlignment(SwingConstants.CENTER);
			passwordLbl.setText("Password");
			loginPanel.add(passwordLbl, JLayeredPane.DEFAULT_LAYER);
			passwordLbl.setBounds(80, 190, 110, 30);

			loginPanel.add(userNameField, JLayeredPane.DEFAULT_LAYER);
			userNameField.setBounds(195, 155, 155, userNameField.getPreferredSize().height);
			userNameField.setText("");
			userNameField.addFocusListener(new FocusAdapter() {
				public void focusGained(java.awt.event.FocusEvent evt) {
					userNameField.selectAll();
				}

			});
			loginPanel.add(passwordField, JLayeredPane.DEFAULT_LAYER);
			passwordField.setBounds(195, 195, 155, passwordField.getPreferredSize().height);
			passwordField.setText("");
			loginBttn.setBorder(null);
			loginBttn.setBorderPainted(false);
			loginBttn.setOpaque(false);
			loginBttn.setFocusPainted(false);
			loginPanel.add(loginBttn, JLayeredPane.DEFAULT_LAYER);
			loginBttn.setBounds(190, 250, 80, 30);
			JButton singUp=new JButton("SingUp");
			singUp.setBounds(280, 250, 80, 30);
			
			loginBttn.setText("Login");
			this.add(loginPanel);
			this.setVisible(true);
			loginPanel.setBounds(230, 100, 440, 315);
			loginBttn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					processLogin();
				}
			});

		}
	}

	private void processLogin() {
		((MainFrame) getParent().getParent().getParent().getParent()).showHomePage();
	}

}
