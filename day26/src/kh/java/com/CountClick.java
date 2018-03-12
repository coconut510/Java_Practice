package kh.java.com;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class CountClick extends JFrame {
	private JButton countUpBtn =  new JButton("숫자 증가");
	private JButton initBtn = new JButton("초기화");
	private JLabel countTitle = new JLabel("count");
	private JLabel countLabel = new JLabel("0");
	
	private int count = 0;
	
	public void comInit()
	{
		countUpBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count+=1;
				countLabel.setText(Integer.toString(count));
			}			
		});
		initBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				countLabel.setText(Integer.toString(count));
			}
		});
			
		countUpBtn.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				System.out.println(e.getKeyCode());
			}
		});
		
		initBtn.addKeyListener(new KeyAdapter()
				{
					public void keyPressed(KeyEvent e)
					{
						System.out.println(e.getKeyCode());
					}
				});
		countLabel.setFont(new Font("Serif", Font.BOLD,100));
	
		this.add(countTitle);
		this.add(countLabel);
		this.add(countUpBtn);
		this.add(initBtn);
	}
	
	public void key()
	{
	}
	
	public CountClick()
	{
		super("카운트 증가 프로그램");
		this.setSize(260,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		comInit();
		this.setVisible(true);
	}
}
