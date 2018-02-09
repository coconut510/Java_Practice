package kh.pracktice.arrayprac;

import java.util.Scanner;

public class ExamArrayFunc {
	public void example01()
	{
		String[] fluteArr = {"딸기","복숭아","키위","사과","바나나"};
		System.out.println("for 없이");
		System.out.println(fluteArr[0]);
		System.out.println(fluteArr[1]);
		System.out.println(fluteArr[2]);
		System.out.println(fluteArr[3]);
		System.out.println(fluteArr[4]);
		
		System.out.println("\n\nfor로");
		for(int i = 0; i<fluteArr.length;i++)
		{
			System.out.println(fluteArr[i]);
		}
	}
	
	public void example02()
	{
		int[] examScore = new int[4];
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		
		for(int i = 0; i<examScore.length-1;i++)
		{
			switch(i) 
			{
				case 0: System.out.print("국어점수 : ");
				 examScore[i] = sc.nextInt();
				 break;
				case 1: System.out.print("영어점수 : ");
				 examScore[i] = sc.nextInt();
				 break;
				case 2: System.out.print("수학점수 : ");
				 examScore[i] = sc.nextInt();
				 break;
				case 3: examScore[i] = sum;
				 
			}
			sum +=examScore[i];
		}
		

		System.out.println("국어 :" +examScore[0]);
		System.out.println("영어 :" +examScore[1]);
		System.out.println("수학 :" +examScore[2]);
		System.out.println("합계 :" +sum);
		System.out.printf("평균 : %.2f", sum/3.0);
		
	}
	
	public void example03()
	{
		int[] examScore = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<examScore.length;i++)
		{
			System.out.printf("%d 번째 학생의 성적 :", i+1 );
			examScore[i] = sc.nextInt();
		}
		
		System.out.println("\n\n<<입력한 학생들의 성적>>");
		for(int i = 0; i<examScore.length;i++)
		{
			System.out.print(examScore[i] +" ");
		}
		
		System.out.printf("\n학생들의 총 합계 : %d",examScore[0]+examScore[1]+examScore[2]+examScore[3]+examScore[4] );
		System.out.printf("\n학생들의 평균 점수 : %.2f", (double)(examScore[0]+examScore[1]+examScore[2]+examScore[3]+examScore[4])/examScore.length );
	
	}
}
