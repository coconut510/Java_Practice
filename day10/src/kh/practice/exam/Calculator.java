package kh.practice.exam;

public class Calculator {
	public void start()
	{
		int a= 10;
		int b = 3;
		System.out.println(	addMethod(a,b));
		System.out.println(	subMethod(a,b));
		System.out.println(	mulMethod(a,b));
		System.out.println(	divMethod(a,b));
	}
	public int addMethod(int a, int b)
	{
		return a+b;
	}
	public int subMethod(int a, int b)
	{
		return a-b;
	}
	public int mulMethod(int a, int b)
	{
		return a*b;
	}

	public double divMethod(int a, int b)
	{
		return (double)a/b;
	}

}
