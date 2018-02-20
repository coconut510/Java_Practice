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
			System.out.println("=============================== 학생 관리 프로그램 v1.0 ===============================\n");
			System.out.println("1.학생정보 입력 ");
			System.out.println("2.학생정보 출력 ");
			System.out.println("3.종료 ");
			System.out.print("선택");
			
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
		System.out.println("=================================== 학생 정보 입력 ===================================");
		System.out.print("1.학번 입력 : ");
		s.setNumber(sc.nextInt());
		sc.nextLine();
		System.out.print("2.이름 입력 : ");
		s.setName(sc.nextLine());
		System.out.print("3.나이 입력 : ");
		s.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("4.주소 입력 : ");
		s.setAddr(sc.nextLine());
		System.out.print("5.성별 입력(M/F) : ");
		s.setGender(sc.next().charAt(0));
		System.out.print("6.학점 입력 : ");
		s.setGrade(sc.nextDouble());		
	}
	
	public void printData()
	{
		System.out.println("=================================== 학생 정보 출력 ========================================");
		System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\n", "학번","이름","나이","주소","성별","학점");
		System.out.printf("%d\t\t%s\t\t%d\t\t%s\t%c\t\t%.2f\n", s.getNumber(), s.getName(), s.getAge(), s.getAddr(), s.getGender(),s.getGrade());
		
	}
}
