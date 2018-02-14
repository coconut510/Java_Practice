package kh.test;

public class CalculatorEx {
	public void cal(String[] arr)
	{
		System.out.println("====사칙연산 프로그램 v1.0====");
		int firNum = Integer.parseInt(arr[0]);
		int secNum = Integer.parseInt(arr[1]);
		
		System.out.printf("합 : %d\n", firNum + secNum);
		System.out.printf("차 : %d\n", firNum - secNum);
		System.out.printf("곱 : %d\n", firNum * secNum);
		System.out.printf("나누기 : %.1f\n", (double)firNum / secNum);
	}
}
