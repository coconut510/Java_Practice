package kh.java.server.socket;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ServerChat {
	public ServerChat()
	{
		Scanner sc = new Scanner(System.in);
		ServerSocket serverSocket =  null;
		Socket clientSocket = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		System.out.println("����ȭ���Դϴ�.");
		try {
			System.out.println("�ȳ�");
			//1. ���� ���� ����
			serverSocket = new ServerSocket(1111);
			//2. Ŭ���̾�Ʈ �� ���� ����.
			clientSocket = serverSocket.accept();
			
			System.out.println("Ŭ���̾�Ʈ�� ä�� ������ �����߽��ϴ�.");
			
			//3. ��/��� ��Ʈ�� ����
			dis = new DataInputStream(clientSocket.getInputStream());
			dos = new DataOutputStream(clientSocket.getOutputStream());
			
			//4. ������ �����.
			dos.writeUTF("ä�� ������ �����߽��ϴ�.");
			
			while(true)
			{                
				String receive = dis.readUTF();
				if(receive.equals("exit"))
				{
					System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�.");
					dis.close();
					break;
				}
				System.out.println("[Ŭ��]��� -> " + receive);
				System.out.print("[����]��    -> ");
				String send = sc.nextLine();
				dos.writeUTF(send);
				if(send.equals("exit"))
				{
					System.out.println("������ �����߽��ϴ�.");
					dos.close();
					break;
				}
				
			}
		
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		finally
		{
			try {
				clientSocket.close();
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

//		ServerSocket ssk = null;
//		Socket csk = null;
//		final int PORT = 5606;
//		Date serverStartDate = new Date();
//		SimpleDateFormat dateFormat = new SimpleDateFormat("[HH:mm:ss]");
//		String startTime = dateFormat.format(serverStartDate);
		
		
	}
}