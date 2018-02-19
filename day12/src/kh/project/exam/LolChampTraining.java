package kh.project.exam;

import java.util.Random;
import java.util.Scanner;

public class LolChampTraining {
	final String enemyName ="����";
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
	String[] adW = {"�����ѿ��ǰ�", "������ ���", "�ǹٶ��","ĥ���� �糯����", "���� ��Ż��"};
	String[] apW = {"��ٵ��� ����","�絧�� �޾Ƹ�", "������ ������","�𷼷γ����","������ ������"};
	String[] adA = {"������ ����","�������� ����","�¾�Ҳ� ����","���ð���","����Ǹͼ�"};
	String[] apA = {"��ö�� �ֶ�","������ ����","�ɿ��� ����","���������","��ī���� ������"};	
	int[] specUp = {100,80,100, 100, 80};
	int[] cost = {1200, 1300, 1400, 1500, 1600};//������ �����ϰ�.
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	int currentState = 0;// 0: �κ� , 1: ���� �޴�, 2: ������ �޴�
	
	public void start()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("è�Ǿ� �̸��� �Է����ּ��� : ");
		champName = sc.nextLine();
		
		System.out.printf("è�Ǿ� %s ��(��) �����߽��ϴ�. ", champName);
		
		statusSet();
		while(true) 
		{			
			// �޴� �����ֱ�.
			switch(currentState) 
			{
				case 0: 
					menuLobby();
					int menuNum = sc.nextInt();
					switch(menuNum)
					{
						case 1:// è�Ǿ� �ɷ�ġ ����.
							showChampStatus();
							break;						
						case 2:// �Ĺ���.
							farmming();
							break;
						case 3:// �����湮.
							shopVisit();
							continue;
						case 4:// ������ ����.
							battle();
							System.out.println("\n\n��ȯ���� ��� ���Ű��� ȯ���մϴ�.\n\n");
							System.out.println("��� ���̳ʴ� �����Դϴ�.");
							delay(10);
							continue;
						default :
							System.out.println("�����߿� �ִ� �޴��� ����ּ���.");
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
							System.out.println("�����߿� �ִ� �޴��� ����ּ���.");
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
							System.out.println("�����߿� �ִ� �޴��� ����ּ���.");
						continue;
					}				
					break;					
					
				default :
					System.out.println("�����߿� �ִ� �޴��� ����ּ���.");
					continue;					
			}										
		}		
	}	
	public void menuLobby()
	{
		System.out.println("=======�κ� �޴�=======");
		System.out.println("1.è�Ǿ� �ɷ�ġ ����");
		System.out.println("2.�Ĺ�");		
		System.out.println("3.���� �湮");
		System.out.println("4.������ ����");
	
	}
	
	public void menuShop()
	{
		System.out.println("=======  ���� �޴�  =======");
		System.out.println("(��� �޴��� �������� ���ŵ˴ϴ�.)");
		System.out.println("1.���� ���� ������");
		System.out.println("2.���� ���� ������");
		System.out.println("3.���� ��� ������");
		System.out.println("4.���� ��� ������");
		System.out.println("5.������ �Ǹ�");
		System.out.println("6.������");
	}
	public void menuBattle()
	{
		System.out.println("=======���� �޴�=======");
		System.out.println("1.��Ÿ����");
		System.out.println("2.��ų����");
		System.out.println("3.Ż��");
		System.out.println("4.��� �ɷ�ġ ����");
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
		
		System.out.println("è�Ǿ� �ɷ�ġ�� �������� �����Ǿ����ϴ�.");
	}
	
	public void showChampStatus()
	{
		System.out.println("\n\n===è�Ǿ� ��������===\n");
		System.out.printf("è�Ǿ� �̸� : %s\n", champName);
		System.out.printf("��� ���� : %d\n", myGold);
		System.out.printf("���� : %d\n", level);
		System.out.printf("���� ���ݷ� : %d\n", adPower);
		System.out.printf("���� ���ݷ� : %d\n", apPower);
		System.out.printf("���� ���ݷ� ����ġ : %d\n", adUp);
		System.out.printf("���� ���ݷ� ����ġ : %d\n", apUp);
		System.out.printf("���� ��� : %d\n", adDf);
		System.out.printf("���� ��� : %d\n", apDf);
		System.out.printf("���� ��� ���� : %d\n", adDfUp);
		System.out.printf("���� ��� ���� : %d\n", apDfUp);
		System.out.printf("���� �ӵ� : %f\n", attackSpeed);
		System.out.printf("���� �ӵ� ������ : %f\n", attackSpeedUp);
		System.out.printf("ü��: %d\n", hp);
		System.out.printf("���� : %d\n", mp);
		System.out.printf("ü�� ������: %d\n", hpUp);
		System.out.printf("���� ������: %d\n", mpUp);
		System.out.printf("���� ���ð� : %d\n ", delay);
		System.out.printf("����ġ : %d\n", exp);
		
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
		System.out.println("=====�̴Ͼ� �Ĺ���=====");
		delay(10);
		int minionNum = r.nextInt(6)+1;
		int goldGet = 0;
		int tempExp = 0;
		for(int i = 0; i<minionNum;i++)
		{
			goldGet+= r.nextInt(7)+15;
			tempExp += r.nextInt(20) + 10;
		}
		System.out.printf("�̴Ͼ��� %d���� ��� %d��带 ȹ���߽��ϴ�.\n\n", minionNum, goldGet);
		System.out.printf("����ġ %d��ŭ ȹ���߽��ϴ�.\n\n", tempExp);
		
		exp += tempExp;
		levelChk();
		
		myGold +=goldGet;
		System.out.println("���� ���� ��� " + myGold);
		delay(5);
		System.out.println("�Ĺ� ����...\n");
		
		currentState = 0;
		
	}
	
	public void shopVisit()
	{
		currentState = 1;// ���� ���·� ����.
	}
	public void itemGotcha(int type)
	{
		int num = r.nextInt(5);
		if(myGold>=cost[num])
		{
			switch(type) 
			{
				case 1:	
					System.out.printf("%s�� ������ϴ�.\n", adW[num]); 
//					adPower += specUp[num];
//					System.out.printf("%s�� ���� ���ݷ��� %d��ŭ �����߽��ϴ�.\n���� ���ݷ� %d\n", champName,specUp[num],adPower );
					itemBattch(adW[num]);
					break;
				case 2:	
					System.out.printf("%s�� ������ϴ�.\n", apW[num]); 
//					apPower += specUp[num];
//					System.out.printf("%s��  �ֹ����� %d��ŭ �����߽��ϴ�.\n���� ���ݷ� %d\n", champName,specUp[num],apPower );
					itemBattch(apW[num]);
					break;												
				case 3:	
					System.out.printf("%s�� ������ϴ�.\n", adA[num]); 
//					adDf += specUp[num]*0.8;
//					System.out.printf("%s�� ���� ������ %d��ŭ �����߽��ϴ�.\n���� ���ݷ� %d\n", champName,specUp[num]*0.8,adDf );
					itemBattch(adA[num]);
					break;
				case 4:	
					System.out.printf("%s�� ������ϴ�.\n", apA[num]); 
//					apDf += specUp[num]*0.8;
//					System.out.printf("%s�� ���� ���ݷ��� %d��ŭ �����߽��ϴ�.\n���� ���ݷ� %d\n", champName,specUp[num]*0.8,apDf );
					itemBattch(apA[num]);
					break;
			}
			myGold -= cost[num];
			System.out.println("���� ���� ��� " + myGold);
		}
		else
		{
			System.out.printf(" %d��尡 �����մϴ�.\n", cost[num]-myGold );
			System.out.println("���� ���� ��� " + myGold);
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
		System.out.printf("\n%s�� ���� ������ %d�Դϴ�.\n", champName, level);
	}
	public void itemSell()
	{
		System.out.println("� �������� �Ǹ��Ͻðڽ��ϱ�?\n(�Ǹž������� 80% �������� �Ǹŵ˴ϴ�.)\n(0�� �Է��ϸ� �������� ���ư��ϴ�.)\n");
	
		for(int i = 0 ; i<item.length;i++)
		{
			System.out.printf("%d�� ���� ������ : %s\n",i+1, item[i]);
		}
		System.out.print("�Ǹ��� ���� ��ȣ : ");
		int num = sc.nextInt();
		if(num!=0) 
		{
			myGold += cost[num]*0.8;
			System.out.printf("%d�� ������ %s�� %d��忡 �Ǹ��߽��ϴ�.\n",num, item[num-1],cost[num]*0.8);
			System.out.println("���� ���� ��� " + myGold);
			item[num-1] = "";
			currentState = 1;
		}
		else
		{
			System.out.println("�����޴��� ���ư��ϴ�.");
		}
	}
	
	public void enemyStatusSet()
	{
	    adPowerE =adPower + r.nextInt(25)-25 ;
		hpE =hp + + r.nextInt(200)-200;
	}
	public void battle()
	{
		currentState = 2;// ������ ����.	
		enemyStatusSet();
		
	}
	public void normalAttack()
	{
		System.out.printf("%s�� �Ϲ� ������ �մϴ�.\n\n", champName);
		delay(3);
		int tempAttack = apPower + r.nextInt(100) - r.nextInt(100);
		hpE-= tempAttack;
		System.out.printf("%s�� �Ϲݰ������� %s���� %d�� �������� �������ϴ�.\n", champName, enemyName, tempAttack);
		delay(3);	
		enemyAttack(tempAttack);
		delay(3);	
		currentState = 2;
		playerCheck();
		enemyCheck();
	}
	public void skillAttack() 
	{
		System.out.printf("%s�� ��ų ������ �մϴ�.\n", champName);
		delay(3);
		int tempAttack = (apPower * r.nextInt(4)+1);
		hpE-= tempAttack;
		System.out.printf("%s�� ��ų �������� %s���� %d�� �������� �������ϴ�.\n\n", champName, enemyName, tempAttack);
		delay(3);
		
		enemyAttack(tempAttack);
		
		delay(3);	
		
		currentState = 2; 
		playerCheck();
		enemyCheck();
	}
	public void enemyAttack(int  tempAttack)
	{
		if(r.nextInt(4)==0)// ��ų����
		{
			tempAttack = (adPowerE * r.nextInt(4)+1);
			hp -= tempAttack;
			System.out.printf("%s��  ��ų �������� %s���� %d�� �������� �������ϴ�.\n\n", enemyName, champName,tempAttack);
		}
		else
		{
			tempAttack = adPowerE + r.nextInt(100);
			hp -= tempAttack;
			System.out.printf("%s�� �Ϲݰ������� %s���� %d�� �������� �������ϴ�.\n\n", enemyName, champName,tempAttack);
			
		}
	}
	
	public void playerCheck()
	{
		if(hp<=0)
		{
			System.out.printf("%s�� �����ϴ�.\n 400��带 %s���� ������ϴ�.\n", champName, enemyName);
			myGold -= 400;
			currentState = 0;
		}
		else
		{
			System.out.printf("%s�� ���� ü�� %d\n\n",champName, hp );
		}
	}
	public void enemyCheck()
	{
		if(hpE<=0)
		{
			int gold = r.nextInt(300) + 100;
			System.out.printf("���带 �����ƽ��ϴ�.\n %d��带 ������ϴ�.\n", gold);
			System.out.println("���� ���� ��� " + myGold);
			currentState = 0;
		}
		else
		{						
			System.out.printf("%s�� ���� ü�� %d\n\n",enemyName, hpE );
		}
	}

	public void escape()
	{
		System.out.println("Ż���߽��ϴ�...");
		myGold -=400;
		if(myGold<0) myGold = 0;
		
		System.out.println("400 ��带 �Ҿ����ϴ�.");
		System.out.println("���� ���� ��� " + myGold);
		currentState = 0;
	}
	
	public void showEnemyStatus()
	{
		System.out.printf("%s�� ����\n", enemyName);
		System.out.printf("���ݷ� : %d",adPowerE);
		System.out.printf("ü�� : %d",hpE);
	}
	
}
