package kh.test;

import java.util.Scanner;

public class InputTest01 {
	public void twoMutiple()
	{		
		Scanner sc = new Scanner(System.in);
		while(true) 
		{
			System.out.print("1~100까지의 정수 하나를 입력하세요.(끝내려면 0입력)");
			int num =sc.nextInt();
			if(num==0)
			{
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if(!(0<num&&num<101))
			{
				System.out.println("1~100까지의 정수만 입력해주세요.");
				continue;
			}
			
			if(num%2==0) System.out.println("2의 배수입니다.");
			else System.out.println("2의 배수가 아닙니다.");
		}
	}
}
