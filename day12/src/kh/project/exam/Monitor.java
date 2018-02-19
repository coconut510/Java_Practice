package kh.project.exam;

import java.util.Scanner;

public class Monitor {
	double inch;// 사이즈.
	int widthPixel;// 해상도.
	int heightPixel;
	String modelName;// 모델명.
	int price;// 가격.
	String company;// 제조회사.
	boolean power = false;// false면 off, true면 on.
	
	public void start()
	{
		Scanner sc = new Scanner(System.in);
		monitorInfoInsert();
		while(true) 
		{
			menu();
			int select = sc.nextInt();
			
			switch(select)
			{
				case 1:  powerBtn(); 	break;
				case 2:  monitorInfo();	break;
				case 3:  powerBtn(); 	break;
			}
		}
	}
	
	public void menu()
	{
		System.out.println("------모니터 제어 메뉴--------");
		System.out.println("1. 전원 on/off");
		System.out.println("2. 모니터 정보 보기");
		System.out.println("3. 출력");
		System.out.println("선택 : ");
	}
	
	public void monitorInfoInsert()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("사이즈를 입력하세요(단위 inch) : ");
		inch = sc.nextDouble();
		
		System.out.print("해상도를 입력하세요 (단위  pixel) : ");
		widthPixel  = sc.nextInt();
		
		 sc.nextLine();
		
		System.out.print("모델명을 입력하세요 : ");
		modelName  = sc.nextLine();
		
		System.out.print("가격을 입력하세요: ");
		price  = sc.nextInt();
		
		 sc.nextLine();
		
		System.out.print("제조회사를 입력하세요 : ");
		company  = sc.nextLine();
	}
	
	public void monitorInfo()
	{
		if(power) 
		{
			System.out.printf("-------- 모니터정보 --------\n");
			System.out.printf("- 사이즈:%.2f             -\n",inch);
			System.out.printf("- 해상도:%d               -\n",widthPixel);
			System.out.printf("- 모델명:%s               -\n",modelName);
			System.out.printf("- 가격:%d 원                                -\n",price);
			System.out.printf("- 제조회사:%s              -\n",company);
			System.out.printf("-------------------------\n");
		}
		else
		{
			System.out.println("현재 모니터가 off 상태입니다.");
			System.out.println("모니터 전원을 on 해주시고 실행해주세요.");
		}
	}
	
	public void print()
	{
		
	}
	
	
	public void powerBtn()
	{
		if(power==false)
		{
			System.out.println("전원이 on 되었습니다.");
			power = true;
		}
		else
		{
			System.out.println("전원이 off 되었습니다.");
			power = false;
		}
	}

}
