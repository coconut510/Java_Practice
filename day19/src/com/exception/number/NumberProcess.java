package com.exception.number;

public class NumberProcess {
	public boolean checkDouble(int a, int b)  throws NumberRnageException
	{
		if((0>a||a>100) || (0>b||b>100)) throw new NumberRnageException("1~100������ ���� �ƴմϴ�.");
		if(a%b==0)
		{
			System.out.printf("%d�� %d�� ����̴�.\n",a,b);
			return true;
		}
		else 
		{
			System.out.printf("%d�� %d�� ����� �ƴϴ�.\n",a,b);
			return false;
		}
	}
}