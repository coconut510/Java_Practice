package kh.java.method;

import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class ApiMethod {
	public void stringBf()
	{
		
		StringBuffer str = new StringBuffer("Hello World");
		System.out.println("실제 String Buffer의 길이 ; " + str.capacity());
		System.out.println("저장된 문자열 길이 : " + str.length());
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
		String str = "홍길동/20/경기도 부천";
		StringTokenizer sT = new StringTokenizer(str,"/");
		
		System.out.println("토큰의 개수 : " + sT.countTokens());
		System.out.println("첫번째 토큰 : " + sT.nextToken());
		System.out.println("토큰 존재 여부 : " + sT.hasMoreTokens());
		System.out.println();
		
		System.out.println("토큰의 개수 : " + sT.countTokens());
		System.out.println("첫번째 토큰 : " + sT.nextToken());
		System.out.println("토큰 존재 여부 : " + sT.hasMoreTokens());
		System.out.println();
		
		System.out.println("토큰의 개수 : " + sT.countTokens());
		System.out.println("첫번째 토큰 : " + sT.nextToken());
		System.out.println("토큰 존재 여부 : " + sT.hasMoreTokens());
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
		System.out.println(Math.abs(-10)); // 절대값
		System.out.println(Math.ceil(10.1)); // 올림
		System.out.println(Math.floor(10.9)); // 버림
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
		
		System.out.printf("%d년 %d월 %d일 %c요일", year,month,day,week);
	}
	public char weekReturn(int week)
	{
		switch(week)
		{
			case 1: return '일';		
			case 2: return '월';
			case 3: return '화';
			case 4: return '수';
			case 5: return '목';
			case 6: return '금';
			case 7: return '토';
		
		}
		return 'a';
	}
}
