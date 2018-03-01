package kh.miniprj.view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;

import kh.miniprj.controller.ResourceMng;
import kh.miniprj.vo.*;
import kh.miniprj.vo.ResourceRoad; 
import java.awt.*;
public class StartGameView {
	private JPanel startPanel = new JPanel();
	private JFrame f = new JFrame();//creating instance of JFrame 
	public void loadMainWIndow()
	{		
		JButton startBtn = new JButton(new ImageIcon(ResourceRoad.resorseRoad.getMainBgImage()));
		startBtn.setBounds(0, 0, 450, 800);
		startBtn.addActionListener(e->{ btnActionEvent();});		
		
		startPanel.setBounds(0, 0, 450, 800);
		startPanel.setBackground(Color.BLACK);
		startPanel.add(startBtn);		
		
		f.setLayout(null);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
          
		f.setSize(450,800);//400 width and 500 height  
		f.setResizable(false);
		//	f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
		f.add(startPanel);//adding button in JFrame  
	
	}
	
	public void btnActionEvent()
	{
		new LobbyView().lobbyView();
	}
	
}
