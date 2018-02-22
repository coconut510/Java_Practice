package kh.java.pay.run;

import kh.java.pay.controller.PayMgr;
import kh.java.pay.model.vo.Intern;
import kh.java.pay.model.vo.PartTime;
import kh.java.pay.model.vo.Permanent;

public class TestMain {
	public static void main(String[] args) {
		PayMgr p = new PayMgr();
		p.insertData(new Permanent("홍길동", "정규직", 1500000));
		p.insertData(new PartTime("김말똥", "시간직", 6000, 200));
		p.insertData(new Intern("삼국지", "인턴직", 2000000));
		p.insertData(new Intern("오국지", "인턴직", 2500000));
		p.insertData(new PartTime("김알바", "시간직", 8000, 100));
		p.insertData(new Permanent("고길동", "정규직", 4800000));
		p.showData();
	}
}
