package kh.classmn.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import kh.classmn.controller.LoginController;
import kh.classmn.vo.util.*;

public class LoginView {
	private LoginController lc;
	private ViewModel vm = ViewModel.getInstance();
	private ResGroup rg = ResGroup.getInstance();
	private JPanel loginViewPanel = new JPanel();
	private JPanel signUpViewPanel = new JPanel();
	private JTextField jtfId = new JTextField();
	private JPasswordField jpfPwd = new JPasswordField();
	private JLabel jlbId = new JLabel("���̵�", JLabel.CENTER);
	private JLabel jlbPwd = new JLabel("�н�����", JLabel.CENTER);
	private JButton jBtnSignin = new JButton("�α���");
	private JButton jBtnSignup = new JButton("ȸ������");
	private boolean idChkFlag = false;
	private boolean loadView = false;
	public LoginView() {}
	public LoginView(LoginController lc)
	{
		this.lc = lc;
		memberSigninPage();
	}

	public void memberSigninPage() {
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel empty = new JPanel();
		JPanel empty2 = new JPanel();
		JLabel logo = new JLabel(new ImageIcon(rg.getKhLogo()));
		empty.add(logo);
		empty.setBackground(rg.getWhite());
		empty2.setBackground(rg.getWhite());
		jp1.setBackground(rg.getWhite());
		
		jp2.setBackground(rg.getWhite());
		
		jp1.setLayout(new GridLayout(2, 2, 15, 15));

		jp1.add(jlbId);
		jp1.add(jtfId);
		jp1.add(jlbPwd);
		jp1.add(jpfPwd);

		jp2.setLayout(new GridLayout(0, 2, 30, 100));
		
		jBtnSignin.setForeground(rg.getWhite());
		jBtnSignin.setBackground(rg.getOrange());
		jBtnSignup.setForeground(rg.getWhite());
		jBtnSignup.setBackground(rg.getBlackBlue());
		jBtnSignin.setPreferredSize(new Dimension(200,80));
		jBtnSignup.setEnabled(false);
		jp2.add(jBtnSignin);
		jp2.add(jBtnSignup);

		jBtnSignup.addActionListener(e -> { 
			 if(!loadView)lc.signUp(); 
			 else loginToSignUp();
			loadView = true;
			});

		jBtnSignin.addActionListener(e -> {
			String getId = jtfId.getText();
			String getPw = new String(jpfPwd.getPassword());
			lc.loginValidCheck(getId,getPw);
		});
		
		loginViewPanel.setSize(new Dimension(100,100));
		loginViewPanel.setLayout(new GridLayout(6,1));
		loginViewPanel.add(empty);
		loginViewPanel.add(empty2);
		loginViewPanel.add(jp1);
		loginViewPanel.add(jp2);
		vm.getMainFrame().add(loginViewPanel);
	}
	public void hideAll()
	{
		loginViewPanel.setVisible(false);
		signUpViewPanel.setVisible(false);
	}
	
	public void loginToSignUp()
	{
		loginViewPanel.setVisible(false);
		signUpViewPanel.setVisible(true);
		
		jtfIdSignUp.setText("");
		jpfPwdSignUp.setText("");
		jpfPwdChkSignUp.setText("");
	}
	
	public void signUpToLogin()
	{
		signUpViewPanel.setVisible(false);
		loginViewPanel.setVisible(true);
		
		jtfId.setText("");
		jpfPwd.setText("");
		loginViewPanel.repaint();
	}

	JTextField jtfIdSignUp = new JTextField();
	JPasswordField jpfPwdSignUp = new JPasswordField();
	JPasswordField jpfPwdChkSignUp = new JPasswordField();
	public void memberSignupPage() {
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JLabel jlbId = new JLabel("���̵�", JLabel.CENTER);
		JLabel jlbPwd = new JLabel("��й�ȣ", JLabel.CENTER);
		JLabel jlbPwdChk = new JLabel("��й�ȣ Ȯ��", JLabel.CENTER);
		jtfIdSignUp = new JTextField();
		jpfPwdSignUp = new JPasswordField();
		jpfPwdChkSignUp = new JPasswordField();
		JButton jBtnIdChk = new JButton("�ߺ� Ȯ��");
		JButton jBtnSignup = new JButton("�����ϱ�");
		JButton jBtnCancel = new JButton("����ϱ�");

		jp1.setLayout(new GridLayout(1, 3, 15, 15));
		jp1.add(jlbId);
		jp1.add(jtfIdSignUp);
		jp1.add(jBtnIdChk);
		jp1.setBorder(BorderFactory.createEmptyBorder(160, 60, 30, 100));

		jp2.setLayout(new GridLayout(2, 2, 15, 15));
		jp2.add(jlbPwd);
		jp2.add(jpfPwdSignUp);
		jp2.add(jlbPwdChk);
		jp2.add(jpfPwdChkSignUp);
		jp2.setBorder(BorderFactory.createEmptyBorder(10, 35, 110, 100));

		jp3.setLayout(new GridLayout(2, 1, 15, 15));
		jp3.add(jBtnSignup);
		jp3.add(jBtnCancel);
		jp3.setBorder(BorderFactory.createEmptyBorder(10, 100, 270, 100));

		jBtnCancel.addActionListener(e -> {    
			idChkFlag = false; 
			signUpToLogin();
		});

		jBtnIdChk.addActionListener(e -> {
			idChkFlag = true;
			lc.idValidCheck(jtfIdSignUp.getText());
		});
		
		// ȸ�� ���� �Ҷ�.
		jBtnSignup.addActionListener(e -> {
			lc.join(idChkFlag, jtfIdSignUp.getText(), new String(jpfPwdSignUp.getPassword()));//
		});
		
		signUpViewPanel.setLayout(new BorderLayout());
//		signUpViewPanel.setBounds(0,0,rg.getFrameWidth(),rg.getFrameHeight());
		signUpViewPanel.add(jp1, BorderLayout.NORTH);
		signUpViewPanel.add(jp2, BorderLayout.CENTER);
		signUpViewPanel.add(jp3, BorderLayout.SOUTH);
		loginViewPanel.setVisible(false);
		vm.getMainFrame().add(signUpViewPanel);
		
	}

}

