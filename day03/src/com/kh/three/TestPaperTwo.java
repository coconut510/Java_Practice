package com.kh.three;

import java.util.Scanner;

public class TestPaperTwo {

	public static void main(String[] args) {
		int kor;
		int eng;
		int math;
		Scanner sc = new Scanner(System.in);
		System.out.print("[국어]점수입력 :");
		kor = sc.nextInt();
		System.out.print("[수학]점수입력 :");
		eng = sc.nextInt();
		System.out.print("[영어]점수입력 :");
		math = sc.nextInt();
		
		int sum = math + eng+ kor;
		System.out.println("------출력------");
		System.out.printf("%s \t%s \t%s \t%s \n","국어","수학","영어","합계");
		System.out.printf("%d \t%d \t%d \t%d ",kor , math , eng , sum);

	}

}
