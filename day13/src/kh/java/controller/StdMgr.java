package kh.java.controller;

import java.util.Scanner;

import kh.java.model.Student;

public class StdMgr {
	
	private Student s = new Student();
    private	Scanner sc = new Scanner(System.in);
	public void start()
	{
		while(true) 
		{
			System.out.println("=============================== �л� ���� ���α׷� v1.0 ===============================\n");
			System.out.println("1.�л����� �Է� ");
			System.out.println("2.�л����� ��� ");
			System.out.println("3.���� ");
			System.out.print("����");
			
			switch(sc.nextInt())
			{
				case 1: insertData(); break;
				case 2: printData(); break;
				case 3: programEnd(); return;
			}
		}
	}
	public void programEnd()
	{
		System.out.println("���α׷��� �����մϴ�.");
		System.out.println("������ ����ϼ���.");		
	}
	public void insertData()
	{
		System.out.println("=================================== �л� ���� �Է� ===================================");
		System.out.print("1.�й� �Է� : ");
		s.setNumber(sc.nextInt());
		sc.nextLine();
		System.out.print("2.�̸� �Է� : ");
		s.setName(sc.nextLine());
		System.out.print("3.���� �Է� : ");
		s.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("4.�ּ� �Է� : ");
		s.setAddr(sc.nextLine());
		System.out.print("5.���� �Է�(M/F) : ");
		s.setGender(sc.next().charAt(0));
		System.out.print("6.���� �Է� : ");
		s.setGrade(sc.nextDouble());		
	}
	
	public void printData()
	{
		System.out.println("=================================== �л� ���� ��� ========================================");
		System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\n", "�й�","�̸�","����","�ּ�","����","����");
		System.out.printf("%d\t\t%s\t\t%d\t\t%s\t%c\t\t%.2f\n", s.getNumber(), s.getName(), s.getAge(), s.getAddr(), s.getGender(),s.getGrade());
		
	}
}
