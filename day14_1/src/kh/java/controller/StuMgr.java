package kh.java.controller;

import kh.java.model.vo.Student;

public class StuMgr {
	private int count = 0;
	Student[] s = new Student[10];
	public void insertStudent(Student s)
	{
		 this.s[count] = s; 
		 count+=1;
	}
	public void viewAllStudent()
	{
		System.out.println("= = = = = = 학생 정보 출력 = = = = = = = ");
		System.out.println("이름\t\t나이\t\t주소");
		for(int  i = 0;i<count;i++)
		{
			System.out.printf("%s\t\t%d\t\t%s\n", s[i].getName(), s[i].getAge(), s[i].getAddr());
		}
	}
}
