package kh.java.member.view;

import java.util.Scanner;

import kh.java.member.controller.MemberController;
import kh.java.member.model.vo.Member;

public class MemberView {
	private MemberController memberController = new MemberController();
	private Scanner sc = new Scanner(System.in);
	public void mainMenu()
	{
		while(true) {
		System.out.println("------- 회원 관리 프로그램 -------");
		System.out.println("1. 회원 가입");
		System.out.println("2. 회원 가입여부 확인");
		System.out.println("3. 회원 정보 보기 <1명>");
		System.out.println("4. 회원 정보 변경하기");
		System.out.println("5. 회원 삭제 하기");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 : ");
		switch(sc.nextInt())
		{
			case 1: memberJoin(); break;
			case 2: memberCheck(); break;
			case 3: memberSelect(); break;
			case 4: memberModify(); break;
			case 5: memberDelete(); break;
			case 0: System.out.println("프로그램을 종료합니다."); return;
		}		
		}
	}
	
	public void memberJoin()
	{
		System.out.println("===== 회원 가입 하기 =====");
		
		System.out.print("회원 아이디 입력 : ");
		String id = sc.next();
		
		
		System.out.print("회원 비밀번호 입력 : ");
		String password = sc.next();
		
		System.out.print("회원 이름 입력 : ");
		String name = sc.next();
		
		System.out.print("회원 나이 입력 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("회원 전화번호 입력 : ");
		String phoneNum = sc.nextLine();
		
		Member m = new Member(id,password,name,age,phoneNum);
		if(	!memberController.memberCheck(id))
		{
			memberController.memberJoin(m);
			System.out.println("회원 가입에 성공하였습니다.");	
		}
		else System.out.println("회원 가입에 실패하였습니다.");	
		
	}
	public void memberCheck()
	{
		System.out.println("===== 회원 가입 여부 확인 =====");
		System.out.print("회원 아이디를 입력하세요 : ");
		String id = sc.next();
		if(memberController.memberCheck(id))
		{
			System.out.printf("%s회원은 현재 존재합니다. 다른 아이디를 사용해주세요.\n" , id);
		}
		else
		{
			System.out.printf("%s회원은 현재 사용이 가능합니다.\n" , id);
		}
	}
	public void memberSelect()
	{
		System.out.println("====== 회원 정보 보기 ======");
		System.out.print("조회할 회원 아이디를 입력하세요 : ");
		String id = sc.next();
		if(memberController.memberCheck(id))
		{
			System.out.println("조회 성공!");
			System.out.println(memberController.memberSelect(id));
		}
		else System.out.println("해당 회원이 존재하지 않습니다.");
			
	}
	public void memberModify()
	{
		System.out.println("===== 회원 정보 변경 하기 ======");
		System.out.print("변경하실 회원의 아이디를 입력하세요 : ");
		String id = sc.next();
		if(memberController.memberCheck(id))
		{
			System.out.print("비밀번호<new> : ");
			String password = sc.next();
			
			System.out.print("이름<new> : ");
			String name = sc.next();
			
			System.out.print("나이<new> : ");
			int age = sc.nextInt();
			
			sc.nextLine();
			System.out.print("폰번호<new> : ");
			String phoneNum = sc.nextLine();
			
			Member m = new Member(id,password,name,age,phoneNum);
			memberController.memberJoin(m);
			
			System.out.println("회원 정보 변경이 완료되었습니다.");			
		}
		else
		{
			System.out.println("변경할 회원 정보가 없습니다.");
		}
	}
	public void memberDelete()
	{
		System.out.println("===== 회원 삭제 하기 =====");
		System.out.print("삭제할 회원 아이디를 입력하세요 : ");
		String id = sc.next();
		if(memberController.memberCheck(id)) 
		{
			System.out.printf("%s님이 삭제 되었습니다.", id);
			memberController.memberDelete(id);
		}
		else
		{
			System.out.println("삭제할 회원 정보가 없습니다.");
		}
		System.out.println();
	}
	
}
