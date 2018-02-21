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
			System.out.println("===== 학생정보 관리 프로그램 v1.0 =====");
			System.out.println("1.학생정보입력");
			System.out.println("2.학생정보출력");
			System.out.println("3.프로그램종료");
			
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
		System.out.println("프로그램을 종료합니다.");
		System.out.println("돈내고 사용하세요.");
	}
	public void insertData()
	{
		for(int i = 0; i<s.length;i++)
		{
			System.out.println("==== 학생정보 입력 ====");
			System.out.print("학번 입력 : ");
			s[i].setNumber(sc.nextInt());
			
			sc.nextLine();
			System.out.print("이름 입력 : ");
			s[i].setName(sc.nextLine());
			System.out.print("나이 입력 : ");
			s[i].setAge(sc.nextInt());
			
			sc.nextLine();
			System.out.print("주소 입력 : ");
			s[i].setAddr(sc.nextLine());
			System.out.print("성별 입력(M/F) : ");
			s[i].setGender(sc.next().charAt(0));
			System.out.print("학점 입력 : ");
			s[i].setGrade(sc.nextDouble());
			
			System.out.printf("\n%d번 학생의 정보 입력 완료\n", i+1);
		}
		
	}
	public void printData()
	{
		System.out.println("======== 학생 정보 출력 ========");
		System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\n","학번", "이름", "나이", "주소", "성별","학점");
		for(int i = 0; i<s.length;i++) 
		{
			System.out.printf("%d\t\t%s\t\t%d\t\t%s\t\t%c\t\t%.2f\n",s[i].getNumber(),s[i].getName(),s[i].getAge(), s[i].getAddr(), s[i].getGender(),s[i].getGrade());;
		}
	}
}
