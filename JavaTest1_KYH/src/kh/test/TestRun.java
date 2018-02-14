package kh.test;

public class TestRun {

	public static void main(String[] args) {
		
		//1~6 10점 7~10 20점.
		// 1번문제
		InputTest01 it = new InputTest01();
//		it.twoMutiple();
		
		//2번 문제
		GooGooDan ggd = new GooGooDan();
//		ggd.googoo();
		
		//3번 문제
		AvrSumPrint asp = new AvrSumPrint();
//		asp.asPrint();
		
		//4번 문제
		CalculatorEx ce =new CalculatorEx();
//		ce.cal(args);
		
		//5번 문제
		NumberOrderCount noc = new NumberOrderCount();
//		noc.numOrderShow();
		
		//6번 문제
		MenuPrint mp = new MenuPrint();
//		mp.menuShow();
		
		//7번 문제
		HorsuSum hs = new HorsuSum();
//		hs.horSum();
		
		//8번문제
		AllArrSum aas = new AllArrSum();
//		aas.sumResult();
		
		//9번문제
		MaxMinSelect mms = new MaxMinSelect();
		mms.minMax();
		
		//10번문제
		AscendingArr aca = new AscendingArr();
//		aca.ascArr();
		
	}

}
