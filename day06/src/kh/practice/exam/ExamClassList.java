package kh.practice.exam;

import java.util.Scanner;

public class ExamClassList {
	public void example01()
	{
		Scanner sc = new Scanner(System.in);
			
		int score =0;
		int i = 0;
		
		while(i<5)
		{
			System.out.print("�������� �Է��Ͻÿ� : ");
			score += sc.nextInt();
			i+=1;
		}		
		System.out.printf("�Է��� 5���� ������ �� : %d", score);
		
	}
	
	public void example02()
	{
		int sum = 0;
		int i = 1;
		while(i<=100)
		{
			sum+=i;
			i+=1;
		}
		System.out.printf("1~100������ ���� %d�Դϴ�.", sum);
	}
	
	public void example03()
	{
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int sum = 0;
		System.out.print("1���� ���Ϸ��� ������ ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		while (i <num)
		{
			i+=1;
			sum+=i;
		}
		System.out.printf("1���� n������ ����? %d ", sum);
	}
	
	public void example04()
	{
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int sum = 0;
		System.out.print("n�� ���� �Է� : ");
		int num = sc.nextInt();
		
		while(i<num)
		{
			i+=2;
			if( i % 2 == 0 ) sum+=i;
		}
		System.out.println("¦���鸸�� ���� : "  + sum);
		
	}
	public void example05()
	{
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� �Է� : ");
		int firstNum = sc.nextInt();
		
		System.out.print("�ι�° �� �Է� : ");
		int secondNum = sc.nextInt();
		
		if(firstNum>secondNum)
		{
			int temp = firstNum;
			firstNum = secondNum;
			secondNum = temp;
		}
		
		int i = firstNum;
		while(i<=secondNum)
		{		
			sum +=i;
			i+=1;
		}
		
		System.out.printf("%d ~ %d������ �� :  %d" , firstNum, secondNum, sum);
		
	}
	
	public void example06()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		int firNum = sc.nextInt();
		
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		int secNum = sc.nextInt();
		
		int sum = 0;
		int count = 0;
		
		if( firNum > secNum )
		{
			int temp = firNum;
			firNum = secNum;
			secNum = temp;
		}
		
		int i = firNum;
		
		while(i<=secNum)
		{
			if( (i%3==0) || (i%5==0) )
			{
				sum+=i;
				count +=1;
			}
			i+=1;
		}
		
		System.out.printf("%d ~ %d ���̿��ִ�\n3, 5�� ����� ������ %d, ���� %d ����� %.1f",firNum,secNum,count, sum, ((double)sum/count));
		Thread t = new Thread();
		try {
			t.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void example07()
	{
		Scanner sc = new Scanner(System.in);
		int su = 0;		
		System.out.print("�����Է� : ");
		su = sc.nextInt();
		do {
			System.out.println(su % 10);
			su/=10;
		}while(su>0);
	}
	
	public void example08()
	{
		int cost = 0;
		char answer ='y';
		String recepiList ="";
		Scanner sc = new Scanner(System.in);
		System.out.println(
				     "���=======================\n"
				+ "1. �������==============1000�� \n"
				+ "2. ġ����==============1200�� \n"
				+ "3. ��ġ���==============2000�� \n"
				+ "���========================\n"
				+ "4. �׳ɶ��==============1200�� \n"
				+ "5. ġ����==============1500�� \n"
				+ "6. «�Ͷ��==============2000�� \n"
				+ "��Ÿ========================\n"
				+ "7. Ƣ��==============1200�� \n"
				+ "8. ����==============2500�� \n"
				+ "9. ����==============1000�� \n"
				+ "10.�����==============800�� \n");
		
		
		do {
		System.out.print("�޴����� : ");
		int menuNum = sc.nextInt();
		System.out.print("�������� : ");
		int menuCountNum = sc.nextInt();
		
		switch(menuNum)
		{
			case 1:
				recepiList = "�������";
				cost+= menuCountNum * 1000;
			break;
			case 2:
				recepiList = "ġ����";
				cost+= menuCountNum * 1200;
			break;
			case 3:
				recepiList = "��ġ���";
				cost+= menuCountNum * 2000;
			break;
			case 4:
				recepiList = "�׳ɶ��";
				cost+= menuCountNum * 1200;
			break;
			case 5:
				recepiList = "ġ����";
				cost+= menuCountNum * 1500;
			break;
			case 6:
				recepiList = "«�Ͷ��";
				cost+= menuCountNum * 2000;
			break;
			case 7:
				recepiList = "Ƣ��";
				cost+= menuCountNum * 1200;
			break;
			case 8:
				recepiList = "����";
				cost+= menuCountNum * 2500;
			break;
			case 9:
				recepiList = "����";
				cost+= menuCountNum * 1000;
			break;
			case 10:
				recepiList = "�����";
				cost+= menuCountNum * 800;
			break;			
		}
		System.out.printf("%s��(��) %d�� �ֹ��ϼ̽��ϴ�.\n", recepiList, menuCountNum);
		
		System.out.print("�߰� �ֹ��Ͻðڽ��ϱ�?(y/n) ");
		sc.nextLine();
		answer = sc.next().charAt(0);
		}while(answer=='y');
							
		System.out.printf("�����Ͻ� �ݾ��� �� %d���Դϴ�.", cost);
		
		Thread t = new Thread();
		try {
			t.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void example09()
	{
		for(int i =1;i<=10;i++)
		{
			System.out.println("i = " + i);
		}
	}
	public void example10()
	{
		
		for(int i = 0; i<5;i++)
		{
			System.out.println("�ȳ��ϼ���");
		}
	}
	
	public void example11()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� ����Ͻðڽ��ϱ�? ");
		int num = sc.nextInt();
		for(int i = 0; i<num;i++)
		{
			System.out.println("�ȳ��ϼ���");
		}
		
		
	}
	
	public void example12()
	{
		int num = 2;
		
		for(int i = 1 ;i<10;i++)
		{
			System.out.printf("%d * %d = %d\n", num,i,num*i);
		}
		
	}
	
	public void example13()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� ����Ͻðڽ��ϱ�?");
		int num = sc.nextInt();
		
		for(int i = 1 ;i<10;i++)
		{
			System.out.printf("%d * %d = %d\n", num,i,num*i);
		}
		
	}
	public void example14()
	{
		Scanner sc = new Scanner(System.in);
		int score =0;
		for(int i =0;i<5;i++)
		{
			System.out.print("�������� �Է��Ͻÿ� : ");
			score += sc.nextInt();
		}
		System.out.printf("�Է��� 5���� ������ �� : %d", score);
	}
	
	public void example15()
	{
		Scanner sc = new Scanner(System.in);
		int sum =0;
		for(int i =0;i<100;i++)
		{
			if(i%2==0) sum +=i;
		}
		System.out.printf("1 ~100 ���� ¦���鸸�� ���� : %d", sum);
	}
	
	public void example16()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("n�� ���� �Է� : ");
		int n = sc.nextInt();
		int sum =0;
		for(int i =0;i<n;i++)
		{
			if(i%2==0) sum +=i;
		}
		System.out.printf("¦���鸸�� ���� : %d", sum);
	}
	
	public void example17()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : ");
		int firNum = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int secNum  = sc.nextInt();
		
		if( firNum > secNum )
		{
			int temp = firNum;
			firNum = secNum;
			secNum = temp;
		}
		int sum = 0;
		for(int i = firNum;i<secNum;i++)
		{
			sum+= i;
		}
		
		System.out.printf("%d ~ %d ������ �� : %d", firNum, secNum, sum);
	}
	
	public void example18()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		int firNum = sc.nextInt();
		
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		int secNum = sc.nextInt();
		
		int sum = 0;
		int count = 0;
		
		if( firNum > secNum )
		{
			int temp = firNum;
			firNum = secNum;
			secNum = temp;
		}
		
		
		for(int i = firNum;i<=secNum;i++)
		{
			if( (i%3==0) || (i%5==0) )
			{
				sum+=i;
				count +=1;
			}
		}
		
		System.out.printf("%d ~ %d ���̿��ִ�\n3, 5�� ����� ������ %d, ���� %d ����� %.1f",firNum,secNum,count, sum, ((double)sum/count));
	}
	
	public void example19()
	{
		int i =1;
		while(i<30)
		{
			if(i%4==0) System.out.println(i);
			i+=1;
		}
		
	}
	
	public void example20()
	{
		Scanner sc =new Scanner(System.in);
		int i =0;
		int num =1;
	    do
		{
			System.out.print("���� �ϳ��� �Է��ϼ���.");
			num = sc. nextInt();
			if(num>0)System.out.printf("%d�� ����Դϴ�.\n", num );
			else if(num<0) System.out.printf("%d�� �����Դϴ�.\n", num );
			else System.out.println("���α׷��� �����մϴ�.");
		}while(num!=0);
	}
	
	public void example21()
	{
		int sum = 0;
		for(int i = 1; i<=10;i++)
		{
			for(int j = 1; j<=i;j++)
			{
				sum+=j;				
			}			
		}
		System.out.printf("����� %d \n" ,sum );
	}
	
	public void example22()
	{
		int n =0;
		int goal = 100;
		int result = 0;
		boolean chk = true;
		while(result<100)//(chk)
		{
			n+=1;	
			if(n%2==0)result -=n;	
			else result +=n;	
			//if(result==goal) chk = false;		
		}
		n = n%2==0?n*-1:n;
		System.out.printf("%d �϶� ������� %d�̵˴ϴ�. ",n,goal);
	}
	
	public void example23()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������� �Է¹����� �Է��ϼ���.");
		int classNum = sc.nextInt();
		int totalNum = 0; 
		for( int i = 1; i<=classNum;i++)
		{
			System.out.printf("%d��° ���� ������ �Է��ϼ��� => ", i);
			totalNum += sc.nextInt();
		}
		double avr = totalNum /classNum;
		if(avr>=80) System.out.println("pass");
		else System.out.println("fail");
	}
}
