package kh.java.com;

public class ExceptionTest {
	public void add()
	{
		
	}
	public void div(int a, int b) throws NoZeroException
	{
		if(a==0|| b==0) throw new NoZeroException("0���δ� ������ �����ϴ�.");
		System.out.println(a+b);
	}
}
