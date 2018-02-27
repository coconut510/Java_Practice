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
		System.out.println(today.get(Calendar.YEAR));// �⵵
		System.out.println(today.get(Calendar.MONTH)+1);// ��(0���� ����)
		System.out.println(today.get(Calendar.DATE));// ��
		System.out.println(today.get(Calendar.AM_PM));// 0== AM , 1==PM
		System.out.println(today.get(Calendar.HOUR));// �ð�
		System.out.println(today.get(Calendar.MINUTE));// ��
		System.out.println(today.get(Calendar.SECOND));// ��
		System.out.println(today.get(Calendar.DAY_OF_WEEK)); // ����(1:�Ͽ���~7: �����)
		
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
		System.out.printf("%d�� %d�� %d�� %c���� %d�� %d�� %d��", year,month,day,date,hour,minute,second);
	}
	public char dateGet(int date)
	{
		switch(date)
		{
		case 1: return '��';
		case 2: return '��';
		case 3: return 'ȭ';
		case 4: return '��';
		case 5: return '��';
		case 6: return '��';
		default: return '��';
		}
	}
	public void dDay()
	{
		int dYear;
		int dMonth;
		int dDay;
	
		Random r = new Random();
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy�� MM�� dd��");
		Calendar c = Calendar.getInstance();
		Calendar cToday = c;// Calendar.getInstance();
		//new GregorianCalendar(dYear,dMonth - 1,dDay);	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("## �Է� �� ��� ##");
		System.out.print("D-Day[�⵵] �Է� : ");
		dYear = sc.nextInt();
		System.out.print("D-Day[��] �Է� : ");
		dMonth = sc.nextInt();
		System.out.print("D-Day[��] �Է� : ");
		dDay = sc.nextInt();
		
		c.set(dYear,dMonth-1,dDay);
		
		System.out.println("���� ��¥ : " + ft.format(date));

		long distance = (cToday.getTimeInMillis() - c.getTimeInMillis()) / (60*60*24*1000) ;
		if(distance > 0 )
		{
			System.out.printf("%d�� �������ϴ�.", distance);		
		}
		else if(distance < 0 )
		{
			System.out.printf("%d�� ���ҽ��ϴ�.", distance*-1 );
		}
		else
		{
			System.out.printf("D-Day �Դϴ�." );
		}
		System.out.println();
	}
	public void simpleDate()
	{
		Date today = new Date();//Calendar.getInstance().getTime();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy�� MM�� dd�� aa HH�� mm�� ss�� hh");
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
