package kh.java.server.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import kh.java.server.model.vo.ClientInfo;

public class ServerNew extends Thread {

	private int portNum = 50000;
	private final String IP = "127.0.0.1";
	private final int DEFAULT_PORT = 1000;
	private ArrayList<ClientInfo> clientList = new ArrayList<ClientInfo>();
	private DataInputStream dis = null;
	private DataOutputStream dos = null;
	private Socket clientSocket = null;
	private ServerSocket serverSocket = null;
	
	public ServerNew()
	{
		System.out.println("KH ä�� ���α׷��� �ʱ�ȭ�ϴµ� �����߽��ϴ�.");
		System.out.println("IP �� PORT �ο��� �����Ͽ����ϴ�.");	
		System.out.println("Ŭ���̾�Ʈ�� ������ �����մϴ�.");	
		try {
			serverSocket = new ServerSocket(DEFAULT_PORT);
			clientSocket = serverSocket.accept();			

			dis = new DataInputStream(clientSocket.getInputStream());
			dos = new DataOutputStream(clientSocket.getOutputStream());				
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		CreateServer();
	}
	
	
	// Ŭ���̾�Ʈ ����� �������ֱ�.
	public void CreateServer()
	{				
		try {						
			ClientInfo ci = new ClientInfo();
			ci.setPortNum(portNum);
			ci.setServerSocket(new ServerSocket(portNum));
			ci.setClientSocket(ci.getServerSocket().accept());
			ci.setDis(new DataInputStream(ci.getClientSocket().getInputStream()));
			ci.setDos(new DataOutputStream(ci.getClientSocket().getOutputStream()));
			clientList.add(ci);
			portNum+=1;
			
			System.out.printf("IP : %s , PORT : %s �� ���� Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.",
					IP, ci.getPortNum() );			
			
			this.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	@Override
	public void run()
	{
		while(true) 
		{
			for(int i = 0; i<clientList.size();i++)
			{
				
			}
			
		}
	}
}
