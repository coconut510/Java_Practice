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
		mgr.insertData(new Silver("È«±æµ¿", "Silver", 1000));
		mgr.insertData(new Silver("±è¸»¶Ë", "Silver", 2000));
		mgr.insertData(new Silver("¶Ë¶ËÀÌ", "Silver", 3000));
		mgr.insertData(new Gold("±èºÎÀå", "Gold", 2000));
		mgr.insertData(new Gold("¹ÚºÎÀå", "Gold", 3000));
		mgr.insertData(new Vip("ÃÖ»çÀå", "Vip", 2000));
		mgr.insertData(new VVip("ÀÌÈ¸Àå", "VVip", 3000));
		mgr.insertData(new Ruby("È«·çºñ","Ruby", 4000));
				
		mgr.printData();
		mgr.deleteData("¶Ë¶ËÀÌ");
		mgr.printData();
		mgr.deleteData("¹ÚºÎÀå");
		mgr.printData();
	}
}
