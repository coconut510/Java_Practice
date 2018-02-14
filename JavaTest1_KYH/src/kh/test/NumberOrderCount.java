package kh.test;

import java.util.Scanner;

public class NumberOrderCount {
	public void numOrderShow()
	{
		System.out.println("1~9까지의 정수 2개를 곱해서 자릿수를 출력하는 프로그램입니다.");
		System.out.println("종료하려면 0을 입력하세요\n");
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("첫번째 1~9까지의 정수를 입력해주세요.");
			int firNum = sc.nextInt();
			if(firNum==0)
			{
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if(!(0<firNum&&firNum<10))
			{
				System.out.println("1~9까지의 정수만 입력해주세요.\n");
				continue;
			}
			
			System.out.print("두번째 1~9까지의 정수를 입력해주세요.");
			int secNum = sc.nextInt();
			if(!(0<secNum&&secNum<10))
			{
				System.out.println("1~9까지의 정수만 입력해주세요.\n");
				continue;
			}
			
			if((firNum*secNum>9)) System.out.println("\n두자리 수 입니다.\n");
			else System.out.println("\n한자리 수 입니다.\n");
		}
	}
}
