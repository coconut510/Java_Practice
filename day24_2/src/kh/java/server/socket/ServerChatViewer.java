package kh.java.server.socket;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import kh.java.client.model.vo.ClientInfo;

public class ServerChatViewer extends Thread {
	DataInputStream dis = null;
	
	DataOutputStream dos = null;		
	
	private int startPortNum = 50000;
	private ArrayList<ServerSocket> serverList = new ArrayList<ServerSocket>();
	private ArrayList<Socket> clientSocketList = new ArrayList<Socket>();
	private ArrayList<Integer> portList = new ArrayList<Integer>();
	
	private ArrayList<ClientInfo> clientInfoList = new ArrayList<ClientInfo>();
	
	private ServerSocket  serverSocket;
	private Socket clientSocket;
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
			System.out.println("IP 와 PORT 부여에 성공하였습니다.");
			portList.add( new Random().nextInt(200) + 1000);
			serverList.add( new ServerSocket(portList.get(0)) );
			clientSocketList.add(serverList.get(0).accept());			
			
			dis = new DataInputStream(clientSocketList.get(0).getInputStream());
			dos = new DataOutputStream(clientSocketList.get(0).getOutputStream());										
			this.start();		
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