package kh.classmn.view;

import java.awt.*;
import java.security.interfaces.RSAKey;
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
		classAllPanel.setLayout(new BorderLayout());
		vm.addPanel("class", classAllPanel);
		initStudent();
		topStatusInfo();
		seatArrayShow();
		actionBtnSection();
		
	}
	public void initStudent()
	{
		for(int i = 0; i<30;i++)
		{
			JButton button = new JButton();
//			button.setSize(400,200);
			button.setBackground(rg.getSkyBlue());
			studentList.add(button);
		}
	}
	
	private JPanel classAllPanel = new JPanel();
	private JPanel classPanel = new JPanel();
	private JPanel statusInfoPanel = new JPanel();
	private JPanel btnPanel = new JPanel();
	//�¼� ǥ��
	public void seatArrayShow()
	{		
		classPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.NONE;
        for(int i = 0; i<5;i++) {
        	for(int j = 0; j<6;j++)
        	{
        		  gbc.gridx=j;
        		  gbc.gridy=i;
        		  gbc.ipadx=96;//65;
        		  gbc.ipady =96;//65;
        		  gbc.weightx=0.1;
        		  gbc.weighty=0.1;
        		  classPanel.add(studentList.get(i*6 + j),gbc);
        	}
        }    

        classPanel.setBackground(rg.getWhite());
        classAllPanel.add(classPanel, BorderLayout.CENTER);

		vm.getMainFrame().add(classAllPanel);
	}
	
	// �Ʒ��� ��ư
	private JButton pracFinishBtn = new JButton("���߾��?");// �۾� ���ߴ���?
	private JButton pracQREsetBtn = new JButton("����");// �۾� ���ߴ��� üũ�ϴ� ��ư ����.
	private String[] sortArr = {"��ü �л�","�Ϸ��� �л�", "�������� �л�", "�����ִ� �л�", "�α׿�","�α׿���"};
	private JComboBox sortComboBox = new JComboBox(sortArr);
	public void actionBtnSection()
	{
		pracFinishBtn.setBackground(rg.getWhite());
		pracFinishBtn.setBounds(20,15,100, 70);
		pracQREsetBtn.setBackground(rg.getWhite());
		pracQREsetBtn.setBounds(140,15,100, 70);
		
		sortComboBox.setBounds(260,15,150,70);
		
        btnPanel.setBackground(rg.getOrange());
		btnPanel.setLayout(null);
		
		btnPanel.add(pracFinishBtn);
		btnPanel.add(pracQREsetBtn);
		btnPanel.add(sortComboBox);
		btnPanel.setPreferredSize(new Dimension(rg.getFrameWidth() ,100));
        classAllPanel.add(btnPanel, BorderLayout.SOUTH);
	}
	
	// ���� �޴�
	private JPanel academyInfoPanel = new JPanel();
	private JPanel studentInfoPanel = new JPanel();
	private JPanel studentStatusPanel = new JPanel();
	private JLabel titleLabel = new JLabel();
	private JLabel lectureTypeLabel = new JLabel();
	private JLabel teacherLabel = new JLabel();
	private JLabel totalStudentLabel = new JLabel();
	private JLabel totalProgressStLabel = new JLabel();
	private JLabel totalFinishStLabel = new JLabel();
	private JLabel totalQuestionStLabel = new JLabel();
	private JLabel logonLabel = new JLabel();
	private JLabel logoutLabel = new JLabel();
	public void topStatusInfo()
	{
		academyInfoPanel.setLayout(new GridLayout(0,1));
		academyInfoPanel.setBackground(rg.getBlackBlue());
		titleLabel.setText("KH ���� ������ - �������");
		titleLabel.setSize(200, 100);
		titleLabel.setFont(titleLabel.getFont().deriveFont(30));
		titleLabel.setForeground(rg.getWhite());
		lectureTypeLabel.setText("Java UI/UX �� ���߰���");
		lectureTypeLabel.setForeground(rg.getWhite());
		teacherLabel.setText("��� ���� : ��μ�");
		teacherLabel.setForeground(rg.getWhite());
		
		academyInfoPanel.add(titleLabel);
		academyInfoPanel.add(lectureTypeLabel);
		academyInfoPanel.add(teacherLabel);
		statusInfoPanel.add(academyInfoPanel);
		
		totalStudentLabel.setText("�� �л� �� : 28");
		totalStudentLabel.setForeground(rg.getWhite());
		totalProgressStLabel.setText("�������� �л� : 25");
		totalProgressStLabel.setForeground(rg.getWhite());
		totalFinishStLabel.setText("�Ϸ��� �л� : 3");
		totalFinishStLabel.setForeground(rg.getWhite());
		totalQuestionStLabel.setText("�����ִ� �л� : 2");
		totalQuestionStLabel.setForeground(rg.getWhite());
		
	
		studentStatusPanel.setLayout(new GridLayout(0,1));
		studentStatusPanel.setBackground(rg.getBlackBlue());
		studentStatusPanel.add(totalStudentLabel);
		studentStatusPanel.add(totalProgressStLabel);
		studentStatusPanel.add(totalFinishStLabel);
		studentStatusPanel.add(totalQuestionStLabel);
		statusInfoPanel.add(studentStatusPanel);
		
		
		studentInfoPanel.setLayout(new GridLayout(0,1));
		studentInfoPanel.setBackground(rg.getBlackBlue());
		logonLabel.setText("�α׿� �л� : 26");
		logonLabel.setForeground(rg.getWhite());
		logoutLabel.setText("�α׿��� �л� : 2");
		logoutLabel.setForeground(rg.getWhite());
		studentInfoPanel.add(logonLabel);
		studentInfoPanel.add(logoutLabel);
		statusInfoPanel.add(studentInfoPanel);
		
		statusInfoPanel.setLayout(new GridLayout(1,0));
        statusInfoPanel.setPreferredSize(new Dimension(rg.getFrameWidth(), 100));
        
        statusInfoPanel.setBackground(rg.getBlackBlue());
        classAllPanel.add(statusInfoPanel, BorderLayout.NORTH);
	}
}
