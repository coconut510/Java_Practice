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
				System.out.println("[상대(클라)] : " + recieveMsg );
				if(recieveMsg.equals("exit"))
				{
					System.out.println("클라이언트에서 종료했습니다.");
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
	
		System.out.println("채팅프로그램 [서버]가 입장했습니다.");
		try {
			System.out.println("KH 채팅 프로그램을 초기화하는데 성공했습니다.");
			serverSocket = new ServerSocket(1000);
			clientSocket = serverSocket.accept();
			
			
			dis = new DataInputStream(clientSocket.getInputStream());
			dos = new DataOutputStream(clientSocket.getOutputStream());							
			
			
			this.start();
			
			while(true) 
			{
				System.out.print("[나   (서버)] : ");
				String sendMsg = sc.nextLine();
				
				if(sendMsg.equals("exit"))
				{
					System.out.println("서버에서 종료했습니다.");	
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