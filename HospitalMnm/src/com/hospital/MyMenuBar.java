package com.hospital;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MyMenuBar extends JMenuBar {
	public MyMenuBar() {
		init();
	}
	public void init(){
		home=new JMenu("Home");
		home.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		add=new JMenu("Add");
		update=new JMenu("Update");
		delete =new JMenu("Delete");
		mainBar=new JMenuBar();
		mainBar.add(home);		
		mainBar.add(add);
		mainBar.add(update);
		mainBar.add(delete);
		docter=new JMenuItem("Doctor");
		docter.setName("Delete_Doctor");
		docter.addActionListener(new MyMouseLitiner());
		patient=new  JMenuItem("Patient");
		patient.setName("Delete_Patient");
		patient.addActionListener(new MyMouseLitiner());
		docter1=new JMenuItem("Doctor");
		docter1.setName("add_Docter");
		docter1.addActionListener(new MyMouseLitiner());
		patient1=new  JMenuItem("Patient");
		patient1.setName("add_Patient");
		patient1.addActionListener(new MyMouseLitiner());
		docter2=new JMenuItem("Doctor");
		docter2.setName("update_Docter");
		docter2.addActionListener(new MyMouseLitiner());
		patient2=new  JMenuItem("Patient");
		patient2.setName("update_Patient");
		patient2.addActionListener(new MyMouseLitiner());
		
		add.add(docter1);
		add.add(patient1);
		
		update.add(docter2);
		update.add(patient2);
		
		delete.add(docter);
		delete.add(patient);
		
		
		add(mainBar, BorderLayout.NORTH);
		setVisible(true);
	}
	private JMenu add;
	private JMenu update;
	private JMenu delete;
	private JMenuBar mainBar;
	private JMenuItem docter,docter1,docter2;
	private JMenuItem patient,patient1,patient2;
	private JMenu home;
	
	private static class MyMouseLitiner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String caller=((JMenuItem)e.getSource()).getName();
			if(caller.equals("add_Docter")){
				
			}
			else if(caller.equals("add_Patient")){
				
			}else if(caller.equals("update_Docter")){
				
			}else if(caller.equals("update_Patient")){
				
			}else if(caller.equals("Delete_Doctor")){
				
			}else if(caller.equals("Delete_Patient")){
				
			}
				
			System.out.println(((JMenuItem)e.getSource()).getName());
		}

	}
}
