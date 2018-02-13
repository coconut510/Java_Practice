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
		System.out.println("---- A 아파트 정보 입력 ----");
		String[][] apt;

		System.out.print("건물 총 층수 입력 : ");
		apartTall = sc.nextInt();
		
		apt = new String[apartTall][];

		for(int i = 0; i<apt.length;i++)
		{
			System.out.printf("%d층의 총 호실 입력 : ",i+1);		
			apt[i] = new String[sc.nextInt()];
		}
		
		for(int i  = 0; i<apt.length;i++)
		{
			System.out.printf("%d층은 %d호실까지 생성 되었습니다.\n", i+1, apt[i].length);
		}
		System.out.println("\n각 호실마다 입주자의 이름을 입력하세요\n");
		
		sc.nextLine();
		
		for(int i = 0; i<apt.length;i++)
		{
			System.out.printf("\n===%d층 입주자 정보 입력 ===\n", i+1);
			for(int j = 0; j<apt[i].length;j++)
			{
				System.out.printf("%d층 %d호 입주자 : ", i+1, j+1);
				apt[i][j] = sc.nextLine();
			}
		}
		
		System.out.println("\n------ 각 층 입주자 정보 출력 ------");
		for(int i = 0; i<apt.length;i++)
		{
			System.out.printf("%d층 : ",i+1);
			for( int j =0; j<apt[i].length;j++)
			{
				System.out.printf("%s  ",apt[i][j]);
			}
			System.out.println();
		}
	}

	
}