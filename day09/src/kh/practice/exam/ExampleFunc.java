package kh.practice.exam;

import java.util.Random;
import java.util.Scanner;

public class ExampleFunc {
	
	public void bubbleSort()
	{
		System.out.println("<<버블 정렬>>");
		int [] arr = new int[5];
		int temp=0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<arr.length;i++ ) 
		{
			System.out.printf("%d번째 숫자 입력 :",i+1);
			arr[i] = sc.nextInt();
		}
		
		for( int i = 0; i<arr.length-1; i++ )
		{
			for(int j = 0; j<arr.length-1-i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i = 0; i<arr.length;i++ ) 
		{
			System.out.printf("%d\t",arr[i]);
		}			
	}
	
	public void selectionSort()
	{
		
		System.out.println("<<선택 정렬>>");
		int [] arr = new int[5];
		int minNum = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<arr.length;i++ ) 
		{
			System.out.printf("%d번째 숫자 입력 :",i+1);
			arr[i] = sc.nextInt();
		}
		
		
	
		for(int i = 0; i<arr.length;i++)
		{
			minNum = arr[i];			
			for(int j = i; j<arr.length; j++)
			{
				if(minNum > arr[j])
				{
					minNum = arr[j];	
					arr[j] = arr[i];
					arr[i] = minNum;
				}				
			}							
		}
		
		for(int i = 0; i<arr.length;i++ ) 
		{
			System.out.printf("%d\t",arr[i]);
		}	
	}
	
	public void insertionSort()
	{
		int [] arrU = new int[5];// 정렬되지 않은 원소들
		int sNum = 0;// 비교할 번호.
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<arrU.length;i++ ) 
		{
			System.out.printf("%d번째 숫자 입력 :",i+1);
			arrU[i] = sc.nextInt();
		}
		
		for(int i = 1; i<arrU.length-1;i++)
		{
			sNum = arrU[i];
			for(int j = i; j>0; j--)
			{
				if(sNum < arrU[i])// 기준값이 보다 작을때.
				{
					arrU[i+1] = arrU[i];
					arrU[i] = sNum;
					break;
				}
				else
				{
					arrU[i+1] = arrU[i];
					
				}
			}
		}
		
		for(int i = 0; i<arrU.length;i++ ) 
		{
			System.out.printf("%d\t",arrU[i]);
		}	
	}
	
	public void motelManagement()
	{
		Scanner sc = new Scanner(System.in);
		int [] roomNum = new int[10];
		int selectNum = 0;
		int room = 0;
		System.out.println("모텔 관리 프로그램 v1.0");
		
		while(true) 
		{			
			System.out.println("1.입실\t2.퇴실\t3.방보기\t4.종료");
			System.out.print("선택>");
			selectNum = sc.nextInt();
			switch(selectNum)
			{
				case 1:
					System.out.print("\n몇번방에 입실하시겠습니까?");
					room = sc.nextInt();
					
					if(room>10||room<1) System.out.println("방은 1호실부터 10호실까지만 있습니다.");
					else 
					{
						if(roomNum[room-1]==0 ) 
						{
							System.out.printf("\n%d번방에 입실하셨습니다.\n\n", room);
							roomNum[room-1] = 1;
						}
						else
						{
							System.out.printf("\n%d번방은 현재 손님이 있습니다\n\n", room);
						}
					}
					break;
				case 2:
					System.out.print("\n몇번방에 입실하시겠습니까?");
					room = sc.nextInt();
					if(room>10||room<1) System.out.println("방은 1호실부터 10호실까지만 있습니다.");
					else 
					{
						if(roomNum[room-1]==1 ) 
						{
							System.out.printf("\n%d번방에서 퇴실하셨습니다.\n", room);
							roomNum[room-1] = 0;
						}
						else
						{
							System.out.printf("\n%d번방은 현재 빈방입니다.\n", room);
						}
					}
					break;					
				case 3:		
					for(int i = 0; i<roomNum.length;i++)
					{
						if(roomNum[i]==0) System.out.printf("%d번방이 현재 비어있습니다.\n\n", i+1);											
						else System.out.printf("%d번방에는 현재 손님이 있습니다.\n\n", i+1);
					}
					break;
				case 4:
					System.out.println("프로그램을 종료합니다.");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return;
			}
		}
		
	}
	
	public void deepCopyArray()
	{
		int [] arr1 = new int[] {1,2,3,4,5,};
		int [] arr2 = new int[arr1.length] ;
		
		System.arraycopy(arr1, 0, arr2, 2, arr1.length);
		
		arr2[2] = 999;
		
		for(int i = 0; i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		for(int i = 0; i<arr1.length;i++)
		{
			System.out.println(arr2[i]);
		}
		for(int i = 0; i<arr2.length;i++)
		{
			arr2[i] = arr1[i];
		}
	}
	
	public void strCharNumCount()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력해주세요 : ");
		String str = sc.nextLine();
		System.out.print("검색하려는 문자를 입력해주세요 : ");
		char c = sc.next().charAt(0);
		int count = 0;
		
		for(int i = 0; i<str.length();i++)
		{
			if(str.charAt(i)==c) count+=1;
		}
		System.out.printf("입력하신 문자열 %s에서 \n찾으시는 문자 %c는  %d개입니다.\n", str,c,count);
	}
	
	public void phoneNumHide()
	{
		char[] phoneNum = new char[13]; 		// 원본 .
		char[] copyPhoneList = new char[phoneNum.length];// 카피.
		String phoneStr = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호 입력 : ");
		
		phoneStr = sc.nextLine();
		for(int i = 0; i<phoneStr.length();i++)
		{		
			phoneNum[i] = phoneStr.charAt(i);
		}

		copyPhoneList = phoneNum.clone();
		for(int i = 4; i<8;i++)
		{
			copyPhoneList[i] ='*'; 
		}
		
		System.out.println("전화번호 원본");
		for(int i = 0; i<phoneStr.length();i++)
		{
			System.out.print(phoneNum[i]);
		}
		System.out.println("\n전화번호  숨겨진 배열");
		for(int i = 0; i<phoneStr.length();i++)
		{
			System.out.print(copyPhoneList[i]);
		}
	}
	
	public void lottoSelect()
	{
		int[] lottoMySelect = new int[6];
		Random r = new Random();
		int num = 0;
		boolean chk = false;
		System.out.println("<<로또 번호 추첨!>>");
		while(true) 
		{
			for(int i = 0; i<lottoMySelect.length;i++)
			{
				num = r.nextInt(45)+1;
				for(int j = 0; j < lottoMySelect.length;j++)
				{				
					chk = true;
					if(num == lottoMySelect[j])
					{
						i-=1;
						chk = false;
						break;
					}
				}
				if(chk)lottoMySelect[i] = num;						
			}
			
			bubblePar(lottoMySelect);
			for(int i = 0; i<lottoMySelect.length;i++)
			{
				System.out.printf("번호 %d\t", lottoMySelect[i]);
			}
			System.out.println();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void lottoReal()
	{
		
		int[] myLotto = new int[6];
		int winnerTurn = 0;// 몇회차때 1등을 했는지.
		int secWinTurn = 0;// 2등 횟수.
		int thdWinTurn = 0;// 3등횟수.
		int totalTurn = 0;// 총 로또 회차.
		int matchNumCount = 0;// 맞은 횟수.
		String myLottoNumStr = "";
		int tempLotto =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("<<로또 당첨 프로그램>>");
		
		for(int i = 0; i<6;i++) 
		{
			System.out.printf("%d번째 번호를 적어주세요.( %s ) => ", i+1,myLottoNumStr);
			boolean chk = true;
			tempLotto = sc.nextInt();		
			for(int j = 0; j<myLotto.length;j++)
			{
				if(tempLotto==myLotto[j])
				{
					System.out.println("이미 입력한 번호입니다. 다시 입력해주세요.");
					i-=1;
					chk = false;
					break;
				}				
				if(1>tempLotto|| tempLotto>45)
				{
					System.out.println("입력할수 있는 번호의 범위를 벗어났습니다.\n다시 입력해주세요.");
					i-=1;
					chk = false;
					break;
				}
			}
			if(chk)
			{
				myLotto[i] = tempLotto;				
				myLottoNumStr +=tempLotto + " ";
			}
		}
		System.out.printf("입력한 로또 번호 ( %s )\n",myLottoNumStr);
		bubblePar(myLotto);// 소팅해주기.
		
		
		
		//로또번호 추첨
		int[] lottoMySelect = new int[6];
		Random r = new Random();
		int num = 0;
		boolean chk = false;

		while(true) 
		{
			for(int i = 0; i<lottoMySelect.length;i++)
			{
				num = r.nextInt(45)+1;
				for(int j = 0; j < lottoMySelect.length;j++)
				{				
					chk = true;
					if( num == lottoMySelect[j] )
					{
						i-=1;
						chk = false;
						break;
					}
				}
				if(chk)lottoMySelect[i] = num;						
			}
			
			bubblePar(lottoMySelect);
			
			totalTurn += 1;
			
			// 내가 입력한 로또번호와 비교하고, 추첨된 로또 번호 출력해주기.
			System.out.printf("%d회차 : ",totalTurn);
			for(int i = 0; i<lottoMySelect.length;i++)
			{
				if(myLotto[i]==lottoMySelect[i])matchNumCount +=1;
				System.out.printf("번호 %d\t", lottoMySelect[i]);
			}
			System.out.println();
			
			switch(matchNumCount)
			{
				case 4:
					System.out.println("========     =========");
					System.out.println("========     =========");
					System.out.println("      ==     ==");
					System.out.println("      ==     ==");
					System.out.println("========     =========");
					System.out.println("========     =========");
					System.out.println("      ==    ===========");
					System.out.println("      ==         ==");
					System.out.println("========       ==  ==");
					System.out.println("========         ==");
					thdWinTurn +=1;
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 5:
					System.out.println("========     =========");
					System.out.println("========     =========");
					System.out.println("      ==     ==");
					System.out.println("      ==     ==");
					System.out.println("========     =========");
					System.out.println("========     =========");
					System.out.println("==          ===========");
					System.out.println("==               ==");
					System.out.println("========       ==  ==");
					System.out.println("========         ==");
					secWinTurn +=1;
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;					
				case 6:
					System.out.println("   ==        =========");
					System.out.println("   ==        =========");
					System.out.println("   ==        ==");
					System.out.println("   ==        ==");
					System.out.println("   ==        =========");
					System.out.println("   ==        =========");
					System.out.println("   ==       ===========");
					System.out.println("   ==            ==");
					System.out.println("   ==          ==  ==");
					System.out.println("   ==            ==");
					
					winnerTurn  = totalTurn;
					
					System.out.printf("당신은 %d번만에 1등이 당첨되었습니다.\n", winnerTurn);
					
					System.out.println("=================================");
					System.out.printf( "2등 당첨횟수 : %d번\n",secWinTurn); 
					System.out.printf( "3등 당첨횟수 : %d번\n",thdWinTurn); 
					System.out.printf( "%d회 동안 투자한 금액(횟수 * 1000원) : %d원\n",totalTurn, totalTurn*1000); 
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return ;
			}
			matchNumCount = 0;
			System.out.println();					

		}
	}
	
	public void bubblePar(int[] arr)
	{
		int temp = 0;
		for( int i = 0; i<arr.length-1; i++ )
		{
			for(int j = 0; j<arr.length-1-i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public void arrayTwoDemension()
	{
		
		int [][] arr = new int[5][5];
		int k = 1;
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j<5;j++)
			{
				arr[i][j] = k++;
			}
		}
		
		for(int i = 0; i<5;i++)
		{
			for(int j = 0; j<5; j++)
			{
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void arrayTwoDemensionTwo()
	{
		int [][]arr = new int[5][5];
		int k = 1;
		
		//1번
		System.out.println("\n1번");
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = 0; j<arr[i].length;j++)
			{
			    arr[i][j] = 5*k*(i+1) - j;
			}
		}
		
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = 0; j<arr[i].length;j++)
			{
				System.out.printf("%5d",arr[i][j]);
			}
			System.out.println();
		}
		
		//2번
		System.out.println("\n2번");
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = 0; j<arr[i].length;j++)
			{
			    arr[i][j] = 5*k*j  +i+1;
			}
		}
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = 0; j<arr[i].length;j++)
			{
				System.out.printf("%5d",arr[i][j]);
			}
			System.out.println();
		}
		
		//3번
		System.out.println("\n3번");
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = 0; j<arr[i].length;j++)
			{
			    arr[i][j] = 5*k*(j+1) - i;
			}
		}
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = 0; j<arr[i].length;j++)
			{
				System.out.printf("%5d",arr[i][j]);
			}
			System.out.println();
		}
		
		
		//4번
		System.out.println("\n4번");
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = 0; j<arr[i].length;j++)
			{
			    if(i%2==0) arr[i][j] = j + 1 + i*k*5;
			    else  arr[i][j] = 5*k*(i+1) - j;
			}
		}
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = 0; j<arr[i].length;j++)
			{
				System.out.printf("%5d",arr[i][j]);
			}
			System.out.println();
		}
		
		//5번
		System.out.println("\n5번");
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = 0; j<arr[i].length;j++)
			{
			    if(i%2==0) arr[i][j] = (2*i + 1-i) * 5*k -j ;
			    else  arr[i][j] = 5*k + j + 1;
			}
		}
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = 0; j<arr[i].length;j++)
			{
				System.out.printf("%5d",arr[i][j]);
			}
			System.out.println();
		}
		
		//6번
		System.out.println("\n6번");
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = 0; j<arr[i].length;j++)
			{
			    if(j%2==0) arr[i][j] = i + 1 + (5*k*j);
			    else  arr[i][j] = 5*k*(j+1) -i;
			}
		}
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = 0; j<arr[i].length;j++)
			{
				System.out.printf("%5d",arr[i][j]);
			}
			System.out.println();
		}
		
		//7번
		System.out.println("\n7번");
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = 0; j<arr[i].length;j++)
			{
			    if(j%2==0) arr[i][j] = 5*k*(j+1) - i;
			    else  arr[i][j] = 5*k*j + i+1;
			}
		}
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = 0; j<arr[i].length;j++)
			{
				System.out.printf("%5d",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void arrayTwoDemensionThree()	
	{
		Scanner sc = new Scanner(System.in);
		int firNum = 1;
		int secNum = 1;
		Random r = new Random();
		while(true) 
		{
			System.out.print("행의 길이를 입력하세요 : ");
			firNum = sc.nextInt();
			if(firNum<1 || firNum>10)
			{
				System.out.println("반드시 1~10사이의 정수를 입력해야합니다. ");
				continue;
			}
			System.out.print("열의 길이를 입력하세요 : ");
			secNum = sc.nextInt();
			if(secNum<1 || secNum>10)
			{
				System.out.println("반드시 1~10사이의 정수를 입력해야합니다. ");
				continue;
			}
			
			
			char [][] arr = new char[firNum][secNum];
			
			for(int i = 0; i<arr.length;i++)
			{
				for(int j = 0; j<arr[i].length;j++)
				{
					arr[i][j] = (char)('a' + r.nextInt(26));
					System.out.printf("%2c",arr[i][j]);
				}
				System.out.println();
			}
			break;
		}
	
	}
}