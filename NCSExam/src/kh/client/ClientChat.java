package kh.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientChat extends Thread {
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
	public ClientChat()
	{		
		try {
			socket = new Socket("192.168.0.100", 20000);
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
