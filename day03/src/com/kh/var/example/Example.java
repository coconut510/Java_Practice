package com.kh.var.example;

import java.util.Scanner;

public class Example {
	public void example1()
	{
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.print("첫번째 정수 : ");
		a = sc.nextInt();
		System.out.print("두번째 정수 : ");
		b = sc.nextInt();
		
		System.out.println("-----출력결과----");
		System.out.println("더한 결과 -> " + (a+b) );
		System.out.println("뺀    결과 -> " + (a-b));
		System.out.println("곱한 결과 -> " + (a*b));
		System.out.println("나눈 몫 -> " + (a/b));
		System.out.println("나눈 나머지 -> " + (a%b));
		
	
	}
	public void example2()
	{
		Scanner sc = new Scanner(System.in);
		double width;
		double height;
		double area;
		double round;
		System.out.print("가로 : ");
		width = sc.nextDouble();
		System.out.print("세로 : ");
		height = sc.nextDouble();
		
		area = width * height;
		round = 2*(width + height);
		System.out.println("면적 : " + area );
		System.out.println("둘레 : " + round);
	}
	public void example3()
	{
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("문자열을 입력하시오 : ");
		str = sc.nextLine();
		System.out.println("첫번째 문자 : " + str.charAt(0));
		System.out.println("문자열을 입력하시오 : " + str.charAt(1));
		System.out.println("문자열을 입력하시오 : " + str.charAt(2));
	}
}
