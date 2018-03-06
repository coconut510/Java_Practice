package kh.java.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ObjectSerial {
	private Scanner sc = new Scanner(System.in);
	private Student s ;
	public void start()
	{
		while(true) {
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
		s = new Student("ȫ�浿", 20,"��⵵");
	}
	public void output()
	{
		System.out.println("�̸� : " + s.getName());
		System.out.println("���� : " + s.getAge());
		System.out.println("�ּ� : " + s.getAddr());
	}
	public void save()
	{
		try(ObjectOutputStream oos =	new ObjectOutputStream(new FileOutputStream("object.txt")))
		{
			oos.writeObject(s);
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
			s = (Student) ois.readObject();
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
