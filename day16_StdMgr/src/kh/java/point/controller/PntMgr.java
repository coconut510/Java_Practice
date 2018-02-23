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
			System.out.println("=========== 회원 관리 시스템 ===========\n");
			System.out.println("1. 회원 추가");
			System.out.println("2. 회원 전체 출력");
			System.out.println("3. 회원 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			switch(sc.nextInt())
			{
				case 1: insertData();  break;
				case 2: showEntireData();  break;
				case 3: modifyData();  break;
				case 4: deleteData();  break;
				case 0: 
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					break;
				default : System.out.println("잘못된 명령어를 입력했습니다.");continue;
			}
		}
	}

	@Override
	public void showEntireData()
	{
		System.out.println("<<======= information =======>>");
		System.out.printf("%s\t\t%s\t\t%s\t\t%s\n", "이름","등급","포인트","이자포인트");
		for(int i = 0; i<index;i++)
		{
			System.out.printf("%s\t\t%s\t\t%d\t\t%.1f\n", g[i].getName(),g[i].getGrade(), g[i].getPoint(),g[i].getInterest());
		}
		System.out.println();
	}

	@Override
	public int searchData() {
		sc.nextLine();
		System.out.print("검색될 회원 이름 입력 : ");
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
			System.out.println("회원을 검색하지 못했습니다.\n");
			start();			
		}
		return 0;
	}

	@Override
	public void modifyData() {
		System.out.println("======= 회원 수정 서비스 =======\n");
		int modifyIndex = searchData();		
		System.out.print("수정될 등급 입력  <Silver/Gold/Vip> : ");
		String grade = sc.nextLine();
		if(!(grade.equals("Silver")||grade.equals("Gold")||grade.equals("Vip"))) 
		{
			System.out.println("잘못 입력하셨습니다.<회원 추가를 종료합니다.>");
			start();
		}
		System.out.print("수정될 이름 입력 : ");
		String name = sc.nextLine();
		
		System.out.print("수정될 점수  입력 : ");
		int point = sc.nextInt();
		
		if(grade.equals("Silver")) g[modifyIndex] = new Silver(name,grade,point);
		if(grade.equals("Gold")) g[modifyIndex] = new Gold(name,grade,point); 
		if(grade.equals("Vip")) g[modifyIndex] = new Vip(name,grade,point); 
		System.out.println("수정이 완료되었습니다.");
	}

	@Override
	public void deleteData() {
		System.out.println("======= 회원 삭제 서비스 =======\n");
		int deleteIndex = searchData();
		index-=1;
		for(int i = deleteIndex; i<index;i++)
		{
			g[i] = g[i+1];
		}
		System.out.println("회원 정보가 삭제되었습니다.\n");
	}

	@Override
	public void insertData() {
		sc.nextLine();
		System.out.println("======= 회원 추가 서비스 =======\n");
		System.out.print("등급 입력 <Silver/Gold/Vip> : ");
		String grade = sc.nextLine();
		if(!(grade.equals("Silver")||grade.equals("Gold")||grade.equals("Vip"))) 
		{
			System.out.println("잘못 입력하셨습니다.<회원 추가를 종료합니다.>");
			start();
		}
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		System.out.print("포인트 입력 : ");
		int point = sc.nextInt();
	

		if(grade.equals("Silver")) g[index++] = new Silver(name,grade,point);
		if(grade.equals("Gold")) g[index++] = new Gold(name,grade,point); 
		if(grade.equals("Vip")) g[index++] = new Vip(name,grade,point); 

		System.out.println("회원 추가가 완료되었습니다.");
		 
		
	}

}
