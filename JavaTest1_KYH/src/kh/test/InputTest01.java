package kh.test;

import java.util.Scanner;

public class InputTest01 {
	public void twoMutiple()
	{		
		Scanner sc = new Scanner(System.in);
		while(true) 
		{
			System.out.print("1~100������ ���� �ϳ��� �Է��ϼ���.(�������� 0�Է�)");
			int num =sc.nextInt();
			if(num==0)
			{
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			if(!(0<num&&num<101))
			{
				System.out.println("1~100������ ������ �Է����ּ���.");
				continue;
			}
			
			if(num%2==0) System.out.println("2�� ����Դϴ�.");
			else System.out.println("2�� ����� �ƴմϴ�.");
		}
	}
}
