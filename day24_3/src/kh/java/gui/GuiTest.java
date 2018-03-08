package kh.java.gui;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiTest extends JFrame {
	private JButton button1 = new JButton("��ư1");
	
	public GuiTest()
	{
		
		this.setSize(500,500);
		this.setTitle("����");
		this.setResizable(false);
		this.setLayout(null);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("calc.png"));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		comInit();// ������Ʈ ���� �޼ҵ� ȣ��( ����� ���� �޼ҵ��� )
		this.setLocationRelativeTo(null);
	}
	public GuiTest(int width, int height, int operation, boolean b)
	{
		this.setSize(width,height);
		this.setVisible(b);
		this.setDefaultCloseOperation(operation);
		this.setLocationRelativeTo(null);
	}
	
	
	public void comInit()
	{
		button1.setSize(100, 50);
		button1.setLocation(100,100);
		this.add(button1);
	}
}
