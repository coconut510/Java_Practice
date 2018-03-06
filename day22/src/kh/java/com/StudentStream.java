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
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ��������(save)");
			System.out.println("4. ���� �ҷ�����(load)");
			System.out.println("0. ����");
			System.out.print("����");
			switch(sc.nextInt())
			{
				case 1: insert(); break;
				case 2: print(); break;
				case 3: save(); break;
				case 4: load(); break;
				case 0: System.out.println("���α׷��� �����մϴ�."); return;
			}
		}
	}
	public void insert()
	{		
		System.out.print("�л� �̸� �Է� : ");
		s.setName(sc.next());
		
		System.out.print("�л� ���� �Է� : ");
		s.setAge(sc.nextInt());
		
		sc.nextLine();
		System.out.print("�л� �ּ� �Է� : ");
		s.setAddr(sc.nextLine());
		
		System.out.println("���� �Է��� �Ϸ�Ǿ����ϴ�.");
	}
	public void print()
	{
		if(s.getAge()==0)
		{
			System.out.println("���� ������ �����ϴ�.");
		}
		else
		{
			System.out.println("�̸� : " + s.getName());
			System.out.println("���� : " + s.getAge());
			System.out.println("�ּ� : " + s.getAddr());
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
			System.out.println("�ҷ��� ������ �����ϴ�.");
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
			
			System.out.println("�ε�Ǿ����ϴ�. ��������� Ȯ���غ�����.");
		}
	}
}
