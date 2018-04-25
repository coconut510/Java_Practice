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
			JOptionPane.showMessageDialog(null, "아이디 중복 체크를 해주세요!", "회원가입", JOptionPane.ERROR_MESSAGE);
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
		System.out.println("로그인 성공!");
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
//			JOptionPane.showMessageDialog(null, "사용가능한 아이디입니다(Test)", "회원가입", JOptionPane.INFORMATION_MESSAGE);
//		} else {
//			JOptionPane.showMessageDialog(null, "이미 있는 아이디 입니다.", "확인", JOptionPane.INFORMATION_MESSAGE);
//		}
//		return dataGroup.chkValid(id);
		return true;
	}

	public void loginValidCheck(String getId, String getPw) {
		System.out.println("불러오기.");
		
//		if (dataGroup.chkValid(getId)) 
//		{
//			if(dataGroup.getMember(getId).getPw().equals(getPw)) 
//			{
//				JOptionPane.showMessageDialog(null, "로그인에 성공 했습니다!", "로그인", JOptionPane.INFORMATION_MESSAGE);
//				dataGroup.setMyMember(dataGroup.getMember(getId));
				loginSuccess();
//			}
//			else JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다.", "로그인", JOptionPane.ERROR_MESSAGE);
//
//		} else {
//			JOptionPane.showMessageDialog(null, "아이디 정보가 없습니다.", "로그인", JOptionPane.ERROR_MESSAGE);
//		}
	}
}
