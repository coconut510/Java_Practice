package kh.practice.example;

import java.util.Scanner;

public class ExampleList {
	public void example01()
	{
		Scanner sc = new Scanner(System.in);// 스캐너 클래스를 생성한다.
		int select;// switch에서 분기해줄 정수형 변수를 선언한다.
		System.out.print("1~3까지 숫자 입력 : ");// 사용자가 입력할 조건 멘트를 출력한다.
		select = sc.nextInt();// switch문에 사용할 정수형 변수를 사용자가 입력한다.
		switch(select)  // 사용자가 입력한 정수로 조건식을 고를수 있게 한다.
		{
			case 1: 
				System.out.println("1 을 입력하였습니다.");// 1을 입력했을때 출력하는 멘트
			//break;
			case 2: 
				System.out.println("2 을 입력하였습니다.");// 2를 입력했을때 출력하는 멘트
			//break;
			case 3: 
				System.out.println("3 을 입력하였습니다.");// 3를 입력했을때 출력하는 멘트
			//break;
			default: System.out.println("잘못된 값을 입력하였습니다.");//1~3 이외에 입력했을때 출력하는 멘트
				
		
		}
	}
	
	public void example02()
	{
		Scanner sc = new Scanner(System.in);// 스캐너 클래스를 생성해 준다.
		
		System.out.print("구매할 과일을 입력해 주세요.");  //사용자가 입력할 변수에 대한 멘트를 출력해준다.
		String flute = sc.nextLine();// 과일 문자열 변수에 사용자가 입력한값을 저장해준다.
		
		// 메뉴판 정보.
		System.out.print("사과 - 1000원\n바나나 - 3000원\n복숭아 - 2000원\n키위 - 5000원\n");
		
		switch(flute)// switch 변수에 사용자가 입력한 변수값을 할당해준다.
		{
			case "사과":// 사용자가 사과를 입력했을때.
				System.out.printf("%s의 가격은 1000원 입니다.", flute);// 사과의 가격을 출력.
			break;
			case "바나나":// 사용자가 바나나를 입력했을때.
				System.out.printf("%s의 가격은 3000원 입니다.", flute);// 바나나의 가격을 출력.
				break;
			case "복숭아":// 사용자가 복숭아를 입력했을때.
				System.out.printf("%s의 가격은 2000원 입니다.", flute);// 복숭아의 가격을 출력.
				break;
			case "키위":// 사용자가 키위를 입력했을때.
				System.out.printf("%s의 가격은 5000원 입니다.", flute);// 키위의 가격을 출력.
				break;
		}
	}
	
	public void example03()
	{
		Scanner sc = new Scanner(System.in);// 스캐너 클래스를 생성해준다.
		System.out.print("번호입력 : ");// 사용자가 입력해주는 변수에 대한 멘트를 출력.
		int num = sc.nextInt();// 정할 메뉴 번호를 담을 변수를 사용자가 입력해준다.
		
		// 메뉴 설명.
		System.out.print("*****초기 메뉴*****\n"
						+ "1.입력\n"
						+ "2.수정\n"
						+ "3.조회\n"
						+ "4.삭제\n"
						+ "0.종료\n"
						+ "****************\n");
		
		switch(num)// 사용자가 입력한 변수로 분기해준다.
		{
			case 1:// 1을 입력했을때.
				 System.out.println("입력메뉴선택");// 해당 멘트 출력.
				break;
			case 2:// 2를 입력했을때.
				 System.out.println("수정메뉴선택");// 해당 멘트 출력.
				break;
			case 3:// 3을 입력했을때.
				 System.out.println("조회메뉴선택");// 해당 멘트 출력.
				break;
			case 4:// 4를 입력했을때.
				 System.out.println("삭제메뉴선택");// 해당 멘트 출력.
				break;
			case 0:// 0을 입력했을때.
				 System.out.println("프로그램을 종료합니다.");// 해당 멘트 출력.
				break;
			default:// 메뉴 이외의 값을 입력했을 때.
				 System.out.println("번호를 잘못 누르셨습니다. 프로그램 종료합니다.");
				
		}
	}
	
	public void example04()
	{
		Scanner sc = new Scanner(System.in);// 스캐너 클래스 생성.
		String burgerMenu="";// 버거 메뉴 이름 저장할 변수.
		String sideMenu ="";// 사이드 메뉴 이름 저장해줄 변수.

		int cost =0;// 총계(버거 + 사이드 메뉴 가격)을 저장해줄 변수.
		// 주메뉴팔 출력.
		System.out.print("*****주 메뉴*****\n"
						+ "a.불고기 버거 ------5000\n"
						+ "b.새우 버거 -------4000\n"
						+ "c.치킨 버거 -------4500\n"
						+ "d.한우 버거 -------10000\n"
						+ "e.디버거 ---------7000\n"
						+ "****************\n");
		
		System.out.print("햄버거를 골라주세요 : ");// 사용자가 입력할 변수에 대한 안내 멘트 출력.
		char burgerChar = sc.next().charAt(0);// a~e 한글자이므로 캐릭터 형으로 출력.
		switch(burgerChar)// 사용자가 입력한 burgerChar로 해당되는 조건식으로 간다.
		{
			case 'a': //a 를 입력했을때.
				burgerMenu = "불고기 버거";// 이름 저장해주는 변수에 버거이름 대입.
				cost+= 5000;// 가격 추가.
				break;
			case 'b': // b 를 입력했을때.
				burgerMenu = "새우 버거";// 이름 저장해주는 변수에 버거이름 대입.
				cost+= 4000;// 가격 추가.
				break;
			case 'c': //c 를 입력했을때.
				burgerMenu = "치킨 버거";// 이름 저장해주는 변수에 버거이름 대입.
				cost+= 4500;// 가격 추가.
				break;
			case 'd': //d 를 입력했을때.
				burgerMenu = "한우 버거";// 이름 저장해주는 변수에 버거이름 대입.
				cost+= 10000;// 가격 추가.
				break;
			case 'e': //e 를 입력했을때.
				burgerMenu = "디버거";// 이름 저장해주는 변수에 버거이름 대입.
				cost+= 7000;// 가격 추가.
				break;
			default: // 이외의값을 출력했을때. case에 해당하지 않은 모든 조건들일때 출력해준다.
				System.out.println("메뉴를 잘못 누르셨습니다. 영업을 종료합니다.");// 멘트
				return ;// 프로그램 종료.
//				System.exit(0);// 프로그램 종료.
		}
		
		// 사이드 메뉴 항목 출력.
		System.out.print("*****사이드 메뉴*****\n"
						+ "1.콜라 ------1500\n"
						+ "2.사이다 -------1500\n"
						+ "3.밀크쉐이드 -------2500\n"
						+ "4.레드불 -------3000\n"
						+ "******************\n");
		
		System.out.print("사이드 메뉴를 골라주세요.");// 사용자가 입력할 값에 대한 정보 멘트 출력.
		int sideMenuNum = sc.nextInt();//1~4 사이드 메뉴 번호를 입력받을 변수.
		
		switch(sideMenuNum)  // 입력받은 사이드 메뉴 번호로 조건식을 출력.
		{
			case 1 : // 1을 입력했을때.
				sideMenu = "콜라";// 사이드 메뉴이름을 저장하는 변수에 이름을 저장해준다.
				cost += 1500;// 가격추가
				break;
			case 2 :// 2를 입력했을때.
				sideMenu = "사이다";// 사이드 메뉴이름을 저장하는 변수에 이름을 저장해준다.
				cost += 1500;// 가격추가
			break;
			case 3 :// 3을 입력했을때.
				sideMenu = "밀크쉐이크";// 사이드 메뉴이름을 저장하는 변수에 이름을 저장해준다.
				cost += 2500;// 가격추가
			break;
			case 4 :// 4를 입력했을때.
				sideMenu = "레드불";// 사이드 메뉴이름을 저장하는 변수에 이름을 저장해준다.
				cost += 3000;// 가격추가
			break;
			default: // 이외의 값을 입력했을때.
				System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");// 멘트 출력
				return ;// 프로그램 종료.
//				System.exit(0);// 프로그램 종료.
		}
		
		//고른 메인메뉴, 사이드 메뉴, 가격을 출력해준다.
		System.out.printf("%s, %s은 총 %d원입니다.", burgerMenu, sideMenu, cost);
		
	}
	
	public void example05()
	{
		Scanner sc = new Scanner(System.in);// 스캐너 클래스 생성.
		System.out.print("일수를 알고싶은 달을 입력하세요 : ");//사용자가 입력할 변수에 대한 안내 멘트.
		int month = sc.nextInt();// 일수를 알고싶은 달을 입력받는다.
		
		switch(month)// 입력한 달에대한 분기.
		{
			case 2: System.out.printf("%d월달은 28 일수 입니다.",month);//2월은 28일.			
				break;
			case 4 : case 6: case 9: case 11: // 4,6,9,11을 30일
					System.out.printf("%d월달은 30 일수 입니다.",month);
				break;
			default : System.out.printf("%d월달은 31 일수 입니다.",month);// 이외에는 모두 31일
		}
	}
	
	public void example06()
	{
		Scanner sc = new Scanner(System.in);// 스캐너 클래스를 생성
		
		System.out.print("===계산기 프로그램===\n"
				+ "연산자 입력(+,-,*,/)");// 프로그램 제목.
		
		int num1 = 0; // 첫번째 입력받을 숫자 변수, 조건식 안에 있으므로 최초 초기화 .
		int num2 = 0; // 두번째 입력받을 숫자 변수, 조건식 안에 있으므로 최초 초기화 .
		char op = sc.next().charAt(0);// 연산자를 입력받는다.
		
		if(op=='+' || op=='-'|| op=='*' || op=='/') // 해당 연산자일때만 switch문 안으로 들어가도록
		{		
			System.out.print("첫번째 숫자 입력 : ");	// 첫번째 숫자 입력	
			num1= sc.nextInt();
			
			System.out.print("두번째 숫자 입력 : ");// 두번째 숫자 입력
			num2= sc.nextInt();
			
			System.out.println("=====결과=====");
			
			switch(op)//사용자가 입력한 연산자로 분기.
			{
				case '+'://+를 선택했을때.
					System.out.printf("%d %c %d = %d", num1, op, num2, num1 + num2);
					break;
				case '-'://-를 선택했을때.
					System.out.printf("%d %c %d = %d", num1, op, num2, num1 - num2);
					break;
				case '*'://*를 선택했을때.
					System.out.printf("%d %c %d = %d", num1, op, num2, num1 * num2);
					break;
				case '/':// /를 선택했을때.
					System.out.printf("%d %c %d = %.2f", num1, op, num2, (double)num1 / num2);
					break;				
			}	
		}
		else // 지원하는 연산자가 아닐때 멘트 출력.
		{
			System.out.printf("잘못된 연산자를 입력했습니다. %c는 연산 할 수 없습니다." , op);	
			return;// 프로그램 종료.
		}
			 
		
		
		
		
	}
	
	public void example07()
	{
		Scanner sc = new Scanner(System.in);// 스캐너 클래스 생성자.
		
		int orderNum  =0;// 주문 번호 변수 선언 및 초기화.
		
		
		//메뉴 표시.
		System.out.print("********메 뉴********\n"
				+ "1.떡볶이 -----------1000\n"
				+ "2.김밥 -----------2000\n"
				+ "3.오뎅 -----------1000\n"
				+ "4.순대 -----------2000\n"
				+ "5.튀김 -----------3000\n"
				+ "6.떡튀순 ----------8000\n"
				+ "************************\n");
		
		System.out.print("주문 번호 입력 : ");// 사용자가 입력할 변수에 대한 정보 멘트.
		orderNum = sc.nextInt();//사용자 입력하는 정보.
		
		switch(orderNum)// 사용자가 주문한 번호로 분기.
		{
			case 1:// 1을 입력했을때.
				System.out.println("떡볶이는 1000원 입니다.");
				break;
			case 2:// 2을 입력했을때.
				System.out.println("김밥은 2000원 입니다.");
			break;
			case 3:// 3을 입력했을때.
				System.out.println("오뎅은 1000원 입니다.");
			break;
			case 4:// 4을 입력했을때.
				System.out.println("순대는 2000원 입니다.");
			break;
			case 5:// 5을 입력했을때.
				System.out.println("튀김은 3000원 입니다.");
			break;
			case 6:// 6을 입력했을때.
				System.out.println("떡튀순은 8000원 입니다.");
				break;
			default :// 이외의 값을 입력했을때.
				System.out.println("번호가 잘못 입력되었습니다.");
		}
		
		
	}
	
	public void example08()
	{
		Scanner sc = new Scanner(System.in);// 스캐너 클래스를 생성
		char grade;// 등급 변수 선언.
		System.out.println("장학금 지불 시스템 입니다.");// 프로그램 이름 
		System.out.print("학생 학점을 입력해주세요.\n(A학점, B학적,C학점,D학점,E학점)\n");		
		// 사용자가 입력할 변수 정보에 대한 멘트.
		
		System.out.print("입력 : ");// 사용자가 입력할 변수 정보에 대한 멘트2.
		grade = sc.next().charAt(0);// 등급 입력.
		
		switch(grade)// 등급으로 switch 분기.
		{
			case 'A'://A입력했을때.
				System.out.println("수고하셨습니다. 장학금을 100% 지급해드리겠습니다.");
				break;
			case 'B'://B입력했을때.
				System.out.println("약간 아쉽네요. 장학금을 50% 지급해드리겠습니다.");
			break;
			case 'C'://C입력했을때.
				System.out.println("이번 학기 장학금은 없네요... 힘내세요");
			break;
			case 'D'://D입력했을때.
				System.out.println("장학금보다는 학고는 면하셨네요.. 노력하세요");
			break;
			case 'E'://E입력했을때.
				System.out.println("이번학기 장학금으로 학고를 맞으셨습니다 3GO일시 제적");
			break;		
		}
		
	}
	
	public void example09()
	{
		Scanner sc = new Scanner(System.in);// 스캐너 클래스 생성.
		System.out.print("점수 입력 :");// 사용자가 입력하는 변수에대한 정보 멘트.
		int score = sc.nextInt();// 점수 변수에 사용자 입력을 받아 저장한다.
		int scoreTemp = 0;// 임시적으로 점수를 저장해줄 변수.
		char grade = 'A';// 등급을 안내해줄 변수 선언 및 초기화.
		
		scoreTemp = (int)(score * 0.1);// 임시 점수에 0.1로 곱해줘서 10~1까지 출력되도록 변경해준다.
		if(0 <= score && score<=100) // 0~100 까지 변수에 있을때만 아래 조건문을 실행.
		{
			switch(scoreTemp)  // 0.1 곱해준 변수로 분기해준다.
			{
				case 10: case 9 ://9이상일때
					grade = 'A';
					break;
				case 8://8이상일때
					grade = 'B';
					break;
				case 7://7이상일때
					grade = 'C';
					break;
				case 6://6이상일때
					grade = 'D';
					break;					
				case 5://5이상일때
					grade = 'E';
					break;
				default : grade = 'F';// 이외일때.
			}
			System.out.printf("%d 점 ==> %c등급", score, grade);// 점수와 등급 표시.
		}
		else
		{
			System.out.println("잘못된 입력(0~100 사이 입력");// 범위 이외의 점수를 입력했을때.
		}
	}
}
