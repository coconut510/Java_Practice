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
			sList = (ArrayList) ois.readObject();
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
