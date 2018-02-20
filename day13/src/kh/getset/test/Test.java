package kh.getset.test;

public class Test {
	public void testMethod()
	{
		System.out.println("안녕하세요 테스트 메소드 입니다.");
	}
	
	public void testMethod(int a)
	{
		System.out.println("호출 값은 " + a + "입니다.");
	}
	public void testMethod(int a, int b)
	{
		System.out.printf("2개의 값은 %d과 %d이며 합한 값은 %d입니다.",a,b,a+b);
	}
}
