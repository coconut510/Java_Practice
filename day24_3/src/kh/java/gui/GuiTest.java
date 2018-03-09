package kh.java.gui;

import java.awt.*;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GuiTest extends JFrame{
	
	private JButton button1 = new JButton("버튼1");
	private JButton button2 = new JButton("버튼2");
	private JButton button3 = new JButton("버튼3");
	private JButton button4 = new JButton("버튼4");
	private JButton button5 = new JButton("버튼5");
	
	public void comInit()
	{
		this.setLayout(new GridBagLayout());
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
	}	

	
	public GuiTest()
	{
		comInit();// 컴포넌트 생성 메소드 호출( 사용자 정의 메소드임 )
		this.setSize(500,500);
		this.setTitle("계산기");
		this.setResizable(false);
//		this.setLayout(null);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("calc.png"));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		this.setLocationRelativeTo(null);
		
	}
	public GuiTest(int width, int height, int operation, boolean b)
	{
		this.setSize(width,height);
		this.setVisible(b);
		this.setDefaultCloseOperation(operation);
		this.setLocationRelativeTo(null);
	}

	
	

}
