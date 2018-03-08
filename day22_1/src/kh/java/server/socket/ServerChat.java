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
		System.out.println("서버화면입니다.");
		try {
			System.out.println("안녕");
			//1. 서버 소켓 생성
			serverSocket = new ServerSocket(1111);
			//2. 클라이언트 별 연결 소켓.
			clientSocket = serverSocket.accept();
			
			System.out.println("클라이언트가 채팅 서버에 접속했습니다.");
			
			//3. 입/출력 스트림 생성
			dis = new DataInputStream(clientSocket.getInputStream());
			dos = new DataOutputStream(clientSocket.getOutputStream());
			
			//4. 데이터 입출력.
			dos.writeUTF("채팅 서버에 입장했습니다.");
			
			while(true)
			{                
				String receive = dis.readUTF();
				if(receive.equals("exit"))
				{
					System.out.println("클라이언트가 종료했습니다.");
					dis.close();
					break;
				}
				System.out.println("[클라]상대 -> " + receive);
				System.out.print("[서버]나    -> ");
				String send = sc.nextLine();
				dos.writeUTF(send);
				if(send.equals("exit"))
				{
					System.out.println("서버가 종료했습니다.");
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