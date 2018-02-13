package kh.practice.exam;

import java.util.Scanner;

public class CharChange {
	public void start()
	{
		Scanner sc = new Scanner (System.in);
		char ch;
		System.out.print("영문자 입력: ");
		ch = sc.next().charAt(0);
		System.out.println("==== 변 환 ====");
		System.out.print(ch +" --> ");
		ch = charChange(ch);
		System.out.println(ch);
	}

	public char charChange(char ch) {	
		return (char) (ch^32);
	}
	
	public void test()
	{
		int [] arr = {1,2,3,4,5};
		test2(arr);
		System.out.println(arr[0]);
	}
	
	public void test2(int []a)
	{
		a[0] = 999;
	}
	
}
