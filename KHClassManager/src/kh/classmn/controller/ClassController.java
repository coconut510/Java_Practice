package kh.classmn.controller;

import kh.classmn.view.ClassView;

public class ClassController {
	private ClassView cv;
	public void start()
	{
		cv = new ClassView(this);
	}
}
