import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TestClient extends Thread{
	private Socket socket = null;	
	private DataInputStream dis = null;
	private DataOutputStream dos = null;
	private Scanner sc = new Scanner(System.in);
	
	public void clientAccess(){
		InetAddress inetAddress  =null;
		while(socket==null) 
		{
			System.out.println("연결 대기1");
		
			try{
				inetAddress = InetAddress.getLocalHost();
				System.out.println(inetAddress.getHostAddress());
				socket = new Socket(inetAddress.getHostAddress(),1000);
				dis =  new DataInputStream(socket.getInputStream());
				dos = new DataOutputStream(socket.getOutputStream());
				System.out.println("**서버 연결 OK**");
				String str;
				
				this.start();
				while(true){
					System.out.print("서버에 보낼 메시지: ");
					str = sc.nextLine();
					dos.writeUTF(str);
					if(str.equalsIgnoreCase("exit"))
						break;
//					pw.println(str);
	
				}
			} catch (UnknownHostException e) {
			} catch (IOException e) {
			}finally{
			
					try {
//						if (br2 != null)br2.close();
//						if (pw != null) pw.close();
//						if (br != null)	br.close();
						if (socket != null)	socket.close();
					} catch (IOException e) {
//						e.printStackTrace();
					}				
				System.out.println("**연결 종료**"); 
			}
		}
	}
	
	@Override
	public void run()
	{		
		String message;
		try {
			while(true)
			{
				message = dis.readUTF();
				System.out.println();
				System.out.println("[상대(서버)] : " + message );
				if(message.equals("exit"))
				{
					System.out.println("서버에서 종료했습니다.");		
					closeAll();
				}	
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public void closeAll()
	{
		try {
			if(dis!=null) dis.close();
			if(dos!=null)dos.close();
			if(socket!=null)socket.close();
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		TestClient tc = new TestClient();
		tc.clientAccess();
	}

}



