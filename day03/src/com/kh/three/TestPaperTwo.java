package com.kh.three;

import java.util.Scanner;

public class TestPaperTwo {

	public static void main(String[] args) {
		int kor;
		int eng;
		int math;
		Scanner sc = new Scanner(System.in);
		System.out.print("[����]�����Է� :");
		kor = sc.nextInt();
		System.out.print("[����]�����Է� :");
		eng = sc.nextInt();
		System.out.print("[����]�����Է� :");
		math = sc.nextInt();
		
		int sum = math + eng+ kor;
		System.out.println("------���------");
		System.out.printf("%s \t%s \t%s \t%s \n","����","����","����","�հ�");
		System.out.printf("%d \t%d \t%d \t%d ",kor , math , eng , sum);

	}

}
