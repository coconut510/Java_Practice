package kh.java.client.socket;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientChat {
	public ClientChat()
	{
		Scanner sc = new Scanner(System.in);
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Socket socket = null;
		System.out.println("클라이언트화면입니다.");
		try {
			// 1. 서버와의 연결 소켓.
			socket = new Socket("127.0.0.1",1111);
			
			// 2. 입출력 스트림 생성.
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			while(true) 
			{
				String receive = dis.readUTF();
				if(receive.equals("exit"))
				{
					System.out.println("서버가 종료했습니다.");
					dis.close();
					break;
				}
				
				System.out.println("[서버]상대 -> " + receive);
				System.out.print("[클라]나    -> ");
				String send = sc.nextLine();
				
				dos.writeUTF(send);
				if(send.equals("exit"))
				{
					System.out.println("클라이언트가 종료했습니다.");
					dos.close();
					break;
				}
				
			}
		}
		catch(UnknownHostException e)
		{
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}		
		finally
		{
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

/*클라이언트 소켓
 * 
 * 
 * 1. 서버와의 연결 소켓
 * new Socket(서버 IP, 포트번호);
 * 2. 입/출력 스트림 생성.
 * new InputStream(서버와의 소켓)
 * new OutputStream(서버와의 소켓)
 * 
 * 3. 데이터 입출력
 * 입력 : 입력스트림.readUTF();
 *	출력 : 출력스트림.writeUTF();
 *
 *4. 통신 연결 종료 및 스트림 해제
 *입력 스트림.close();
 *출력 스트림.close();
 *서버 연결소켓.close();
 */