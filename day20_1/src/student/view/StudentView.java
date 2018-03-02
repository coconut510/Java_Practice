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
			System.out.println("======= 학생 관리 프로그램 v1.0 =======");
			System.out.println("1. 학생 정보 출력	  ");
			System.out.println("2. 학생 정보 조회(학번 ) ");
			System.out.println("3. 학생 정보 입력 	  ");
			System.out.println("4. 학생 정보 변경 	  ");
			System.out.println("5. 학생 정보 삭제 	  ");
			System.out.println("0. 프로그램 종료  	  ");
			System.out.print("선택 : ");
			
			switch(sc.nextInt())
			{
				case 1: selectAll(); break;
				case 2: selectOne(); break;
				case 3: insertStudent(); break;
				case 4: updateStudent(); break;
				case 5: deleteStudent(); break;
				case 0: System.out.println("프로그램을 종료합니다."); return;		
			}
			System.out.println();
		}
	}
	public void selectAll() 
	{
		ArrayList<Student> s = stuCon.selectAll();
		System.out.println("\n=============== 학생 정보 전체 출력 ===============\n");
		System.out.println("학번\t\t\t이름\t\t\t나이\t\t\t주소\t\t\t학점");
		for(Student stu : s)
		{
			System.out.println(stu);
		}	
		System.out.println("\n\n");
	}
	public void selectOne() 
	{
		System.out.print("조회할 학생 학번 입력 : ");
		int classNumber = sc.nextInt();
		Student tempStu = stuCon.selectOne(classNumber); 
		if(tempStu!=null) 
		{
			System.out.printf("\n= = = = = = = %s 학생 정보 출력 = = = = = = =\n",tempStu.getName());
			System.out.printf("학번 : %d\n",tempStu.getClassNumber());	
			System.out.printf("이름 : %s\n",tempStu.getName());
			System.out.printf("나이 : %d\n",tempStu.getAge());
			System.out.printf("주소 : %s\n",tempStu.getAddress());
			System.out.printf("학점 : %.2f\n",tempStu.getGrade());
		}
		else System.out.println("학생이 조회되지 않습니다.");
	}
	
	
	public void insertStudent()
	{
		Student s = new Student();
		
		System.out.print("학생 학번 입력 : ");
		s.setClassNumber(sc.nextInt());
		
		sc.nextLine();
		
		System.out.print("학생 이름 입력 : ");
		s.setName(sc.nextLine());
		
		System.out.print("학생 나이 입력 : ");
		s.setAge(sc.nextInt());
		
		sc.nextLine();
		
		System.out.print("학생 주소 입력 : ");
		s.setAddress(sc.nextLine());
		
		System.out.print("학생 학점 입력 : ");
		s.setGrade(sc.nextDouble());		
	
		if(stuCon.insertStudent(s)) System.out.println("학생 정보 입력을 완료했습니다.");
		else System.out.println("학생정보 입력이 실패하였습니다!!");
		System.out.println("\n\n");
	}
	public void updateStudent()
	{		
		Student oldStudent = new Student();
		Student newStudent = new Student();
		System.out.println("\n\n= = = = = = = %s 학생 정보 변경 = = = = = = =\n");
		System.out.print("변경할 학생 학번 입력 : ");
		
		oldStudent = stuCon.selectOne(sc.nextInt()); 
		sc.nextLine();
		if(oldStudent !=null) 
		{
			System.out.printf("학번 : [%d] 이름 : [%s] 나이 : [%d] 주소 : [%s] 학점 : [%.2f]\n",
					oldStudent.getClassNumber(),oldStudent.getName(),oldStudent.getAge(),oldStudent.getAddress(),oldStudent.getGrade());
			System.out.print("학번 입력<new> : ");
			newStudent.setClassNumber(sc.nextInt());
			
			sc.nextLine();
			System.out.print("이름 입력<new> : ");
			newStudent.setName(sc.nextLine());
			
			System.out.print("나이 입력<new> : ");
			newStudent.setAge(sc.nextInt());
			
			sc.nextLine();
			System.out.print("주소 입력<new> : ");
			newStudent.setAddress(sc.nextLine());
			
			System.out.print("학점 입력<new> : ");
			newStudent.setGrade(sc.nextDouble());	
			
			stuCon.updateStudent(oldStudent, newStudent);
		}
	}
	public void deleteStudent() 
	{
		System.out.println("\n\n= = = = = = = %s 학생 정보 삭제 = = = = = = =\n");
		System.out.print("삭제할 학생 학번 입력 : ");
		
		Student delStu = stuCon.selectOne(sc.nextInt()); 
		
		if(delStu!=null)
		{
			stuCon.deleteStudent(delStu.getClassNumber());
			System.out.println(delStu.getName() + " 학생을 학적에서 삭제했습니다.");
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
				System.out.println("숫자만 입력해주세요.");
			}
		}
		return num;
		
	}
	
	
	
	

}
