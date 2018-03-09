package kh.com.guiTest;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class ResearchListView extends JFrame {	
	
	private JPanel totalPanel = new JPanel();
	private JPanel topPanel = new JPanel();
	private JPanel infoPanel = new JPanel();
	private JPanel genderPanel = new JPanel();
	private JPanel hobbyPanel = new JPanel();
	private JPanel etcPanel = new JPanel();
	private JPanel btnPanel = new JPanel();
	
	private Color bg = new Color(116,116,116);
	
	public ResearchListView()
	{			
		titlePanel();		
		infoPanel();
		genderPanel();
		hobbyPanel();
		etcPanel();
		bottomBtn();
		mainFrame();				
	}
	
	public void mainFrame()
	{
		totalPanel.setBounds(0,0,500,700);
		totalPanel.setBackground(bg);
		totalPanel.setLayout(null);
		
		this.setTitle("설문조사");
		this.setSize(500,600);
		this.setBackground(Color.black);
		this.setResizable(false);
		this.setLayout(null);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("search.png"));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		this.setLocationRelativeTo(null);
		this.add(totalPanel);
	}
	public void titlePanel()
	{		
		JLabel title = new JLabel("20~30대를 대상으로 진행하는 설문입니다.");
		title.setSize(400,40);
		title.setLocation(60,5);
		title.setFont(new Font("바탕체", Font.BOLD, 18));
	
		topPanel.setSize(485,50);
		topPanel.setLocation(5,5);
		topPanel.setBackground(new Color(213,213,213));
		topPanel.setLayout(null);
		
		topPanel.add(title);
		totalPanel.add(topPanel);
	}
	
	public void infoPanel()
	{
		JLabel name = new JLabel("이름 : ");
		name.setBounds(50,4,80,20);
		JLabel age = new JLabel("나이 : ");
		age.setBounds(240,4,80,20);
		JTextField nameFd = new JTextField(5);
		nameFd.setSize(50,30);
		nameFd.setLocation(100,0);
		JTextField ageFd = new JTextField(5);
		ageFd.setSize(50,30);
		ageFd.setLocation(280,0);

		infoPanel.setBounds(15,60,400,30);
		infoPanel.setBackground(bg);
		infoPanel.setLayout(null);
		
		infoPanel.add(name);
		infoPanel.add(nameFd);
		infoPanel.add(age);
		infoPanel.add(ageFd);
		
		totalPanel.add(infoPanel);
	}
	
	public void genderPanel()
	{
		Border line = BorderFactory.createLineBorder(Color.black);
		
		JLabel title = new JLabel("1번 당신의 성별은?");
		title.setSize(150,20);
		title.setLocation(15,0);
		title.setBackground(Color.white);
		
		JPanel titlePanel = new JPanel();
		titlePanel.setSize(120,20);
		titlePanel.setLocation(15,0);
		titlePanel.setBackground(Color.white);
						
		JPanel innnerPanel = new JPanel();
		innnerPanel.setSize(475,90);
		innnerPanel.setLocation(5,7);
		innnerPanel.setBorder(line);
		innnerPanel.setBackground(Color.white);
		innnerPanel.setLayout(null);		
		
		JRadioButton male = new JRadioButton("남성", true);
		male.setBounds(15,20,100,20);
		male.setBackground(Color.WHITE);
		
		JRadioButton female = new JRadioButton("여성");
		female.setBounds(15,50,100,20);
		female.setBackground(Color.WHITE);
		
		ButtonGroup rg = new ButtonGroup();
		rg.add(male);
		rg.add(female);
		innnerPanel.add(male);
		innnerPanel.add(female);		
		
		genderPanel.setSize(485,100);
		genderPanel.setLocation(5,100);
		genderPanel.setBackground(Color.WHITE);
		genderPanel.setLayout(null);
		
		genderPanel.add(title);
		genderPanel.add(titlePanel);
		genderPanel.add(innnerPanel);

		totalPanel.add(genderPanel);		
	}
	
	public void hobbyPanel()
	{
		int yPos = 210;
		Border line = BorderFactory.createLineBorder(Color.black);
		
		JLabel title = new JLabel("2번 당신의 관심사는?(다중선택 가능)");
		title.setSize(250,20);
		title.setLocation(15,0);
		
		JPanel titlePanel = new JPanel();
		titlePanel.setSize(220,20);
		titlePanel.setLocation(15,0);
		titlePanel.setBackground(Color.white);
		
		JCheckBox chFood = new JCheckBox("음식", true);
		chFood.setBounds(20,30,60,30);
		chFood.setBackground(Color.white);
		JCheckBox chMusic = new JCheckBox("음악", false);
		chMusic.setBounds(90,30,60,30);		
		chMusic.setBackground(Color.white);
		JCheckBox chTv = new JCheckBox("TV", false);
		chTv.setBounds(160,30,60,30);
		chTv.setBackground(Color.white);
		JCheckBox chSport = new JCheckBox("운동", false);
		chSport.setBounds(230,30,60,30);
		chSport.setBackground(Color.white);
		JCheckBox etc = new JCheckBox("기타", false);
		etc.setBounds(300,30,60,30);
		etc.setBackground(Color.white);
		
		JTextField etcFd = new JTextField(10);
		etcFd.setSize(100,20);
		etcFd.setLocation(370,35);								
		
		JPanel innnerPanel = new JPanel();
		innnerPanel.setSize(475,90);
		innnerPanel.setLocation(5,7);
		innnerPanel.setBorder(line);
		innnerPanel.setBackground(Color.white);
		innnerPanel.setLayout(null);		

		innnerPanel.add(chFood);
		innnerPanel.add(chMusic);
		innnerPanel.add(chTv);
		innnerPanel.add(chSport);	
		innnerPanel.add(etc);
		innnerPanel.add(etcFd);
		

		hobbyPanel.setSize(485,100);
		hobbyPanel.setLocation(5,yPos);
		hobbyPanel.setBackground(Color.WHITE);
		hobbyPanel.setLayout(null);		
		
		hobbyPanel.add(title);
		hobbyPanel.add(titlePanel);
		hobbyPanel.add(innnerPanel);
		
		totalPanel.add(hobbyPanel);	
	}
	
	
	public void etcPanel()
	{
		int yPos = 350;
		
		JLabel title = new JLabel("기타사항");
		title.setBounds(10,yPos-30,200,30);
		this.add(title);
		
		JTextArea textArea = new JTextArea(8,24);
		textArea.setText("기타사항을 작성해주세요");
		textArea.setBounds(10,10,465,150);
		textArea.setLineWrap(true);						
		
		etcPanel.setSize(485,180);
		etcPanel.setLocation(5,yPos);
	    etcPanel.setBackground(Color.WHITE);
		etcPanel.setLayout(null);
		
		etcPanel.add(textArea);		
		totalPanel.add(etcPanel);		
	}
	
	public void bottomBtn()
	{
		int yPos = 535;
		JButton transportBtn = new JButton("전송");
		transportBtn.setSize(70,30);
		transportBtn.setLocation(100,0);
		this.add(transportBtn);
		
		JButton cancleBtn = new JButton("취소");
		cancleBtn.setSize(70,30);
		cancleBtn.setLocation(300,0);
		this.add(cancleBtn);
		
		btnPanel.setSize(485,180);
		btnPanel.setLocation(5,yPos);
		btnPanel.setBackground(bg);
		btnPanel.setLayout(null);
		
		btnPanel.add(transportBtn);
		btnPanel.add(cancleBtn);
		
		totalPanel.add(btnPanel);
	}
}
