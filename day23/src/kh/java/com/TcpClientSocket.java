package kh.java.com;
import java.io.*;
import java.net.*;
import java.util.Calendar;
import java.util.Scanner;
 
public class TcpClientSocket {
    Scanner sc = new Scanner(System.in);
    Calendar day = Calendar.getInstance();
    public TcpClientSocket() {
        String serverIpAddress = "127.0.0.1";
        int serverPort = 7777;
        Socket clientSocket = null;
        
        try {
            clientSocket = new Socket(serverIpAddress,serverPort);
            System.out.println(currentTime()+"�������Դϴ�...");
            System.out.println(currentTime()+"����Ǿ����ϴ�.");
            System.out.println(currentTime()+serverIpAddress+"�� �����Ͽ����ϴ�.");
            InputStream in = clientSocket.getInputStream();
            DataInputStream dis = new DataInputStream(in);
            OutputStream out = clientSocket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(out);
            
            String serverMessage;
            String clientMessage;
            
            while(true) {
                serverMessage = dis.readUTF();
                if(serverMessage.equals("exit")) break;
                System.out.println(currentTime()+"����[���] : "+serverMessage);
                System.out.print(currentTime()+"Ŭ���̾�Ʈ[��] : ");
                clientMessage = sc.nextLine();
                dos.writeUTF(clientMessage);
                if(clientMessage.equals("exit")) break;
            }
            dis.close();
            dos.close();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public String currentTime() {
        day = Calendar.getInstance();
        return "["+day.get(Calendar.HOUR)+":"+day.get(Calendar.MINUTE)+":"+day.get(Calendar.SECOND)+"]";
    }
}