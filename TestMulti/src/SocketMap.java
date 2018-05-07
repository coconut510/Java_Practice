import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class SocketMap extends Thread{
	static public HashMap<String, Socket> socketList = new HashMap<String, Socket>();
	private DataInputStream dis = null;
	private DataOutputStream dos = null;
	private Scanner sc = new Scanner(System.in);
	
	public SocketMap() {}
	static private int number = 1;
	public void socketAdd(Socket s)
	{
		String id = "id"+ number++;
		System.out.println(id+" �߰��� ���̵�");
		socketList.put(id, s);
	}
	@Override
	public void run()
	{
		entireNotice();
	}
	public void entireNotice()
	{
		try {			
			System.out.print("[��   (����)] : ");
			String sendMsg = sc.nextLine();
			
			
			Iterator iter = socketList.keySet().iterator();
			while(iter.hasNext())
			{
				String id = iter.next().toString();
				dis = new DataInputStream(socketList.get(id).getInputStream());
				dos = new DataOutputStream(socketList.get(id).getOutputStream());
				if(sendMsg.equals("exit"))
				{
					System.out.println("�������� �����߽��ϴ�.");	
					dos.writeUTF(sendMsg);
				}
				else dos.writeUTF(sendMsg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
