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
	//좌석 표시
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
	
	// 아래쪽 버튼
	private JButton pracFinishBtn = new JButton("다했어요?");// 작업 다했는지?
	private JButton pracQREsetBtn = new JButton("리셋");// 작업 다했는지 체크하는 버튼 리셋.
	private String[] sortArr = {"전체 학생","완료한 학생", "진행중인 학생", "질문있는 학생", "로그온","로그오프"};
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
	
	// 위쪽 메뉴
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
		titleLabel.setText("KH 정보 교육원 - 당산지점");
		titleLabel.setSize(200, 100);
		titleLabel.setFont(titleLabel.getFont().deriveFont(30));
		titleLabel.setForeground(rg.getWhite());
		lectureTypeLabel.setText("Java UI/UX 웹 개발과정");
		lectureTypeLabel.setForeground(rg.getWhite());
		teacherLabel.setText("담당 강사 : 노민수");
		teacherLabel.setForeground(rg.getWhite());
		
		academyInfoPanel.add(titleLabel);
		academyInfoPanel.add(lectureTypeLabel);
		academyInfoPanel.add(teacherLabel);
		statusInfoPanel.add(academyInfoPanel);
		
		totalStudentLabel.setText("총 학생 수 : 28");
		totalStudentLabel.setForeground(rg.getWhite());
		totalProgressStLabel.setText("진행중인 학생 : 25");
		totalProgressStLabel.setForeground(rg.getWhite());
		totalFinishStLabel.setText("완료한 학생 : 3");
		totalFinishStLabel.setForeground(rg.getWhite());
		totalQuestionStLabel.setText("질문있는 학생 : 2");
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
		logonLabel.setText("로그온 학생 : 26");
		logonLabel.setForeground(rg.getWhite());
		logoutLabel.setText("로그오프 학생 : 2");
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
