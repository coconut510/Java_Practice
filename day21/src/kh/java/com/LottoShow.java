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
		System.out.println("���ϴ� �ζǹ�ȣ�� �Է��ϼ���.");
		while(hs.size()!=6)
		{
			System.out.printf("%d��° �ζ� ��ȣ�� �Է��ϼ��� .", hs.size()+1);
			int myNum = sc.nextInt();
			if(!(0<myNum && myNum<46))System.out.println("1~45������ �Է����ּ���.");
			else
			{
				if(hs.add(myNum)) hs.add(myNum);
				else System.out.println("�ߺ��� ���� �Է��߽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
		
		myLotto.addAll(hs);
		Collections.sort(myLotto);
		getLotto();
	}
	
	public void getLotto()
	{
		System.out.println("<=====��÷ ����=====>");
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
				System.out.println(thirdCount + "��° 3�� ��÷!!");
				delay();
				break;
			case 5:			
				secondCount +=1;
				System.out.println(secondCount + "��° 2�� ��÷!!");
				delay();
				break;
			case 6:
				firstCount +=1;
				System.out.println("1�� ��÷!!");
				delay();
				break;
		}
		System.out.printf("%d ȸ�� ��ȣ %s\n",totalCount,al);
		

		if(firstCount==1)
		{
			System.out.println(totalCount + "ȸ���� 1�� ��÷�� �߽��ϴ�.");
			System.out.printf("2�� ��÷Ƚ��  : %d\n", thirdCount);
			System.out.printf("3�� ��÷Ƚ��  : %d\n", thirdCount);
			
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
