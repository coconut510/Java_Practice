package kh.classmn.controller;

import kh.classmn.view.StartView;
import kh.classmn.vo.util.ResGroup;
import kh.classmn.vo.util.ViewModel;

public class StartController {
	private StartView sv;
	private ResGroup rg = new ResGroup();
	private ViewModel vm = new ViewModel();
	public StartController() {
		sv = new StartView(this);
	}
	public void btnAction() {
		vm.getPanel("start").setVisible(false);
		new LoginController().startLogin();
	}
}
