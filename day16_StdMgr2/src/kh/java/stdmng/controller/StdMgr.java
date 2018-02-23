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
			System.out.println("< < < = = = �޴� = = = > > >\n");
			System.out.println("1.�л� ���");
			System.out.println("2.�л� �˻�");
			System.out.println("3.�л� ���");
			System.out.println("4.�л� ����");
			System.out.println("5.�л� ����");
			System.out.println("6.����");
			System.out.print("���� : ");
			
			switch(sc.nextInt())
			{
				case 1: insertData(); break;
				case 2: showStudentData(-1); break;
				case 3: printData(); break;
				case 4: modifyData(); break;
				case 5: deleteData(); break;
				case 6: closeProgram(); return;	
				default : System.out.println("�߸��� ��ɾ� �Դϴ�."); continue;
			}
			
		}
	}

	@Override
	public void insertData() {
		System.out.println("======== �л� ���� �Է� ========");
		sc.nextLine();
		s[index] = new Student();
		System.out.print("�л� �̸� �Է� : ");
		String nameT = sc.nextLine();
		s[index].setName(nameT);
		
		System.out.printf("%s �л� ���� �Է� : ",nameT);
		s[index].setAge(sc.nextInt());
		
		sc.nextLine();
		
		System.out.printf("%s �л� �ּ� �Է� : ",nameT);
		s[index].setAddr(sc.nextLine());
		
		System.out.printf("%s �л� ���� ���� : ",nameT);
		s[index].setKor(sc.nextInt());
		
		System.out.printf("%s �л� ���� ���� : ",nameT);
		s[index].setEng(sc.nextInt());
		
		System.out.printf("%s �л� ���� ���� : ",nameT);
		s[index].setMath(sc.nextInt());
		
		System.out.println("�л� ���� �Է� �Ϸ�");
		
		index+=1;
		
	}

	@Override
	public void printData() {
		System.out.println("< < = = = = = information = = = = = > >");
		System.out.println("�л��̸�\t\t�л�����\t\t�л��ּ�");
		for(int i = 0; i<index;i++)
		{
			System.out.printf("%s\t\t%d\t\t%s\n",s[i].getName(),s[i].getAge(),s[i].getAddr());
		}
		
		System.out.println("< �л� �������� ������ �˻��� �̿��ϼ���.");
	}

	@Override
	public void deleteData() {
		int tempIndex = searchData();
		index-=1;
		for(int i = tempIndex; i<index;i++)
		{
			s[i] = s[i+1];
		}
		
		System.out.println("���� �Ϸ�");
	}

	@Override
	public void modifyData() {
		int tempIndex = searchData();
		showStudentData(tempIndex);
		boolean loop = true;
		while(loop) 
		{
			System.out.println("\n\n������ �׸��� ���� �Ͻÿ�");
			System.out.println("1.�̸� 2.���� 3.�ּ� 	4.����  5.���� ����");
			System.out.print("���� : ");
			switch(sc.nextInt())
			{
				case 1:
					sc.nextLine();
					System.out.println("���� �̸� : " + s[tempIndex].getName());
					System.out.print("������ �̸� : ");
					String nameTemp = sc.nextLine();
					System.out.printf("�̸� %s���� %s��(����) ���� �Ϸ�.",s[tempIndex].getName(), nameTemp);
					s[tempIndex].setName(nameTemp);
					
				break;
				case 2:
					System.out.println("���� ���� : " + s[tempIndex].getAge());
					System.out.print("������ ���� : ");
					int ageTemp = sc.nextInt();
					System.out.printf("%d�� -> %d ���� ���� ���� �Ϸ�.",s[tempIndex].getAge(), ageTemp);
					s[tempIndex].setAge(ageTemp);
				break;
				case 3:
					sc.nextLine();
					System.out.println("���� ���� : " + s[tempIndex].getAge());
					System.out.print("������ ���� : ");
					String addrTemp = sc.nextLine();
					System.out.printf("%s���� %s�� �ּ� ���� �Ϸ�.",s[tempIndex].getAddr(), addrTemp);
					s[tempIndex].setName(addrTemp);
				break;
				case 4:
					System.out.println("���� ����");
					System.out.printf("���� : %d ���� : %d ���� : %d\n",  s[tempIndex].getKor(), s[tempIndex].getEng(), s[tempIndex].getMath());
					System.out.print("������ ���� ���� : ");
					int korTemp = sc.nextInt();
					s[tempIndex].setKor(korTemp);
					
					System.out.print("������ ���� ���� : ");
					int engTemp = sc.nextInt();
					s[tempIndex].setEng(engTemp);
					
					System.out.print("������ ���� ���� : ");
					int mathTemp = sc.nextInt();
					s[tempIndex].setMath(mathTemp);
					
					System.out.println("���� ���� �Ϸ�");
					
				break;
				case 5:
					System.out.println("������ �����մϴ�.\n");
					loop = false;
				break;
			}
		}
	}

	@Override
	public void closeProgram() {
		System.out.println("���α׷��� �����մϴ�.");
	}

	@Override
	public int searchData() {
		sc.nextLine();
		System.out.print("�˻��� �̸� �Է� : ");
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
			System.out.printf("%s �л��� ã���� �����ϴ�. ó������ ���ư��ϴ�.\n", name);
			start();
		}
		return 0;
	}

	@Override
	public void showStudentData(int getIndex) {
		int tempIndex = getIndex==-1?searchData():getIndex;
		System.out.println("�л� ���� �˻� �Ϸ�");
		System.out.println("< < = = = = = information = = = = = > >");
		System.out.printf("�л� �̸� : %s\n", s[tempIndex].getName());
		System.out.printf("�л� ���� : %d\n", s[tempIndex].getAge());
		System.out.printf("�л� �ּ� : %s\n", s[tempIndex].getAddr());
		System.out.printf("���� ���� : %d\n", s[tempIndex].getKor());
		System.out.printf("���� ���� : %d\n", s[tempIndex].getEng());
		System.out.printf("���� ���� : %d\n", s[tempIndex].getMath());
		System.out.printf("��� ���� : %d\n", s[tempIndex].getSum());
		System.out.printf("��� ���� : %s\n", s[tempIndex].getAvr());
		System.out.printf("��� ���� : %.2f\n", s[tempIndex].getAvr());
		System.out.printf("�л� ��� : %s\n", s[tempIndex].getGrade());
	}
}
