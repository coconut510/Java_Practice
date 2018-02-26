package kh.java.method;

import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class ApiMethod {
	public void stringBf()
	{
		
		StringBuffer str = new StringBuffer("Hello World");
		System.out.println("���� String Buffer�� ���� ; " + str.capacity());
		System.out.println("����� ���ڿ� ���� : " + str.length());
		str.reverse();
		System.out.println(str);
		str.reverse();
		System.out.println(str);
		
		str.insert(5," Java");
		System.out.println(str);
		
		str.delete(4, 5);		
		System.out.println(str);
		
		str.replace(10, 15, "Coffee");
		System.out.println(str);	
	}
	
	public void stringTk()
	{
		String str = "ȫ�浿/20/��⵵ ��õ";
		StringTokenizer sT = new StringTokenizer(str,"/");
		
		System.out.println("��ū�� ���� : " + sT.countTokens());
		System.out.println("ù��° ��ū : " + sT.nextToken());
		System.out.println("��ū ���� ���� : " + sT.hasMoreTokens());
		System.out.println();
		
		System.out.println("��ū�� ���� : " + sT.countTokens());
		System.out.println("ù��° ��ū : " + sT.nextToken());
		System.out.println("��ū ���� ���� : " + sT.hasMoreTokens());
		System.out.println();
		
		System.out.println("��ū�� ���� : " + sT.countTokens());
		System.out.println("ù��° ��ū : " + sT.nextToken());
		System.out.println("��ū ���� ���� : " + sT.hasMoreTokens());
	}

	
	public void getStrTokenEx()
	{
		String str = "J a v a P r o g r a m ";
		StringTokenizer sT = new StringTokenizer(str," ");
		StringBuilder sb = new StringBuilder();
		char [] cArr = new char[sT.countTokens()];
		for(int i = 0;i< cArr.length;i++)
		{			
			//	cArr[i] = sT.nextToken().toUpperCase().charAt(0);	
			cArr[i] = sT.nextToken().charAt(0);		
			sb.append(cArr[i]>='a'? (cArr[i] ^= 32): cArr[i]);
		}	
		System.out.println(sb);
	}
	
	public void mathAPI()
	{
		System.out.println(Math.abs(-10)); // ���밪
		System.out.println(Math.ceil(10.1)); // �ø�
		System.out.println(Math.floor(10.9)); // ����
		System.out.println(Math.random());// 0~0.99		
		System.out.println(Math.max(1, 20));
	}
	
	public void calTest()
	{
		Calendar c = Calendar.getInstance();
	
		Date date = new Date(c.getTimeInMillis());		
		int year =  c.get(Calendar.YEAR);
		int	month = c.get(Calendar.MONTH);
		int day =  c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute =  c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		char week  = weekReturn(c.get(Calendar.DAY_OF_WEEK));
		
		System.out.printf("%d�� %d�� %d�� %c����", year,month,day,week);
	}
	public char weekReturn(int week)
	{
		switch(week)
		{
			case 1: return '��';		
			case 2: return '��';
			case 3: return 'ȭ';
			case 4: return '��';
			case 5: return '��';
			case 6: return '��';
			case 7: return '��';
		
		}
		return 'a';
	}
}
