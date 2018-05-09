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
 * ���� Ŭ���̾�Ʈ�� �޼����� �ְ� �޴� ������
 *   Socket: �������, �����ڸ� ���ؼ� TestServer���� �Ҵ� �޴´�.
 * 1. extends Thread
 * 2. run()
 *   Ŭ���̾�Ʈ�� �޼����� �ְ� �޴� ����Ͻ�(Socket)
 * @author ������
 *
 */
public class ServerThread extends Thread{
	static public HashMap<String, Socket> socketList = new HashMap<String, Socket>();
	//��������� ����
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
			System.out.println("**"+userIP+"�� ���� ����.");
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
				System.out.println(userIP+"���� ������ �����߽��ϴ�.");
				break;
			}
			System.out.println();
			System.out.println("���� " + socket.getLocalSocketAddress() + "��: "+str);
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



