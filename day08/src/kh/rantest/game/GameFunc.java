package kh.rantest.game;
import java.util.*;
public class GameFunc {
	public void coinFaceChoice()
	{
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("===���� �� �� ���߱�===");
		int playerChoice = 0;
		int coinFace = 0;
		int winCount = 0;
		int loseCount = 0;
		while(true)
		{
			System.out.print("���ڸ� �Է����ּ���(1.�ո�/2.�޸�) ");
			playerChoice = sc.nextInt();
			if(playerChoice!=1 && playerChoice!=2)
			{
				System.out.println("������ �߿��� ����ּ���.");
				continue;
			}
			coinFace = r.nextInt(2)+1;
		
			if(coinFace==playerChoice) 
			{				
				System.out.println("������ϴ�!");
				winCount+=1;
			}
			else
			{
				System.out.println("�� Ʋ�Ƚ��ϴ�!");
				loseCount +=1;
			}
			
			delay(300);
			
			System.out.printf("%d�� %d�� %d��, �·� %.2f",
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
		System.out.println("<<���� �ա�/�ڡ� ���߱�>>");
		while(true)
		{
			System.out.printf("�����ϼ���<���� ������ : %d ���� : %d ��>\nī���븦 �������� ������ 0������ �ϼ��� \n", myMoney,goMultiple);
			System.out.print("���ñ��� �Է��ϼ��� ");
			battingPrice = sc.nextInt();		
			
			if(battingPrice==0)
			{
				if(myMoney-originMoney>0)System.out.printf("%d���� ���� ī���븦 �����ϴ�.",myMoney-originMoney);
				else System.out.printf("%d���� �Ұ� ī���븦 �����ϴ�.",originMoney-myMoney);
				break;
			}
			if(battingPrice>myMoney)
			{
				System.out.println("���� �����ݺ��� ������ �����ϴ�. �ٽ� ������ �Է����ּ���");
				continue;
			}
			if(battingPrice<0)
			{
				System.out.println("���� ��� �ϽðԿ�?");
				continue;
			}
			
			System.out.print("���� �յڸ� �����ϼ��� <1.�ա�/2.�ڡ�> : ");
			playerChoice = sc.nextInt();
			
			if(playerChoice!=1 && playerChoice!=2)
			{
				System.out.println("������ �߿��� ����ּ���.");
				continue;
			}
			
			
			
			
			
			coinFace = r.nextInt(2)+1;
			waitCoinResult(coinFace);
			
		
			
			if(coinFace==playerChoice)
			{			
				System.out.printf("%d���� ���ñ� %d���� ������  %d���� �����ϴ�.\n",battingPrice, goMultiple, battingPrice*goMultiple );
				myMoney +=(battingPrice*goMultiple);
				
				
				goMultiple+=1;
				System.out.printf("������ %d��� �ö����ϴ�.\n",goMultiple);
			
				System.out.printf("\n\n <<<���� ������ %d��>>>", myMoney);
			}
			else
			{
				goMultiple = 2;
				System.out.printf("%d������ �����ؼ� �Ҿ����ϴ� \n ���÷��� 2��� �ʱ�ȭ�˴ϴ�.",battingPrice);
				myMoney -=battingPrice;
				System.out.printf("\n\n <<<���� ������ %d��>>>", myMoney);
				
				
				if(myMoney<=0)
				{
					System.out.println("���δ��߽��ϴ�. ����");
					return;
				}
			}
			
			System.out.println("\n\n-----------Restart-----------\n\n");		
			
		}
	}
	
	public void waitCoinResult(int coinNum)
	{
		System.out.println("���� ������..");
		for(int i = 0; i<6+coinNum;i++)
		{			
			if(i%2==0)System.out.println("��");
			else System.out.println("��");
			
			if(i==(5+coinNum)) System.out.print("<<���� ���");
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
		
		System.out.println("== ����/����/�� ==");
		while(true)
		{
			System.out.print("�����ϼ��� <1.����/2.����/3.��>\n(�����Ϸ��� 0�� ��������)");
			playerHand = sc.nextInt();
			
			if(playerHand==0)
			{
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
				
			
			if(playerHand!=1 && playerHand!=2 && playerHand!=3 )
			{
				System.out.println("������ �߿� �������ּ���.");
				continue;
			}
			switch(playerHand)
			{
				case 1: playerResult = "����"; break;
				case 2:	playerResult = "����"; break;
				case 3:	playerResult = "��"; break;
			}			
			
			// ��ǻ�� ����
			computerHand = r.nextInt(3)+1;
			switch(computerHand)
			{
				case 1: computerResult = "����"; break;
				case 2:	computerResult = "����"; break;
				case 3:	computerResult = "��"; break;
			}
			
			System.out.printf("����ڴ� %s�� �½��ϴ�.\n",playerResult );
			System.out.printf("��ǻ�ʹ� %s�� �½��ϴ�.\n",computerResult );
			
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
			
			System.out.println("\n=====���=====");
			switch(resultState)
			{
				case 0: System.out.println("<<<<�̰���ϴ�!>>>>"); break;
				case 1: System.out.println("<<<<�����ϴ�.>>>>"); break;
				case 2: System.out.println("<<<<�����ϴ�!>>>>"); break;			
			}
			System.out.println();
			
			System.out.printf("���� %d�� %d�� %d�� %d�� �Դϴ�.\n\n",
					win+lose+draw, win, draw, lose);
			
			System.out.println("\n=====�� ����=====");									
		}
	}
	
	
	public void rockSissorsPaperVer2()
	{
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("===�����ver2.0===");
		int pHand = 0;
		int cHand = 0;
		
		int win = 0;
		int lose = 0;
		int draw = 0;
		int resultState = 0;
		
		int rcState = 0;// 0: ����������. 1: �����.���ӽ�����Ʈ
		
		String pHandStr = "";
		String cHandStr = "";
		
		while(true)// while���� ����������, ����� ���� ���¸� ��������.
		{
			if(rcState==0)// �����������϶�.
			{
				System.out.println("\n\n\n�켱 ������������ �սô�.");
				System.out.println("1.���� / 2. ���� / 3.��");
				System.out.println("�����Ͻ÷��� 0�� ��������.");
				System.out.print("����");
				pHand = sc.nextInt();
				
				if(pHand==0)
				{
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
				
				if(pHand!=1&&pHand!=2&&pHand!=3)
				{
					System.out.println("������ �߿��� �����ϼ���.");
					break;
				}
				
				switch(pHand)
				{
					case 1: pHandStr = "����"; break;
					case 2:	pHandStr = "����"; break;
					case 3:	pHandStr = "��"; break;
				}
				
				
				// ��ǻ�� ����
				cHand = r.nextInt(3)+1;
				switch(cHand)
				{
					case 1: cHandStr = "����"; break;
					case 2:	cHandStr = "����"; break;
					case 3:	cHandStr = "��"; break;
				}
				
				System.out.printf("����ڴ� %s�� �½��ϴ�.\n",pHandStr );
				System.out.printf("��ǻ�ʹ� %s�� �½��ϴ�.\n",cHandStr );
				
				if(pHandStr==cHandStr) 
					resultState = 2;
				else
				{
					if((pHand==1&& cHand==2) ||(pHand==2 &&cHand==3) || (pHand==3 &&cHand==1)) 
					     resultState = 1;
	
					else resultState = 0;
			
				}
				
				System.out.println("------ �� �� �� ------");
				switch(resultState) {
					case 0: System.out.println("�̰���ϴ�.�÷��̾ ���ݱ��� �����ɴϴ�.");
					System.out.println("\n\n\n����� �����Դϴ�.");
					break;// �̰�����.
					case 1: System.out.println("�����ϴ�. ��ǻ�Ͱ� ���ݱ��� �������ϴ�.");
					System.out.println("\n\n\n��ǻ���� �����Դϴ�.");
					break;// ������.
					case 2: System.out.println("�����ϴ�. �ٽ� ����������\n\n"); continue;// �������.
				}
	
				
				rcState =1;// ����� ���·� ����.
			}
			else// ����� �����϶�.
			{
				System.out.println("1.��/2.��/3.��");
				System.out.print("����");
				pHand = sc.nextInt();
				
				if(pHand!=1&&pHand!=2&&pHand!=3)
				{
					System.out.println("������ �߿��� �����ϼ���.");
					rcState =1;// ����� ���·� ����.
					continue;
				}
				// ������ ����.
				switch(pHand)
				{
					case 1:	pHandStr = "��"; break;
					case 2: pHandStr = "��"; break;					
					case 3:	pHandStr = "��"; break;
				}
				
				cHand = r.nextInt(3)+1;
				// ��ǻ�Ͱ� ����.
				switch(cHand)
				{
					case 1:	cHandStr = "��"; break;
					case 2: cHandStr = "��"; break;					
					case 3:	cHandStr = "��"; break;
				}
				// �� ��ٷȴٰ�.
				delay(300);
				
				if(resultState==0)// ���� �����϶�.
				{
					System.out.printf("��� : %s\n",pHandStr );
					delay(100);
					System.out.printf("��Ǫ�� : %s\n",cHandStr );
				}
				else  // ��ǻ�Ͱ� �����϶�.
				{				
					System.out.printf("��Ǫ�� : %s\n",cHandStr );
					delay(100);
					System.out.printf("��� : %s\n",pHandStr );					
				}
				
				System.out.println("\n\n====���====");
				
				if(pHand==cHand)// ������ �̰�����.
				{
					switch(resultState)
					{
						case 0: System.out.println("����� �¸�!!");break;// ���� �����̾�����.
						case 1: System.out.println("��ǻ���� �¸�!!");break;// ���Ͱ� �����̾�����.
					}				
					rcState = 0;
				}
				else
				{
					// ������.
					if((pHand==1&& cHand==3) ||(pHand==2 &&cHand==1) || (pHand==3 &&cHand==2)) 
					{
						System.out.println("��ǻ�Ͱ� ������ �������ϴ�.");
						resultState =1;									
					}
					else
					{
						System.out.println("����� ������ �������ϴ�.");
						resultState =0;	
					}
					rcState = 1;
					continue;
				}
				// ������� ��������.
				if(rcState==0)
				{
					System.out.print("����Ͻðڽ��ϱ�? (y/n)");
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
		System.out.println("�� ������ 1~100 ������ �� �ϳ��� ���ߴ� �����Դϴ�.");
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("<<Game Start>>");
		
		while(true) 
		{
			if(chk)
			{
				goalNum = r.nextInt(100)+1;//1~100����.
				System.out.println(goalNum + "��ǥ����");
				chk = false;
			}
			System.out.print("���ڸ� �Է����ּ���.");
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
				System.out.println("�����Դϴ�.");
				System.out.printf("%d�� ���� ������ϴ�.", answerCount);
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
		System.out.println("�� ������ 1~100 ������ �� �ϳ��� ���ߴ� �����Դϴ�.");
		System.out.println("0�� �Է��ϸ� ������ �����մϴ�.");
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<<Game Start>>");
		
		
		int tempNum =0;
		while(true)
		{
			if(chk)
			{
				goalNum = r.nextInt(100)+1;//1~100����.
				chk = false;
				turnChk = 0;
			}
			
			// ����� ��.
			if(turnChk==0) 
			{
				System.out.println("<<User Turn>>");
				System.out.print("���ڸ� �Է����ּ���.(user)");
				playerNum = sc.nextInt();
				if(playerNum==0)
				{
					System.out.println("������ �����մϴ�.");
					break;
				}
				if(playerNum<0&&playerNum>100)
				{
					System.out.println("1~100���� ���ڸ� �Է����ּ���!");
					continue;
				}
				tempNum = playerNum;	
				turnChk =1;				
			}
			else
			{
				System.out.println("<<Computer Turn>>");
				comNum = r.nextInt(100)+1;// ���� ����.
				System.out.printf("���ڸ� �Է����ּ���.(com) %d  \n",comNum);
			
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
				turnName = (turnChk==1)?"����":"��ǻ��";
				System.out.printf("%s�� ������ %d������ ������ϴ�.\n\n\n\n" ,turnName,answerCount);
				
				System.out.println("�� ���� ����!");
				chk = true; // ���� ���� �س������.
				turnChk = 2;// �� ������ �ʱ�ȭ.
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
		System.out.println("�� ������ 1~100 ������ �� �ϳ��� ���ߴ� �����Դϴ�.");
		System.out.println("0�� �Է��ϸ� ������ �����մϴ�.");
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<<Game Start>>");
		
		
		int tempNum =0;
		while(true)
		{
			if(chk)
			{
				goalNum = r.nextInt(100)+1;//1~100����.
				chk = false;
				turnChk = 0;
			}
			
			// ����� ��.
			if(turnChk==0) 
			{
				System.out.println("<<User Turn>>");
				System.out.printf("���ڸ� �Է����ּ���.(user %d~%d) ", min, max);
				playerNum = sc.nextInt();
				if(playerNum==0)
				{
					System.out.println("������ �����մϴ�.");
					break;
				}
				if(playerNum<0&&playerNum>100)
				{
					System.out.println("1~100���� ���ڸ� �Է����ּ���!");
					continue;
				}
				tempNum = playerNum;	
				turnChk =1;				
			}
			else// ��ǻ�� ���϶�.
			{
				System.out.println("<<Computer Turn>>");
				int standNum = max - min;
				//�ִ밪 - �ּҰ��� ���� ������ �����ϰ� �ּҰ��� ���� �����ָ� �ּ�~�ִ밪 ������ ���Ҽ� ����.
				comNum = r.nextInt(standNum)+min;// ���� ����.
				System.out.printf("���ڸ� �Է����ּ���.(com %d~%d ) %d  \n", min, max, comNum);
			
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
				turnName = (turnChk==1)?"����":"��ǻ��";
				System.out.printf("%s�� ������ %d������ ������ϴ�.\n\n\n\n" ,turnName,answerCount);
				// �ִ��ּ� �ʱ�ȭ.
				min = 1;
				max = 100;
				System.out.println("�� ���� ����!");
				chk = true; // ���� ���� �س������.
				turnChk = 2;// �� ������ �ʱ�ȭ.
			}					
		}
	}
}
