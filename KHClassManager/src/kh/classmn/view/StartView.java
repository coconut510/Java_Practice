package kh.classmn.view;

import java.awt.*;

import javax.swing.*;

import kh.classmn.controller.*;
import kh.classmn.controller.StartController;
import kh.classmn.vo.util.ResGroup;
import kh.classmn.vo.util.ViewModel;

public class StartView extends JFrame {
	private StartController sc;
	private ResGroup rg = ResGroup.getInstance();
	private ViewModel vm = ViewModel.getInstance();
	public StartView() {	}
	public StartView(StartController sc)
	{
	    this.sc = sc;
		startView();
		this.setTitle("수업 관리 프로그램");	
		this.setSize( (rg.getFrameWidth()), (rg.getFrameHeight()));
		rg.getKhLogo();
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBackground(rg.getWhite());
		this.setResizable(true);
		this.setVisible(true);
		vm.setMainFrame(this);
	}
	private JPanel startPanel = new JPanel();
	public void startView()
	{		
		JButton startBtn = new JButton(new ImageIcon(rg.getKhLogo()));
		startBtn = vm.fitImageBtn(startBtn);
		startBtn.setBounds(0,0,rg.getFrameWidth(),rg.getFrameHeight());
		startBtn.addActionListener(e->{sc.btnAction();});
		startPanel.setBackground(rg.getWhite());
		startPanel.add(startBtn);
		vm.addPanel("start", startPanel);
		this.add(startPanel);
	}
	
}
