package kh.project.exam;

import java.util.Scanner;

public class StdMgr {
	private Student s = new Student();// 정보를 담을수있는 그릇.
	private Scanner sc = new Scanner(System.in);
	
	public void start()
	{		
		while(true) 
		{
			System.out.println("메뉴를 선택하세요");
			System.out.println("1.학생정보입력");
			System.out.println("2.학생정보출력");
			System.out.print("선택 ");
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
		System.out.print("이름 입력 : ");
		s.setName(sc.next());
		
		System.out.print("나이 입력 : ");
		s.setAge(sc.nextInt());
		
		sc.nextLine();
		
		System.out.print("주소 입력 : ");
		s.setAddr(sc.nextLine());
	}
	
	public void printData()
	{
		System.out.println("==== 정보출력 ====\n");
		System.out.println("이름 : " + s.getName());
		System.out.println("나이 : " + s.getAge());
		System.out.println("주소 : " + s.getAddr());
	}
	
}
