package kh.test;

import java.util.Scanner;

public class MenuPrint {
	public void menuShow()
	{
		Scanner sc =new Scanner(System.in);
		int num = 0;
		while(true) 
		{
			System.out.print("1~5������ ��ȣ�� �Է����ּ��� : ");
			num = sc.nextInt();
			switch(num)
			{
				case 1: System.out.println("1 : ** �Է��� ���������� �Ǿ����ϴ�! ** \n"); 	break;			
				case 2: System.out.println("2 : ** ��ȸ�� ���۵Ǿ����ϴ�! ** \n"); 	    break;
				case 3: System.out.println("3 : ** ������ ���������� �Ǿ����ϴ�! ** \n");	break;
				case 4: System.out.println("4 : ** ������ ���������� �Ǿ����ϴ�! ** \n");	break;
				case 5: System.out.println("5 : ** ���������� ���� �Ǿ����ϴ�! **  \n");	return;
				default: System.out.println(" ** �ٽ� �Է��� �ּ���! ** \n"); continue;					
			}
		}
	}
}
