package kh.java.com;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;



public class TestMain {
	public static void main(String[] args) {
		LottoShow ls =new LottoShow();
			ls.start();
//		HashSet<Integer> hs = new HashSet<Integer>();
//		hs.add(100);
//		hs.add(200);
//		hs.add(200);
//		hs.add(300);
//		System.out.println(hs);
//
//		Iterator<Integer> data = hs.iterator();
//		
//		ArrayList<Integer> al = new ArrayList<Integer>(hs);
//		
//		System.out.println(data.hasNext());
//		
//		System.out.println(data.next());
//		System.out.println(data.next());
//		System.out.println(data.next());
	}
	
	
	/*
	private static Properties prop = new Properties();
	private static java.util.Scanner sc = new java.util.Scanner(System.in);
	public static void main(String[] args) {
		try {
			prop.load(new FileReader("resources/test.Properties"));
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(prop.getProperty("Serial").equals("demo"))
		{
			demoMenu();
		}
		else if(prop.getProperty("Serial").equals("mslove"))
		{
			menu();
		}
//		System.out.println(prop.getProperty("OS"));
//		System.out.println(prop.getProperty("User"));
//		System.out.println(prop.getProperty("Password"));
	}
	
	public static void menu()
	{
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 검색");
		System.out.println("3. 학생 정보 출력");
		System.out.println("4. 학생 정보 변경");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("0. 종료");
		switch(sc.nextInt())
		{
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 0: break;
		}
	}
	public static void demoMenu()
	{
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 검색");
		System.out.println("0. 종료");
		switch(sc.nextInt())
		{
			case 1: break;
			case 2: break;
			case 0: break;
		}
	}
	 */
}
