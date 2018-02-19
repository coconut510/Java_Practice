package kh.project.exam;

import java.util.Scanner;

public class StudentMgr {
	String name;
	int age;
	String addr;
	
	public void insertData()
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.print("학생 이름 입력 : ");
		name = sc.nextLine();
		
		System.out.print("학생 나이 입력 : ");
		age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("학생 주소 입력 : ");
		addr = sc.nextLine();
	}
	
	public void printData()
	{
		System.out.println("\n====== 정보 출력 ======\n");
		System.out.println("이름	나이	주소");
		System.out.printf("%s\t%d\t%s",name,age,addr);
	}
}
