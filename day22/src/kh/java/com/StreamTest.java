package kh.java.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StreamTest {
	private Scanner sc = new Scanner(System.in);
	private Student s ;
	public StreamTest() 
	{	
		
	}	
	
	public void start()
	{
		System.out.println("1. �л����� �Է� ");
		System.out.println("2. �л����� ��� ");
		System.out.println("3. ���� ");
		System.out.println("4. �ҷ����� ");
		System.out.print("����");
		switch(sc.nextInt())
		{
			case 1: break;
		}
		
	}
	public void filePathInsert()
	{
		System.out.print("�˻��� ��� �Է� : ");
		File dir = new File(sc.next());
		File[] files = dir.listFiles();
		for(File i : files)
		{
			System.out.println(i);
		}
//		System.out.println(file.exists());// exists �޼ҵ�� ������ �����ϸ� true, ������ false�� ����.
//		System.out.println(file.getName());
	}
	
	public void filePath()
	{

		File file = new File("quiz.txt");
		if(file.exists())
		{
			System.out.println("���ϸ� : " + file.getName());
			System.out.println("������ ��� ��� : " + file.getPath());
			System.out.println("������ ���� ��� : " + file.getAbsolutePath());
			System.out.println("������ ũ�� : " + ((double)file.length()/1024/1024) + "MByte");
		}
		else
		{
			System.out.println("������ �������� �ʽ��ϴ�.");	
		}
	}
	
	public void inputString()
	{
		BufferedReader bfr;

		try {
			String line = null;
			bfr = new BufferedReader(new FileReader("text.txt"));
			
//			for(int lineNumber = 1;(line=bfr.readLine())!=null;lineNumber++)
//			{
//				System.out.println(lineNumber + " : " + line);
//			}
			
			while(true)
			{
				line = bfr.readLine();
				if(line == null)
				{  	
					bfr.close();
					break;
				}
				else System.out.println(line);
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void outpuStringTest()
	{
		FileOutputStream fOut = null;
		DataOutputStream dOut = null;// ������Ʈ��
		BufferedWriter bfw = null;
		
		FileWriter fw = null;
		System.out.print("������ ���� ��:");
		String fileName = sc.next();
		sc.nextLine();
		String str ="";
	
		System.out.println("'" + fileName+"'" + "���Ͽ� ����� ���� �Է� ");
		
			try {
				bfw = new BufferedWriter(new FileWriter("d:\\"+fileName));
//				fw = new FileWriter("d:\\"+fileName);
//				dOut = new DataOutputStream(new FileOutputStream("d:\\"+fileName));
				int lineNumber = 1;
				while(!str.equals("exit"))
				{
					System.out.print( (lineNumber++) + " : ");
					str = sc.nextLine();
					String sentence =(lineNumber-1)+" : " +str;
					if(str.equals("exit")) 
					{
						System.out.println("�����մϴ�.");
						bfw.close();
//						fw.close();
						break;
					}		
					bfw.write(sentence);
					bfw.newLine();
//					fw.write(sentence + System.lineSeparator());
				
//					dOut.writeBytes(sentence + System.getProperty("line.separator"));
//					dOut.writeChars(sentence.getBytes());						
				}
			}
		
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}	
			catch (IOException e) {
					e.printStackTrace();
			}
	}

}