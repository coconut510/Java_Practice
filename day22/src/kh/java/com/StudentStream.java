package kh.java.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentStream {
	private Scanner sc  = new Scanner(System.in);
	private Student s = new Student();
	private BufferedReader bfr = null;
	private BufferedWriter bfw = null;
	private StringBuilder sw = new StringBuilder();
	
	private String path = System.getProperty("user.home") + "/Desktop/";
	String[] line = new String[3];
	public void start()
	{
		while(true)
		{
			System.out.println("1. 정보입력");
			System.out.println("2. 정보출력");
			System.out.println("3. 정보저장(save)");
			System.out.println("4. 정보 불러오기(load)");
			System.out.println("0. 종료");
			System.out.print("선택");
			switch(sc.nextInt())
			{
				case 1: insert(); break;
				case 2: print(); break;
				case 3: save(); break;
				case 4: load(); break;
				case 0: System.out.println("프로그램을 종료합니다."); return;
			}
		}
	}
	public void insert()
	{		
		System.out.print("학생 이름 입력 : ");
		s.setName(sc.next());
		
		System.out.print("학생 나이 입력 : ");
		s.setAge(sc.nextInt());
		
		sc.nextLine();
		System.out.print("학생 주소 입력 : ");
		s.setAddr(sc.nextLine());
		
		System.out.println("정보 입력이 완료되었습니다.");
	}
	public void print()
	{
		if(s.getAge()==0)
		{
			System.out.println("현재 정보가 없습니다.");
		}
		else
		{
			System.out.println("이름 : " + s.getName());
			System.out.println("나이 : " + s.getAge());
			System.out.println("주소 : " + s.getAddr());
			System.out.println();
		}
	}
	public void save()
	{
		try {
			bfw = new BufferedWriter(new FileWriter(path+"student.txt"));
			bfw.write(s.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				bfw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void load()
	{
		String total ="";
		try {
			bfr = new BufferedReader(new FileReader(path+"student.txt"));
			total = bfr.readLine();			
		} catch (FileNotFoundException e1) {	
			System.out.println("불러올 정보가 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} 		
		finally
		{
			try {
				bfr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if(total.length()>0) 
		{
			StringBuilder sb = new StringBuilder(total);
			line = sb.toString().split("/");
			s.setName(line[0]);
			s.setAge(Integer.parseInt(line[1]));
			s.setAddr(line[2]);	
			
			System.out.println("로드되었습니다. 정보출력을 확인해보세요.");
		}
	}
}
