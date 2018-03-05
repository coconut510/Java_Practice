package kh.java.run;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import kh.java.member.view.MemberView;

public class MemberRun {
	public static void main(String[] args) {
		new MemberView().mainMenu();
	}
}
