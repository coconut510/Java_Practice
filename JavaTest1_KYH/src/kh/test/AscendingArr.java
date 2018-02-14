package kh.test;

import java.util.Scanner;

public class AscendingArr {
	public void ascArr()
	{		
		int [] array = new int[5];

		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<array.length;i++)
		{
			System.out.printf("%d번째 정수 입력 : ", i+1);
			array[i] = sc.nextInt();

			for(int j = 0; j<array.length;j++)
			{
				if(array[i] < array[j])
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int i = 0; i<array.length;i++)
		{
			System.out.print(array[i] + " ");
		}
	}
}
