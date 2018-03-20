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
			System.out.println("1. �л����� �Է� ");
			System.out.println("2. �л����� ��� ");
			System.out.println("3. ���� ");
			System.out.println("4. �ҷ����� ");
			System.out.println("0. ���� ");
			System.out.print("����");
			switch(sc.nextInt())
			{
				case 1:input(); break;
				case 2:output(); break;
				case 3:save(); break;
				case 4:load(); break;
				case 0: System.out.println("���α׷��� �����մϴ�."); return;
			}		
		}
	}
	
	public void input()
	{
		Student s = new Student();
		System.out.println("=====�л� ���� �Է�=====");
		System.out.print("�л� �̸� �Է� : ");
		s.setName(sc.next());
		
		System.out.print("�л� ���� �Է� : ");
		s.setAge(sc.nextInt());
		
		sc.nextLine();
		System.out.print("�л� �ּ� �Է� : ");
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
			System.out.println("����Ϸ�.");
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
				System.out.println("�ε� �Ϸ�");
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
