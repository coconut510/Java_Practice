package kh.classmn.view;

import java.awt.*;

import javax.swing.*;

import kh.classmn.controller.ManagerController;

public class ManagerView extends JFrame {
	private ManagerController mc;
//	public ManagerView() {	}
	public ManagerView()
	{
		this.setTitle("���� ���� ���α׷�(�����ڿ�)");
		int width = (int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()*0.3f); 
		int height = (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()*0.3f);
		this.setSize( width,height);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
