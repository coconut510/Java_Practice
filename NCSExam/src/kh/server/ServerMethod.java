package kh.server;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ServerMethod extends Thread {
	DataInputStream dis = null;
	DataOutputStream dos = null;
	ServerSocket serverSocket = null;
	Socket clientSocket = null;
	SimpleDateFormat dt = new SimpleDateFormat("hh:mm:ss");
	Calendar c = Calendar.getInstance();
	@Override
	public void run() 
	{
		
	
			try {
				 serverSocket = new ServerSocket(10000);
				while(true)
				{	
				 clientSocket = serverSocket.accept();
				 dis = new DataInputStream(clientSocket.getInputStream());
				 dos = new DataOutputStream(clientSocket.getOutputStream());
				 String message = dis.readUTF();
				 if(message.equals("time"))
				 {
					 Date date = new Date(c.getTimeInMillis());			
					 message = "[현재시간]" + dt.format(date); 
					 dos.writeUTF(message);
				 }
				 System.out.println(message);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public ServerMethod() {
			 this.start();
	}
}
