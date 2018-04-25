package kh.classmn.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import kh.classmn.vo.student.Member;


//----- �� �� �� �� ----- //
public class JoinGameMgr extends Thread
{
	// =============================== 
	JoinGameMgr jgm = null;
	String getMessage; 
	static ClientSender sender; 
	Member m = new Member();
	//	String ipAddr;
	//	int port;
	String name;
	static int userNumber1 =0;
	
	
	public static int getUserNumber1() {
		return userNumber1;
	}
	int userNumber2 =2;
	public static int count;
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		JoinGameMgr.count = count;
	}
	// =============================== 
	Socket socket = null;
	// ===============================
	public JoinGameMgr() // �⺻������
	{

	}
	public void joinGame() {
		try { 
			String serverIp = "127.0.0.1"; 
			socket = new Socket(serverIp, 7777); // ������ �����Ͽ� ������ ��û�Ѵ�.
			System.out.println("������ ����Ǿ����ϴ�.");

			DataInputStream dis = new DataInputStream(socket.getInputStream());
			count = dis.readInt();
			
//			ClientGameView.setCount(count);
			
			sleep(100);
			System.out.println("ī��Ʈ"+count);
			// �޽��� ���ۿ� Thread ���� 
			sender = new ClientSender(socket);
			
			// �޽��� ���ſ� Thread ���� 
			Thread receiver = new Thread(new ClientReceiver(socket));

			receiver.start(); 
		} catch (ConnectException ce) { 
			ce.printStackTrace(); 
		} catch (Exception e) { 
		} 
	}
	// =================================================
	static class ClientSender 
	{ 
		Socket socket; 
		DataOutputStream out; 

		ClientSender(Socket socket) { 
			this.socket = socket; 

			try { 
				this.out = new DataOutputStream(socket.getOutputStream());

				// �������� ����, �ڽ��� ��ȭ���� ������ ���� 

				if (out != null)
				{
//					out.writeUTF(Test1.getName1()); 
				} 

			} catch (Exception e) { 
			} 

		}    
		public void send(String message) {
			if (out != null) {
				try { 
					// Ű����� �Է¹��� �����͸� ������ ����
					out.writeUTF("[" +  "] " + message);
				} catch (IOException e) { 
					System.out.println("����Ÿ��?");
				} 
			} 
		} 
	}
	//	public void getInfo(String ipNumber, int portNumber) 
	//	{
	//		this.ipAddr = ipNumber;
	//		this.port = portNumber;
	//		joinGame();
	//	}
	// �޽��� ���ſ� Thread 
	static class ClientReceiver implements Runnable {
		Socket socket; 
		DataInputStream in; 

		// ������ 
		ClientReceiver(Socket socket) { 
			this.socket = socket; 

			try { 
				// ������ ���� �����͸� ���� �� �ֵ��� DataInputStream ����
				this.in = new DataInputStream(socket.getInputStream());
			} catch (IOException e) { 
			} 
		} 

		public void run() {
			while (in != null) { 
				try { 
					// ������ ���� ���۵Ǵ� �����͸� ��� 
					System.out.println(in.readUTF());
				} catch (IOException e) { 
				} 
			} 
		} 
	}
	public void getMessage(String message)
	{
		jgm = new JoinGameMgr();
		this.getMessage=message;
		jgm.sender.send(message);
	} 

}