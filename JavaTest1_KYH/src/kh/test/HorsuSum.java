package kh.test;

import java.util.Scanner;

public class HorsuSum {
	public void horSum()
	{
		int [] array = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i<array.length;i++)
		{
			System.out.printf("%d��° �� �Է� : ", i+1);
			array[i] = sc.nextInt();
			if(array[i]%2==1) sum += array[i];
		}
		System.out.printf("Ȧ������ �հ� : %d", sum);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
