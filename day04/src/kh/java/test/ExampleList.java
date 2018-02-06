package kh.java.test;

import java.util.Scanner;

public class ExampleList {
	public void example01()
	{
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("임의의 수를 입력하세요:");
		num = sc.nextInt();
		
		if(num>0)
		{
			System.out.printf("당신이 입력한 수 %d 는 양수입니다.", num);
		}
		else if(num<0)
		{
			System.out.printf("당신이 입력한 수 %d 는 음수입니다.", num);
		}
		else
		{
			System.out.printf("당신이 입력한 수 %d 은 0입니다.", num);
		}
	}
	
	public void example02()
	{
		System.out.println("= = = 두수 비교 하는 프로그램 v1.0 = = =");
		Scanner sc = new Scanner(System.in);
		int numOne, numSecond;
		
		System.out.print("첫번째 수를 입력하세요:");
		numOne = sc.nextInt();
		
		System.out.print("두번째 수를 입력하세요:");
		numSecond = sc.nextInt();
		
		if(numOne>numSecond)// 첫번째 수가 더 큰경우
		{
			System.out.printf("%d > %d \n첫번째 수가 더 큽니다.", numOne, numSecond);
		}
		else if(numOne<numSecond)// 두번째 수가 더 큰경우
		{
			System.out.printf("%d < %d \n두번째 수가 더 큽니다.", numOne, numSecond);
		}
		else // 두수가 같은경우.
		{
			System.out.printf("%d = %d \n두 수가 같은수 입니다.", numOne, numSecond);
		}
	}
	
	
	public void example03()
	{
		char feature;
		int firNum,secNum;
		double result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("계산기 프로그램  ver 1.0");
		
		System.out.print("연산자를 입력하세요(+,-,*,/) :");
		feature = sc.next().charAt(0);
		
		System.out.print("첫번째 수를 입력 :");
		firNum = sc.nextInt();
		
		System.out.print("두번째 수를 입력 :");
		secNum = sc.nextInt();

		if(feature=='+')
		{
			System.out.printf("%d %c %d = %d", 
					firNum,feature,secNum,(firNum+secNum));
		}
		else if(feature=='-')
		{
			System.out.printf("%d %c %d = %d", 
					firNum,feature,secNum,( firNum-secNum));
		}
		else if(feature=='*')
		{
			System.out.printf("%d %c %d = %d", 
					firNum,feature,secNum,(firNum*secNum));
		}
		else if(feature=='/')
		{
			System.out.printf("%d %c %d = %f", 
					firNum,feature,secNum,(double)firNum/secNum);
		}
		
		
	}
	
	
	public void example04()
	{
		Scanner sc = new Scanner(System.in);
		int su;
		
		System.out.print("정수입력 : ");
		su = sc.nextInt();
		if(su>0)
		{
			System.out.println("입력 값은 0 보다 크다");
		}
		else
		{
			System.out.println("입력 값은 0 보다 크지 않다.");
		}
	}
	

	//제어문 4-2 1번문제.
	public void example05()
	{
		final int ADC = 15000;
		final int KDC  = 10000;
		int totalNum, kidCount, adultCount;
		
		System.out.println("놀이 공원 프로그램 v1.0");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입장하실 인원은 총 몇명입니까?");
		totalNum= sc.nextInt();
		 
		System.out.print("어른은 몇명입니까? (인원당  1만 5천원)");
		adultCount = sc.nextInt();
		
		System.out.print("어른은 몇명입니까? (인원당  1만 5천원)");
		kidCount = sc.nextInt();
		
		if(totalNum==(adultCount + kidCount))
		{
			System.out.printf("지불하실 총 금액은 %d 원 입니다.\n", 
					(ADC * adultCount + KDC * kidCount));
		}
		else
		{
			System.out.println("말씀하신 인원이 맞질 않습니다.");
		}
	}
	

	//제어문 4-2 2번문제.
	public void example06()
	{
		int score = 0;
		int answer;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("첫번째 퀴즈입니다.");
		System.out.print("사과는 영어로 무엇일까요? (1.Apple / 2.잡스) ");
		answer = sc.nextInt();
		if(answer==1) 
		{
			System.out.println("졍답!");
			score+=1;
		}
		else System.out.println("땡");
		
		
		
		System.out.println("두번째 퀴즈입니다.");
		System.out.print("바나나나는 길어 길으면 기차 기차는?(1.빨라 2.비싸) ");		
		answer = sc.nextInt();
		if(answer==1) 
		{
			System.out.println("졍답!");
			score+=1;
		}
		else System.out.println("땡");
		
		System.out.printf("총 %d 문제를 맞추셨습니다", score);
	}
	
	public void example07()
	{
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.print("1부터 100까지의 수 중 선택 :");
		num1 = sc.nextInt();
		if( 1<= num1 && num1 <=100 ) 
		{			
			if(num1%2==0) System.out.printf("입력한 수는 짝수입니다.\n");
			else System.out.println("입력한 수는 홀수 입니다.");
		}
		else
		{
			System.out.println("잘못된 수를 입력하였습니다.");
		}
	}
	
	// 4-3 제어문 문제1.
	public void example08()
	{
		System.out.println("= = = = = = 심리 테스트 v1.0 = = = = = =");
		Scanner sc = new Scanner(System.in);
		int answer;
		System.out.print("당신은 술을 좋아하십니까?(1.yes, 2.no)");
		answer = sc.nextInt();
		if(answer==1)
		{
			System.out.print("당신은 담배를 피웁니까?(1.yes, 2.no)");
			answer = sc.nextInt();
			if(answer==1)
			{
				System.out.println("술담배는 검강에 좋지 않습니다.");
			}
			else
			{
				System.out.println("담배는 피우지 않아도 술때문에 간이 위험해요!");
			}
		}
		else
		{
			System.out.print("당신은 이성친구가 있습니까?(1.yes, 2.no)");
			answer = sc.nextInt();
			if(answer==1)
			{
				System.out.println("올.....");
			}
			else
			{
				System.out.println("힘내세요.... 무슨낙으로 사시나요...?");
			}
		}		
	}
	
	public void example09()
	{
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.print("InputNumber 1~3:");
		num1 = sc.nextInt();
		if(num1 ==1)
		{
			System.out.println("One !");
		}
		else if(num1 ==2)
		{
			System.out.println("Two !");
		}
		else if(num1 ==3)
		{
			System.out.println("Three !");
		}
		else
		{
			System.out.println("Error !");
		}
	}
	
	
	//4-4 제어문 문제1
	public void example10()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("문자입력");
		char w = sc.next().charAt(0);
		System.out.println("======결  과 ======");
		if('a'<=w  && w<='z')
		{
			System.out.printf("소문자로 입력 하였습니다.\n대문자로 변환 : %c", w - 32);
		}
		else if('A'<=w  && w<='Z')
		{
			System.out.printf("대문자로 입력 하였습니다.\n소문자로 변환 : %c", w + 32);
		}
		else
		{
			System.out.println("잘못입력하셨습니다. 영문자를 입력해주세요.");
		}		
	}
	//4-4 문제2번
	public void example11()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력");
		int num = sc.nextInt();
		
		if(num!=0) 
		{
			if((num%3==0) &&(num%4==0))
			{
				System.out.printf("%d은(는) 3의 배수이면서, 4의 배수입니다.",num);
			}
			else if((num%3==0))
			{
				System.out.printf("%d은(는) 3의 배수입니다.",num);
			}
			else if((num%4==0))
			{
				System.out.printf("%d은(는) 4의 배수입니다.",num);
			}
			else
			{
				System.out.printf("%d은(는) 3의 배수도, 4의 배수도 아닙니다.",num);
			}
		}
		else
		{
			System.out.println("0은 3의 배수도 4의 배수도 아닙니다.");
		}						
	}
	
	
	//제어문 4-2 3번문제.
	public void example12()
	{
		Scanner sc = new Scanner(System.in);
		
		String name;
		int yearGrade, classGrade, orderNum;
		char sex;
		String sexKor;
		double examScore;
		
		System.out.print("학생이름을 입력하세요 : ");
		name = sc.nextLine();

		System.out.print("학년을 입력하세요 : ");
		yearGrade = sc.nextInt();
		
		System.out.print("반을 입력하세요 : ");
		classGrade = sc.nextInt();
		
		System.out.print("번호을 입력하세요 : ");
		orderNum = sc.nextInt();
		
		System.out.print("성별을 입력하세요(남:M, 여 :F) : ");
		sex = sc.next().charAt(0);
		
		System.out.print("평균을 입력하세요 : ");
		examScore = sc.nextDouble();
		
		sexKor = sex=='M'?"남학생":"여학생";
		
		System.out.printf("%d학년 %d반 %d번 %s %s은(는) 성적이 %.2f이다. ",
				yearGrade,classGrade, orderNum, sexKor, name,  examScore  );
	}
	
	// 4-3 문제2
	public void example13()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("1~10 사이의 정수 한개를 입력하세요.");
		int num = sc.nextInt();
		
		if(1<=num && num<=10)
		{
			String numChk = (num%2==0)?"짝수":"홀수";
			System.out.printf("%s다", numChk);
		}
		else
		{
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
		}
	}
	
	//4-3 문제3
	public void example14()
	{
		Scanner sc = new Scanner(System.in);
		double tall, mass, standardMass;
		String massResult;
		System.out.print("신장(cm)을 입력하세요 :");
		tall = sc.nextDouble();
		
		System.out.print("체중(kg)을 입력하세요 :");
		mass = sc.nextDouble();
		
		System.out.println("----------------");
		standardMass = (tall-100) * 0.9;
		
		if(standardMass-1 > mass)// 저체중
		{
			massResult = "저체중"; 
		}
		else if(standardMass+1 < mass)//과체중
		{
			massResult = "과체중"; 
		}
		else
		{
			massResult = "표준체중"; 
		}
		System.out.printf("표준체중은 %.2f 입니다.\n고로 당신은 %s입니다.", standardMass, massResult);
		
		
	}
	
	
	// 4-3 문제4
	public void example15()
	{
		Scanner sc = new Scanner(System.in);
	}
	
	
	//4-4 추가문제
	public void example16()
	{
		Scanner sc = new Scanner(System.in);
		double tall, mass, bmi;
		String bmiResult;
		System.out.print("신장(cm)을 입력하세요 :");
		tall = sc.nextDouble();
		
		System.out.print("체중(kg)을 입력하세요 :");
		mass = sc.nextDouble();
		
		bmi = mass/(tall*tall * 0.01);
		if(bmi<18.5)
		{
			bmiResult = "저체중";
		}
		else if (18.5<=bmi && bmi<23 )
		{
			bmiResult = "정상체중";
		}
		else if (23<=bmi && bmi<25 )
		{
			bmiResult = "과체중";
		}
		else if (25<=bmi && bmi<30 )
		{
			bmiResult = "비만";
		}
		else 
		{
			bmiResult = "고도비만";
		}
		
		
		System.out.printf("BMI(체질량 지수)는 %f 이므로 %s입니다.",bmi, bmiResult );
	}
	
	public void PsyTest()
	{
		Scanner sc = new Scanner(System.in);
		final String LION = "사자";
		final String MONKEY = "원숭이";
		final String COW = "소";
		final String HORSE = "말";
		final String SHEEP = "양";
		
		String animal ="";
		char answer;
		System.out.println("===== 사막 동물 심리테스트 =====");
		System.out.println("당신은 지금 사막에 홀로 있습니다\n"
				+ "당신은 사자, 원숭이, 소, 말, 양 이렇게\n 다섯마리의 동물과 사막을 건너야 합니다.\n"
				+ "그런데 너무 지치고 힘들어서 \n 모든 동물을 다 데리고 가지 못하게 되었어요\n"
				+ "5마리의 동물 중 1마리씩 버려야 하는데요,\n 여러분은 어떤 동물을 먼저 사막에 버리시겠습니까?\n "
				+ "사자 (a), 원숭이(b), 소(c), 말(d), 양(e)\n"
				);
		System.out.print("가장 먼저 버릴 동물은?");
		answer = sc.next().charAt(0);
		
		if(answer=='a') animal = LION;
		else if(answer=='b') animal = MONKEY;
		else if(answer=='c') animal = COW;
		else if(answer=='d') animal = HORSE;
		else if(answer=='e') animal = SHEEP;
		
		System.out.printf("가장먼저 %s를 버렸습니다.",animal );
		
		System.out.print("그 다음 버릴 동물은?");
		answer = sc.next().charAt(0);
		
		if(answer=='a') animal = LION;
		else if(answer=='b') animal = MONKEY;
		else if(answer=='c') animal = COW;
		else if(answer=='d') animal = HORSE;
		else if(answer=='e') animal = SHEEP;
		
		System.out.printf("두번째로 %s를 버렸습니다.",animal );
		
		System.out.print("그 다음 버릴 동물은?");
		answer = sc.next().charAt(0);
		
		if(answer=='a') animal = LION;
		else if(answer=='b') animal = MONKEY;
		else if(answer=='c') animal = COW;
		else if(answer=='d') animal = HORSE;
		else if(answer=='e') animal = SHEEP;
		
		System.out.printf("세번째로 %s를 버렸습니다.",animal );
		
		System.out.print("그 다음 버릴 동물은?");
		answer = sc.next().charAt(0);
		
		if(answer=='a') animal = LION;
		else if(answer=='b') animal = MONKEY;
		else if(answer=='c') animal = COW;
		else if(answer=='d') animal = HORSE;
		else if(answer=='e') animal = SHEEP;
		
		System.out.printf("네번째로 %s를 버렸습니다.",animal );
		
		System.out.print("마지막으로 버릴 동물은?");
		answer = sc.next().charAt(0);
		
		if(answer=='a') animal = LION;
		else if(answer=='b') animal = MONKEY;
		else if(answer=='c') animal = COW;
		else if(answer=='d') animal = HORSE;
		else if(answer=='e') animal = SHEEP;
		
		System.out.printf("마지막으로 %s를 버렸습니다.",animal );
		
		System.out.printf("\n\n ============결과============\n\n",animal );
		
		
		System.out.println("이 질문은 여러분이 힘든 상황에 닥쳤을 때,\n" + 
				"가장 먼저 포기하게 되는 것이 무엇인지를 알아보는 심리테스트 입니다.\n"
				+ "각각의 동물이 의미하는 바는\n"
				+ "1.사자=자존심 / 2.말=가족 / 3.소=직업 / 4.양=사랑 / 5.원숭이=친구\n"
				+ "다음과 같습니다.");
	}
	
}
