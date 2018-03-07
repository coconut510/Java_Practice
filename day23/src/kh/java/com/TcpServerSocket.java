package kh.java.com;

import java.io.*;
import java.net.*;
import java.util.Calendar;
import java.util.Scanner;
 
public class TcpServerSocket {
    Scanner sc = new Scanner(System.in);
    Calendar day = Calendar.getInstance();
    public TcpServerSocket() {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        int port = 7777;
        
        try {
            serverSocket = new ServerSocket(port);
            
            System.out.println(currentTime()+"연결 대기중...");
            
            clientSocket = serverSocket.accept();
            
            System.out.println(currentTime()+clientSocket.getInetAddress()+"님이 접속하셨습니다.");
            
            InputStream in = clientSocket.getInputStream();
            DataInputStream dis = new DataInputStream(in);
            OutputStream out = clientSocket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(out);
            
            String serverMessage;
            String clientMessage;
            while(true) {
                System.out.print(currentTime()+"서버[나] : ");
                serverMessage = sc.nextLine();
                dos.writeUTF(serverMessage);
                if(serverMessage.equals("exit")) break;
                clientMessage = dis.readUTF();
                if(clientMessage.equals("exit")) break;
                System.out.println(currentTime()+"클라이언트[상대] : "+clientMessage);                
            }
            dis.close();
            dos.close();
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            try {
                serverSocket.close();
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
