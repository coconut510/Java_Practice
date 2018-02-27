package kh.java.cal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class CalMethod {
	public void calM()
	{
		Calendar today = Calendar.getInstance();
		
//		today.set(Calendar.YEAR, 2015);
		System.out.println(today.get(Calendar.YEAR));// 년도
		System.out.println(today.get(Calendar.MONTH)+1);// 월(0부터 시작)
		System.out.println(today.get(Calendar.DATE));// 일
		System.out.println(today.get(Calendar.AM_PM));// 0== AM , 1==PM
		System.out.println(today.get(Calendar.HOUR));// 시간
		System.out.println(today.get(Calendar.MINUTE));// 분
		System.out.println(today.get(Calendar.SECOND));// 초
		System.out.println(today.get(Calendar.DAY_OF_WEEK)); // 요일(1:일요일~7: 토요일)
		
		System.out.println(today.getTimeInMillis());
	}
	public void calTest()
	{
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int day = today.get(Calendar.DAY_OF_MONTH);
		int hour = today.get(Calendar.HOUR);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		char date = dateGet(today.get(Calendar.DAY_OF_WEEK));
		System.out.printf("%d년 %d월 %d일 %c요일 %d시 %d분 %d초", year,month,day,date,hour,minute,second);
	}
	public char dateGet(int date)
	{
		switch(date)
		{
		case 1: return '일';
		case 2: return '월';
		case 3: return '화';
		case 4: return '수';
		case 5: return '목';
		case 6: return '금';
		default: return '토';
		}
	}
	public void dDay()
	{
		int dYear;
		int dMonth;
		int dDay;
	
		Random r = new Random();
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy년 MM월 dd일");
		Calendar c = Calendar.getInstance();
		Calendar cToday = c;// Calendar.getInstance();
		//new GregorianCalendar(dYear,dMonth - 1,dDay);	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("## 입력 및 출력 ##");
		System.out.print("D-Day[년도] 입력 : ");
		dYear = sc.nextInt();
		System.out.print("D-Day[월] 입력 : ");
		dMonth = sc.nextInt();
		System.out.print("D-Day[일] 입력 : ");
		dDay = sc.nextInt();
		
		c.set(dYear,dMonth-1,dDay);
		
		System.out.println("오늘 날짜 : " + ft.format(date));

		long distance = (cToday.getTimeInMillis() - c.getTimeInMillis()) / (60*60*24*1000) ;
		if(distance > 0 )
		{
			System.out.printf("%d일 지났습니다.", distance);		
		}
		else if(distance < 0 )
		{
			System.out.printf("%d일 남았습니다.", distance*-1 );
		}
		else
		{
			System.out.printf("D-Day 입니다." );
		}
		System.out.println();
	}
	public void simpleDate()
	{
		Date today = new Date();//Calendar.getInstance().getTime();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy년 MM월 dd일 aa HH시 mm분 ss초 hh");
		String strToday = ft.format(today);
		
		System.out.println(strToday);
	}
	
	public void gregorianCal()
	{
		Calendar today = Calendar.getInstance();
		Calendar c = new GregorianCalendar(2018,1,26);
		System.out.println(today.getTimeInMillis() - c.getTimeInMillis());
	}
}
