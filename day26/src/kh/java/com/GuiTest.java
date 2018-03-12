package kh.java.com;

import java.awt.*;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiTest extends JFrame implements ActionListener,KeyListener {
	private JButton ls = new JButton("<<");
	private JButton lts = new JButton("<");
	private JButton rts = new JButton(">");
	private JButton rs = new JButton(">>");
	private JButton exit = new JButton("exit");
	
	private JPanel northPanel = new JPanel();// north���� �г�.
	private JPanel centerPanel = new JPanel();// center���� �г�.
	private JPanel[] cards = new JPanel[7]; // ���� �����ϴ� �г��� ����.

	
	private int cardNum = 1;
	@Override
	public void actionPerformed(ActionEvent e) {		
		if(e.getSource()==ls)
		{
			cardNum = 1;
		}  
		else if(e.getSource()==lts)
		{
			if(	cardNum>1)	cardNum -= 1;
		}
		else if(e.getSource()==rts)
		{
			if(	cardNum<7)	cardNum += 1;
		}
		else if(e.getSource()==rs)
		{
			cardNum = 7;
		}
		else if(e.getSource()==exit)
		{
			System.exit(0);
		}
		// ī�带 ������ �ִ� ���̾ƿ��� CardLayout
		((CardLayout) centerPanel.getLayout()).show(centerPanel, Integer.toString(cardNum));
	}
	
	public void northPanel()
	{
		northPanel.setLayout(new FlowLayout(FlowLayout.LEFT,35,5));
							//new GridLayout(1,5,2,2));
		northPanel.setPreferredSize(new Dimension(430,35));
		northPanel.add(ls);
		northPanel.add(lts);
		northPanel.add(rts);
		northPanel.add(rs);
		northPanel.add(exit);
		
		// �� ��ư�� ���� ������ ����.
		ls.addActionListener(this);
		lts.addActionListener(this);
		rts.addActionListener(this);
		rs.addActionListener(this);
		exit.addActionListener(this);
		ls.addKeyListener(this);
		lts.addKeyListener(this);
		rts.addKeyListener(this);
		
	}
	
	public void centerPanel()
	{
		centerPanel.setLayout(new CardLayout());
		
		for(int i = 0; i<cards.length;i++)
		{
			cards[i] = new JPanel();
			centerPanel.add( Integer.toString(i+1), cards[i] );
		}
		
		cards[0].setBackground(Color.WHITE);
		cards[1].setBackground(Color.GREEN);
		cards[2].setBackground(Color.PINK);
		cards[3].setBackground(Color.BLUE);
		cards[4].setBackground(Color.YELLOW);
		cards[5].setBackground(Color.LIGHT_GRAY);
		cards[6].setBackground(Color.BLACK);
		
		
	}
	
	public void compInit()
	{
		this.northPanel();
		this.centerPanel();
		this.add(northPanel,BorderLayout.NORTH);
		this.add(centerPanel, BorderLayout.CENTER);
	}
	public GuiTest()
	{
		this.setTitle("CardLayout Test");//==super("CardLayout Test");
		this.setLayout(new BorderLayout(5,5));//���̾ƿ� �޴��� ����.
		this.setSize(450,300);// ������ ������.
		this.setLocationRelativeTo(null);//�߾ӿ� ��ġ ����.
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// x ��ư Ŭ���� ����.
		this.compInit();//����� ���� �޼ҵ�
		this.setVisible(true);// ���������� �����־��.
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyChar()=='a'||e.getKeyCode()==37)
		{
			if(	cardNum>1)	cardNum -= 1;
		}
		else if(e.getKeyChar()=='d'||e.getKeyCode()==39)
		{
			if(	cardNum<7)	cardNum += 1;
		}

		((CardLayout) centerPanel.getLayout()).show(centerPanel, Integer.toString(cardNum));
		System.out.println("keyPressed " + e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}