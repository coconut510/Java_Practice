package kh.java.controller;

import kh.java.model.vo.Gold;
import kh.java.model.vo.Grade;
import kh.java.model.vo.Silver;
import kh.java.model.vo.VVip;
import kh.java.model.vo.Vip;

public class Pntmgr {
	private Grade[] g = new Grade[30];

	private int index=0;

	public void insertData(Grade s) { this.g[index++] = s; }
	public void deleteData(String name)
	{
		boolean chk = false;
		index-=1;
		for(int i = 0;i<index;i++)
		{
			if(g[i].getName().equals(name)) chk = true;
			if(chk) g[i] = g[i+1];
		}
	}
	public void printData()
	{

		System.out.println("<<====================information=====================>>");
		System.out.println("이름\t\t등급\t\t포인트\t\t이자적립률");
		for(int i = 0; i<index;i++)
		{	
			System.out.printf("%s\t\t%s\t\t%d\t\t%.1f\n", g[i].getName(),g[i].getGrade(), g[i].getPoint(), g[i].getInterest());
		}
	}
		
}
