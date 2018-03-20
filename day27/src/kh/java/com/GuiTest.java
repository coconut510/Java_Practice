package kh.java.com;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.plaf.FontUIResource;

import org.omg.Messaging.SyncScopeHelper;

public class GuiTest extends JFrame{

//	private JMenuBar menuBar = new JMenuBar();
//	private JMenu menu1 = new JMenu("메뉴1");
//	private JMenuItem menuItem1 = new JMenuItem("메뉴항목1");

	public GuiTest()
	{
		super("계산기");
		JTextField num1 = new JTextField();
		JTextField num2 = new JTextField();
		JLabel result = new JLabel();
		JButton sum = new JButton("+");
		
		sum.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				int sumValue = Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText());
				result.setText("Result : " + sumValue);
			}
		});
	
		this.add(num1);
		this.add(num2);
		this.add(sum);
		this.add(result);
		this.setSize(250,200);
		this.setLayout(new GridLayout(0,1));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
//	private JFileChooser fc = new JFileChooser();
//	private Font font = new Font("Serif",Font.BOLD,300);
//	private Font font1 = new Font("고딕",Font.ITALIC,10);
//	
//	public void questionTwo()
//	{
////		super("계산기");
//		JTextField num1 = new JTextField();
//		JTextField num2 = new JTextField();
//		JLabel result = new JLabel();
//		JButton sum = new JButton("+");
//		
//		sum.addActionListener(new ActionListener()
//		{
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				int sumValue = Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText());
//				result.setText("Result : " + sumValue);
//			}
//		});
//	
//		this.add(num1);
//		this.add(num2);
//		this.add(sum);
//		this.add(result);
//		this.setSize(250,200);
//		this.setLayout(new GridLayout(0,1));
//		this.setLocationRelativeTo(null);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setVisible(true);
//	}
//	
//	
//	public void questionOne()
//	{
//		
//		/// 문제 1번.
//		
////		super("Test");
////	
////		this.setSize(300,300);
////		
////		
////		this.setLayout(new GridBagLayout());
////		GridBagConstraints gbc = new GridBagConstraints();  
////		gbc.gridx = 0;
////		gbc.gridy = 0;
////		this.add(new JLabel("메뉴와 버튼을 만들어보세요"), gbc);
////		gbc.gridx = 1;
////		gbc.gridy = 0;
////		this.add(new JButton("OK"), gbc);
////		
////		this.setLocationRelativeTo(null);
////		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////		
////		menu1.add(menuItem1);
////
////		menuBar.add(menu1);
////		this.setJMenuBar(menuBar);
////		comInit();
////		this.setVisible(true);
//	}
//	
//	
//	private HashMap<String, JButton> btnList = new HashMap<String,JButton>();
//	public void seatCreat()
//	{
//		GridBagConstraints gbc = new GridBagConstraints();  
//		gbc.fill = GridBagConstraints.HORIZONTAL;  
//		for(int i = 0; i<2;i++)//01  45
//		{
//			for(int j = 0; j<8;j++)
//			{
//				JButton button = new JButton(i+""+j);
//				button.setSize(100,20);
//				button.addActionListener(new ActionListener()
//				{
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						getCode(button.getText());
//					}
//				});
//				gbc.gridx = i;
//				gbc.gridy = j;
//				gbc.ipadx = 100;
//				gbc.ipady = 40;
//				this.add(button,gbc);
//				btnList.put(i+""+j, button);
//			}
//		}
//		
//		for(int i = 4; i<6;i++)
//		{
//			for(int j = 0; j<8;j++)
//			{
//				if(i==4)gbc.insets = new Insets(0,50,0,0);
//				else if(i==5) gbc.insets = new Insets(0,0,0,0);
//				JButton button = new JButton((i-2)+""+j);
//				button.addActionListener(new ActionListener()
//					{
//						@Override
//						public void actionPerformed(ActionEvent e) {
//							getCode(button.getText());
//						}
//					});
//				button.setSize(100,20);
//				gbc.gridx = i;
//				gbc.gridy = j;
//				gbc.ipadx = 100;
//				gbc.ipady = 40;
//				this.add(button,gbc);
//				btnList.put((i-2)+""+j, button);
//			}
//		}
//		System.out.println(btnList.get("01").getText());
//	}
//	
//	public void getCode(String code)
//	{
//		if(btnList.get(code).getBackground()!=Color.RED) btnList.get(code).setBackground(Color.RED);
//		else btnList.get(code).setBackground(null);
//		
//		System.out.println("코드 출력 " + code);
//	}
//
//	public void comInit()
//	{
////		menuItem1.addActionListener(this);
////		menuItem2.addActionListener(this);
////		menuItem3.addActionListener(this);
////		
////		menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.ALT_MASK));
////		menuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.ALT_MASK));
////		menuItem3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,ActionEvent.ALT_MASK));
//		
//		menu1.add(menuItem1);
////		menu1.add(menuItem2);
////		menu1.add(menuItem3);
//
//		menuBar.add(menu1);
////		menuBar.add(menu2);
//		this.setJMenuBar(menuBar);
//		
//	
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) 
//	{
//		if(e.getSource().equals(menuItem1))
//		{
//			if(fc.showOpenDialog(this)==JFileChooser.APPROVE_OPTION)
//			{
//				String fileName = fc.getSelectedFile().getName();
//				System.out.println("선택 파일 이름 " + fileName);
//
//				String filePath = fc.getSelectedFile().getPath();
//				System.out.println("선택 파일 경로 " + filePath);
//			}
//		}
//		else if(e.getSource().equals(menuItem2))
//		{
//			fc.showSaveDialog(this);
//			System.out.println("저장");
//		}
//		else if(e.getSource().equals(menuItem3))
//		{
//			System.out.println("종료");
//			System.exit(0);
//		}
//	}
}
