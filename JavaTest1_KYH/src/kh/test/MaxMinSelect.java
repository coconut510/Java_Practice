package kh.test;

public class MaxMinSelect {
	public void minMax()
	{
		int [] array = {82, 10, 12, 61, 39, 22, 44, 55, 11}; 
		int min = array[0];
		int max = array[0];
		for(int i = 0; i<array.length;i++)
		{
			if(min>array[i]) min = array[i];
			if(max<array[i]) max = array[i];
		}
		System.out.printf("�ش� �迭���� �ִ밪��%d, �ּҰ��� %d", max, min);
	}
}
