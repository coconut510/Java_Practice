package kh.java.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ObjectSerial {
	ArrayList<Student> sList = new ArrayList<Student>();
	private Scanner sc = new Scanner(System.in);
	public void start()
	{
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
		
		sList.add(s);
	}
	public void output()
	{
		for(int i = 0; i<sList.size();i++) 
		{
			System.out.println(sList.get(i));
			System.out.println("----------");
		}
	}
	public void save()
	{
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt")))
		{
			oos.writeObject(sList);
			System.out.println("����Ϸ�.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void load()
	{
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt")))
		{
			sList = (ArrayList) ois.readObject();
			System.out.println("�ε� �Ϸ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
