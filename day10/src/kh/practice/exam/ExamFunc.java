package kh.practice.exam;

import java.util.Scanner;

public class ExamFunc {
	public void flexibleArrayExam()
	{
		int [][] arr = new int[3][];
		arr[0] = new int[] {1,2,3};
		arr[1] = new int[] {4,5};
		arr[2] = new int[] {6,7,8,9,10};
		
		System.out.println(arr[1][1]);
	}
	public void apratInfoManage()
	{
		int apartTall = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("---- A ����Ʈ ���� �Է� ----");
		String[][] apt;

		System.out.print("�ǹ� �� ���� �Է� : ");
		apartTall = sc.nextInt();
		
		apt = new String[apartTall][];

		for(int i = 0; i<apt.length;i++)
		{
			System.out.printf("%d���� �� ȣ�� �Է� : ",i+1);		
			apt[i] = new String[sc.nextInt()];
		}
		
		for(int i  = 0; i<apt.length;i++)
		{
			System.out.printf("%d���� %dȣ�Ǳ��� ���� �Ǿ����ϴ�.\n", i+1, apt[i].length);
		}
		System.out.println("\n�� ȣ�Ǹ��� �������� �̸��� �Է��ϼ���\n");
		
		sc.nextLine();
		
		for(int i = 0; i<apt.length;i++)
		{
			System.out.printf("\n===%d�� ������ ���� �Է� ===\n", i+1);
			for(int j = 0; j<apt[i].length;j++)
			{
				System.out.printf("%d�� %dȣ ������ : ", i+1, j+1);
				apt[i][j] = sc.nextLine();
			}
		}
		
		System.out.println("\n------ �� �� ������ ���� ��� ------");
		for(int i = 0; i<apt.length;i++)
		{
			System.out.printf("%d�� : ",i+1);
			for( int j =0; j<apt[i].length;j++)
			{
				System.out.printf("%s  ",apt[i][j]);
			}
			System.out.println();
		}
	}

	
}