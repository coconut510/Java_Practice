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


//----- 준 상 성 민 ----- //
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
	public JoinGameMgr() // 기본생성자
	{

	}
	public void joinGame() {
		try { 
			String serverIp = "127.0.0.1"; 
			socket = new Socket(serverIp, 7777); // 소켓을 생성하여 연결을 요청한다.
			System.out.println("서버에 연결되었습니다.");

			DataInputStream dis = new DataInputStream(socket.getInputStream());
			count = dis.readInt();
			
//			ClientGameView.setCount(count);
			
			sleep(100);
			System.out.println("카운트"+count);
			// 메시지 전송용 Thread 생성 
			sender = new ClientSender(socket);
			
			// 메시지 수신용 Thread 생성 
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

				// 시작하자 마자, 자신의 대화명을 서버로 전송 

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
					// 키보드로 입력받은 데이터를 서버로 전송
					out.writeUTF("[" +  "] " + message);
				} catch (IOException e) { 
					System.out.println("여길타니?");
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
	// 메시지 수신용 Thread 
	static class ClientReceiver implements Runnable {
		Socket socket; 
		DataInputStream in; 

		// 생성자 
		ClientReceiver(Socket socket) { 
			this.socket = socket; 

			try { 
				// 서버로 부터 데이터를 받을 수 있도록 DataInputStream 생성
				this.in = new DataInputStream(socket.getInputStream());
			} catch (IOException e) { 
			} 
		} 

		public void run() {
			while (in != null) { 
				try { 
					// 서버로 부터 전송되는 데이터를 출력 
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