package kh.pracktice.arrayprac;

import java.util.Scanner;

public class ExamArrayFunc {
	public void example01()
	{
		String[] fluteArr = {"����","������","Ű��","���","�ٳ���"};
		System.out.println("for ����");
		System.out.println(fluteArr[0]);
		System.out.println(fluteArr[1]);
		System.out.println(fluteArr[2]);
		System.out.println(fluteArr[3]);
		System.out.println(fluteArr[4]);
		
		System.out.println("\n\nfor��");
		for(int i = 0; i<fluteArr.length;i++)
		{
			System.out.println(fluteArr[i]);
		}
	}
	
	public void example02()
	{
		int[] examScore = new int[4];
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		
		for(int i = 0; i<examScore.length-1;i++)
		{
			switch(i) 
			{
				case 0: System.out.print("�������� : ");
				 examScore[i] = sc.nextInt();
				 break;
				case 1: System.out.print("�������� : ");
				 examScore[i] = sc.nextInt();
				 break;
				case 2: System.out.print("�������� : ");
				 examScore[i] = sc.nextInt();
				 break;
				case 3: examScore[i] = sum;
				 
			}
			sum +=examScore[i];
		}
		

		System.out.println("���� :" +examScore[0]);
		System.out.println("���� :" +examScore[1]);
		System.out.println("���� :" +examScore[2]);
		System.out.println("�հ� :" +sum);
		System.out.printf("��� : %.2f", sum/3.0);
		
	}
	
	public void example03()
	{
		int[] examScore = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<examScore.length;i++)
		{
			System.out.printf("%d ��° �л��� ���� :", i+1 );
			examScore[i] = sc.nextInt();
		}
		
		System.out.println("\n\n<<�Է��� �л����� ����>>");
		for(int i = 0; i<examScore.length;i++)
		{
			System.out.print(examScore[i] +" ");
		}
		
		System.out.printf("\n�л����� �� �հ� : %d",examScore[0]+examScore[1]+examScore[2]+examScore[3]+examScore[4] );
		System.out.printf("\n�л����� ��� ���� : %.2f", (double)(examScore[0]+examScore[1]+examScore[2]+examScore[3]+examScore[4])/examScore.length );
	
	}
}
