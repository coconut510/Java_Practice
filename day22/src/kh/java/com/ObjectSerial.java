package kh.java.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ObjectSerial {
	HashMap<String,Student> sList = new HashMap<String,Student>();
	private Scanner sc = new Scanner(System.in);
	public void start()
	{
		load();
		while(true) {
			System.out.println("\n----------");
			System.out.println("1. 학생정보 입력 ");
			System.out.println("2. 학생정보 출력 ");
			System.out.println("3. 저장 ");
			System.out.println("4. 불러오기 ");
			System.out.println("0. 종료 ");
			System.out.print("선택");
			switch(sc.nextInt())
			{
				case 1:input(); break;
				case 2:output(); break;
				case 3:save(); break;
				case 4:load(); break;
				case 0: System.out.println("프로그램을 종료합니다."); return;
			}		
		}
	}
	
	public void input()
	{
		Student s = new Student();
		System.out.println("=====학생 정보 입력=====");
		System.out.print("학생 이름 입력 : ");
		s.setName(sc.next());
		
		System.out.print("학생 나이 입력 : ");
		s.setAge(sc.nextInt());
		
		sc.nextLine();
		System.out.print("학생 주소 입력 : ");
		s.setAddr(sc.nextLine());
		
		sList.put(s.getName(),s);
	}
	
	public void output()
	{
//		for(int i = 0; i<sList.size();i++) 
//		{
			System.out.println(sList.get("aa").toString());
			System.out.println(sList.get("bb").toString());
			System.out.println(sList.containsKey("cc"));
			System.out.println(sList.containsKey("dd"));
			System.out.println(sList.containsKey("ee"));
			System.out.println("----------");
//		}
	}
	public void save()
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("object.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(sList);
			System.out.println("저장완료.");
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void load()
	{
		File file = new File("object.txt");
		if(file.exists()) 
		{
			try
			{
				FileInputStream fis = new FileInputStream("object.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				sList = (HashMap<String,Student>) ois.readObject();
				System.out.println("로드 완료");
				ois.close();
				fis.close();
			} catch (FileNotFoundException e) {
		
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
}
