package kh.java.server.socket;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

import kh.java.client.model.ClientMng;
import kh.java.client.model.vo.ClientInfo;

public class ServerChatViewer extends Thread {


	
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
	public ServerChatViewer()
	{
		this.start();		
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