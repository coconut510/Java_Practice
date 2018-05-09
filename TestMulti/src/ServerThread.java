import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
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
	static public HashMap<String, Socket> socketList = new HashMap<String, Socket>();
	//멤버변수로 선언
	private Socket socket;
	private BufferedReader br = null;
	private PrintWriter pw = null;
	private Scanner sc = new Scanner(System.in);
	private String userIP;

	private DataInputStream dis = null;
	private DataOutputStream dos = null;
	private SocketMap sm = new SocketMap();

	public ServerThread(Socket s){
		this.socket = s;
		sm.socketAdd(s);
		sm.start();
//		userIP = socket.getInetAddress().toString();
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
		String str = null;
		while(true){
			dis = new DataInputStream(socket.getInputStream());
			str = dis.readUTF();
			if(str == null){
				System.out.println(userIP+"님이 연결을 종료했습니다.");
				break;
			}
			System.out.println();
			System.out.println("서버 " + socket.getLocalSocketAddress() + "님: "+str);
		}
	}
	public void closeAll(){
		try {
			if (dis != null) dis.close();
			if (dos != null)dos.close();			
			if (socket != null) socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



