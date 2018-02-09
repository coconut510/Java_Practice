package kh.rantest.game;
import java.util.*;
public class GameFunc {
	public void coinFaceChoice()
	{
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("===동전 앞 뒤 맞추기===");
		int playerChoice = 0;
		int coinFace = 0;
		int winCount = 0;
		int loseCount = 0;
		while(true)
		{
			System.out.print("숫자를 입력해주세요(1.앞면/2.뒷면) ");
			playerChoice = sc.nextInt();
			if(playerChoice!=1 && playerChoice!=2)
			{
				System.out.println("선택지 중에서 골라주세요.");
				continue;
			}
			coinFace = r.nextInt(2)+1;
		
			if(coinFace==playerChoice) 
			{				
				System.out.println("맞췄습니다!");
				winCount+=1;
			}
			else
			{
				System.out.println("땡 틀렸습니다!");
				loseCount +=1;
			}
			
			delay(300);
			
			System.out.printf("%d전 %d승 %d패, 승률 %.2f",
					winCount+loseCount, winCount, loseCount,(double) winCount/(winCount + loseCount) *100);
			
			
			System.out.println("\n\n-----------Restart-----------\n\n");			
			
		}		
		
	}
	public void coinBatting()
	{
		int myMoney = 2000;
		final int originMoney = myMoney;
		int battingPrice =0;
		int goMultiple = 2;
		int coinFace = 0;
		int playerChoice = 0;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("<<동전 앞○/뒤● 맞추기>>");
		while(true)
		{
			System.out.printf("배팅하세요<현재 소지금 : %d 배당금 : %d 배>\n카지노를 나가려면 배팅을 0원으로 하세요 \n", myMoney,goMultiple);
			System.out.print("배팅금을 입력하세요 ");
			battingPrice = sc.nextInt();		
			
			if(battingPrice==0)
			{
				if(myMoney-originMoney>0)System.out.printf("%d원을 따고 카지노를 떠납니다.",myMoney-originMoney);
				else System.out.printf("%d원을 잃고 카지노를 떠납니다.",originMoney-myMoney);
				break;
			}
			if(battingPrice>myMoney)
			{
				System.out.println("현재 소지금보다 배당금이 많습니다. 다시 배당금을 입력해주세요");
				continue;
			}
			if(battingPrice<0)
			{
				System.out.println("ㄷㄷ 기부 하시게요?");
				continue;
			}
			
			System.out.print("동전 앞뒤를 선택하세요 <1.앞○/2.뒤●> : ");
			playerChoice = sc.nextInt();
			
			if(playerChoice!=1 && playerChoice!=2)
			{
				System.out.println("선택지 중에서 골라주세요.");
				continue;
			}
			
			
			
			
			
			coinFace = r.nextInt(2)+1;
			waitCoinResult(coinFace);
			
		
			
			if(coinFace==playerChoice)
			{			
				System.out.printf("%d원의 배팅금 %d배의 배당률로  %d원을 땄습니다.\n",battingPrice, goMultiple, battingPrice*goMultiple );
				myMoney +=(battingPrice*goMultiple);
				
				
				goMultiple+=1;
				System.out.printf("배당률이 %d배로 올랐습니다.\n",goMultiple);
			
				System.out.printf("\n\n <<<현재 소지금 %d원>>>", myMoney);
			}
			else
			{
				goMultiple = 2;
				System.out.printf("%d원으로 배팅해서 잃었습니다 \n 배팅률은 2배로 초기화됩니다.",battingPrice);
				myMoney -=battingPrice;
				System.out.printf("\n\n <<<현재 소지금 %d원>>>", myMoney);
				
				
				if(myMoney<=0)
				{
					System.out.println("올인당했습니다. ㄷㄷ");
					return;
				}
			}
			
			System.out.println("\n\n-----------Restart-----------\n\n");		
			
		}
	}
	
	public void waitCoinResult(int coinNum)
	{
		System.out.println("코인 보는중..");
		for(int i = 0; i<6+coinNum;i++)
		{			
			if(i%2==0)System.out.println("○");
			else System.out.println("●");
			
			if(i==(5+coinNum)) System.out.print("<<최종 결과");
			delay(90);
		}
		System.out.println();
	}
	
	
	public void rockScissorsPaper()
	{
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int playerHand =0;
		int computerHand = 0;
		
		int win=0;
		int lose = 0;
		int draw = 0;
		int resultState =0;
		
		String playerResult ="";
		String computerResult = "";				
		
		System.out.println("== 가위/바위/보 ==");
		while(true)
		{
			System.out.print("선택하세요 <1.가위/2.바위/3.보>\n(종료하려면 0을 누르세요)");
			playerHand = sc.nextInt();
			
			if(playerHand==0)
			{
				System.out.println("프로그램을 종료합니다");
				break;
			}
				
			
			if(playerHand!=1 && playerHand!=2 && playerHand!=3 )
			{
				System.out.println("선택지 중에 선택해주세요.");
				continue;
			}
			switch(playerHand)
			{
				case 1: playerResult = "가위"; break;
				case 2:	playerResult = "바위"; break;
				case 3:	playerResult = "보"; break;
			}			
			
			// 컴퓨터 연산
			computerHand = r.nextInt(3)+1;
			switch(computerHand)
			{
				case 1: computerResult = "가위"; break;
				case 2:	computerResult = "바위"; break;
				case 3:	computerResult = "보"; break;
			}
			
			System.out.printf("사용자는 %s를 냈습니다.\n",playerResult );
			System.out.printf("컴퓨터는 %s를 냈습니다.\n",computerResult );
			
			if(playerHand==computerHand)
			{
				draw+=1;	
				resultState = 2;
			}
			else
			{
				if((playerHand==1&& computerHand==2) ||(playerHand==2 &&computerHand==3) ||(playerHand==3 &&computerHand==1))
				{
					lose+=1;
					resultState = 1;
				}
				else 
				{
					win +=1; 
					resultState = 0;
				}			
			}
			
			System.out.println("\n=====결과=====");
			switch(resultState)
			{
				case 0: System.out.println("<<<<이겼습니다!>>>>"); break;
				case 1: System.out.println("<<<<졌습니다.>>>>"); break;
				case 2: System.out.println("<<<<비겼습니다!>>>>"); break;			
			}
			System.out.println();
			
			System.out.printf("현재 %d전 %d승 %d무 %d패 입니다.\n\n",
					win+lose+draw, win, draw, lose);
			
			System.out.println("\n=====새 게임=====");									
		}
	}
	
	
	public void rockSissorsPaperVer2()
	{
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("===묵찌빠ver2.0===");
		int pHand = 0;
		int cHand = 0;
		
		int win = 0;
		int lose = 0;
		int draw = 0;
		int resultState = 0;
		
		int rcState = 0;// 0: 가위바위보. 1: 묵찌빠.게임스테이트
		
		String pHandStr = "";
		String cHandStr = "";
		
		while(true)// while문에 가위바위보, 묵찌빠 루프 상태를 나눠줬음.
		{
			if(rcState==0)// 가위바위보일때.
			{
				System.out.println("\n\n\n우선 가위바위보를 합시다.");
				System.out.println("1.가위 / 2. 바위 / 3.보");
				System.out.println("종료하시려면 0을 누르세요.");
				System.out.print("선택");
				pHand = sc.nextInt();
				
				if(pHand==0)
				{
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				
				if(pHand!=1&&pHand!=2&&pHand!=3)
				{
					System.out.println("선택지 중에서 선택하세요.");
					break;
				}
				
				switch(pHand)
				{
					case 1: pHandStr = "가위"; break;
					case 2:	pHandStr = "바위"; break;
					case 3:	pHandStr = "보"; break;
				}
				
				
				// 컴퓨터 연산
				cHand = r.nextInt(3)+1;
				switch(cHand)
				{
					case 1: cHandStr = "가위"; break;
					case 2:	cHandStr = "바위"; break;
					case 3:	cHandStr = "보"; break;
				}
				
				System.out.printf("사용자는 %s를 냈습니다.\n",pHandStr );
				System.out.printf("컴퓨터는 %s를 냈습니다.\n",cHandStr );
				
				if(pHandStr==cHandStr) 
					resultState = 2;
				else
				{
					if((pHand==1&& cHand==2) ||(pHand==2 &&cHand==3) || (pHand==3 &&cHand==1)) 
					     resultState = 1;
	
					else resultState = 0;
			
				}
				
				System.out.println("------ 공 격 권 ------");
				switch(resultState) {
					case 0: System.out.println("이겼습니다.플레이어가 공격권을 가져옵니다.");
					System.out.println("\n\n\n당신의 공격입니다.");
					break;// 이겼을때.
					case 1: System.out.println("졌습니다. 컴퓨터가 공격권을 가져갑니다.");
					System.out.println("\n\n\n컴퓨터의 공격입니다.");
					break;// 졌을때.
					case 2: System.out.println("비겼습니다. 다시 가위바위보\n\n"); continue;// 비겼을때.
				}
	
				
				rcState =1;// 묵찌빠 상태로 변경.
			}
			else// 묵찌빠 상태일때.
			{
				System.out.println("1.묵/2.찌/3.빠");
				System.out.print("선택");
				pHand = sc.nextInt();
				
				if(pHand!=1&&pHand!=2&&pHand!=3)
				{
					System.out.println("선택지 중에서 선택하세요.");
					rcState =1;// 묵찌빠 상태로 변경.
					continue;
				}
				// 유저가 낸거.
				switch(pHand)
				{
					case 1:	pHandStr = "묵"; break;
					case 2: pHandStr = "찌"; break;					
					case 3:	pHandStr = "빠"; break;
				}
				
				cHand = r.nextInt(3)+1;
				// 컴퓨터가 낸거.
				switch(cHand)
				{
					case 1:	cHandStr = "묵"; break;
					case 2: cHandStr = "찌"; break;					
					case 3:	cHandStr = "빠"; break;
				}
				// 좀 기다렸다가.
				delay(300);
				
				if(resultState==0)// 내가 선공일때.
				{
					System.out.printf("당신 : %s\n",pHandStr );
					delay(100);
					System.out.printf("컴푸터 : %s\n",cHandStr );
				}
				else  // 컴퓨터가 선공일때.
				{				
					System.out.printf("컴푸터 : %s\n",cHandStr );
					delay(100);
					System.out.printf("당신 : %s\n",pHandStr );					
				}
				
				System.out.println("\n\n====결과====");
				
				if(pHand==cHand)// 누군가 이겼을때.
				{
					switch(resultState)
					{
						case 0: System.out.println("당신의 승리!!");break;// 내가 선공이었을때.
						case 1: System.out.println("컴퓨터의 승리!!");break;// 컴터가 선공이었을때.
					}				
					rcState = 0;
				}
				else
				{
					// 졌을때.
					if((pHand==1&& cHand==3) ||(pHand==2 &&cHand==1) || (pHand==3 &&cHand==2)) 
					{
						System.out.println("컴퓨터가 선공을 가져갑니다.");
						resultState =1;									
					}
					else
					{
						System.out.println("당신이 선공을 가져갑니다.");
						resultState =0;	
					}
					rcState = 1;
					continue;
				}
				// 묵찌빠가 끝났을때.
				if(rcState==0)
				{
					System.out.print("계속하시겠습니까? (y/n)");
					char q = sc.next().charAt(0);
					if(q=='y') continue;
					else break;
				}							
			}					
		}		
	}
	
	public void delay(int sec)
	{
		try {
			Thread.sleep(sec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void upDownGameEasy()
	{
		int playerNum = 0;
		int goalNum = 0;
		int answerCount = 0;
		boolean chk = true;
		System.out.println("=== Up & Down ===");
		System.out.println("이 게임은 1~100 사이의 수 하나를 맞추는 게임입니다.");
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("<<Game Start>>");
		
		while(true) 
		{
			if(chk)
			{
				goalNum = r.nextInt(100)+1;//1~100까지.
				System.out.println(goalNum + "목표점수");
				chk = false;
			}
			System.out.print("숫자를 입력해주세요.");
			playerNum = sc.nextInt();
			
			if(goalNum > playerNum) 
			{
				System.out.println("\nUP!!\n");
				answerCount+=1;
				continue;
			}
			else if(goalNum < playerNum)
			{
				System.out.println("\nDOWN!!\n");
				answerCount+=1;
				continue;
			}
			else 
			{
				System.out.println("정답입니다.");
				System.out.printf("%d번 만에 맞췄습니다.", answerCount);
			}			
			
		}
	}
	
	
	public void upDownGameNormal()
	{
		int playerNum = 0;
		int comNum = 0;
		int goalNum = 0;
		int answerCount = 0;
		boolean chk = true;
		int turnChk = 0;
		String turnName = "";
		System.out.println("=== Up & Down ===");
		System.out.println("이 게임은 1~100 사이의 수 하나를 맞추는 게임입니다.");
		System.out.println("0을 입력하면 게임을 종료합니다.");
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<<Game Start>>");
		
		
		int tempNum =0;
		while(true)
		{
			if(chk)
			{
				goalNum = r.nextInt(100)+1;//1~100까지.
				chk = false;
				turnChk = 0;
			}
			
			// 사용자 턴.
			if(turnChk==0) 
			{
				System.out.println("<<User Turn>>");
				System.out.print("숫자를 입력해주세요.(user)");
				playerNum = sc.nextInt();
				if(playerNum==0)
				{
					System.out.println("게임을 종료합니다.");
					break;
				}
				if(playerNum<0&&playerNum>100)
				{
					System.out.println("1~100까지 숫자를 입력해주세요!");
					continue;
				}
				tempNum = playerNum;	
				turnChk =1;				
			}
			else
			{
				System.out.println("<<Computer Turn>>");
				comNum = r.nextInt(100)+1;// 난수 생성.
				System.out.printf("숫자를 입력해주세요.(com) %d  \n",comNum);
			
				tempNum = comNum;
				turnChk =0;				
			}
			
			if(goalNum > tempNum) 
			{
				System.out.println("\nUP!!\n");
				answerCount+=1;
				continue;
			}
			else if(goalNum < tempNum)
			{
				delay(300);
				System.out.println("\nDOWN!!\n");
				answerCount+=1;
				continue;
			}
			else 
			{
				turnName = (turnChk==1)?"유저":"컴퓨터";
				System.out.printf("%s가 정답을 %d번만에 맞췄습니다.\n\n\n\n" ,turnName,answerCount);
				
				System.out.println("새 게임 시작!");
				chk = true; // 새로 점수 해놓으라고.
				turnChk = 2;// 턴 페이즈 초기화.
			}		
			
		}
	}
	public void upDownGameAI()
	{
		int playerNum = 0;
		int comNum = 0;
		int goalNum = 0;
		int answerCount = 0;
		boolean chk = true;
		int turnChk = 0;
		
		
		int min = 1;
		int max = 100;
		String turnName = "";
		System.out.println("=== Up & Down ===");
		System.out.println("이 게임은 1~100 사이의 수 하나를 맞추는 게임입니다.");
		System.out.println("0을 입력하면 게임을 종료합니다.");
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<<Game Start>>");
		
		
		int tempNum =0;
		while(true)
		{
			if(chk)
			{
				goalNum = r.nextInt(100)+1;//1~100까지.
				chk = false;
				turnChk = 0;
			}
			
			// 사용자 턴.
			if(turnChk==0) 
			{
				System.out.println("<<User Turn>>");
				System.out.printf("숫자를 입력해주세요.(user %d~%d) ", min, max);
				playerNum = sc.nextInt();
				if(playerNum==0)
				{
					System.out.println("게임을 종료합니다.");
					break;
				}
				if(playerNum<0&&playerNum>100)
				{
					System.out.println("1~100까지 숫자를 입력해주세요!");
					continue;
				}
				tempNum = playerNum;	
				turnChk =1;				
			}
			else// 컴퓨터 턴일때.
			{
				System.out.println("<<Computer Turn>>");
				int standNum = max - min;
				//최대값 - 최소값을 난수 범위로 지정하고 최소값을 새로 더해주면 최소~최대값 범위를 구할수 있음.
				comNum = r.nextInt(standNum)+min;// 난수 생성.
				System.out.printf("숫자를 입력해주세요.(com %d~%d ) %d  \n", min, max, comNum);
			
				tempNum = comNum;
				turnChk =0;				
			}
			
			if(goalNum > tempNum) 
			{
				System.out.println("\nUP!!\n");
				if(tempNum>min)
				{
					min = tempNum;
				}
				answerCount+=1;
				continue;
			}
			else if(goalNum < tempNum)
			{
				if(tempNum<max)
				{
					max = tempNum;
				}
				delay(300);
				System.out.println("\nDOWN!!\n");
				answerCount+=1;
				continue;
			}
			else 
			{
				turnName = (turnChk==1)?"유저":"컴퓨터";
				System.out.printf("%s가 정답을 %d번만에 맞췄습니다.\n\n\n\n" ,turnName,answerCount);
				// 최대최소 초기화.
				min = 1;
				max = 100;
				System.out.println("새 게임 시작!");
				chk = true; // 새로 점수 해놓으라고.
				turnChk = 2;// 턴 페이즈 초기화.
			}					
		}
	}
}
