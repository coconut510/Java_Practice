package kh.java.cal;

import java.util.Scanner;

public class TryCatchEx {
	public void tcEx()
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int su1 = sc. nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int su2 = sc. nextInt();
		try {
			System.out.println("결과 : " + (su1/su2));
		}
		catch(ArithmeticException e)
		{
			System.out.println("에러메세지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println(" 수고하셨습니다.");			
	}
	
	public void menuSelect()
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("--------메뉴선택---------");
			System.out.println("1.반갑습니다 .출력");
			System.out.println("2.잘지내세요 .출력");
			System.out.println("3.또만나요 .출력");
			System.out.print("입력 : ");
		
		}
	}
}
