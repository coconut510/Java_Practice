package com.exception.number;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		NumberProcess np = new NumberProcess();
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� �Է�");
		int a = sc.nextInt();
		System.out.print("�ι�° �� �Է�");
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