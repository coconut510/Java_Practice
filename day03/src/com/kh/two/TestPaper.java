package com.kh.two;

import java.util.Scanner;

public class TestPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum;
		double kor;
		double eng;
		double math;
		char grade;
		double avr;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� �Է� : ");
		kor = sc.nextDouble();
		System.out.print("�������� �Է� : ");
		eng = sc.nextDouble();
		System.out.print("�������� �Է� : ");
		math = sc.nextDouble();
		System.out.print("��� �Է� : ");
		grade = sc.next().charAt(0);
		
		sum = kor + eng + math;
		avr = sum/3;
		System.out.println("--------��°��--------");
		System.out.println("����� ������ ������ " +sum + "���̰� ����� "  +avr +"�� �̱���"  );
		System.out.println("����� ����� "+ grade + "��� �Դϴ�.");
		
		
	}

}
