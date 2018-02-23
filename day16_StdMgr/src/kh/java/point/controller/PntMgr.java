package kh.java.point.controller;

import java.util.Scanner;

import kh.java.point.model.vo.Gold;
import kh.java.point.model.vo.Grade;
import kh.java.point.model.vo.Silver;
import kh.java.point.model.vo.Vip;

public class PntMgr implements  PntMgrInterface {
	
	private Grade[] g = new Grade[20];
	private int index = 0;
	private Scanner sc = new Scanner(System.in);

	@Override
	public void start() {
		while(true)
		{
			System.out.println("=========== ȸ�� ���� �ý��� ===========\n");
			System.out.println("1. ȸ�� �߰�");
			System.out.println("2. ȸ�� ��ü ���");
			System.out.println("3. ȸ�� ����");
			System.out.println("4. ȸ�� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� : ");
			switch(sc.nextInt())
			{
				case 1: insertData();  break;
				case 2: showEntireData();  break;
				case 3: modifyData();  break;
				case 4: deleteData();  break;
				case 0: 
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
					break;
				default : System.out.println("�߸��� ��ɾ �Է��߽��ϴ�.");continue;
			}
		}
	}

	@Override
	public void showEntireData()
	{
		System.out.println("<<======= information =======>>");
		System.out.printf("%s\t\t%s\t\t%s\t\t%s\n", "�̸�","���","����Ʈ","��������Ʈ");
		for(int i = 0; i<index;i++)
		{
			System.out.printf("%s\t\t%s\t\t%d\t\t%.1f\n", g[i].getName(),g[i].getGrade(), g[i].getPoint(),g[i].getInterest());
		}
		System.out.println();
	}

	@Override
	public int searchData() {
		sc.nextLine();
		System.out.print("�˻��� ȸ�� �̸� �Է� : ");
		String searchName = sc.nextLine();
		int infoIndex = -1;
		for(int i = 0; i<index;i++)
		{
			if(searchName.equals(g[i].getName()))
			{
				infoIndex = i;
				return infoIndex;
			}
		}
		if(infoIndex==-1) 
		{
			System.out.println("ȸ���� �˻����� ���߽��ϴ�.\n");
			start();			
		}
		return 0;
	}

	@Override
	public void modifyData() {
		System.out.println("======= ȸ�� ���� ���� =======\n");
		int modifyIndex = searchData();		
		System.out.print("������ ��� �Է�  <Silver/Gold/Vip> : ");
		String grade = sc.nextLine();
		if(!(grade.equals("Silver")||grade.equals("Gold")||grade.equals("Vip"))) 
		{
			System.out.println("�߸� �Է��ϼ̽��ϴ�.<ȸ�� �߰��� �����մϴ�.>");
			start();
		}
		System.out.print("������ �̸� �Է� : ");
		String name = sc.nextLine();
		
		System.out.print("������ ����  �Է� : ");
		int point = sc.nextInt();
		
		if(grade.equals("Silver")) g[modifyIndex] = new Silver(name,grade,point);
		if(grade.equals("Gold")) g[modifyIndex] = new Gold(name,grade,point); 
		if(grade.equals("Vip")) g[modifyIndex] = new Vip(name,grade,point); 
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	}

	@Override
	public void deleteData() {
		System.out.println("======= ȸ�� ���� ���� =======\n");
		int deleteIndex = searchData();
		index-=1;
		for(int i = deleteIndex; i<index;i++)
		{
			g[i] = g[i+1];
		}
		System.out.println("ȸ�� ������ �����Ǿ����ϴ�.\n");
	}

	@Override
	public void insertData() {
		sc.nextLine();
		System.out.println("======= ȸ�� �߰� ���� =======\n");
		System.out.print("��� �Է� <Silver/Gold/Vip> : ");
		String grade = sc.nextLine();
		if(!(grade.equals("Silver")||grade.equals("Gold")||grade.equals("Vip"))) 
		{
			System.out.println("�߸� �Է��ϼ̽��ϴ�.<ȸ�� �߰��� �����մϴ�.>");
			start();
		}
		System.out.print("�̸� �Է� : ");
		String name = sc.nextLine();
		
		System.out.print("����Ʈ �Է� : ");
		int point = sc.nextInt();
	

		if(grade.equals("Silver")) g[index++] = new Silver(name,grade,point);
		if(grade.equals("Gold")) g[index++] = new Gold(name,grade,point); 
		if(grade.equals("Vip")) g[index++] = new Vip(name,grade,point); 

		System.out.println("ȸ�� �߰��� �Ϸ�Ǿ����ϴ�.");
		 
		
	}

}
