package kh.test;

public class CalculatorEx {
	public void cal(String[] arr)
	{
		System.out.println("====��Ģ���� ���α׷� v1.0====");
		int firNum = Integer.parseInt(arr[0]);
		int secNum = Integer.parseInt(arr[1]);
		
		System.out.printf("�� : %d\n", firNum + secNum);
		System.out.printf("�� : %d\n", firNum - secNum);
		System.out.printf("�� : %d\n", firNum * secNum);
		System.out.printf("������ : %.1f\n", (double)firNum / secNum);
	}
}
