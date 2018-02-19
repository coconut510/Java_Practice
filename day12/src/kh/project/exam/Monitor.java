package kh.project.exam;

import java.util.Scanner;

public class Monitor {
	double inch;// ������.
	int widthPixel;// �ػ�.
	int heightPixel;
	String modelName;// �𵨸�.
	int price;// ����.
	String company;// ����ȸ��.
	boolean power = false;// false�� off, true�� on.
	
	public void start()
	{
		Scanner sc = new Scanner(System.in);
		monitorInfoInsert();
		while(true) 
		{
			menu();
			int select = sc.nextInt();
			
			switch(select)
			{
				case 1:  powerBtn(); 	break;
				case 2:  monitorInfo();	break;
				case 3:  powerBtn(); 	break;
			}
		}
	}
	
	public void menu()
	{
		System.out.println("------����� ���� �޴�--------");
		System.out.println("1. ���� on/off");
		System.out.println("2. ����� ���� ����");
		System.out.println("3. ���");
		System.out.println("���� : ");
	}
	
	public void monitorInfoInsert()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �Է��ϼ���(���� inch) : ");
		inch = sc.nextDouble();
		
		System.out.print("�ػ󵵸� �Է��ϼ��� (����  pixel) : ");
		widthPixel  = sc.nextInt();
		
		 sc.nextLine();
		
		System.out.print("�𵨸��� �Է��ϼ��� : ");
		modelName  = sc.nextLine();
		
		System.out.print("������ �Է��ϼ���: ");
		price  = sc.nextInt();
		
		 sc.nextLine();
		
		System.out.print("����ȸ�縦 �Է��ϼ��� : ");
		company  = sc.nextLine();
	}
	
	public void monitorInfo()
	{
		if(power) 
		{
			System.out.printf("-------- ��������� --------\n");
			System.out.printf("- ������:%.2f             -\n",inch);
			System.out.printf("- �ػ�:%d               -\n",widthPixel);
			System.out.printf("- �𵨸�:%s               -\n",modelName);
			System.out.printf("- ����:%d ��                                -\n",price);
			System.out.printf("- ����ȸ��:%s              -\n",company);
			System.out.printf("-------------------------\n");
		}
		else
		{
			System.out.println("���� ����Ͱ� off �����Դϴ�.");
			System.out.println("����� ������ on ���ֽð� �������ּ���.");
		}
	}
	
	public void print()
	{
		
	}
	
	
	public void powerBtn()
	{
		if(power==false)
		{
			System.out.println("������ on �Ǿ����ϴ�.");
			power = true;
		}
		else
		{
			System.out.println("������ off �Ǿ����ϴ�.");
			power = false;
		}
	}

}
