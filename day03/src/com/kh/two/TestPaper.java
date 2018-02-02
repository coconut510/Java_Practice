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
		
		System.out.print("국어점수 입력 : ");
		kor = sc.nextDouble();
		System.out.print("영어점수 입력 : ");
		eng = sc.nextDouble();
		System.out.print("수학점수 입력 : ");
		math = sc.nextDouble();
		System.out.print("등급 입력 : ");
		grade = sc.next().charAt(0);
		
		sum = kor + eng + math;
		avr = sum/3;
		System.out.println("--------출력결과--------");
		System.out.println("당신의 성적의 총합은 " +sum + "점이고 평균은 "  +avr +"점 이군요"  );
		System.out.println("당신의 등급은 "+ grade + "등급 입니다.");
		
		
	}

}
