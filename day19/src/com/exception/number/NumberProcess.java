package com.exception.number;

public class NumberProcess {
	public boolean checkDouble(int a, int b)  throws NumberRnageException
	{
		if((0>a||a>100) || (0>b||b>100)) throw new NumberRnageException("1~100사이의 값이 아닙니다.");
		if(a%b==0)
		{
			System.out.printf("%d는 %d의 배수이다.\n",a,b);
			return true;
		}
		else 
		{
			System.out.printf("%d는 %d의 배수가 아니다.\n",a,b);
			return false;
		}
	}
}