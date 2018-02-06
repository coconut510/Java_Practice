package kh.practice.exampleloop;

import java.util.Scanner;

public class ExamLoopList {
	public void example01()
	{
		int i ;// 반복문에 사용되는 파라미터 선언.
		i = 0;// 파라미터 초기값 지정.
		while(i<10000) // 조건문. //10000번 반복하도록 조건문 설정.
		{		
			i = i+1; // 증강문.1씩 증가 시켜준다. 10000이 되기전까지 조건을 충족시키기 위해 1씩 증가시켜준다.
			System.out.printf("i = %d\n",i  );	// i를 콘솔창에 출력시켜준다.
			
			//쓰레드 슬립 메소드로  0.1초마다 콘솔창에 값이 업데이트 되도록 한다. 
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
	public void example02()
	{
		Scanner sc = new Scanner(System.in);// 스캐너 클래스 생성.
		System.out.print("안녕하세요를 몇번 출력하시겠습니까? : ");// 입력받을값 안내 멘트.
		int count = sc.nextInt();// 인티져 정수 값으로 사용자에게 값을 받는다.
		int i =0;// 반복문에 사용되는 파라미터 선언 및 초기화.
		while(i <count)// i가 count(즉, 사용자가 입력한 값 만큼 이 될때까지 반복하라는 조건문)
		{
			i+=1;// 조건문에서 사용되는 파라미터를 1씩 증가시켜 준다.
			System.out.println("안녕하세요");// 안녕하세요 출력.
		}
	}
	
	public void example03()
	{
		int i = 0; // 인티져 정수 값으로 사용자에게 값을 받는다.
		while(i<9)// i가 9번씩 반복되도록 조건문생성.
		{
			i +=1;// 9까지 i가 증가할수 있도록 1씩 증가시킨다.
			System.out.printf("2 * %d = %d\n", i, 2*i); // 2 *  i = 2*i 방식으로 한다.;
		}
	}
	
	public void example04()
	{
		Scanner sc = new Scanner(System.in);// 스캐너 클래스를 생성해준다.
		
		System.out.print("몇단을 출력하시겠습니까? : ");// 사용자가 받을 값을 설명해주는 멘트.
		int num = sc.nextInt();// 출력할 단을 인티저 변수에 사용자가 할당한다.
		
		System.out.printf("%d단 입니다.\n", num);// 몇단인지 알려준다. 위의 'num' 단이라고 하면 됨.
		int i = 0; // 반복문에서 사용되는 파라미터 선언 및 초기화.
		while(i<9)// 구구단에서 사용되는 조건식.
		{
			i +=1;// 9번 반복할수 있도록 9가 되기까지 변수의 값을 1씩 증가시켜 준다.
			System.out.printf("%d * %d = %d\n", num,i, num*i);// num(사용자 입력값) * i(증가값) = num*i;
		}
	}

	public void example05()
	{
		Scanner sc = new Scanner(System.in);// 스캐너 클래스를 생성해준다.
		int sumVal =0;// 더해줄 정수형 변수를 선언하고 초기화 해준다.
		int i =0;// 반복문에 사용되는 변수를 선언하고 초기화해준다.
		while(i<5)// 문제에서 5번 정수를 받으라고 했기에, 5번으로 조건식을 만들어준다.
		{
			i+=1;// 조건문을 만족할수 있도록 1씩 증가시켜준다.
			System.out.print("정수값을 입력하세요 : ");//정수값을 입력하라는 멘트. (5번 반복된다.)
			sumVal += sc.nextInt();// 입력받은 값을 sumVal( 더해주는 변수)에 바로 더해준다. 따로 더해줘도 무방. 
		}
		System.out.printf("입력한 5개의 정수의 합 : %d ", sumVal);// 더해준 값을 출력해준다.
	}
	public void example06()
	{
		int i =0;// 반복문에 쓰이는 파라미터 선언 및 초기화
		int sum = 0;// 짝수값들을 더해주는 변수를 선언해준다.
		while(i<100)// 문제에서 100까지 정수라고 했으므로, 100까지 반복할수 있는 조건문을 만들어준다.
		{
			i+=1; // 조건문 <100을 만족하기위해 i값을 1씩 증가시켜준다.
			if(i%2==0) sum+=i; // 나머지가 2인 100까지의 숫자, %나머지 연산자를 사용해서 sum변수에 더해준다.
		}
		System.out.printf("짝수들만의 합은 : %d", sum);// 결과값을 출력해준다.
	}
	
	public void example07()
	{
		Scanner sc = new Scanner(System.in);
		int i = 0;// 반복문에 사용되는 파라미터를 선언하고 초기화한다.
		int num = 0;// 사용자가 입력받을 변수를 선언한다.
		int sum = 0;// 더해줄 값을 넣어줄 변수를 선언한다.
		System.out.print("n의 수를 입력 : ");// 사용자가 입력할 값을 안내해주는 멘트.
		num = sc.nextInt();// 변수에 정수값을 할당해준다.
		
		while(i<num) // 사용자가 입력한 변수값까지 반복하는 조건식. num번 반복한다.
		{
			i+=1;// num까지 루프를 돌도록 한번 돌때마다 i값을 1 증가시켜 준다ㅑ.
			if(i%2==0) sum+=i; // num까지의 짝수값을 더해준다.
		}
		System.out.printf("짝수들만의 합은 : %d", sum);// 결과값을 출력해준다.
	}
	
	public void example08()
	{
		Scanner sc = new Scanner(System.in);// 스캐너 클래스를 생성해준다.
	
		System.out.print("첫번째 수 입력 : ");// 시작할 정수를 입력하라고 한다.
		int firstNum= sc.nextInt();// 첫번째 기준값 정수에 값을 입력한다.
		
		System.out.print("두번째 수 입력 : ");// 끝날 정수를 입력하라고 한다.
		int secondNum= sc.nextInt();// 끝나는 기준값 정수에 값을 입력한다.
		
		int i = firstNum;// 조건문에 사용할 변수에 첫번째 입력받은 정수를 할당해준다.
		int sum =0;// 더해줄 값들을 저장할 변수를 선언한다.
// 		while 문
//		while(i<secondNum+1)  // i(첫번째 입력받은 정수)~ 두번째 입력받은 정수 까지를 조건식으로 한다. 
//		{			
//			sum+=i;// 저장할 변수에 i( 첫번째 입력받은정수~ 두번째 정수 까지 더해준다).
//			i+=1;// 기준점을 +1 해준다. // 입력받은 숫자를 먼저 입력해야하기에, 변수를 증가시키는 식을 뒤에 넣어준다.
//		}

		//for 문
		for(int j = firstNum; j <= secondNum; j++)// 위에 i 변수를 선언했으므로 j로 선언했다.
		{										  // 첫번재 받은 변수~두번째 변수까지  반복하라는 의미.
			sum += j;// j는 for문에서 계속 증가하므로 합계를 보관하는 변수에 더해준다.			
		}
		
		System.out.printf("%d ~ %d 까지의 합 : %d", firstNum, secondNum, sum);// 결과값 출력.
	}
}
