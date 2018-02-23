package kh.java.stdmng.controller;

import java.util.Scanner;

import kh.java.stdmng.student.vo.Student;

public class StdMgr implements StdMgrInterface {
	private Student [] s = new Student[100];
	private Scanner sc = new Scanner(System.in);
	private int index = 0;
	@Override
	public void start()
	{
		while(true)
		{
			System.out.println("< < < = = = 메뉴 = = = > > >\n");
			System.out.println("1.학생 등록");
			System.out.println("2.학생 검색");
			System.out.println("3.학생 목록");
			System.out.println("4.학생 수정");
			System.out.println("5.학생 삭제");
			System.out.println("6.종료");
			System.out.print("선택 : ");
			
			switch(sc.nextInt())
			{
				case 1: insertData(); break;
				case 2: showStudentData(-1); break;
				case 3: printData(); break;
				case 4: modifyData(); break;
				case 5: deleteData(); break;
				case 6: closeProgram(); return;	
				default : System.out.println("잘못된 명령어 입니다."); continue;
			}
			
		}
	}

	@Override
	public void insertData() {
		System.out.println("======== 학생 정보 입력 ========");
		sc.nextLine();
		s[index] = new Student();
		System.out.print("학생 이름 입력 : ");
		String nameT = sc.nextLine();
		s[index].setName(nameT);
		
		System.out.printf("%s 학생 나이 입력 : ",nameT);
		s[index].setAge(sc.nextInt());
		
		sc.nextLine();
		
		System.out.printf("%s 학생 주소 입력 : ",nameT);
		s[index].setAddr(sc.nextLine());
		
		System.out.printf("%s 학생 국어 점수 : ",nameT);
		s[index].setKor(sc.nextInt());
		
		System.out.printf("%s 학생 영어 점수 : ",nameT);
		s[index].setEng(sc.nextInt());
		
		System.out.printf("%s 학생 수학 점수 : ",nameT);
		s[index].setMath(sc.nextInt());
		
		System.out.println("학생 정보 입력 완료");
		
		index+=1;
		
	}

	@Override
	public void printData() {
		System.out.println("< < = = = = = information = = = = = > >");
		System.out.println("학생이름\t\t학생나이\t\t학생주소");
		for(int i = 0; i<index;i++)
		{
			System.out.printf("%s\t\t%d\t\t%s\n",s[i].getName(),s[i].getAge(),s[i].getAddr());
		}
		
		System.out.println("< 학생 개개인의 점수는 검색을 이용하세요.");
	}

	@Override
	public void deleteData() {
		int tempIndex = searchData();
		index-=1;
		for(int i = tempIndex; i<index;i++)
		{
			s[i] = s[i+1];
		}
		
		System.out.println("삭제 완료");
	}

	@Override
	public void modifyData() {
		int tempIndex = searchData();
		showStudentData(tempIndex);
		boolean loop = true;
		while(loop) 
		{
			System.out.println("\n\n수정할 항목을 선택 하시오");
			System.out.println("1.이름 2.나이 3.주소 	4.점수  5.수정 종료");
			System.out.print("선택 : ");
			switch(sc.nextInt())
			{
				case 1:
					sc.nextLine();
					System.out.println("현재 이름 : " + s[tempIndex].getName());
					System.out.print("수정할 이름 : ");
					String nameTemp = sc.nextLine();
					System.out.printf("이름 %s에서 %s로(으로) 수정 완료.",s[tempIndex].getName(), nameTemp);
					s[tempIndex].setName(nameTemp);
					
				break;
				case 2:
					System.out.println("현재 나이 : " + s[tempIndex].getAge());
					System.out.print("수정할 나이 : ");
					int ageTemp = sc.nextInt();
					System.out.printf("%d세 -> %d 세로 나이 수정 완료.",s[tempIndex].getAge(), ageTemp);
					s[tempIndex].setAge(ageTemp);
				break;
				case 3:
					sc.nextLine();
					System.out.println("현재 나이 : " + s[tempIndex].getAge());
					System.out.print("수정할 나이 : ");
					String addrTemp = sc.nextLine();
					System.out.printf("%s에서 %s로 주소 수정 완료.",s[tempIndex].getAddr(), addrTemp);
					s[tempIndex].setName(addrTemp);
				break;
				case 4:
					System.out.println("현재 점수");
					System.out.printf("국어 : %d 영어 : %d 수학 : %d\n",  s[tempIndex].getKor(), s[tempIndex].getEng(), s[tempIndex].getMath());
					System.out.print("수정할 국어 점수 : ");
					int korTemp = sc.nextInt();
					s[tempIndex].setKor(korTemp);
					
					System.out.print("수정할 영어 점수 : ");
					int engTemp = sc.nextInt();
					s[tempIndex].setEng(engTemp);
					
					System.out.print("수정할 수학 점수 : ");
					int mathTemp = sc.nextInt();
					s[tempIndex].setMath(mathTemp);
					
					System.out.println("점수 수정 완료");
					
				break;
				case 5:
					System.out.println("수정을 종료합니다.\n");
					loop = false;
				break;
			}
		}
	}

	@Override
	public void closeProgram() {
		System.out.println("프로그램을 종료합니다.");
	}

	@Override
	public int searchData() {
		sc.nextLine();
		System.out.print("검색할 이름 입력 : ");
		String name = sc.nextLine();
		boolean chk = false;
		for(int i = 0 ; i<index;i++)
		{
			if(name.equals(s[i].getName()))
			{
				chk = true;
				return i;
			}
		}
		if(!chk) 
		{
			System.out.printf("%s 학생을 찾을수 없습니다. 처음으로 돌아갑니다.\n", name);
			start();
		}
		return 0;
	}

	@Override
	public void showStudentData(int getIndex) {
		int tempIndex = getIndex==-1?searchData():getIndex;
		System.out.println("학생 정보 검색 완료");
		System.out.println("< < = = = = = information = = = = = > >");
		System.out.printf("학생 이름 : %s\n", s[tempIndex].getName());
		System.out.printf("학생 나이 : %d\n", s[tempIndex].getAge());
		System.out.printf("학생 주소 : %s\n", s[tempIndex].getAddr());
		System.out.printf("국어 점수 : %d\n", s[tempIndex].getKor());
		System.out.printf("영어 점수 : %d\n", s[tempIndex].getEng());
		System.out.printf("수학 점수 : %d\n", s[tempIndex].getMath());
		System.out.printf("평균 점수 : %d\n", s[tempIndex].getSum());
		System.out.printf("평균 점수 : %s\n", s[tempIndex].getAvr());
		System.out.printf("평균 점수 : %.2f\n", s[tempIndex].getAvr());
		System.out.printf("학생 등급 : %s\n", s[tempIndex].getGrade());
	}
}
