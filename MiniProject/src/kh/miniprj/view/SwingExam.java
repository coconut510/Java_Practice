package kh.miniprj.view;
import java.awt.BorderLayout;
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

import kh.miniprj.vo.ResourceRoad;  

public class SwingExam extends JFrame {
	 JPanel contentPane;
	private ImageIcon imageIcon = new ImageIcon();	
	private JButton b= new JButton("gif");
	private JPanel p = new JPanel();
	public void viewPopup() throws IOException
	{
		JFrame f=new JFrame();//creating instance of JFrame  
        f.setLayout(new BorderLayout());
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		URL url = new URL("https://colinbendell.cloudinary.com/image/upload/c_crop,f_auto,g_auto,h_350,w_400/v1512090971/Wizard-Clap-by-Markus-Magnusson.gif");					
		BufferedImage image  = ImageIO.read(url);	
		imageIcon = new ImageIcon(image);
		b= new JButton(imageIcon);//creating instance of JButton  

		b.setBounds(130,100,330, 130);//x axis, y axis, width, height  
		
		b.addActionListener(e->{ eventBtn();});          
		JLabel label = new JLabel(imageIcon);
		f.getContentPane().add(label);
		
//		g.drawImage(iTemp,300,300,this);
		label.setIcon(imageIcon);
		
		f.add(b,BorderLayout.PAGE_START);//adding button in JFrame  
		          
		f.setSize(400,500);//400 width and 500 height  
	//	f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
	}
	

	public void eventBtn()
	{
		System.out.println("버튼 클릭");
	}
}
