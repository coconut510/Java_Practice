package kh.practice.exam;

import java.util.Scanner;

public class ExportSquare {
	public void squareExport()
	{
		Scanner sc = new Scanner(System.in);
		int squareNum = 0;

		while(true) {
			System.out.print("nxn���� ���ϴ� n�� �Է����ּ���.(1~100)");
			squareNum = sc.nextInt();
			if(!(0<squareNum&&squareNum<101))
			{
				System.out.println("1~100������ �ڿ����� �Է����ּ���.");
				continue;
			}
			else break;
		}	
		showSquare(squareNum);
	
	}
	public void showSquare(int squareNum)
	{
		for(int i = 1; i<=squareNum;i++)
		{
			for(int j = 1; j<=squareNum;j++)
			{
				System.out.printf("%4d", i*j);
			}
			System.out.println();
		}
	}
}
