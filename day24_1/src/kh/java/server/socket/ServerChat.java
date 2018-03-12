package kh.java.server.socket;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;

import kh.java.client.model.vo.ClientInfo;

public class ServerChat extends Thread {
	DataInputStream dis = null;
	
	DataOutputStream dos = null;		
	Socket clientSocket = null;
	ServerSocket serverSocket =  null;
	
	@Override
	public void run()
	{		
		String recieveMsg;
		try {
			while(true)
			{
				recieveMsg = dis.readUTF();
				System.out.println("[���(Ŭ��)] : " + recieveMsg );
				if(recieveMsg.equals("exit"))
				{
					System.out.println("Ŭ���̾�Ʈ���� �����߽��ϴ�.");
					closeAll();
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public ServerChat()
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("ä�����α׷� [����]�� �����߽��ϴ�.");
		try {
			System.out.println("KH ä�� ���α׷��� �ʱ�ȭ�ϴµ� �����߽��ϴ�.");
			serverSocket = new ServerSocket(1000);
			clientSocket = serverSocket.accept();
			
			
			dis = new DataInputStream(clientSocket.getInputStream());
			dos = new DataOutputStream(clientSocket.getOutputStream());							
			
			
			this.start();
			
			while(true) 
			{
				System.out.print("[��   (����)] : ");
				String sendMsg = sc.nextLine();
				
				if(sendMsg.equals("exit"))
				{
					System.out.println("�������� �����߽��ϴ�.");	
					dos.writeUTF(sendMsg);
					break;
				}
				else dos.writeUTF(sendMsg);					
			}				
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
			dis.close();
			dos.close();
			clientSocket.close();
			serverSocket.close();	
			System.exit(0);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}