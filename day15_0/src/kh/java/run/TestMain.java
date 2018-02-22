package kh.java.run;

import kh.java.controller.Pntmgr;
import kh.java.model.vo.Gold;
import kh.java.model.vo.Ruby;
import kh.java.model.vo.Silver;
import kh.java.model.vo.VVip;
import kh.java.model.vo.Vip;

public class TestMain {

	public static void main(String[] args) 
	{
		Pntmgr mgr = new Pntmgr();
		mgr.insertData(new Silver("ȫ�浿", "Silver", 1000));
		mgr.insertData(new Silver("�踻��", "Silver", 2000));
		mgr.insertData(new Silver("�˶���", "Silver", 3000));
		mgr.insertData(new Gold("�����", "Gold", 2000));
		mgr.insertData(new Gold("�ں���", "Gold", 3000));
		mgr.insertData(new Vip("�ֻ���", "Vip", 2000));
		mgr.insertData(new VVip("��ȸ��", "VVip", 3000));
		mgr.insertData(new Ruby("ȫ���","Ruby", 4000));
				
		mgr.printData();
		mgr.deleteData("�˶���");
		mgr.printData();
		mgr.deleteData("�ں���");
		mgr.printData();
	}
}
