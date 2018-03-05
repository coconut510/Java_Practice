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
		System.out.println("------- ȸ�� ���� ���α׷� -------");
		System.out.println("1. ȸ�� ����");
		System.out.println("2. ȸ�� ���Կ��� Ȯ��");
		System.out.println("3. ȸ�� ���� ���� <1��>");
		System.out.println("4. ȸ�� ���� �����ϱ�");
		System.out.println("5. ȸ�� ���� �ϱ�");
		System.out.println("0. ���α׷� ����");
		System.out.print("���� : ");
		switch(sc.nextInt())
		{
			case 1: memberJoin(); break;
			case 2: memberCheck(); break;
			case 3: memberSelect(); break;
			case 4: memberModify(); break;
			case 5: memberDelete(); break;
			case 0: System.out.println("���α׷��� �����մϴ�."); return;
		}		
		}
	}
	
	public void memberJoin()
	{
		System.out.println("===== ȸ�� ���� �ϱ� =====");
		
		System.out.print("ȸ�� ���̵� �Է� : ");
		String id = sc.next();
		
		
		System.out.print("ȸ�� ��й�ȣ �Է� : ");
		String password = sc.next();
		
		System.out.print("ȸ�� �̸� �Է� : ");
		String name = sc.next();
		
		System.out.print("ȸ�� ���� �Է� : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("ȸ�� ��ȭ��ȣ �Է� : ");
		String phoneNum = sc.nextLine();
		
		Member m = new Member(id,password,name,age,phoneNum);
		if(	!memberController.memberCheck(id))
		{
			memberController.memberJoin(m);
			System.out.println("ȸ�� ���Կ� �����Ͽ����ϴ�.");	
		}
		else System.out.println("ȸ�� ���Կ� �����Ͽ����ϴ�.");	
		
	}
	public void memberCheck()
	{
		System.out.println("===== ȸ�� ���� ���� Ȯ�� =====");
		System.out.print("ȸ�� ���̵� �Է��ϼ��� : ");
		String id = sc.next();
		if(memberController.memberCheck(id))
		{
			System.out.printf("%sȸ���� ���� �����մϴ�. �ٸ� ���̵� ������ּ���.\n" , id);
		}
		else
		{
			System.out.printf("%sȸ���� ���� ����� �����մϴ�.\n" , id);
		}
	}
	public void memberSelect()
	{
		System.out.println("====== ȸ�� ���� ���� ======");
		System.out.print("��ȸ�� ȸ�� ���̵� �Է��ϼ��� : ");
		String id = sc.next();
		if(memberController.memberCheck(id))
		{
			System.out.println("��ȸ ����!");
			System.out.println(memberController.memberSelect(id));
		}
		else System.out.println("�ش� ȸ���� �������� �ʽ��ϴ�.");
			
	}
	public void memberModify()
	{
		System.out.println("===== ȸ�� ���� ���� �ϱ� ======");
		System.out.print("�����Ͻ� ȸ���� ���̵� �Է��ϼ��� : ");
		String id = sc.next();
		if(memberController.memberCheck(id))
		{
			System.out.print("��й�ȣ<new> : ");
			String password = sc.next();
			
			System.out.print("�̸�<new> : ");
			String name = sc.next();
			
			System.out.print("����<new> : ");
			int age = sc.nextInt();
			
			sc.nextLine();
			System.out.print("����ȣ<new> : ");
			String phoneNum = sc.nextLine();
			
			Member m = new Member(id,password,name,age,phoneNum);
			memberController.memberJoin(m);
			
			System.out.println("ȸ�� ���� ������ �Ϸ�Ǿ����ϴ�.");			
		}
		else
		{
			System.out.println("������ ȸ�� ������ �����ϴ�.");
		}
	}
	public void memberDelete()
	{
		System.out.println("===== ȸ�� ���� �ϱ� =====");
		System.out.print("������ ȸ�� ���̵� �Է��ϼ��� : ");
		String id = sc.next();
		if(memberController.memberCheck(id)) 
		{
			System.out.printf("%s���� ���� �Ǿ����ϴ�.", id);
			memberController.memberDelete(id);
		}
		else
		{
			System.out.println("������ ȸ�� ������ �����ϴ�.");
		}
		System.out.println();
	}
	
}
