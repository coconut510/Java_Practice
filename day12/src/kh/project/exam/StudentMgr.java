package kh.project.exam;

import java.util.Scanner;

public class StudentMgr {
	String name;
	int age;
	String addr;
	
	public void insertData()
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.print("�л� �̸� �Է� : ");
		name = sc.nextLine();
		
		System.out.print("�л� ���� �Է� : ");
		age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("�л� �ּ� �Է� : ");
		addr = sc.nextLine();
	}
	
	public void printData()
	{
		System.out.println("\n====== ���� ��� ======\n");
		System.out.println("�̸�	����	�ּ�");
		System.out.printf("%s\t%d\t%s",name,age,addr);
	}
}
