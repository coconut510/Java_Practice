package com.kh.var.example;

import java.util.Scanner;

public class Example {
	public void example1()
	{
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.print("ù��° ���� : ");
		a = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		b = sc.nextInt();
		
		System.out.println("-----��°��----");
		System.out.println("���� ��� -> " + (a+b) );
		System.out.println("��    ��� -> " + (a-b));
		System.out.println("���� ��� -> " + (a*b));
		System.out.println("���� �� -> " + (a/b));
		System.out.println("���� ������ -> " + (a%b));
		
	
	}
	public void example2()
	{
		Scanner sc = new Scanner(System.in);
		double width;
		double height;
		double area;
		double round;
		System.out.print("���� : ");
		width = sc.nextDouble();
		System.out.print("���� : ");
		height = sc.nextDouble();
		
		area = width * height;
		round = 2*(width + height);
		System.out.println("���� : " + area );
		System.out.println("�ѷ� : " + round);
	}
	public void example3()
	{
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		str = sc.nextLine();
		System.out.println("ù��° ���� : " + str.charAt(0));
		System.out.println("���ڿ��� �Է��Ͻÿ� : " + str.charAt(1));
		System.out.println("���ڿ��� �Է��Ͻÿ� : " + str.charAt(2));
	}
}
