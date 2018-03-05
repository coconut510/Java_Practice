package kh.java.hasmaptest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMgr {
	private HashMap<Integer,Student> hm = new HashMap<Integer,Student>();
	private Scanner sc = new Scanner(System.in);
	
	public void start()
	{
		while(true)
		{
			System.out.println("========== �л� ���� ���α׷� ==========");
			System.out.println("1. �л� ���� ����");
			System.out.println("2. �л� ���� ���");
			System.out.println("0. ����");
			System.out.print("���� : ");
			switch(sc.nextInt())
			{
				case 1: studentInsert(); break;
				case 2: studentSelectAll(); break;
				case 0: System.out.println("����");return;
			}
		}
	}

	public void studentSelectAll() {
		Iterator iter = hm.keySet().iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

	public void studentInsert() {
		System.out.print("�л� �й� �Է� : ");
		int classNumber = sc.nextInt();
		if(hm.containsKey(classNumber))
		{
			System.out.println("�̹� �ش� �й� �л��� �����մϴ�.");
			return ;
		}
		else
		{
			System.out.print("�л� �̸� �Է� : ");
			String name = sc.next();
			System.out.print("�л� ���� �Է� : ");
			int age = sc.nextInt();
			
			hm.put(classNumber, new Student(classNumber,name,age));
		}
	}
	
}
