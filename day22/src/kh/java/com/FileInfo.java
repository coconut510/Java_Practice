package kh.java.com;

import java.io.File;
import java.util.Scanner;

public class FileInfo {
	public void FileInfoShow()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��� ���ϸ� �Է� : ");
		String path = sc.next();
		File file = new File(path);
		if(file.exists())
		{
			System.out.println("���ϸ� : " + file.getName());
			System.out.println("������ ��� ��� : " + file.getPath());
			System.out.println("������ ���� ��� : " + file.getAbsolutePath());
			System.out.println("������ ũ��(Byte) : " + (file.length()) + "Byte");
			System.out.println("������ ũ��(MByte) : " + (file.length()/1024/1024) + "MByte");
		}
		else
		{
			System.out.println(path + " ������ �������� �ʽ��ϴ�.");	
		}

	}
}
