package kh.project.exam;

import java.util.Random;
import java.util.Scanner;

public class LolChampTraining {
	final String enemyName ="제드";
	String champName;
	int myGold = 3000;
	int level;
	int adPower;
	int apPower;
	int adUp;
	int apUp;
	int adDf;
	int apDf;
	int adDfUp;
	int apDfUp;
	float attackSpeed;
	float attackSpeedUp;
	int hp;
	int mp;
	int hpUp;
	int mpUp;
	int delay;
	int exp;
	
	
	int adPowerE;
	int adUpE;
	int apUpE;
	int hpE;
	
	String[] item = {"","","","","",""};
	int [] expStan = new int[18];
	String[] adW = {"몰락한왕의검", "무한의 대검", "피바라기","칠흙의 양날도끼", "정수 약탈자"};
	String[] apW = {"라바돈의 모자","루덴의 메아리", "영겁의 지팡이","모렐로노미콘","공허의 지팡이"};
	String[] adA = {"망자의 갑옷","란두인의 예언","태양불꽃 망토","가시갑옷","기사의맹세"};
	String[] apA = {"강철의 솔라리","정령의 형상","심연의 가면","즈롯차원문","미카엘의 도가니"};	
	int[] specUp = {100,80,100, 100, 80};
	int[] cost = {1200, 1300, 1400, 1500, 1600};//가격은 동일하게.
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	int currentState = 0;// 0: 로비 , 1: 상점 메뉴, 2: 라인전 메뉴
	
	public void start()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("챔피언 이름을 입력해주세요 : ");
		champName = sc.nextLine();
		
		System.out.printf("챔피언 %s 을(를) 생성했습니다. ", champName);
		
		statusSet();
		while(true) 
		{			
			// 메뉴 보여주기.
			switch(currentState) 
			{
				case 0: 
					menuLobby();
					int menuNum = sc.nextInt();
					switch(menuNum)
					{
						case 1:// 챔피언 능력치 보기.
							showChampStatus();
							break;						
						case 2:// 파밍중.
							farmming();
							break;
						case 3:// 상점방문.
							shopVisit();
							continue;
						case 4:// 라인전 연습.
							battle();
							System.out.println("\n\n소환사의 협곡에 오신것을 환영합니다.\n\n");
							System.out.println("상대 라이너는 제드입니다.");
							delay(10);
							continue;
						default :
							System.out.println("보기중에 있는 메뉴를 골라주세요.");
							continue;
					}
				break;
				case 1:
					menuShop(); 
					
					switch(sc.nextInt())
					{
						case 1: itemGotcha(1); break;
						case 2: itemGotcha(2); break;
						case 3: itemGotcha(3); break;
						case 4: itemGotcha(4); break;					
						case 5: itemSell();  break;
						case 6: currentState = 0; continue;
						default :
							System.out.println("보기중에 있는 메뉴를 골라주세요.");
						continue;
					}
					break;
				case 2: 										
					menuBattle();										
					
				
					switch(sc.nextInt())
					{
						case 1:
							normalAttack();
							break;
						case 2:
							skillAttack();
							break;
						case 3:
							escape();
							break;
						case 4:
							showEnemyStatus();
							break;
						default :
							System.out.println("보기중에 있는 메뉴를 골라주세요.");
						continue;
					}				
					break;					
					
				default :
					System.out.println("보기중에 있는 메뉴를 골라주세요.");
					continue;					
			}										
		}		
	}	
	public void menuLobby()
	{
		System.out.println("=======로비 메뉴=======");
		System.out.println("1.챔피언 능력치 보기");
		System.out.println("2.파밍");		
		System.out.println("3.상점 방문");
		System.out.println("4.라인전 연습");
	
	}
	
	public void menuShop()
	{
		System.out.println("=======  상점 메뉴  =======");
		System.out.println("(모든 메뉴는 렌덤으로 구매됩니다.)");
		System.out.println("1.물리 공격 아이템");
		System.out.println("2.마법 공격 아이템");
		System.out.println("3.물리 방어 아이템");
		System.out.println("4.마법 방어 아이템");
		System.out.println("5.아이템 판매");
		System.out.println("6.나가기");
	}
	public void menuBattle()
	{
		System.out.println("=======공격 메뉴=======");
		System.out.println("1.평타공격");
		System.out.println("2.스킬공격");
		System.out.println("3.탈주");
		System.out.println("4.상대 능력치 보기");
	}
	
	public void statusSet()
	{
		level = 1;
		adPower = r.nextInt(50)+40;
		apPower = r.nextInt(50)+50;
		adUp = r.nextInt(6)+3;
		apUp = r.nextInt(6)+3;
		adDf = r.nextInt(10)+30;
		apDf = r.nextInt(10)+30;
		adDfUp = r.nextInt(10)+30;
		apDfUp = r.nextInt(10)+30;
		attackSpeed = r.nextFloat() * (r.nextInt(5)+4);
		attackSpeedUp = r.nextFloat() + 0.01f;
		hp =  r.nextInt(250)+400;
		mp =  r.nextInt(200)+200;;
		hpUp = r.nextInt(10)+20;
		mpUp = r.nextInt(8)+10;
		delay = 10;
		exp = 0;
		myGold = r.nextInt(2000) + 2000;
		for(int i = 0; i<expStan.length;i++)
		{
			expStan[i] = 50 * (i+1) * (i+1);
		}
		
		System.out.println("챔피언 능력치가 랜덤으로 생성되었습니다.");
	}
	
	public void showChampStatus()
	{
		System.out.println("\n\n===챔피언 정보보기===\n");
		System.out.printf("챔피언 이름 : %s\n", champName);
		System.out.printf("골드 소지 : %d\n", myGold);
		System.out.printf("레벨 : %d\n", level);
		System.out.printf("물리 공격력 : %d\n", adPower);
		System.out.printf("마법 공격력 : %d\n", apPower);
		System.out.printf("물리 공격력 증가치 : %d\n", adUp);
		System.out.printf("마법 공격력 증가치 : %d\n", apUp);
		System.out.printf("물리 방어 : %d\n", adDf);
		System.out.printf("마법 방어 : %d\n", apDf);
		System.out.printf("물리 방어 증가 : %d\n", adDfUp);
		System.out.printf("마법 방어 증가 : %d\n", apDfUp);
		System.out.printf("공격 속도 : %f\n", attackSpeed);
		System.out.printf("공격 속도 증가량 : %f\n", attackSpeedUp);
		System.out.printf("체력: %d\n", hp);
		System.out.printf("마나 : %d\n", mp);
		System.out.printf("체력 증가량: %d\n", hpUp);
		System.out.printf("마나 증가량: %d\n", mpUp);
		System.out.printf("재사용 대기시간 : %d\n ", delay);
		System.out.printf("경험치 : %d\n", exp);
		
		currentState = 0;
	}
	
	public void delay(int timer)
	{
		try {
			Thread.sleep(timer*100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void farmming()
	{
		System.out.println("=====미니언 파밍중=====");
		delay(10);
		int minionNum = r.nextInt(6)+1;
		int goldGet = 0;
		int tempExp = 0;
		for(int i = 0; i<minionNum;i++)
		{
			goldGet+= r.nextInt(7)+15;
			tempExp += r.nextInt(20) + 10;
		}
		System.out.printf("미니언을 %d마리 잡고 %d골드를 획득했습니다.\n\n", minionNum, goldGet);
		System.out.printf("경험치 %d만큼 획득했습니다.\n\n", tempExp);
		
		exp += tempExp;
		levelChk();
		
		myGold +=goldGet;
		System.out.println("현재 보유 골드 " + myGold);
		delay(5);
		System.out.println("파밍 종료...\n");
		
		currentState = 0;
		
	}
	
	public void shopVisit()
	{
		currentState = 1;// 상점 상태로 변경.
	}
	public void itemGotcha(int type)
	{
		int num = r.nextInt(5);
		if(myGold>=cost[num])
		{
			switch(type) 
			{
				case 1:	
					System.out.printf("%s를 얻었습니다.\n", adW[num]); 
//					adPower += specUp[num];
//					System.out.printf("%s의 물리 공격력이 %d만큼 증가했습니다.\n현재 공격력 %d\n", champName,specUp[num],adPower );
					itemBattch(adW[num]);
					break;
				case 2:	
					System.out.printf("%s를 얻었습니다.\n", apW[num]); 
//					apPower += specUp[num];
//					System.out.printf("%s의  주문력이 %d만큼 증가했습니다.\n현재 공격력 %d\n", champName,specUp[num],apPower );
					itemBattch(apW[num]);
					break;												
				case 3:	
					System.out.printf("%s를 얻었습니다.\n", adA[num]); 
//					adDf += specUp[num]*0.8;
//					System.out.printf("%s의 물리 방어력이 %d만큼 증가했습니다.\n현재 공격력 %d\n", champName,specUp[num]*0.8,adDf );
					itemBattch(adA[num]);
					break;
				case 4:	
					System.out.printf("%s를 얻었습니다.\n", apA[num]); 
//					apDf += specUp[num]*0.8;
//					System.out.printf("%s의 물리 공격력이 %d만큼 증가했습니다.\n현재 공격력 %d\n", champName,specUp[num]*0.8,apDf );
					itemBattch(apA[num]);
					break;
			}
			myGold -= cost[num];
			System.out.println("현재 보유 골드 " + myGold);
		}
		else
		{
			System.out.printf(" %d골드가 부족합니다.\n", cost[num]-myGold );
			System.out.println("현재 보유 골드 " + myGold);
		}
	}
	
	public void itemBattch(String itemName)
	{
		for(int i = 0; i<item.length;i++)
		{
			if(item[i].length()==0)
			{
				item[i] = itemName;
				break;
			}
				
		}
	}
	
	
	public void levelChk()
	{
		for(int i = 0; i< expStan.length;i++)
		{
			if(exp>=expStan[i]) level = i+1;
		}
		System.out.printf("\n%s의 현재 레벨은 %d입니다.\n", champName, level);
	}
	public void itemSell()
	{
		System.out.println("어떤 아이템을 판매하시겠습니까?\n(판매아이템은 80% 가격으로 판매됩니다.)\n(0을 입력하면 상점으로 돌아갑니다.)\n");
	
		for(int i = 0 ; i<item.length;i++)
		{
			System.out.printf("%d번 슬롯 아이템 : %s\n",i+1, item[i]);
		}
		System.out.print("판매할 슬롯 번호 : ");
		int num = sc.nextInt();
		if(num!=0) 
		{
			myGold += cost[num]*0.8;
			System.out.printf("%d번 슬롯의 %s를 %d골드에 판매했습니다.\n",num, item[num-1],cost[num]*0.8);
			System.out.println("현재 보유 골드 " + myGold);
			item[num-1] = "";
			currentState = 1;
		}
		else
		{
			System.out.println("상점메뉴로 돌아갑니다.");
		}
	}
	
	public void enemyStatusSet()
	{
	    adPowerE =adPower + r.nextInt(25)-25 ;
		hpE =hp + + r.nextInt(200)-200;
	}
	public void battle()
	{
		currentState = 2;// 라인전 상태.	
		enemyStatusSet();
		
	}
	public void normalAttack()
	{
		System.out.printf("%s가 일반 공격을 합니다.\n\n", champName);
		delay(3);
		int tempAttack = apPower + r.nextInt(100) - r.nextInt(100);
		hpE-= tempAttack;
		System.out.printf("%s가 일반공격으로 %s에게 %d의 데미지를 입혔습니다.\n", champName, enemyName, tempAttack);
		delay(3);	
		enemyAttack(tempAttack);
		delay(3);	
		currentState = 2;
		playerCheck();
		enemyCheck();
	}
	public void skillAttack() 
	{
		System.out.printf("%s가 스킬 공격을 합니다.\n", champName);
		delay(3);
		int tempAttack = (apPower * r.nextInt(4)+1);
		hpE-= tempAttack;
		System.out.printf("%s가 스킬 공격으로 %s에게 %d의 데미지를 입혔습니다.\n\n", champName, enemyName, tempAttack);
		delay(3);
		
		enemyAttack(tempAttack);
		
		delay(3);	
		
		currentState = 2; 
		playerCheck();
		enemyCheck();
	}
	public void enemyAttack(int  tempAttack)
	{
		if(r.nextInt(4)==0)// 스킬공격
		{
			tempAttack = (adPowerE * r.nextInt(4)+1);
			hp -= tempAttack;
			System.out.printf("%s가  스킬 공격으로 %s에게 %d의 데미지를 입혔습니다.\n\n", enemyName, champName,tempAttack);
		}
		else
		{
			tempAttack = adPowerE + r.nextInt(100);
			hp -= tempAttack;
			System.out.printf("%s가 일반공격으로 %s에게 %d의 데미지를 입혔습니다.\n\n", enemyName, champName,tempAttack);
			
		}
	}
	
	public void playerCheck()
	{
		if(hp<=0)
		{
			System.out.printf("%s가 졌습니다.\n 400골드를 %s에게 뺏겼습니다.\n", champName, enemyName);
			myGold -= 400;
			currentState = 0;
		}
		else
		{
			System.out.printf("%s의 남은 체력 %d\n\n",champName, hp );
		}
	}
	public void enemyCheck()
	{
		if(hpE<=0)
		{
			int gold = r.nextInt(300) + 100;
			System.out.printf("제드를 물리쳤습니다.\n %d골드를 얻었습니다.\n", gold);
			System.out.println("현재 보유 골드 " + myGold);
			currentState = 0;
		}
		else
		{						
			System.out.printf("%s의 남은 체력 %d\n\n",enemyName, hpE );
		}
	}

	public void escape()
	{
		System.out.println("탈주했습니다...");
		myGold -=400;
		if(myGold<0) myGold = 0;
		
		System.out.println("400 골드를 잃었습니다.");
		System.out.println("현재 보유 골드 " + myGold);
		currentState = 0;
	}
	
	public void showEnemyStatus()
	{
		System.out.printf("%s의 상태\n", enemyName);
		System.out.printf("공격력 : %d",adPowerE);
		System.out.printf("체력 : %d",hpE);
	}
	
}
