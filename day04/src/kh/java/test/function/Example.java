package kh.java.test.function;

import java.util.Scanner;


public class Example {

	public void opSample()
	{
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, sum;
		double avr;
		
		System.out.print("���� ���� �Է� : ");
		kor = sc.nextInt();
		
		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();
		
		System.out.print("���� ���� �Է� : ");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		avr = ((double)sum/3);
		System.out.printf("���� ������ %d ����� %.2f \n", sum,  avr);

		if((avr>=60) && kor>=40 && eng>=40 && math>=40)
		{
			System.out.println("�հ�!!!");
		}
		else
		{
			System.out.println("���հ�!");
		}
	}
	
	public void opSample2()
	{
		Scanner sc = new Scanner(System.in);
		int num ;
		
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
		if(num%2==0)
		{
			System.out.printf("%d�� ¦��!", num);
		}
		else
		{
			System.out.printf("%d�� Ȧ��!", num);
		}
	}

}
