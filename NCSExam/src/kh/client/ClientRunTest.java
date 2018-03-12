package kh.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientRunTest extends Thread {
	private Socket socket = null;
	private DataInputStream dis = null;
	private DataOutputStream dos = null;
	private Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		
		while(true)
		{
			try {
				String message = dis.readUTF();
				if(message.equals("exit"))
				{			
					closeAll();
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public ClientRunTest()
	{		
		try {
			socket = new Socket("127.0.0.1", 10000);
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			this.start();
			while(true)
			{				
				String message = sc.nextLine();
				dos.writeUTF(message);
				if(message.equals("exit"))
				{
					closeAll();
					break;
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void closeAll()
	{
		try {
			dis.close();
			dos.close();
			socket.close();
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
