package cast.practice;

import java.util.Scanner;
//import java.lang.Integer;

public class CastingSample {
	public void printUniCode()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		char wordEx = sc.next().charAt(0);
		System.out.printf("%c is unicode : %d",wordEx, (int)wordEx );
	}
	public void calculatorScore()
	{
System.out.println("�ꤾ��� üũ");
		double kor;
		double eng;
		double math;
		int avr;
		int total;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� :");
		kor = sc.nextDouble();
		System.out.print("���� :");
		eng = sc.nextDouble();
		System.out.print("���� :");
		math = sc.nextDouble();
		
		total = (int)(kor + eng + math);
		avr = (int)(total/3);
		System.out.printf("���� : %d \n",total);
		System.out.printf("���� : %d",avr);
	}
	public void printBitCount()
	{		
		Scanner sc = new Scanner(System.in);		
		System.out.printf("���� �Է� :");
		int num = sc.nextInt();// �����ޱ�.
		String str = Integer.toBinaryString(num);// ������ 2�����ε� ���ڿ���
		str = str.replaceAll("0", "");// ���ڿ����� 0�� ��� �����Ѵ�.
		num = str.length();// ���ڿ��� �������
		System.out.printf("11�� 2������ ���Ե� 1�� ���� : %s", num);// ���.
	}
}
