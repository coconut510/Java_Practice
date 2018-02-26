package kh.java.cal.controller;

import java.util.Scanner;

import kh.java.com.Calculator;

public class CalControll implements Calculator {
	private Scanner sc  = new Scanner(System.in);
	@Override
	public void start() {
		while(true)
		{
			System.out.print("������ �Է�(+,-,*,/) : ");
			char op = sc.next().charAt(0);
			if(!(op=='+'||op=='-'||op=='*'||op=='/'))
			{
				System.out.println("������ �����ڸ� �Է����ּ���.");
				continue;
			}
			sc.nextLine();
			System.out.print("ù��° ���� �Է� : ");
			String fir = sc.nextLine();
			
			System.out.print("�ι�° ���� �Է� : ");
			String sec = sc.nextLine();
			switch(op)
			{
				case '+': System.out.printf("%s %c %s = %s",fir,op,sec,add(fir,sec)); break;
				case '-': System.out.printf("%s %c %s = %s",fir,op,sec,subtract(fir,sec)); break;
				case '*': System.out.printf("%s %c %s = %s",fir,op,sec,multiply(fir,sec)); break;
				case '/': System.out.printf("%s %c %s = %.1f",fir,op,sec,divide(fir,sec)); break;					
			}
			System.out.println("\n");
		}
		
	}
	
	@Override
	public int add(String su1, String su2) {
		return Integer.parseInt(su1) +  Integer.parseInt(su2);
	}

	@Override
	public int subtract(String su1, String su2) {
		return Integer.parseInt(su1) -  Integer.parseInt(su2);
	}

	@Override
	public int multiply(String su1, String su2) {
		return Integer.parseInt(su1) *  Integer.parseInt(su2);
	}

	@Override
	public double divide(String su1, String su2) {
		return Integer.parseInt(su1) / Double.parseDouble(su2);
	}


}
