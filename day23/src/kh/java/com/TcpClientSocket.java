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
            System.out.println(currentTime()+"연결중입니다...");
            System.out.println(currentTime()+"연결되었습니다.");
            System.out.println(currentTime()+serverIpAddress+"에 접속하였습니다.");
            InputStream in = clientSocket.getInputStream();
            DataInputStream dis = new DataInputStream(in);
            OutputStream out = clientSocket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(out);
            
            String serverMessage;
            String clientMessage;
            
            while(true) {
                serverMessage = dis.readUTF();
                if(serverMessage.equals("exit")) break;
                System.out.println(currentTime()+"서버[상대] : "+serverMessage);
                System.out.print(currentTime()+"클라이언트[나] : ");
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