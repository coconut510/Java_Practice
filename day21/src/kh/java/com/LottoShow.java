package kh.java.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class LottoShow {
	private ArrayList<Integer> myLotto = new ArrayList<Integer>();
	private Scanner sc =new Scanner(System.in);
	
	private int totalCount = 0;
	private int thirdCount = 0;
	private int secondCount = 0;
	private int firstCount = 0;
	
	
	public void start()
	{
		
		HashSet<Integer> hs = new HashSet<Integer>();
		System.out.println("원하는 로또번호를 입력하세요.");
		while(hs.size()!=6)
		{
			System.out.printf("%d번째 로또 번호를 입력하세요 .", hs.size()+1);
			int myNum = sc.nextInt();
			if(!(0<myNum && myNum<46))System.out.println("1~45까지만 입력해주세요.");
			else
			{
				if(hs.add(myNum)) hs.add(myNum);
				else System.out.println("중복된 값을 입력했습니다. 다시 입력해주세요.");
			}
		}
		
		myLotto.addAll(hs);
		Collections.sort(myLotto);
		getLotto();
	}
	
	public void getLotto()
	{
		System.out.println("<=====추첨 시작=====>");
		Random r = new Random();
		while(true) 
		{			
			HashSet<Integer> hs = new HashSet<Integer>();
			
			while(hs.size()!=6)
			{
				int temNum = r.nextInt(45) + 1;
				if(hs.add(temNum)) hs.add(temNum);
			}
			ArrayList<Integer> al = new ArrayList<Integer>(hs);
			Collections.sort(al);
			resultLott(al);
			
		}
	}
	

	
	public int resultLott(ArrayList<Integer> al)
	{			
		int count = 0;
		for(int i = 0; i<myLotto.size();i++)
		{
			if(myLotto.get(i)==al.get(i))
			{
				count +=1;
			}
		}
		totalCount+=1;
		switch(count)
		{
			case 4:
				thirdCount+=1;
				System.out.println(thirdCount + "번째 3등 당첨!!");
				delay();
				break;
			case 5:			
				secondCount +=1;
				System.out.println(secondCount + "번째 2등 당첨!!");
				delay();
				break;
			case 6:
				firstCount +=1;
				System.out.println("1등 당첨!!");
				delay();
				break;
		}
		System.out.printf("%d 회차 번호 %s\n",totalCount,al);
		

		if(firstCount==1)
		{
			System.out.println(totalCount + "회차에 1등 당첨을 했습니다.");
			System.out.printf("2등 당첨횟수  : %d\n", thirdCount);
			System.out.printf("3등 당첨횟수  : %d\n", thirdCount);
			
			System.exit(0);
		}
		return count;
	}
	public void delay()
	{
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
