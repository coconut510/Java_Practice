package kh.test;

import java.util.Scanner;

public class NumberOrderCount {
	public void numOrderShow()
	{
		System.out.println("1~9������ ���� 2���� ���ؼ� �ڸ����� ����ϴ� ���α׷��Դϴ�.");
		System.out.println("�����Ϸ��� 0�� �Է��ϼ���\n");
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("ù��° 1~9������ ������ �Է����ּ���.");
			int firNum = sc.nextInt();
			if(firNum==0)
			{
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			if(!(0<firNum&&firNum<10))
			{
				System.out.println("1~9������ ������ �Է����ּ���.\n");
				continue;
			}
			
			System.out.print("�ι�° 1~9������ ������ �Է����ּ���.");
			int secNum = sc.nextInt();
			if(!(0<secNum&&secNum<10))
			{
				System.out.println("1~9������ ������ �Է����ּ���.\n");
				continue;
			}
			
			if((firNum*secNum>9)) System.out.println("\n���ڸ� �� �Դϴ�.\n");
			else System.out.println("\n���ڸ� �� �Դϴ�.\n");
		}
	}
}
