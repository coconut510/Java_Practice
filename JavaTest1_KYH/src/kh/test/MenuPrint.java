package kh.test;

import java.util.Scanner;

public class MenuPrint {
	public void menuShow()
	{
		Scanner sc =new Scanner(System.in);
		int num = 0;
		while(true) 
		{
			System.out.print("1~5번까지 번호를 입력해주세요 : ");
			num = sc.nextInt();
			switch(num)
			{
				case 1: System.out.println("1 : ** 입력이 정상적으로 되었습니다! ** \n"); 	break;			
				case 2: System.out.println("2 : ** 조회가 시작되었습니다! ** \n"); 	    break;
				case 3: System.out.println("3 : ** 수정이 정상적으로 되었습니다! ** \n");	break;
				case 4: System.out.println("4 : ** 삭제가 정상적으로 되었습니다! ** \n");	break;
				case 5: System.out.println("5 : ** 정상적으로 종료 되었습니다! **  \n");	return;
				default: System.out.println(" ** 다시 입력해 주세요! ** \n"); continue;					
			}
		}
	}
}
