package kh.java.test;

import java.util.Scanner;

public class ExampleList {
	public void example01()
	{
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("������ ���� �Է��ϼ���:");
		num = sc.nextInt();
		
		if(num>0)
		{
			System.out.printf("����� �Է��� �� %d �� ����Դϴ�.", num);
		}
		else if(num<0)
		{
			System.out.printf("����� �Է��� �� %d �� �����Դϴ�.", num);
		}
		else
		{
			System.out.printf("����� �Է��� �� %d �� 0�Դϴ�.", num);
		}
	}
	
	public void example02()
	{
		System.out.println("= = = �μ� �� �ϴ� ���α׷� v1.0 = = =");
		Scanner sc = new Scanner(System.in);
		int numOne, numSecond;
		
		System.out.print("ù��° ���� �Է��ϼ���:");
		numOne = sc.nextInt();
		
		System.out.print("�ι�° ���� �Է��ϼ���:");
		numSecond = sc.nextInt();
		
		if(numOne>numSecond)// ù��° ���� �� ū���
		{
			System.out.printf("%d > %d \nù��° ���� �� Ů�ϴ�.", numOne, numSecond);
		}
		else if(numOne<numSecond)// �ι�° ���� �� ū���
		{
			System.out.printf("%d < %d \n�ι�° ���� �� Ů�ϴ�.", numOne, numSecond);
		}
		else // �μ��� �������.
		{
			System.out.printf("%d = %d \n�� ���� ������ �Դϴ�.", numOne, numSecond);
		}
	}
	
	
	public void example03()
	{
		char feature;
		int firNum,secNum;
		double result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���α׷�  ver 1.0");
		
		System.out.print("�����ڸ� �Է��ϼ���(+,-,*,/) :");
		feature = sc.next().charAt(0);
		
		System.out.print("ù��° ���� �Է� :");
		firNum = sc.nextInt();
		
		System.out.print("�ι�° ���� �Է� :");
		secNum = sc.nextInt();

		if(feature=='+')
		{
			System.out.printf("%d %c %d = %d", 
					firNum,feature,secNum,(firNum+secNum));
		}
		else if(feature=='-')
		{
			System.out.printf("%d %c %d = %d", 
					firNum,feature,secNum,( firNum-secNum));
		}
		else if(feature=='*')
		{
			System.out.printf("%d %c %d = %d", 
					firNum,feature,secNum,(firNum*secNum));
		}
		else if(feature=='/')
		{
			System.out.printf("%d %c %d = %f", 
					firNum,feature,secNum,(double)firNum/secNum);
		}
		
		
	}
	
	
	public void example04()
	{
		Scanner sc = new Scanner(System.in);
		int su;
		
		System.out.print("�����Է� : ");
		su = sc.nextInt();
		if(su>0)
		{
			System.out.println("�Է� ���� 0 ���� ũ��");
		}
		else
		{
			System.out.println("�Է� ���� 0 ���� ũ�� �ʴ�.");
		}
	}
	

	//��� 4-2 1������.
	public void example05()
	{
		final int ADC = 15000;
		final int KDC  = 10000;
		int totalNum, kidCount, adultCount;
		
		System.out.println("���� ���� ���α׷� v1.0");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Ͻ� �ο��� �� ����Դϱ�?");
		totalNum= sc.nextInt();
		 
		System.out.print("��� ����Դϱ�? (�ο���  1�� 5õ��)");
		adultCount = sc.nextInt();
		
		System.out.print("��� ����Դϱ�? (�ο���  1�� 5õ��)");
		kidCount = sc.nextInt();
		
		if(totalNum==(adultCount + kidCount))
		{
			System.out.printf("�����Ͻ� �� �ݾ��� %d �� �Դϴ�.\n", 
					(ADC * adultCount + KDC * kidCount));
		}
		else
		{
			System.out.println("�����Ͻ� �ο��� ���� �ʽ��ϴ�.");
		}
	}
	

	//��� 4-2 2������.
	public void example06()
	{
		int score = 0;
		int answer;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("ù��° �����Դϴ�.");
		System.out.print("����� ����� �����ϱ��? (1.Apple / 2.�⽺) ");
		answer = sc.nextInt();
		if(answer==1) 
		{
			System.out.println("����!");
			score+=1;
		}
		else System.out.println("��");
		
		
		
		System.out.println("�ι�° �����Դϴ�.");
		System.out.print("�ٳ������� ��� ������ ���� ������?(1.���� 2.���) ");		
		answer = sc.nextInt();
		if(answer==1) 
		{
			System.out.println("����!");
			score+=1;
		}
		else System.out.println("��");
		
		System.out.printf("�� %d ������ ���߼̽��ϴ�", score);
	}
	
	public void example07()
	{
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.print("1���� 100������ �� �� ���� :");
		num1 = sc.nextInt();
		if( 1<= num1 && num1 <=100 ) 
		{			
			if(num1%2==0) System.out.printf("�Է��� ���� ¦���Դϴ�.\n");
			else System.out.println("�Է��� ���� Ȧ�� �Դϴ�.");
		}
		else
		{
			System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
		}
	}
	
	// 4-3 ��� ����1.
	public void example08()
	{
		System.out.println("= = = = = = �ɸ� �׽�Ʈ v1.0 = = = = = =");
		Scanner sc = new Scanner(System.in);
		int answer;
		System.out.print("����� ���� �����Ͻʴϱ�?(1.yes, 2.no)");
		answer = sc.nextInt();
		if(answer==1)
		{
			System.out.print("����� ��踦 �ǿ�ϱ�?(1.yes, 2.no)");
			answer = sc.nextInt();
			if(answer==1)
			{
				System.out.println("������ �˰��� ���� �ʽ��ϴ�.");
			}
			else
			{
				System.out.println("���� �ǿ��� �ʾƵ� �������� ���� �����ؿ�!");
			}
		}
		else
		{
			System.out.print("����� �̼�ģ���� �ֽ��ϱ�?(1.yes, 2.no)");
			answer = sc.nextInt();
			if(answer==1)
			{
				System.out.println("��.....");
			}
			else
			{
				System.out.println("��������.... ���������� ��ó���...?");
			}
		}		
	}
	
	public void example09()
	{
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.print("InputNumber 1~3:");
		num1 = sc.nextInt();
		if(num1 ==1)
		{
			System.out.println("One !");
		}
		else if(num1 ==2)
		{
			System.out.println("Two !");
		}
		else if(num1 ==3)
		{
			System.out.println("Three !");
		}
		else
		{
			System.out.println("Error !");
		}
	}
	
	
	//4-4 ��� ����1
	public void example10()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է�");
		char w = sc.next().charAt(0);
		System.out.println("======��  �� ======");
		if('a'<=w  && w<='z')
		{
			System.out.printf("�ҹ��ڷ� �Է� �Ͽ����ϴ�.\n�빮�ڷ� ��ȯ : %c", w - 32);
		}
		else if('A'<=w  && w<='Z')
		{
			System.out.printf("�빮�ڷ� �Է� �Ͽ����ϴ�.\n�ҹ��ڷ� ��ȯ : %c", w + 32);
		}
		else
		{
			System.out.println("�߸��Է��ϼ̽��ϴ�. �����ڸ� �Է����ּ���.");
		}		
	}
	//4-4 ����2��
	public void example11()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է�");
		int num = sc.nextInt();
		
		if(num!=0) 
		{
			if((num%3==0) &&(num%4==0))
			{
				System.out.printf("%d��(��) 3�� ����̸鼭, 4�� ����Դϴ�.",num);
			}
			else if((num%3==0))
			{
				System.out.printf("%d��(��) 3�� ����Դϴ�.",num);
			}
			else if((num%4==0))
			{
				System.out.printf("%d��(��) 4�� ����Դϴ�.",num);
			}
			else
			{
				System.out.printf("%d��(��) 3�� �����, 4�� ����� �ƴմϴ�.",num);
			}
		}
		else
		{
			System.out.println("0�� 3�� ����� 4�� ����� �ƴմϴ�.");
		}						
	}
	
	
	//��� 4-2 3������.
	public void example12()
	{
		Scanner sc = new Scanner(System.in);
		
		String name;
		int yearGrade, classGrade, orderNum;
		char sex;
		String sexKor;
		double examScore;
		
		System.out.print("�л��̸��� �Է��ϼ��� : ");
		name = sc.nextLine();

		System.out.print("�г��� �Է��ϼ��� : ");
		yearGrade = sc.nextInt();
		
		System.out.print("���� �Է��ϼ��� : ");
		classGrade = sc.nextInt();
		
		System.out.print("��ȣ�� �Է��ϼ��� : ");
		orderNum = sc.nextInt();
		
		System.out.print("������ �Է��ϼ���(��:M, �� :F) : ");
		sex = sc.next().charAt(0);
		
		System.out.print("����� �Է��ϼ��� : ");
		examScore = sc.nextDouble();
		
		sexKor = sex=='M'?"���л�":"���л�";
		
		System.out.printf("%d�г� %d�� %d�� %s %s��(��) ������ %.2f�̴�. ",
				yearGrade,classGrade, orderNum, sexKor, name,  examScore  );
	}
	
	// 4-3 ����2
	public void example13()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("1~10 ������ ���� �Ѱ��� �Է��ϼ���.");
		int num = sc.nextInt();
		
		if(1<=num && num<=10)
		{
			String numChk = (num%2==0)?"¦��":"Ȧ��";
			System.out.printf("%s��", numChk);
		}
		else
		{
			System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
		}
	}
	
	//4-3 ����3
	public void example14()
	{
		Scanner sc = new Scanner(System.in);
		double tall, mass, standardMass;
		String massResult;
		System.out.print("����(cm)�� �Է��ϼ��� :");
		tall = sc.nextDouble();
		
		System.out.print("ü��(kg)�� �Է��ϼ��� :");
		mass = sc.nextDouble();
		
		System.out.println("----------------");
		standardMass = (tall-100) * 0.9;
		
		if(standardMass-1 > mass)// ��ü��
		{
			massResult = "��ü��"; 
		}
		else if(standardMass+1 < mass)//��ü��
		{
			massResult = "��ü��"; 
		}
		else
		{
			massResult = "ǥ��ü��"; 
		}
		System.out.printf("ǥ��ü���� %.2f �Դϴ�.\n��� ����� %s�Դϴ�.", standardMass, massResult);
		
		
	}
	
	
	// 4-3 ����4
	public void example15()
	{
		Scanner sc = new Scanner(System.in);
	}
	
	
	//4-4 �߰�����
	public void example16()
	{
		Scanner sc = new Scanner(System.in);
		double tall, mass, bmi;
		String bmiResult;
		System.out.print("����(cm)�� �Է��ϼ��� :");
		tall = sc.nextDouble();
		
		System.out.print("ü��(kg)�� �Է��ϼ��� :");
		mass = sc.nextDouble();
		
		bmi = mass/(tall*tall * 0.01);
		if(bmi<18.5)
		{
			bmiResult = "��ü��";
		}
		else if (18.5<=bmi && bmi<23 )
		{
			bmiResult = "����ü��";
		}
		else if (23<=bmi && bmi<25 )
		{
			bmiResult = "��ü��";
		}
		else if (25<=bmi && bmi<30 )
		{
			bmiResult = "��";
		}
		else 
		{
			bmiResult = "����";
		}
		
		
		System.out.printf("BMI(ü���� ����)�� %f �̹Ƿ� %s�Դϴ�.",bmi, bmiResult );
	}
	
	public void PsyTest()
	{
		Scanner sc = new Scanner(System.in);
		final String LION = "����";
		final String MONKEY = "������";
		final String COW = "��";
		final String HORSE = "��";
		final String SHEEP = "��";
		
		String animal ="";
		char answer;
		System.out.println("===== �縷 ���� �ɸ��׽�Ʈ =====");
		System.out.println("����� ���� �縷�� Ȧ�� �ֽ��ϴ�\n"
				+ "����� ����, ������, ��, ��, �� �̷���\n �ټ������� ������ �縷�� �ǳʾ� �մϴ�.\n"
				+ "�׷��� �ʹ� ��ġ�� ���� \n ��� ������ �� ������ ���� ���ϰ� �Ǿ����\n"
				+ "5������ ���� �� 1������ ������ �ϴµ���,\n �������� � ������ ���� �縷�� �����ðڽ��ϱ�?\n "
				+ "���� (a), ������(b), ��(c), ��(d), ��(e)\n"
				);
		System.out.print("���� ���� ���� ������?");
		answer = sc.next().charAt(0);
		
		if(answer=='a') animal = LION;
		else if(answer=='b') animal = MONKEY;
		else if(answer=='c') animal = COW;
		else if(answer=='d') animal = HORSE;
		else if(answer=='e') animal = SHEEP;
		
		System.out.printf("������� %s�� ���Ƚ��ϴ�.",animal );
		
		System.out.print("�� ���� ���� ������?");
		answer = sc.next().charAt(0);
		
		if(answer=='a') animal = LION;
		else if(answer=='b') animal = MONKEY;
		else if(answer=='c') animal = COW;
		else if(answer=='d') animal = HORSE;
		else if(answer=='e') animal = SHEEP;
		
		System.out.printf("�ι�°�� %s�� ���Ƚ��ϴ�.",animal );
		
		System.out.print("�� ���� ���� ������?");
		answer = sc.next().charAt(0);
		
		if(answer=='a') animal = LION;
		else if(answer=='b') animal = MONKEY;
		else if(answer=='c') animal = COW;
		else if(answer=='d') animal = HORSE;
		else if(answer=='e') animal = SHEEP;
		
		System.out.printf("����°�� %s�� ���Ƚ��ϴ�.",animal );
		
		System.out.print("�� ���� ���� ������?");
		answer = sc.next().charAt(0);
		
		if(answer=='a') animal = LION;
		else if(answer=='b') animal = MONKEY;
		else if(answer=='c') animal = COW;
		else if(answer=='d') animal = HORSE;
		else if(answer=='e') animal = SHEEP;
		
		System.out.printf("�׹�°�� %s�� ���Ƚ��ϴ�.",animal );
		
		System.out.print("���������� ���� ������?");
		answer = sc.next().charAt(0);
		
		if(answer=='a') animal = LION;
		else if(answer=='b') animal = MONKEY;
		else if(answer=='c') animal = COW;
		else if(answer=='d') animal = HORSE;
		else if(answer=='e') animal = SHEEP;
		
		System.out.printf("���������� %s�� ���Ƚ��ϴ�.",animal );
		
		System.out.printf("\n\n ============���============\n\n",animal );
		
		
		System.out.println("�� ������ �������� ���� ��Ȳ�� ������ ��,\n" + 
				"���� ���� �����ϰ� �Ǵ� ���� ���������� �˾ƺ��� �ɸ��׽�Ʈ �Դϴ�.\n"
				+ "������ ������ �ǹ��ϴ� �ٴ�\n"
				+ "1.����=������ / 2.��=���� / 3.��=���� / 4.��=��� / 5.������=ģ��\n"
				+ "������ �����ϴ�.");
	}
	
}
