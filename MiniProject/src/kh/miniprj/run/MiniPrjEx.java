package kh.miniprj.run;

import java.io.IOException;

import kh.miniprj.controller.MainController;
import kh.miniprj.view.StartGameView;
import kh.miniprj.view.SwingExam;

public class MiniPrjEx {

	public static void main(String[] args) {
		MainController mc = new MainController();
		mc.start();
//		SwingExam se = new SwingExam();
//		try {
//			se.viewPopup();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}