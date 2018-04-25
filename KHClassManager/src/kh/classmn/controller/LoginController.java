package kh.classmn.controller;

import javax.swing.JOptionPane;

import kh.classmn.view.LoginView;
import kh.classmn.vo.data.DataGroup;

public class LoginController {
	private LoginView loginView;
	private DataGroup dataGroup =null;

	String id;
	String pw;

	public void startLogin() {
		dataGroup = new DataGroup();
		loginView = new LoginView(this);
	}

	public void signUp() {
		loginView.memberSignupPage();
	}

	public void join(boolean idChkFlag, String getId, String getPw) 
	{
//		m = new Member(getId, getPw);
//		dataGroup.setMyMember(m);
		if (idChkFlag == false) {
			JOptionPane.showMessageDialog(null, "���̵� �ߺ� üũ�� ���ּ���!", "ȸ������", JOptionPane.ERROR_MESSAGE);
		} 
		else 
		{
			if(!idValidCheck(getId)) 
			{
//				dataGroup.setMemberDataList(getId,m);
//				dataGroup.saveData();
				loginView.signUpToLogin();
			}
		}
	}

	public void loginSuccess() {
		System.out.println("�α��� ����!");
		loginView.hideAll();
		new ClassController().start();
	}

//	public boolean validCheck(String getId) {
//		int flag = 0; // false
//		if (map.containsKey(getId)) {
//			flag = 1;
//		}
//		if(flag == 1) return true;
//		else return false;
//	}

	public boolean idValidCheck(String id) {
//		if(!(dataGroup.chkValid(id))) {
//			JOptionPane.showMessageDialog(null, "��밡���� ���̵��Դϴ�(Test)", "ȸ������", JOptionPane.INFORMATION_MESSAGE);
//		} else {
//			JOptionPane.showMessageDialog(null, "�̹� �ִ� ���̵� �Դϴ�.", "Ȯ��", JOptionPane.INFORMATION_MESSAGE);
//		}
//		return dataGroup.chkValid(id);
		return true;
	}

	public void loginValidCheck(String getId, String getPw) {
		System.out.println("�ҷ�����.");
		
//		if (dataGroup.chkValid(getId)) 
//		{
//			if(dataGroup.getMember(getId).getPw().equals(getPw)) 
//			{
//				JOptionPane.showMessageDialog(null, "�α��ο� ���� �߽��ϴ�!", "�α���", JOptionPane.INFORMATION_MESSAGE);
//				dataGroup.setMyMember(dataGroup.getMember(getId));
				loginSuccess();
//			}
//			else JOptionPane.showMessageDialog(null, "��й�ȣ�� Ʋ�Ƚ��ϴ�.", "�α���", JOptionPane.ERROR_MESSAGE);
//
//		} else {
//			JOptionPane.showMessageDialog(null, "���̵� ������ �����ϴ�.", "�α���", JOptionPane.ERROR_MESSAGE);
//		}
	}
}
