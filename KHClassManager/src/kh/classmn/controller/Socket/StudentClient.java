package kh.classmn.controller.Socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class StudentClient extends Thread {
	DataInputStream dis = null;
	Socket socket = null;	
	DataOutputStream dos = null;
	public static int num = 0;
	@Override
	public void run()
	{		
		String message;
		try {
			while(true)
			{
				message = dis.readUTF();
				System.out.println("[���(����)] : " + message );
				if(message.equals("exit"))
				{
					System.out.println("�������� �����߽��ϴ�.");		
					closeAll();
				}	
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public StudentClient()
	{
		System.out.println(num++);
		Scanner sc = new Scanner(System.in);	
	
		System.out.println("ä�����α׷� [Ŭ��]�� �����߽��ϴ�.");
		try {
			socket = new Socket("127.0.0.1",1000);
			dis =  new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			
			this.start();
			while(true)
			{
				String message = sc.nextLine();
				if(message.equals("exit"))
				{
					System.out.println("ä���� �����մϴ�.");
					dos.writeUTF(message);
					break;
				}
				else dos.writeUTF(message);
			}			
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally
		{
			closeAll();				
		}
	}
	
	public void closeAll()
	{
		try {
			if(dis!=null) dis.close();
			if(dos!=null)dos.close();
			if(socket!=null)socket.close();
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
