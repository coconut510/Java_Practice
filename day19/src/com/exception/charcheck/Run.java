package com.exception.charcheck;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		CharacterProcess ccp = new CharacterProcess();
		System.out.println("���ڿ��� �Է����ּ���.");
		try {
			System.out.println(ccp.countAlpha(sc.nextLine()));
		} catch (CharCheckException e) {
			e.printStackTrace();
		}
	}

}
