package kh.classmn.run;

import kh.classmn.controller.JoinGameMgr;
import kh.classmn.controller.MultichatServer;
import kh.classmn.controller.StartController;
import kh.classmn.controller.Socket.StudentClient;
import kh.classmn.controller.Socket.TeacherServer;

public class KHClassMNRun {

	public static void main(String[] args) {
//		new MultichatServer().start();
//		new JoinGameMgr().start();
//		new TeacherServer();
		new StudentClient();
//		new StartController();
	}

}
