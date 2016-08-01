package com.hospital;

import java.awt.BorderLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class HomePage extends JPanel{
	
	public HomePage() {
		init();
	}
	public void init(){
		setLayout(new BorderLayout());
		menuBar=new MyMenuBar();
		
		add(menuBar, BorderLayout.NORTH);
		setBounds(230, 100, 440, 315);	
		setVisible(true);
	}
	MyMenuBar menuBar;
	
	/*private static class MyMouseLitiner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String caller=((JMenuItem)e.getSource()).getName();
			if(caller.equals("")){
				
			}
			else if(caller.equals("")){
				
			}else if(caller.equals("")){
				
			}else if(caller.equals("")){
				
			}else if(caller.equals("")){
				
			}else if(caller.equals("")){
				
			}
				
			System.out.println(((JMenuItem)e.getSource()).getName());
		}

		
	}*/
	
}
