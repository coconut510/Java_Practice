package student.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import student.controller.StudentController;
import student.vo.Student;

public class StudentView {
	private StudentController stuCon = new StudentController();
	private Scanner sc = new Scanner(System.in);
	public void mainMenu()
	{
		while(true) 
		{
			System.out.println("======= �л� ���� ���α׷� v1.0 =======");
			System.out.println("1. �л� ���� ���	  ");
			System.out.println("2. �л� ���� ��ȸ(�й� ) ");
			System.out.println("3. �л� ���� �Է� 	  ");
			System.out.println("4. �л� ���� ���� 	  ");
			System.out.println("5. �л� ���� ���� 	  ");
			System.out.println("0. ���α׷� ����  	  ");
			System.out.print("���� : ");
			
			switch(sc.nextInt())
			{
				case 1: selectAll(); break;
				case 2: selectOne(); break;
				case 3: insertStudent(); break;
				case 4: updateStudent(); break;
				case 5: deleteStudent(); break;
				case 0: System.out.println("���α׷��� �����մϴ�."); return;		
			}
			System.out.println();
		}
	}
	public void selectAll() 
	{
		ArrayList<Student> s = stuCon.selectAll();
		System.out.println("\n=============== �л� ���� ��ü ��� ===============\n");
		System.out.println("�й�\t\t\t�̸�\t\t\t����\t\t\t�ּ�\t\t\t����");
		for(Student stu : s)
		{
			System.out.println(stu);
		}	
		System.out.println("\n\n");
	}
	public void selectOne() 
	{
		System.out.print("��ȸ�� �л� �й� �Է� : ");
		int classNumber = sc.nextInt();
		Student tempStu = stuCon.selectOne(classNumber); 
		if(tempStu!=null) 
		{
			System.out.printf("\n= = = = = = = %s �л� ���� ��� = = = = = = =\n",tempStu.getName());
			System.out.printf("�й� : %d\n",tempStu.getClassNumber());	
			System.out.printf("�̸� : %s\n",tempStu.getName());
			System.out.printf("���� : %d\n",tempStu.getAge());
			System.out.printf("�ּ� : %s\n",tempStu.getAddress());
			System.out.printf("���� : %.2f\n",tempStu.getGrade());
		}
		else System.out.println("�л��� ��ȸ���� �ʽ��ϴ�.");
	}
	
	
	public void insertStudent()
	{
		Student s = new Student();
		
		System.out.print("�л� �й� �Է� : ");
		s.setClassNumber(sc.nextInt());
		
		sc.nextLine();
		
		System.out.print("�л� �̸� �Է� : ");
		s.setName(sc.nextLine());
		
		System.out.print("�л� ���� �Է� : ");
		s.setAge(sc.nextInt());
		
		sc.nextLine();
		
		System.out.print("�л� �ּ� �Է� : ");
		s.setAddress(sc.nextLine());
		
		System.out.print("�л� ���� �Է� : ");
		s.setGrade(sc.nextDouble());		
	
		if(stuCon.insertStudent(s)) System.out.println("�л� ���� �Է��� �Ϸ��߽��ϴ�.");
		else System.out.println("�л����� �Է��� �����Ͽ����ϴ�!!");
		System.out.println("\n\n");
	}
	public void updateStudent()
	{		
		Student oldStudent = new Student();
		Student newStudent = new Student();
		System.out.println("\n\n= = = = = = = %s �л� ���� ���� = = = = = = =\n");
		System.out.print("������ �л� �й� �Է� : ");
		
		oldStudent = stuCon.selectOne(sc.nextInt()); 
		sc.nextLine();
		if(oldStudent !=null) 
		{
			System.out.printf("�й� : [%d] �̸� : [%s] ���� : [%d] �ּ� : [%s] ���� : [%.2f]\n",
					oldStudent.getClassNumber(),oldStudent.getName(),oldStudent.getAge(),oldStudent.getAddress(),oldStudent.getGrade());
			System.out.print("�й� �Է�<new> : ");
			newStudent.setClassNumber(sc.nextInt());
			
			sc.nextLine();
			System.out.print("�̸� �Է�<new> : ");
			newStudent.setName(sc.nextLine());
			
			System.out.print("���� �Է�<new> : ");
			newStudent.setAge(sc.nextInt());
			
			sc.nextLine();
			System.out.print("�ּ� �Է�<new> : ");
			newStudent.setAddress(sc.nextLine());
			
			System.out.print("���� �Է�<new> : ");
			newStudent.setGrade(sc.nextDouble());	
			
			stuCon.updateStudent(oldStudent, newStudent);
		}
	}
	public void deleteStudent() 
	{
		System.out.println("\n\n= = = = = = = %s �л� ���� ���� = = = = = = =\n");
		System.out.print("������ �л� �й� �Է� : ");
		
		Student delStu = stuCon.selectOne(sc.nextInt()); 
		
		if(delStu!=null)
		{
			stuCon.deleteStudent(delStu.getClassNumber());
			System.out.println(delStu.getName() + " �л��� �������� �����߽��ϴ�.");
		}		
	}
	
	public int inputInt()
	{
		int num = 0;
		while(true)
		{
			try {
				num = sc.nextInt();
				break;
			}
			catch(InputMismatchException e)
			{
				num = sc.nextInt();
				System.out.println("���ڸ� �Է����ּ���.");
			}
		}
		return num;
		
	}
	
	
	
	

}
