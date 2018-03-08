package kh.java.client.socket;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientChat {
	public ClientChat()
	{
		Scanner sc = new Scanner(System.in);
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Socket socket = null;
		System.out.println("Ŭ���̾�Ʈȭ���Դϴ�.");
		try {
			// 1. �������� ���� ����.
			socket = new Socket("127.0.0.1",1111);
			
			// 2. ����� ��Ʈ�� ����.
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			while(true) 
			{
				String receive = dis.readUTF();
				if(receive.equals("exit"))
				{
					System.out.println("������ �����߽��ϴ�.");
					dis.close();
					break;
				}
				
				System.out.println("[����]��� -> " + receive);
				System.out.print("[Ŭ��]��    -> ");
				String send = sc.nextLine();
				
				dos.writeUTF(send);
				if(send.equals("exit"))
				{
					System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�.");
					dos.close();
					break;
				}
				
			}
		}
		catch(UnknownHostException e)
		{
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}		
		finally
		{
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

/*Ŭ���̾�Ʈ ����
 * 
 * 
 * 1. �������� ���� ����
 * new Socket(���� IP, ��Ʈ��ȣ);
 * 2. ��/��� ��Ʈ�� ����.
 * new InputStream(�������� ����)
 * new OutputStream(�������� ����)
 * 
 * 3. ������ �����
 * �Է� : �Է½�Ʈ��.readUTF();
 *	��� : ��½�Ʈ��.writeUTF();
 *
 *4. ��� ���� ���� �� ��Ʈ�� ����
 *�Է� ��Ʈ��.close();
 *��� ��Ʈ��.close();
 *���� �������.close();
 */