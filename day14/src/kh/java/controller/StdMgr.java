package kh.java.controller;

import java.util.Scanner;

import kh.java.model.Student;

public class StdMgr {
	private Student[] s = new Student[3];
	private Scanner sc = new Scanner(System.in);
	
	public StdMgr()
	{
		for(int i = 0; i<s.length;i++)
		{
			s[i] = new Student();
		}
	}
	public void start()
	{
		while(true)
		{
			System.out.println("===== �л����� ���� ���α׷� v1.0 =====");
			System.out.println("1.�л������Է�");
			System.out.println("2.�л��������");
			System.out.println("3.���α׷�����");
			
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
		for(int i = 0; i<s.length;i++)
		{
			System.out.println("==== �л����� �Է� ====");
			System.out.print("�й� �Է� : ");
			s[i].setNumber(sc.nextInt());
			
			sc.nextLine();
			System.out.print("�̸� �Է� : ");
			s[i].setName(sc.nextLine());
			System.out.print("���� �Է� : ");
			s[i].setAge(sc.nextInt());
			
			sc.nextLine();
			System.out.print("�ּ� �Է� : ");
			s[i].setAddr(sc.nextLine());
			System.out.print("���� �Է�(M/F) : ");
			s[i].setGender(sc.next().charAt(0));
			System.out.print("���� �Է� : ");
			s[i].setGrade(sc.nextDouble());
			
			System.out.printf("\n%d�� �л��� ���� �Է� �Ϸ�\n", i+1);
		}
		
	}
	public void printData()
	{
		System.out.println("======== �л� ���� ��� ========");
		System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\n","�й�", "�̸�", "����", "�ּ�", "����","����");
		for(int i = 0; i<s.length;i++) 
		{
			System.out.printf("%d\t\t%s\t\t%d\t\t%s\t\t%c\t\t%.2f\n",s[i].getNumber(),s[i].getName(),s[i].getAge(), s[i].getAddr(), s[i].getGender(),s[i].getGrade());;
		}
	}
}
