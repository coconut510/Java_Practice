package kh.java.test.function;

import java.util.Scanner;


public class Example {

	public void opSample()
	{
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, sum;
		double avr;
		
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();
		
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();
		
		System.out.print("수학 점수 입력 : ");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		avr = ((double)sum/3);
		System.out.printf("점수 총합은 %d 평균은 %.2f \n", sum,  avr);

		if((avr>=60) && kor>=40 && eng>=40 && math>=40)
		{
			System.out.println("합격!!!");
		}
		else
		{
			System.out.println("불합격!");
		}
	}
	
	public void opSample2()
	{
		Scanner sc = new Scanner(System.in);
		int num ;
		
		System.out.print("숫자 입력 : ");
		num = sc.nextInt();
		if(num%2==0)
		{
			System.out.printf("%d는 짝수!", num);
		}
		else
		{
			System.out.printf("%d는 홀수!", num);
		}
	}

}
