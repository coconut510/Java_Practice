package kh.java.cal;

import java.util.Scanner;

public class TryCatchEx {
	public void tcEx()
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : ");
		int su1 = sc. nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int su2 = sc. nextInt();
		try {
			System.out.println("��� : " + (su1/su2));
		}
		catch(ArithmeticException e)
		{
			System.out.println("�����޼��� : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println(" �����ϼ̽��ϴ�.");			
	}
	
	public void menuSelect()
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("--------�޴�����---------");
			System.out.println("1.�ݰ����ϴ� .���");
			System.out.println("2.���������� .���");
			System.out.println("3.�Ǹ����� .���");
			System.out.print("�Է� : ");
		
		}
	}
}
