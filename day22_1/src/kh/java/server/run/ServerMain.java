package kh.java.server.run;

import kh.java.server.socket.ServerChat;

public class ServerMain {

	public static void main(String[] args) {
		new ServerChat();
	}

}
/*
���� ����

1. �������� ����(���� ����)
new ServerSocket(��Ʈ��ȣ) ;

2. Ŭ���̾�Ʈ�� ���� ����
���� ����. accept();

3. ��/��� ��Ʈ�� ����.
Ŭ���̾�Ʈ ����.getInputStream();
Ŭ���̾�Ʈ ����.getOutputStream();

4. ������ �����
�Է� : �Է½�Ʈ��.readUTF();
��� : ��½�Ʈ��.writeUTF();

5. ��� ���� ���� �� ��Ʈ�� ����
�Է� ��Ʈ��.close()
��� ��Ʈ��.close()
Ŭ���̾�Ʈ�� ����.close()
����.close()
 */