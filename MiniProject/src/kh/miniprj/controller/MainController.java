package kh.miniprj.controller;

import kh.miniprj.view.StartGameView;

public class MainController {
	public void start()
	{
		new ResourceMng().resStart();
		new StartGameView().loadMainWIndow();
	}
}
