import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer{
		public void serverHost(){
			ServerSocket serverSocket = null;
			Socket s = null;
	
			try{
				serverSocket = new ServerSocket(1000);
				while(true){
					s = serverSocket.accept(); 
					ServerThread st = new ServerThread(s);
					st.start(); 
					System.out.println(s.getInetAddress()+"님 입장");
				}
	
			} catch (IOException e) {
				e.printStackTrace();
			}
	
			finally{		
				try {
					if (s != null)s.close();
					if (serverSocket != null)serverSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}			
				System.out.println("**서버 종료**");   
			}
		}
		public static void main(String[] args) {
			TestServer ts = new TestServer();
			ts.serverHost();

		}
	}