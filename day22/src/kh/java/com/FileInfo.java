package kh.java.com;

import java.io.File;
import java.util.Scanner;

public class FileInfo {
	public void FileInfoShow()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 파일명 입력 : ");
		String path = sc.next();
		File file = new File(path);
		if(file.exists())
		{
			System.out.println("파일명 : " + file.getName());
			System.out.println("파일의 상대 경로 : " + file.getPath());
			System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());
			System.out.println("파일의 크기(Byte) : " + (file.length()) + "Byte");
			System.out.println("파일의 크기(MByte) : " + (file.length()/1024/1024) + "MByte");
		}
		else
		{
			System.out.println(path + " 파일이 존재하지 않습니다.");	
		}

	}
}
