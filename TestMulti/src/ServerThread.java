import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
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
	//��������� ����
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
//				System.out.print("[��   (����)] : ");
//				String sendMsg = sc.nextLine();
//				
//				if(sendMsg.equals("exit"))
//				{
//					System.out.println("�������� �����߽��ϴ�.");	
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
			System.out.println("**"+userIP+"�� ���� ����.");
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
				System.out.println(userIP+"���� ������ �����߽��ϴ�.");
				break;
			}
			System.out.println("���� " + userIP + "��: "+str);
			// ���� ����

			
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



