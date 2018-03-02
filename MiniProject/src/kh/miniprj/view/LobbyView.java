package kh.miniprj.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import kh.miniprj.vo.MainBtn;
import kh.miniprj.vo.ResourceRoad;

public class LobbyView {
	private JPanel startPanel = new JPanel();;
	private JFrame f = new JFrame();//creating instance of JFrame 
	public void lobbyView()
	{		
		JButton b = new MainBtn();
		JButton startBtn= new MainBtn(new ImageIcon(ResourceRoad.resorseRoad.getMainBgImage()));
		startBtn.setSize(450,800);
		startBtn.setLocation(0, 0);
		
		startPanel.setSize(450,800);
		startPanel.add(startBtn);		
		
		f.setLayout(null);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
          
		f.setSize(450,800);//400 width and 500 height  
		f.setResizable(false);
		//	f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
		f.add(startPanel);//adding button in JFrame  
	
	}
	
	
}
