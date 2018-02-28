package com.exception.number;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		NumberProcess np = new NumberProcess();
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력");
		int a = sc.nextInt();
		System.out.print("두번째 수 입력");
		int b = sc.nextInt();
		try 
		{
			np.checkDouble(a, b);
		}
		catch(NumberRnageException e)
		{
			System.out.println(e.getMessage());
		}
	}
}