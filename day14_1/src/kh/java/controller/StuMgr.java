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
		System.out.println("= = = = = = �л� ���� ��� = = = = = = = ");
		System.out.println("�̸�\t\t����\t\t�ּ�");
		for(int  i = 0;i<count;i++)
		{
			System.out.printf("%s\t\t%d\t\t%s\n", s[i].getName(), s[i].getAge(), s[i].getAddr());
		}
	}
}
