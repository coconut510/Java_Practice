package kh.classmn.view;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import kh.classmn.controller.ClassController;
import kh.classmn.vo.util.ResGroup;
import kh.classmn.vo.util.ViewModel;

public class ClassView {
	private ClassController cc;
	private ResGroup rg = ResGroup.getInstance();
	private ViewModel vm = ViewModel.getInstance();
	private ArrayList<JButton> studentList = new ArrayList<JButton>();
	public ClassView() {}
	public ClassView(ClassController cc)
	{
		this.cc = cc;
		initStudent();
		seatArrayShow();
	}
	public void initStudent()
	{
		for(int i = 0; i<30;i++)
		{
			JButton button = new JButton();
			button.setSize(200,100);
			button.setBackground(rg.getSkyBlue());
			studentList.add(button);
		}
	}
	
	private JPanel classAllPanel = new JPanel();
	private JPanel classPanel = new JPanel();
	private JPanel menuPanel = new JPanel();
	private JPanel statusPanel = new JPanel();
	JLabel stateLabel =new JLabel("채팅, 상태 들어갈 부분");
	JLabel menuLabel= new JLabel("메뉴 들어갈 부분");
	public void seatArrayShow()
	{
		
		classPanel.setLayout(new GridBagLayout());
		classAllPanel.setLayout(new BorderLayout());
		GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.NONE;
        for(int i = 0; i<5;i++) {
        	for(int j = 0; j<6;j++)
        	{
        		  gbc.gridx=j;
        		  gbc.gridy=i;
        		  gbc.ipadx=60;
        		  gbc.ipady =60;
        		  gbc.weightx=0.8;
        		  gbc.weighty=0.8;
        		  classPanel.add(studentList.get(i*6 + j),gbc);
        	}
        }
      
        stateLabel.setPreferredSize(new Dimension(200,100));
        stateLabel.setForeground(rg.getWhite());
        statusPanel.add(stateLabel);
        
        menuLabel.setPreferredSize(new Dimension(200,100));
//        menuLabel.setForeground(rg.getWhite());
        menuPanel.add(menuLabel);
        
        menuPanel.setBackground(rg.getWhite());
        classPanel.setBackground(rg.getWhite());
        statusPanel.setBackground(rg.getBlackBlue());
        classAllPanel.add(menuPanel, BorderLayout.NORTH);
        classAllPanel.add(classPanel, BorderLayout.CENTER);
        classAllPanel.add(statusPanel, BorderLayout.SOUTH);
		vm.addPanel("class", classAllPanel);
		vm.getMainFrame().add(classAllPanel);
	}
}
