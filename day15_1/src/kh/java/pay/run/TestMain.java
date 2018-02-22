package kh.java.pay.run;

import kh.java.pay.controller.PayMgr;
import kh.java.pay.model.vo.Intern;
import kh.java.pay.model.vo.PartTime;
import kh.java.pay.model.vo.Permanent;

public class TestMain {
	public static void main(String[] args) {
		PayMgr p = new PayMgr();
		p.insertData(new Permanent("ȫ�浿", "������", 1500000));
		p.insertData(new PartTime("�踻��", "�ð���", 6000, 200));
		p.insertData(new Intern("�ﱹ��", "������", 2000000));
		p.insertData(new Intern("������", "������", 2500000));
		p.insertData(new PartTime("��˹�", "�ð���", 8000, 100));
		p.insertData(new Permanent("��浿", "������", 4800000));
		p.showData();
	}
}
