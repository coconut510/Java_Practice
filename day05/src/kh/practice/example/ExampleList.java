package kh.practice.example;

import java.util.Scanner;

public class ExampleList {
	public void example01()
	{
		Scanner sc = new Scanner(System.in);// ��ĳ�� Ŭ������ �����Ѵ�.
		int select;// switch���� �б����� ������ ������ �����Ѵ�.
		System.out.print("1~3���� ���� �Է� : ");// ����ڰ� �Է��� ���� ��Ʈ�� ����Ѵ�.
		select = sc.nextInt();// switch���� ����� ������ ������ ����ڰ� �Է��Ѵ�.
		switch(select)  // ����ڰ� �Է��� ������ ���ǽ��� ���� �ְ� �Ѵ�.
		{
			case 1: 
				System.out.println("1 �� �Է��Ͽ����ϴ�.");// 1�� �Է������� ����ϴ� ��Ʈ
			//break;
			case 2: 
				System.out.println("2 �� �Է��Ͽ����ϴ�.");// 2�� �Է������� ����ϴ� ��Ʈ
			//break;
			case 3: 
				System.out.println("3 �� �Է��Ͽ����ϴ�.");// 3�� �Է������� ����ϴ� ��Ʈ
			//break;
			default: System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");//1~3 �̿ܿ� �Է������� ����ϴ� ��Ʈ
				
		
		}
	}
	
	public void example02()
	{
		Scanner sc = new Scanner(System.in);// ��ĳ�� Ŭ������ ������ �ش�.
		
		System.out.print("������ ������ �Է��� �ּ���.");  //����ڰ� �Է��� ������ ���� ��Ʈ�� ������ش�.
		String flute = sc.nextLine();// ���� ���ڿ� ������ ����ڰ� �Է��Ѱ��� �������ش�.
		
		// �޴��� ����.
		System.out.print("��� - 1000��\n�ٳ��� - 3000��\n������ - 2000��\nŰ�� - 5000��\n");
		
		switch(flute)// switch ������ ����ڰ� �Է��� �������� �Ҵ����ش�.
		{
			case "���":// ����ڰ� ����� �Է�������.
				System.out.printf("%s�� ������ 1000�� �Դϴ�.", flute);// ����� ������ ���.
			break;
			case "�ٳ���":// ����ڰ� �ٳ����� �Է�������.
				System.out.printf("%s�� ������ 3000�� �Դϴ�.", flute);// �ٳ����� ������ ���.
				break;
			case "������":// ����ڰ� �����Ƹ� �Է�������.
				System.out.printf("%s�� ������ 2000�� �Դϴ�.", flute);// �������� ������ ���.
				break;
			case "Ű��":// ����ڰ� Ű���� �Է�������.
				System.out.printf("%s�� ������ 5000�� �Դϴ�.", flute);// Ű���� ������ ���.
				break;
		}
	}
	
	public void example03()
	{
		Scanner sc = new Scanner(System.in);// ��ĳ�� Ŭ������ �������ش�.
		System.out.print("��ȣ�Է� : ");// ����ڰ� �Է����ִ� ������ ���� ��Ʈ�� ���.
		int num = sc.nextInt();// ���� �޴� ��ȣ�� ���� ������ ����ڰ� �Է����ش�.
		
		// �޴� ����.
		System.out.print("*****�ʱ� �޴�*****\n"
						+ "1.�Է�\n"
						+ "2.����\n"
						+ "3.��ȸ\n"
						+ "4.����\n"
						+ "0.����\n"
						+ "****************\n");
		
		switch(num)// ����ڰ� �Է��� ������ �б����ش�.
		{
			case 1:// 1�� �Է�������.
				 System.out.println("�Է¸޴�����");// �ش� ��Ʈ ���.
				break;
			case 2:// 2�� �Է�������.
				 System.out.println("�����޴�����");// �ش� ��Ʈ ���.
				break;
			case 3:// 3�� �Է�������.
				 System.out.println("��ȸ�޴�����");// �ش� ��Ʈ ���.
				break;
			case 4:// 4�� �Է�������.
				 System.out.println("�����޴�����");// �ش� ��Ʈ ���.
				break;
			case 0:// 0�� �Է�������.
				 System.out.println("���α׷��� �����մϴ�.");// �ش� ��Ʈ ���.
				break;
			default:// �޴� �̿��� ���� �Է����� ��.
				 System.out.println("��ȣ�� �߸� �����̽��ϴ�. ���α׷� �����մϴ�.");
				
		}
	}
	
	public void example04()
	{
		Scanner sc = new Scanner(System.in);// ��ĳ�� Ŭ���� ����.
		String burgerMenu="";// ���� �޴� �̸� ������ ����.
		String sideMenu ="";// ���̵� �޴� �̸� �������� ����.

		int cost =0;// �Ѱ�(���� + ���̵� �޴� ����)�� �������� ����.
		// �ָ޴��� ���.
		System.out.print("*****�� �޴�*****\n"
						+ "a.�Ұ�� ���� ------5000\n"
						+ "b.���� ���� -------4000\n"
						+ "c.ġŲ ���� -------4500\n"
						+ "d.�ѿ� ���� -------10000\n"
						+ "e.����� ---------7000\n"
						+ "****************\n");
		
		System.out.print("�ܹ��Ÿ� ����ּ��� : ");// ����ڰ� �Է��� ������ ���� �ȳ� ��Ʈ ���.
		char burgerChar = sc.next().charAt(0);// a~e �ѱ����̹Ƿ� ĳ���� ������ ���.
		switch(burgerChar)// ����ڰ� �Է��� burgerChar�� �ش�Ǵ� ���ǽ����� ����.
		{
			case 'a': //a �� �Է�������.
				burgerMenu = "�Ұ�� ����";// �̸� �������ִ� ������ �����̸� ����.
				cost+= 5000;// ���� �߰�.
				break;
			case 'b': // b �� �Է�������.
				burgerMenu = "���� ����";// �̸� �������ִ� ������ �����̸� ����.
				cost+= 4000;// ���� �߰�.
				break;
			case 'c': //c �� �Է�������.
				burgerMenu = "ġŲ ����";// �̸� �������ִ� ������ �����̸� ����.
				cost+= 4500;// ���� �߰�.
				break;
			case 'd': //d �� �Է�������.
				burgerMenu = "�ѿ� ����";// �̸� �������ִ� ������ �����̸� ����.
				cost+= 10000;// ���� �߰�.
				break;
			case 'e': //e �� �Է�������.
				burgerMenu = "�����";// �̸� �������ִ� ������ �����̸� ����.
				cost+= 7000;// ���� �߰�.
				break;
			default: // �̿��ǰ��� ���������. case�� �ش����� ���� ��� ���ǵ��϶� ������ش�.
				System.out.println("�޴��� �߸� �����̽��ϴ�. ������ �����մϴ�.");// ��Ʈ
				return ;// ���α׷� ����.
//				System.exit(0);// ���α׷� ����.
		}
		
		// ���̵� �޴� �׸� ���.
		System.out.print("*****���̵� �޴�*****\n"
						+ "1.�ݶ� ------1500\n"
						+ "2.���̴� -------1500\n"
						+ "3.��ũ���̵� -------2500\n"
						+ "4.����� -------3000\n"
						+ "******************\n");
		
		System.out.print("���̵� �޴��� ����ּ���.");// ����ڰ� �Է��� ���� ���� ���� ��Ʈ ���.
		int sideMenuNum = sc.nextInt();//1~4 ���̵� �޴� ��ȣ�� �Է¹��� ����.
		
		switch(sideMenuNum)  // �Է¹��� ���̵� �޴� ��ȣ�� ���ǽ��� ���.
		{
			case 1 : // 1�� �Է�������.
				sideMenu = "�ݶ�";// ���̵� �޴��̸��� �����ϴ� ������ �̸��� �������ش�.
				cost += 1500;// �����߰�
				break;
			case 2 :// 2�� �Է�������.
				sideMenu = "���̴�";// ���̵� �޴��̸��� �����ϴ� ������ �̸��� �������ش�.
				cost += 1500;// �����߰�
			break;
			case 3 :// 3�� �Է�������.
				sideMenu = "��ũ����ũ";// ���̵� �޴��̸��� �����ϴ� ������ �̸��� �������ش�.
				cost += 2500;// �����߰�
			break;
			case 4 :// 4�� �Է�������.
				sideMenu = "�����";// ���̵� �޴��̸��� �����ϴ� ������ �̸��� �������ش�.
				cost += 3000;// �����߰�
			break;
			default: // �̿��� ���� �Է�������.
				System.out.println("��ȣ�� �߸� �����̽��ϴ�. ������ �����մϴ�.");// ��Ʈ ���
				return ;// ���α׷� ����.
//				System.exit(0);// ���α׷� ����.
		}
		
		//�� ���θ޴�, ���̵� �޴�, ������ ������ش�.
		System.out.printf("%s, %s�� �� %d���Դϴ�.", burgerMenu, sideMenu, cost);
		
	}
	
	public void example05()
	{
		Scanner sc = new Scanner(System.in);// ��ĳ�� Ŭ���� ����.
		System.out.print("�ϼ��� �˰���� ���� �Է��ϼ��� : ");//����ڰ� �Է��� ������ ���� �ȳ� ��Ʈ.
		int month = sc.nextInt();// �ϼ��� �˰���� ���� �Է¹޴´�.
		
		switch(month)// �Է��� �޿����� �б�.
		{
			case 2: System.out.printf("%d������ 28 �ϼ� �Դϴ�.",month);//2���� 28��.			
				break;
			case 4 : case 6: case 9: case 11: // 4,6,9,11�� 30��
					System.out.printf("%d������ 30 �ϼ� �Դϴ�.",month);
				break;
			default : System.out.printf("%d������ 31 �ϼ� �Դϴ�.",month);// �̿ܿ��� ��� 31��
		}
	}
	
	public void example06()
	{
		Scanner sc = new Scanner(System.in);// ��ĳ�� Ŭ������ ����
		
		System.out.print("===���� ���α׷�===\n"
				+ "������ �Է�(+,-,*,/)");// ���α׷� ����.
		
		int num1 = 0; // ù��° �Է¹��� ���� ����, ���ǽ� �ȿ� �����Ƿ� ���� �ʱ�ȭ .
		int num2 = 0; // �ι�° �Է¹��� ���� ����, ���ǽ� �ȿ� �����Ƿ� ���� �ʱ�ȭ .
		char op = sc.next().charAt(0);// �����ڸ� �Է¹޴´�.
		
		if(op=='+' || op=='-'|| op=='*' || op=='/') // �ش� �������϶��� switch�� ������ ������
		{		
			System.out.print("ù��° ���� �Է� : ");	// ù��° ���� �Է�	
			num1= sc.nextInt();
			
			System.out.print("�ι�° ���� �Է� : ");// �ι�° ���� �Է�
			num2= sc.nextInt();
			
			System.out.println("=====���=====");
			
			switch(op)//����ڰ� �Է��� �����ڷ� �б�.
			{
				case '+'://+�� ����������.
					System.out.printf("%d %c %d = %d", num1, op, num2, num1 + num2);
					break;
				case '-'://-�� ����������.
					System.out.printf("%d %c %d = %d", num1, op, num2, num1 - num2);
					break;
				case '*'://*�� ����������.
					System.out.printf("%d %c %d = %d", num1, op, num2, num1 * num2);
					break;
				case '/':// /�� ����������.
					System.out.printf("%d %c %d = %.2f", num1, op, num2, (double)num1 / num2);
					break;				
			}	
		}
		else // �����ϴ� �����ڰ� �ƴҶ� ��Ʈ ���.
		{
			System.out.printf("�߸��� �����ڸ� �Է��߽��ϴ�. %c�� ���� �� �� �����ϴ�." , op);	
			return;// ���α׷� ����.
		}
			 
		
		
		
		
	}
	
	public void example07()
	{
		Scanner sc = new Scanner(System.in);// ��ĳ�� Ŭ���� ������.
		
		int orderNum  =0;// �ֹ� ��ȣ ���� ���� �� �ʱ�ȭ.
		
		
		//�޴� ǥ��.
		System.out.print("********�� ��********\n"
				+ "1.������ -----------1000\n"
				+ "2.��� -----------2000\n"
				+ "3.���� -----------1000\n"
				+ "4.���� -----------2000\n"
				+ "5.Ƣ�� -----------3000\n"
				+ "6.��Ƣ�� ----------8000\n"
				+ "************************\n");
		
		System.out.print("�ֹ� ��ȣ �Է� : ");// ����ڰ� �Է��� ������ ���� ���� ��Ʈ.
		orderNum = sc.nextInt();//����� �Է��ϴ� ����.
		
		switch(orderNum)// ����ڰ� �ֹ��� ��ȣ�� �б�.
		{
			case 1:// 1�� �Է�������.
				System.out.println("�����̴� 1000�� �Դϴ�.");
				break;
			case 2:// 2�� �Է�������.
				System.out.println("����� 2000�� �Դϴ�.");
			break;
			case 3:// 3�� �Է�������.
				System.out.println("������ 1000�� �Դϴ�.");
			break;
			case 4:// 4�� �Է�������.
				System.out.println("����� 2000�� �Դϴ�.");
			break;
			case 5:// 5�� �Է�������.
				System.out.println("Ƣ���� 3000�� �Դϴ�.");
			break;
			case 6:// 6�� �Է�������.
				System.out.println("��Ƣ���� 8000�� �Դϴ�.");
				break;
			default :// �̿��� ���� �Է�������.
				System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�.");
		}
		
		
	}
	
	public void example08()
	{
		Scanner sc = new Scanner(System.in);// ��ĳ�� Ŭ������ ����
		char grade;// ��� ���� ����.
		System.out.println("���б� ���� �ý��� �Դϴ�.");// ���α׷� �̸� 
		System.out.print("�л� ������ �Է����ּ���.\n(A����, B����,C����,D����,E����)\n");		
		// ����ڰ� �Է��� ���� ������ ���� ��Ʈ.
		
		System.out.print("�Է� : ");// ����ڰ� �Է��� ���� ������ ���� ��Ʈ2.
		grade = sc.next().charAt(0);// ��� �Է�.
		
		switch(grade)// ������� switch �б�.
		{
			case 'A'://A�Է�������.
				System.out.println("�����ϼ̽��ϴ�. ���б��� 100% �����ص帮�ڽ��ϴ�.");
				break;
			case 'B'://B�Է�������.
				System.out.println("�ణ �ƽ��׿�. ���б��� 50% �����ص帮�ڽ��ϴ�.");
			break;
			case 'C'://C�Է�������.
				System.out.println("�̹� �б� ���б��� ���׿�... ��������");
			break;
			case 'D'://D�Է�������.
				System.out.println("���бݺ��ٴ� �а�� ���ϼ̳׿�.. ����ϼ���");
			break;
			case 'E'://E�Է�������.
				System.out.println("�̹��б� ���б����� �а� �����̽��ϴ� 3GO�Ͻ� ����");
			break;		
		}
		
	}
	
	public void example09()
	{
		Scanner sc = new Scanner(System.in);// ��ĳ�� Ŭ���� ����.
		System.out.print("���� �Է� :");// ����ڰ� �Է��ϴ� ���������� ���� ��Ʈ.
		int score = sc.nextInt();// ���� ������ ����� �Է��� �޾� �����Ѵ�.
		int scoreTemp = 0;// �ӽ������� ������ �������� ����.
		char grade = 'A';// ����� �ȳ����� ���� ���� �� �ʱ�ȭ.
		
		scoreTemp = (int)(score * 0.1);// �ӽ� ������ 0.1�� �����༭ 10~1���� ��µǵ��� �������ش�.
		if(0 <= score && score<=100) // 0~100 ���� ������ �������� �Ʒ� ���ǹ��� ����.
		{
			switch(scoreTemp)  // 0.1 ������ ������ �б����ش�.
			{
				case 10: case 9 ://9�̻��϶�
					grade = 'A';
					break;
				case 8://8�̻��϶�
					grade = 'B';
					break;
				case 7://7�̻��϶�
					grade = 'C';
					break;
				case 6://6�̻��϶�
					grade = 'D';
					break;					
				case 5://5�̻��϶�
					grade = 'E';
					break;
				default : grade = 'F';// �̿��϶�.
			}
			System.out.printf("%d �� ==> %c���", score, grade);// ������ ��� ǥ��.
		}
		else
		{
			System.out.println("�߸��� �Է�(0~100 ���� �Է�");// ���� �̿��� ������ �Է�������.
		}
	}
}
