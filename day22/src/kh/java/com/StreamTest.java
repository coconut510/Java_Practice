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
		System.out.println("1. 학생정보 입력 ");
		System.out.println("2. 학생정보 출력 ");
		System.out.println("3. 저장 ");
		System.out.println("4. 불러오기 ");
		System.out.print("선택");
		switch(sc.nextInt())
		{
			case 1: break;
		}
		
	}
	public void filePathInsert()
	{
		System.out.print("검색할 경로 입력 : ");
		File dir = new File(sc.next());
		File[] files = dir.listFiles();
		for(File i : files)
		{
			System.out.println(i);
		}
//		System.out.println(file.exists());// exists 메소드는 파일이 존재하면 true, 없으면 false를 리턴.
//		System.out.println(file.getName());
	}
	
	public void filePath()
	{

		File file = new File("quiz.txt");
		if(file.exists())
		{
			System.out.println("파일명 : " + file.getName());
			System.out.println("파일의 상대 경로 : " + file.getPath());
			System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());
			System.out.println("파일의 크기 : " + ((double)file.length()/1024/1024) + "MByte");
		}
		else
		{
			System.out.println("파일이 존재하지 않습니다.");	
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
		DataOutputStream dOut = null;// 보조스트림
		BufferedWriter bfw = null;
		
		FileWriter fw = null;
		System.out.print("저장할 파일 명:");
		String fileName = sc.next();
		sc.nextLine();
		String str ="";
	
		System.out.println("'" + fileName+"'" + "파일에 저장될 내용 입력 ");
		
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
						System.out.println("종료합니다.");
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