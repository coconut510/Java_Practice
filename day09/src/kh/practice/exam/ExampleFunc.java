package kh.practice.exam;

import java.util.Random;
import java.util.Scanner;

public class ExampleFunc {
	
	public void bubbleSort()
	{
		System.out.println("<<���� ����>>");
		int [] arr = new int[5];
		int temp=0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<arr.length;i++ ) 
		{
			System.out.printf("%d��° ���� �Է� :",i+1);
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
		
		System.out.println("<<���� ����>>");
		int [] arr = new int[5];
		int minNum = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<arr.length;i++ ) 
		{
			System.out.printf("%d��° ���� �Է� :",i+1);
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
		int [] arrU = new int[5];// ���ĵ��� ���� ���ҵ�
		int sNum = 0;// ���� ��ȣ.
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<arrU.length;i++ ) 
		{
			System.out.printf("%d��° ���� �Է� :",i+1);
			arrU[i] = sc.nextInt();
		}
		
		for(int i = 1; i<arrU.length-1;i++)
		{
			sNum = arrU[i];
			for(int j = i; j>0; j--)
			{
				if(sNum < arrU[i])// ���ذ��� ���� ������.
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
		System.out.println("���� ���� ���α׷� v1.0");
		
		while(true) 
		{			
			System.out.println("1.�Խ�\t2.���\t3.�溸��\t4.����");
			System.out.print("����>");
			selectNum = sc.nextInt();
			switch(selectNum)
			{
				case 1:
					System.out.print("\n����濡 �Խ��Ͻðڽ��ϱ�?");
					room = sc.nextInt();
					
					if(room>10||room<1) System.out.println("���� 1ȣ�Ǻ��� 10ȣ�Ǳ����� �ֽ��ϴ�.");
					else 
					{
						if(roomNum[room-1]==0 ) 
						{
							System.out.printf("\n%d���濡 �Խ��ϼ̽��ϴ�.\n\n", room);
							roomNum[room-1] = 1;
						}
						else
						{
							System.out.printf("\n%d������ ���� �մ��� �ֽ��ϴ�\n\n", room);
						}
					}
					break;
				case 2:
					System.out.print("\n����濡 �Խ��Ͻðڽ��ϱ�?");
					room = sc.nextInt();
					if(room>10||room<1) System.out.println("���� 1ȣ�Ǻ��� 10ȣ�Ǳ����� �ֽ��ϴ�.");
					else 
					{
						if(roomNum[room-1]==1 ) 
						{
							System.out.printf("\n%d���濡�� ����ϼ̽��ϴ�.\n", room);
							roomNum[room-1] = 0;
						}
						else
						{
							System.out.printf("\n%d������ ���� ����Դϴ�.\n", room);
						}
					}
					break;					
				case 3:		
					for(int i = 0; i<roomNum.length;i++)
					{
						if(roomNum[i]==0) System.out.printf("%d������ ���� ����ֽ��ϴ�.\n\n", i+1);											
						else System.out.printf("%d���濡�� ���� �մ��� �ֽ��ϴ�.\n\n", i+1);
					}
					break;
				case 4:
					System.out.println("���α׷��� �����մϴ�.");
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
		System.out.print("���ڿ��� �Է����ּ��� : ");
		String str = sc.nextLine();
		System.out.print("�˻��Ϸ��� ���ڸ� �Է����ּ��� : ");
		char c = sc.next().charAt(0);
		int count = 0;
		
		for(int i = 0; i<str.length();i++)
		{
			if(str.charAt(i)==c) count+=1;
		}
		System.out.printf("�Է��Ͻ� ���ڿ� %s���� \nã���ô� ���� %c��  %d���Դϴ�.\n", str,c,count);
	}
	
	public void phoneNumHide()
	{
		char[] phoneNum = new char[13]; 		// ���� .
		char[] copyPhoneList = new char[phoneNum.length];// ī��.
		String phoneStr = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȭ��ȣ �Է� : ");
		
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
		
		System.out.println("��ȭ��ȣ ����");
		for(int i = 0; i<phoneStr.length();i++)
		{
			System.out.print(phoneNum[i]);
		}
		System.out.println("\n��ȭ��ȣ  ������ �迭");
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
		System.out.println("<<�ζ� ��ȣ ��÷!>>");
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
				System.out.printf("��ȣ %d\t", lottoMySelect[i]);
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
		int winnerTurn = 0;// ��ȸ���� 1���� �ߴ���.
		int secWinTurn = 0;// 2�� Ƚ��.
		int thdWinTurn = 0;// 3��Ƚ��.
		int totalTurn = 0;// �� �ζ� ȸ��.
		int matchNumCount = 0;// ���� Ƚ��.
		String myLottoNumStr = "";
		int tempLotto =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("<<�ζ� ��÷ ���α׷�>>");
		
		for(int i = 0; i<6;i++) 
		{
			System.out.printf("%d��° ��ȣ�� �����ּ���.( %s ) => ", i+1,myLottoNumStr);
			boolean chk = true;
			tempLotto = sc.nextInt();		
			for(int j = 0; j<myLotto.length;j++)
			{
				if(tempLotto==myLotto[j])
				{
					System.out.println("�̹� �Է��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
					i-=1;
					chk = false;
					break;
				}				
				if(1>tempLotto|| tempLotto>45)
				{
					System.out.println("�Է��Ҽ� �ִ� ��ȣ�� ������ ������ϴ�.\n�ٽ� �Է����ּ���.");
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
		System.out.printf("�Է��� �ζ� ��ȣ ( %s )\n",myLottoNumStr);
		bubblePar(myLotto);// �������ֱ�.
		
		
		
		//�ζǹ�ȣ ��÷
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
			
			// ���� �Է��� �ζǹ�ȣ�� ���ϰ�, ��÷�� �ζ� ��ȣ ������ֱ�.
			System.out.printf("%dȸ�� : ",totalTurn);
			for(int i = 0; i<lottoMySelect.length;i++)
			{
				if(myLotto[i]==lottoMySelect[i])matchNumCount +=1;
				System.out.printf("��ȣ %d\t", lottoMySelect[i]);
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
					
					System.out.printf("����� %d������ 1���� ��÷�Ǿ����ϴ�.\n", winnerTurn);
					
					System.out.println("=================================");
					System.out.printf( "2�� ��÷Ƚ�� : %d��\n",secWinTurn); 
					System.out.printf( "3�� ��÷Ƚ�� : %d��\n",thdWinTurn); 
					System.out.printf( "%dȸ ���� ������ �ݾ�(Ƚ�� * 1000��) : %d��\n",totalTurn, totalTurn*1000); 
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
		
		//1��
		System.out.println("\n1��");
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
		
		//2��
		System.out.println("\n2��");
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
		
		//3��
		System.out.println("\n3��");
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
		
		
		//4��
		System.out.println("\n4��");
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
		
		//5��
		System.out.println("\n5��");
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
		
		//6��
		System.out.println("\n6��");
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
		
		//7��
		System.out.println("\n7��");
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
			System.out.print("���� ���̸� �Է��ϼ��� : ");
			firNum = sc.nextInt();
			if(firNum<1 || firNum>10)
			{
				System.out.println("�ݵ�� 1~10������ ������ �Է��ؾ��մϴ�. ");
				continue;
			}
			System.out.print("���� ���̸� �Է��ϼ��� : ");
			secNum = sc.nextInt();
			if(secNum<1 || secNum>10)
			{
				System.out.println("�ݵ�� 1~10������ ������ �Է��ؾ��մϴ�. ");
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