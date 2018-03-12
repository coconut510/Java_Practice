package kh.java.com;

import java.awt.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class KeyEventTest extends JFrame implements KeyListener{
	private JPanel viewPanel = new JPanel();
	private JPanel controlPanel = new JPanel();
	private JLabel upKey = new JLabel();
	private JLabel downKey = new JLabel();
	private JLabel leftKey = new JLabel();
	private JLabel rightKey = new JLabel();
	
	private JLabel view = new JLabel();

	private ImageIcon upKeyImg = null;
	private ImageIcon downKeyImg = null;
	private ImageIcon leftKeyImg = null;
	private ImageIcon rightKeyImg = null;
	private ImageIcon upKeyImgPre = null;
	private ImageIcon downKeyImgPre = null;
	private ImageIcon leftKeyImgPre = null;
	private ImageIcon rightKeyImgPre = null;
	
	private ImageIcon mainRyan = null;
	private ImageIcon upRyan = null;
	private ImageIcon downRyan = null;
	private ImageIcon leftRyan = null;
	private ImageIcon rightRyan = null;
	
	public void setImage()
	{
		mainRyan = new ImageIcon(new ImageIcon("ryan.png").getImage().
				getScaledInstance(250, 250, Image.SCALE_SMOOTH));
		upRyan = new ImageIcon(new ImageIcon("image1.png").getImage().
				getScaledInstance(250, 250, Image.SCALE_SMOOTH));
		downRyan = new ImageIcon(new ImageIcon("image2.png").getImage().
				getScaledInstance(250, 250, Image.SCALE_SMOOTH));
		leftRyan = 
				new ImageIcon(new ImageIcon("image3.gif").getImage().
				getScaledInstance(250, 250, Image.SCALE_DEFAULT));
		rightRyan = new ImageIcon(new ImageIcon("image4.png").getImage().
				getScaledInstance(250, 250, Image.SCALE_SMOOTH));
				
		
		
		upKeyImg = new ImageIcon(new ImageIcon("north.png").getImage().
				getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		downKeyImg = new ImageIcon(new ImageIcon("south.png").getImage().
				getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		leftKeyImg = new ImageIcon(new ImageIcon("west.png").getImage().
				getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		rightKeyImg = new ImageIcon(new ImageIcon("east.png").getImage().
				getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		
		upKeyImgPre = new ImageIcon(new ImageIcon("north2.png").getImage().
				getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		downKeyImgPre = new ImageIcon(new ImageIcon("south2.png").getImage().
				getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		leftKeyImgPre = new ImageIcon(new ImageIcon("west2.png").getImage().
				getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		rightKeyImgPre = new ImageIcon(new ImageIcon("east2.png").getImage().
				getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		
	}
	
	public void setPanel1()
	{
		viewPanel.setPreferredSize(new Dimension(290,290));
		view.setIcon(mainRyan);
		viewPanel.add(view);
		this.add(viewPanel, BorderLayout.CENTER);
	}
	
	public void setPanel2()
	{
		
		upKey.setIcon(upKeyImg);
		downKey.setIcon(downKeyImg);
		leftKey.setIcon(leftKeyImg);
		rightKey.setIcon(rightKeyImg);
		
		controlPanel.add(upKey);
		controlPanel.add(downKey);
		controlPanel.add(leftKey);
		controlPanel.add(rightKey);
		
		controlPanel.setLayout(new FlowLayout(FlowLayout.CENTER,30,10));
		this.add(controlPanel,BorderLayout.SOUTH);
	}
	
	
	public void comInit()
	{
		setImage();
		setPanel1();
		setPanel2();
	}
	
	public KeyEventTest()
	{
		super("라이언 춤추기");
		this.setSize(315,410);
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		comInit();
		this.setVisible(true);
		this.addKeyListener(this);
	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode())
		{
			case 38:	
				upKey.setIcon(upKeyImgPre);
				view.setIcon(upRyan);
				break;// Up
			case 40:	
				downKey.setIcon(downKeyImgPre); 
				view.setIcon(downRyan);
			break;// Down
			case 37:	
				leftKey.setIcon(leftKeyImgPre);
				view.setIcon(leftRyan);
				break;// Left
			case 39:	
				rightKey.setIcon(rightKeyImgPre); 
				view.setIcon(rightRyan);
				break;// Right
		}
		controlPanel.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode())
		{
			case 38:	upKey.setIcon(upKeyImg); break;// Up
			case 40:	downKey.setIcon(downKeyImg); break;// Down
			case 37:	leftKey.setIcon(leftKeyImg); break;// Left
			case 39:	rightKey.setIcon(rightKeyImg); break;// Right
		}
		controlPanel.repaint();
	}
}
