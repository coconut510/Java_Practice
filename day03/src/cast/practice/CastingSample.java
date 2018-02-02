package cast.practice;

import java.util.Scanner;
//import java.lang.Integer;

public class CastingSample {
	public void printUniCode()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("문자입력 : ");
		char wordEx = sc.next().charAt(0);
		System.out.printf("%c is unicode : %d",wordEx, (int)wordEx );
	}
	public void calculatorScore()
	{
System.out.println("깃ㅎ허브 체크");
		double kor;
		double eng;
		double math;
		int avr;
		int total;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 :");
		kor = sc.nextDouble();
		System.out.print("영어 :");
		eng = sc.nextDouble();
		System.out.print("수학 :");
		math = sc.nextDouble();
		
		total = (int)(kor + eng + math);
		avr = (int)(total/3);
		System.out.printf("총점 : %d \n",total);
		System.out.printf("총점 : %d",avr);
	}
	public void printBitCount()
	{		
		Scanner sc = new Scanner(System.in);		
		System.out.printf("정수 입력 :");
		int num = sc.nextInt();// 정수받기.
		String str = Integer.toBinaryString(num);// 정수를 2진수로된 문자열로
		str = str.replaceAll("0", "");// 문자열에서 0을 모두 제외한다.
		num = str.length();// 문자열의 길이출력
		System.out.printf("11의 2진수에 포함된 1의 갯수 : %s", num);// 결과.
	}
}
