package kh.project.exam;

import java.util.Scanner;

public class StdMgr {
	private Student s = new Student();// ������ �������ִ� �׸�.
	private Scanner sc = new Scanner(System.in);
	
	public void start()
	{		
		while(true) 
		{
			System.out.println("�޴��� �����ϼ���");
			System.out.println("1.�л������Է�");
			System.out.println("2.�л��������");
			System.out.print("���� ");
			int select = sc.nextInt();
			switch(select)
			{
				case 1: insertData(); break;				
				case 2: printData(); break;				
			}
		}
		
	}
	
	public void insertData()
	{
		System.out.print("�̸� �Է� : ");
		s.setName(sc.next());
		
		System.out.print("���� �Է� : ");
		s.setAge(sc.nextInt());
		
		sc.nextLine();
		
		System.out.print("�ּ� �Է� : ");
		s.setAddr(sc.nextLine());
	}
	
	public void printData()
	{
		System.out.println("==== ������� ====\n");
		System.out.println("�̸� : " + s.getName());
		System.out.println("���� : " + s.getAge());
		System.out.println("�ּ� : " + s.getAddr());
	}
	
}