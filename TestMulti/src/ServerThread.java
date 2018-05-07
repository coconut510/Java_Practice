import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 개별 클라이언트와 메세지를 주고 받는 스레드
 *   Socket: 멤버변수, 생성자를 통해서 TestServer에서 할당 받는다.
 * 1. extends Thread
 * 2. run()
 *   클라이언트의 메세지를 주고 받는 비즈니스(Socket)
 * @author 관리자
 *
 */
public class ServerThread extends Thread{
	//멤버변수로 선언
	private Socket socket;
	private BufferedReader br = null;
	private Scanner sc = new Scanner(System.in);
	private PrintWriter pw = null;
	private String userIP;
	
	private DataInputStream dis = null;
	private DataOutputStream dos = null;
	private SocketMap sm = new SocketMap();
	
	public ServerThread(Socket s){
		this.socket = s;
		sm.socketAdd(s);
		sm.start();
		try {
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
//			while(true) 
//			{
//				System.out.print("[나   (서버)] : ");
//				String sendMsg = sc.nextLine();
//				
//				if(sendMsg.equals("exit"))
//				{
//					System.out.println("서버에서 종료했습니다.");	
//					dos.writeUTF(sendMsg);
//					break;
//				}
//				else dos.writeUTF(sendMsg);					
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}	
		userIP = socket.getInetAddress().toString();
	}
	
	@Override
	public void run(){
		try{
			service();
			
		}catch(IOException e){
			System.out.println("**"+userIP+"님 접속 종료.");
		}finally{
			closeAll();
		}
	}

	private void service()throws IOException{
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		pw = new PrintWriter(socket.getOutputStream(), true);
		String str = null;
		while(true){
			str = br.readLine();
			if(str == null){
				System.out.println(userIP+"님이 연결을 종료했습니다.");
				break;
			}
			System.out.println("서버 " + userIP + "님: "+str);
			// 서버 공지

			
			pw.println(str);
		}
	}
	public void closeAll(){
		try {
			if (pw != null) pw.close();
			if (br != null)br.close();			
			if (socket != null) socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



