package kh.java.controller;

import kh.java.model.vo.Gold;
import kh.java.model.vo.Silver;
import kh.java.model.vo.Vip;

public class Pntmgr {
	private Silver[] s = new Silver[10];
	private Gold[] g = new Gold[10];
	private Vip[] v = new Vip[10];
	private int indexS = 0;
	private int indexG = 0;
	private int indexV = 0;
	public void insertData(Silver s)
	{
		this.s[indexS] = s;
		indexS+=1;
	}
	public void insertData(Gold g)
	{
		this.g[indexG] = g;
		indexG+=1;
	}
	public void insertData(Vip v)
	{
		this.v[indexV] = v;
		indexV+=1;
	}
	
	public void printData()
	{
		System.out.println("<<===================information====================>>");
		System.out.println("이름\t\t등급\t\t포인트\t\t이자포인트");
		for(int i = 0; i<indexS;i++)
		{
			System.out.printf("%s\t\t%s\t\t%d\t\t%.1f\n", s[i].getName(), s[i].getGrade(), s[i].getPoint(), s[i].getInterest());
		}
		for(int i = 0; i<indexG;i++)
		{
			System.out.printf("%s\t\t%s\t\t%d\t\t%.1f\n", g[i].getName(), g[i].getGrade(), g[i].getPoint(), g[i].getInterest());
		}
		for(int i = 0; i<indexV;i++)
		{
			System.out.printf("%s\t\t%s\t\t%d\t\t%.1f\n", v[i].getName(), v[i].getGrade(), v[i].getPoint(), v[i].getInterest());
		}
	}
}
