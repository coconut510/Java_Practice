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
			System.out.println("========== 학생 관리 프로그램 ==========");
			System.out.println("1. 학생 정보 저장");
			System.out.println("2. 학생 정보 출력");
			System.out.println("0. 종료");
			System.out.print("선택 : ");
			switch(sc.nextInt())
			{
				case 1: studentInsert(); break;
				case 2: studentSelectAll(); break;
				case 0: System.out.println("종료");return;
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
		System.out.print("학생 학번 입력 : ");
		int classNumber = sc.nextInt();
		if(hm.containsKey(classNumber))
		{
			System.out.println("이미 해당 학번 학생이 존재합니다.");
			return ;
		}
		else
		{
			System.out.print("학생 이름 입력 : ");
			String name = sc.next();
			System.out.print("학생 나이 입력 : ");
			int age = sc.nextInt();
			
			hm.put(classNumber, new Student(classNumber,name,age));
		}
	}
	
}
