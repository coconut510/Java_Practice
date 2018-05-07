import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient extends Thread{
//	private HashMap<Socket>
	private Socket socket = null;	
	private DataInputStream dis = null;
	private DataOutputStream dos = null;
	
	public void clientAccess(){
		
		BufferedReader br = null;
		PrintWriter pw = null;
		BufferedReader br2 = null;
		InetAddress inetAddress  =null;
		while(socket==null) 
		{
			System.out.println("���� ���1");
		
			try{
				inetAddress = InetAddress.getLocalHost();
				System.out.println(inetAddress.getHostAddress());
				socket = new Socket(inetAddress.getHostAddress(),1000);
				dis =  new DataInputStream(socket.getInputStream());
				dos = new DataOutputStream(socket.getOutputStream());
				System.out.println("**���� ���� OK**");
				br = new BufferedReader(new InputStreamReader(System.in));
				pw = new PrintWriter(socket.getOutputStream(), true);
				br2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String str;
				
				this.start();
				while(true){
					System.out.print("������ ���� �޽���:");
					str = br.readLine();
					if(str.equalsIgnoreCase("exit"))
						break;
					pw.println(str);
	
				}
			} catch (UnknownHostException e) {
//				e.printStackTrace();
			} catch (IOException e) {
//				e.printStackTrace();
			}finally{
			
					try {
						if (br2 != null)br2.close();
						if (pw != null) pw.close();
						if (br != null)	br.close();
						if (socket != null)	socket.close();
					} catch (IOException e) {
//						e.printStackTrace();
					}
				
				System.out.println("**���� ����**"); 
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
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
				System.out.println("[���(����)] : " + message );
				if(message.equals("exit"))
				{
					System.out.println("�������� �����߽��ϴ�.");		
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



