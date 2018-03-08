package kh.java.server.run;

import kh.java.server.socket.ServerChat;

public class ServerMain {

	public static void main(String[] args) {
		new ServerChat();
	}

}
/*
서버 소켓

1. 서버소켓 생성(서버 오픈)
new ServerSocket(포트번호) ;

2. 클라이언트별 연결 소켓
서버 소켓. accept();

3. 입/출력 스트림 생성.
클라이언트 소켓.getInputStream();
클라이언트 소켓.getOutputStream();

4. 데이터 입출력
입력 : 입력스트림.readUTF();
출력 : 출력스트림.writeUTF();

5. 통신 연결 종료 및 스트림 해제
입력 스트림.close()
출력 스트림.close()
클라이언트별 소켓.close()
소켓.close()
 */