package kh.practice.exam;

import java.util.Scanner;

public class ExamClassList {
	public void example01()
	{
		Scanner sc = new Scanner(System.in);
			
		int score =0;
		int i = 0;
		
		while(i<5)
		{
			System.out.print("정수값을 입력하시오 : ");
			score += sc.nextInt();
			i+=1;
		}		
		System.out.printf("입력한 5개의 정수의 합 : %d", score);
		
	}
	
	public void example02()
	{
		int sum = 0;
		int i = 1;
		while(i<=100)
		{
			sum+=i;
			i+=1;
		}
		System.out.printf("1~100까지의 합은 %d입니다.", sum);
	}
	
	public void example03()
	{
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int sum = 0;
		System.out.print("1부터 더하려는 숫자의 범위를 입력하세요 : ");
		int num = sc.nextInt();
		
		while (i <num)
		{
			i+=1;
			sum+=i;
		}
		System.out.printf("1부터 n까지의 합은? %d ", sum);
	}
	
	public void example04()
	{
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int sum = 0;
		System.out.print("n의 수를 입력 : ");
		int num = sc.nextInt();
		
		while(i<num)
		{
			i+=2;
			if( i % 2 == 0 ) sum+=i;
		}
		System.out.println("짝수들만의 합은 : "  + sum);
		
	}
	public void example05()
	{
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int firstNum = sc.nextInt();
		
		System.out.print("두번째 수 입력 : ");
		int secondNum = sc.nextInt();
		
		if(firstNum>secondNum)
		{
			int temp = firstNum;
			firstNum = secondNum;
			secondNum = temp;
		}
		
		int i = firstNum;
		while(i<=secondNum)
		{		
			sum +=i;
			i+=1;
		}
		
		System.out.printf("%d ~ %d까지의 합 :  %d" , firstNum, secondNum, sum);
		
	}
	
	public void example06()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int firNum = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int secNum = sc.nextInt();
		
		int sum = 0;
		int count = 0;
		
		if( firNum > secNum )
		{
			int temp = firNum;
			firNum = secNum;
			secNum = temp;
		}
		
		int i = firNum;
		
		while(i<=secNum)
		{
			if( (i%3==0) || (i%5==0) )
			{
				sum+=i;
				count +=1;
			}
			i+=1;
		}
		
		System.out.printf("%d ~ %d 사이에있는\n3, 5의 배수의 갯수는 %d, 합은 %d 평균은 %.1f",firNum,secNum,count, sum, ((double)sum/count));
		Thread t = new Thread();
		try {
			t.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void example07()
	{
		Scanner sc = new Scanner(System.in);
		int su = 0;		
		System.out.print("정수입력 : ");
		su = sc.nextInt();
		do {
			System.out.println(su % 10);
			su/=10;
		}while(su>0);
	}
	
	public void example08()
	{
		int cost = 0;
		char answer ='y';
		String recepiList ="";
		Scanner sc = new Scanner(System.in);
		System.out.println(
				     "깁밥=======================\n"
				+ "1. 원조김밥==============1000원 \n"
				+ "2. 치즈김밥==============1200원 \n"
				+ "3. 참치김밥==============2000원 \n"
				+ "라면========================\n"
				+ "4. 그냥라면==============1200원 \n"
				+ "5. 치즈라면==============1500원 \n"
				+ "6. 짬뽕라면==============2000원 \n"
				+ "기타========================\n"
				+ "7. 튀김==============1200원 \n"
				+ "8. 순대==============2500원 \n"
				+ "9. 오뎅==============1000원 \n"
				+ "10.음료수==============800원 \n");
		
		
		do {
		System.out.print("메뉴선택 : ");
		int menuNum = sc.nextInt();
		System.out.print("수량선택 : ");
		int menuCountNum = sc.nextInt();
		
		switch(menuNum)
		{
			case 1:
				recepiList = "원조김밥";
				cost+= menuCountNum * 1000;
			break;
			case 2:
				recepiList = "치즈김밥";
				cost+= menuCountNum * 1200;
			break;
			case 3:
				recepiList = "참치김밥";
				cost+= menuCountNum * 2000;
			break;
			case 4:
				recepiList = "그냥라면";
				cost+= menuCountNum * 1200;
			break;
			case 5:
				recepiList = "치즈라면";
				cost+= menuCountNum * 1500;
			break;
			case 6:
				recepiList = "짬뽕라면";
				cost+= menuCountNum * 2000;
			break;
			case 7:
				recepiList = "튀김";
				cost+= menuCountNum * 1200;
			break;
			case 8:
				recepiList = "순대";
				cost+= menuCountNum * 2500;
			break;
			case 9:
				recepiList = "오뎅";
				cost+= menuCountNum * 1000;
			break;
			case 10:
				recepiList = "음료수";
				cost+= menuCountNum * 800;
			break;			
		}
		System.out.printf("%s을(를) %d개 주문하셨습니다.\n", recepiList, menuCountNum);
		
		System.out.print("추가 주문하시겠습니까?(y/n) ");
		sc.nextLine();
		answer = sc.next().charAt(0);
		}while(answer=='y');
							
		System.out.printf("지불하실 금액은 총 %d원입니다.", cost);
		
		Thread t = new Thread();
		try {
			t.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void example09()
	{
		for(int i =1;i<=10;i++)
		{
			System.out.println("i = " + i);
		}
	}
	public void example10()
	{
		
		for(int i = 0; i<5;i++)
		{
			System.out.println("안녕하세요");
		}
	}
	
	public void example11()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇번을 출력하시겠습니까? ");
		int num = sc.nextInt();
		for(int i = 0; i<num;i++)
		{
			System.out.println("안녕하세요");
		}
		
		
	}
	
	public void example12()
	{
		int num = 2;
		
		for(int i = 1 ;i<10;i++)
		{
			System.out.printf("%d * %d = %d\n", num,i,num*i);
		}
		
	}
	
	public void example13()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇단을 출력하시겠습니까?");
		int num = sc.nextInt();
		
		for(int i = 1 ;i<10;i++)
		{
			System.out.printf("%d * %d = %d\n", num,i,num*i);
		}
		
	}
	public void example14()
	{
		Scanner sc = new Scanner(System.in);
		int score =0;
		for(int i =0;i<5;i++)
		{
			System.out.print("정수값을 입력하시오 : ");
			score += sc.nextInt();
		}
		System.out.printf("입력한 5개의 정수의 합 : %d", score);
	}
	
	public void example15()
	{
		Scanner sc = new Scanner(System.in);
		int sum =0;
		for(int i =0;i<100;i++)
		{
			if(i%2==0) sum +=i;
		}
		System.out.printf("1 ~100 까지 짝수들만의 합은 : %d", sum);
	}
	
	public void example16()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("n의 수를 입력 : ");
		int n = sc.nextInt();
		int sum =0;
		for(int i =0;i<n;i++)
		{
			if(i%2==0) sum +=i;
		}
		System.out.printf("짝수들만의 합은 : %d", sum);
	}
	
	public void example17()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int firNum = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int secNum  = sc.nextInt();
		
		if( firNum > secNum )
		{
			int temp = firNum;
			firNum = secNum;
			secNum = temp;
		}
		int sum = 0;
		for(int i = firNum;i<secNum;i++)
		{
			sum+= i;
		}
		
		System.out.printf("%d ~ %d 까지의 합 : %d", firNum, secNum, sum);
	}
	
	public void example18()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int firNum = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int secNum = sc.nextInt();
		
		int sum = 0;
		int count = 0;
		
		if( firNum > secNum )
		{
			int temp = firNum;
			firNum = secNum;
			secNum = temp;
		}
		
		
		for(int i = firNum;i<=secNum;i++)
		{
			if( (i%3==0) || (i%5==0) )
			{
				sum+=i;
				count +=1;
			}
		}
		
		System.out.printf("%d ~ %d 사이에있는\n3, 5의 배수의 갯수는 %d, 합은 %d 평균은 %.1f",firNum,secNum,count, sum, ((double)sum/count));
	}
	
	public void example19()
	{
		int i =1;
		while(i<30)
		{
			if(i%4==0) System.out.println(i);
			i+=1;
		}
		
	}
	
	public void example20()
	{
		Scanner sc =new Scanner(System.in);
		int i =0;
		int num =1;
	    do
		{
			System.out.print("정수 하나를 입력하세요.");
			num = sc. nextInt();
			if(num>0)System.out.printf("%d는 양수입니다.\n", num );
			else if(num<0) System.out.printf("%d는 음수입니다.\n", num );
			else System.out.println("프로그램을 종료합니다.");
		}while(num!=0);
	}
	
	public void example21()
	{
		int sum = 0;
		for(int i = 1; i<=10;i++)
		{
			for(int j = 1; j<=i;j++)
			{
				sum+=j;				
			}			
		}
		System.out.printf("결과값 %d \n" ,sum );
	}
	
	public void example22()
	{
		int n =0;
		int goal = 100;
		int result = 0;
		boolean chk = true;
		while(result<100)//(chk)
		{
			n+=1;	
			if(n%2==0)result -=n;	
			else result +=n;	
			//if(result==goal) chk = false;		
		}
		n = n%2==0?n*-1:n;
		System.out.printf("%d 일때 결과값은 %d이됩니다. ",n,goal);
	}
	
	public void example23()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("몇과목을 입력받을지 입력하세요.");
		int classNum = sc.nextInt();
		int totalNum = 0; 
		for( int i = 1; i<=classNum;i++)
		{
			System.out.printf("%d번째 과목 점수를 입력하세요 => ", i);
			totalNum += sc.nextInt();
		}
		double avr = totalNum /classNum;
		if(avr>=80) System.out.println("pass");
		else System.out.println("fail");
	}
}
