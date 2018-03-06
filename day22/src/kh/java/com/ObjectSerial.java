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
		s = new Student("홍길동", 20,"경기도");
	}
	public void output()
	{
		System.out.println("이름 : " + s.getName());
		System.out.println("나이 : " + s.getAge());
		System.out.println("주소 : " + s.getAddr());
	}
	public void save()
	{
		try(ObjectOutputStream oos =	new ObjectOutputStream(new FileOutputStream("object.txt")))
		{
			oos.writeObject(s);
			System.out.println("저장완료.");
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
			System.out.println("로드 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
