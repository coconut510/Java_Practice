package kh.practice.example;

import java.util.Random;
import java.util.Scanner;

public class ExamList {
	public void example01()
	{
		int  a  =1;
		int  b  =1;
		for(int i =0; i<5 ;i++)
		{
			for(int j = 0; j<5 ;j++)
			{				
				System.out.print("a" + a + " ");
				a++;
			}
			
			for(int k = 0; k<5 ;k++)
			{				
				System.out.print("b" + b + " ");
				b++;
			}
		}
	}
	
	public void example02()
	{
		for(int i =5; i<10; i++)
		{
			for(int j = 1; j<10;j++)
			{
				System.out.printf("%d x %d = %d \n", i , j , i*j);
			}
			System.out.println();
		}
	}
	
	public void example03()
	{
		for(int i = 2; i<10; i++)
		{
			for(int j = 1; j<10;j++)
			{
				if((i*j)>=10)System.out.printf("%dx%d=%d  ",i,j,i*j);
				else System.out.printf("%dx%d= %d  ",i,j,i*j);
			}
			System.out.println("");
		}
	}
	
	public void example04()
	{
		for(int i = 1; i<10;i++)
		{		
			for(int j = 2; j<10; j++)
			{
				if((i*j)>=10) System.out.printf("%dx%d=%d  ", j, i, i*j);
				else System.out.printf("%dx%d= %d  ",j,i,i*j);
			}
			System.out.println("");
		}
	}
	public void example05()
	{
		for(int i = 1; i<=5;i++)
		{
			for(int j = 0; j<i ;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void example06()
	{
		for(int i = 0; i<5;i++)
		{
			System.out.print("*");
		}
	}
	
	public void example07()
	{
		for(int i = 1; i<=5;i++)
		{
			for(int j = 1; j<=5;j++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}
	}
	
	public void example08()	
	{
		for( int i = 0; i<5;i++)
		{
			for(int j = 1+i; j<=5+i;j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}
	
	public void example09()
	{
		for(int i = 1; i<=5; i++)
		{
			for( int j = 0; j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void example10()
	{
		for(int i = 0; i<5;i++)
		{
			System.out.println("*");
		}
	}
	
	public void example11()
	{
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j<5 ; j++)
			{
				System.out.print("*");
				
			}
			System.out.println("");
		}
	}
	
	public void example12()
	{
		for(int i = 0; i<5; i++)
		{
			for(int j = 1; j<=5; j++)
			{
				System.out.print(j);
			}
			
			System.out.println("");
		}
	}
	public void example13()
	{
		for(int i = 5; i>0;i--)
		{
			
			for( int j = 0;j<5; j++ )
			{
				System.out.print(i+j);
			}
			System.out.println("");
		}
	}
	
	public void example14()
	{
		for(int i = 0; i<5;i++)
		{
			for(int j = 5-i; j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	
	public void example15()
	{
		for(int i = 0; i<5; i++)
		{
			for(int k = 0; k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j = 5-i ; j>0 ;j--)
			{
				
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void example16()
	{
		for(int i = 1; i<=5; i++)
		{
			for(int j = 5-i;j>=0;j-- )
			{
				System.out.print(" ");				 
			}
			for(int s = 0; s<i; s++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void example17()
	{
		int total = 10;
		for(int i = 0; i<total;i++)
		{
			if(i<total/2) 
			{
				for(int j = 0; j<=i;j++)
				{
						System.out.print("*");			
				}
			}
			else
			{
				for(int j = total-i-1; j>0;j--)
				{
						System.out.print("*");			
				}
			}
			System.out.println("");			
		}
	
	}
	
	
	public void example18()
	{
		int total = 20;
		for(int i = 0; i<total;i++)
		{
			if(i< (total/2 ) ) 
			{
				for(int j = (total/2)-i; j>0;j--)
				{
					System.out.print("*");	
				}				
			}
			else 
			{
				for(int j = 0; j <= i-(total/2)+1;j++)
				{				
						System.out.print("*");			
				}
			}
			System.out.println("");	
		}

	}
	
	public void example19()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ����� �� ���� �Է��ϼ��� : ");
		int lineNum = sc.nextInt();
		
		for(int i = 1; i<=lineNum ; i++)
		{
			for(int j = 0; j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void example20()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ����� �� ���� �Է��ϼ��� : ");
		int lineNum = sc.nextInt();
		for(int i = 0; i<lineNum;i++)
		{
			for(int j= 0; j<i+lineNum-3;j++)
			{
				System.out.print(" ");
			}
			for(int k= 0; k<lineNum;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}		
	}
	
	public void example21()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("===���� ���α׷� ===");
		char op ='a';
		int firNum = 0;
		int secNum = 0;
		for(;;)
		{
			System.out.print("������ �Է� (+, - . *, /(q ����) ) : ");
			op = sc.next().charAt(0);
			
			
			if(op=='q' || op=='Q') {
				System.out.println("���⸦ �����մϴ�.");
				break;
			}
			
			if(op!='+'&&op!='-'&&op!='*'&&op!='/') 
			{
				System.out.printf("������ %c�� �߸� �Է��ϼ̽��ϴ�.\n", op);
				continue;
			}
			
			
			System.out.print("ù ��° ���� �Է� : ");
			firNum = sc.nextInt();
			
			System.out.print("�� ��° ���� �Է� : ");
			secNum = sc.nextInt();
			
			System.out.print("�����");
			for(int i = 0; i<5;i++)
			{
				System.out.print(".");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println("\n\n======= ��� =======");
			
			switch(op)
			{
				case '+': System.out.printf("%d %c %d = %d", firNum, op, secNum,firNum + secNum );break;
				case '-': System.out.printf("%d %c %d = %d", firNum, op, secNum,firNum - secNum );break;
				case '*': System.out.printf("%d %c %d = %d", firNum, op, secNum,firNum * secNum );break;
				case '/': System.out.printf("%d %c %d = %.1f", firNum, op, secNum,(double)firNum / secNum );break;
			}
			System.out.println("");	
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clear();
		}
	}
	public void clear()
	{
		for(int i = 0; i<50;i++)
		{
			System.out.println();
		}
	}
	
	public void example22()
	{
		int numLine = 22;
		
		for(int i = 1; i<numLine;i++)
		{
			if(i< numLine/2 ) 
			{
				for(int j = 1; j <i; j++)
				{
					System.out.print(" ");
				}
				for(int k = 0; k <= (numLine/2) - i;k++)
				{
					System.out.print("*");
				}
			}
			else
			{
				for(int j = numLine - i; j > 1 ; j--)
				{
					System.out.print(" ");
				}				
				for(int k = 1; k <= (i - numLine/2) +1; k++)
				{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
	
	public void example23()
	{
		int i= 0;
		while(true)//for(int i =0; ; i++)
		{
			System.out.println(i);
			i+=1;
		}
	}
	
	public void example24()
	{
		Scanner sc = new Scanner(System.in);
		int sel = 0;
		int sum = 0;
		
		while(true)
		{
			System.out.print("���� ���� �Է��ϼ��� (���� ==0) : ");
			sel = sc.nextInt();
			if(sel==0) break;
			sum +=sel;
		}
		
		System.out.printf("�Է��Ͻ� ������ ��ü ���� %d�Դϴ�.", sum);
	}
	public void example25()
	{
		final int stand = 500000;
		int multiple = 1;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(true)
		{
			i+=1;
			System.out.println(i);
			if(i==(stand * multiple))
			{
				System.out.print("���α׷��� �ߴ��Ͻðڽ��ϱ�? (y/n)");
				if(sc.next().charAt(0)=='y') break;
				else multiple +=1; 
				i+=1;
			}
		}
	}
	
	public void example26()
	{
		int numLine =22;
		for( int i = 0; i<numLine;i++)
		{
			if(i<(numLine/2)) 
			{
				for(int j = 0; j<(numLine/2)-i;j++)
				{
					System.out.print(" ");
				}
				for(int k = 0; k<i+1 ;k++)
				{
					System.out.print("*");
				}
			}
			else
			{
				for(int j = 0; j<i-(numLine/2)+2; j++)
				{
					System.out.print(" ");
				}
				for( int k = 0 ; k< (numLine) - i-1; k++)
				{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
	
	public void example27()
	{
		int numLine = 10;
		for( int i = 0; i<numLine; i++)
		{
			for(int j = 0; j<numLine - i;j++)
			{
				System.out.print(" ");
			}
			for(int k = 0; k<2*i + 1;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	
	public void example28()
	{
		int numLine = 14;
		for( int i = 0; i<numLine; i++)
		{
			for(int j = 0; j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k = 0; k<(numLine-i-1)*2 + 1;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public void example29()
	{
		int numLine = 20;
		for( int i = 0; i<numLine; i++)
		{
			if(i < numLine/2) 
			{
				for(int j = 0; j< (numLine/2) - i;j++)
				{
					System.out.print(" ");
				}
				for(int k = 0; k<(2*i + 1);k++)
				{
					System.out.print("*");
				}
			}
			else
			{
				for(int j = 0; j<i - (numLine/2) +2;j++)
				{
					System.out.print(" ");
				}
				for(int k = 0; k<(numLine-i-2)*2 + 1;k++)
				{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
	}
	
	public void example30()
	{
		Random r = new Random();
		
		while(true)
		{
			int data = r.nextInt(6)+1;
			System.out.println(data);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void example31()
	{
		Random r = new Random();
		
		while(true)
		{
			System.out.printf("0~9 ������ ���� �� : %d \n", r.nextInt(10));
			System.out.printf("1~10 ������ ���� �� : %d \n", r.nextInt(10)+1);
			System.out.printf("20~35 ������ ���� �� : %d \n", r.nextInt(16)+20);
			System.out.printf("0�Ǵ� 1: %d \n", r.nextInt(2));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
		}
	}
	public void example32()
	{
		int numLine = 10;
		for( int i = 0; i<numLine;i++)
		{
//			for( int j = 0;j<)
		}
	}
	
	public void example33()
	{
		Random r = new Random();
		
		while(true)
		{
			
			System.out.printf("0~45 ������ ���� �� : %d \n", r.nextInt(46));
			System.out.printf("1~55 ������ ���� �� : %d \n", r.nextInt(55)+1);
			System.out.printf("23~45 ������ ���� �� : %d \n", r.nextInt(23)+23);
			System.out.printf("55~80 ������ ���� �� : %d \n", r.nextInt(26)+55);
			System.out.printf("17~50 ������ ���� �� : %d \n", r.nextInt(34)+33);
			System.out.printf("34~40 ������ ���� �� : %d \n", r.nextInt(7)+34);
			System.out.printf("80~120 ������ ���� �� : %d \n", r.nextInt(41)+80);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
		}
	}
	 public void example34() {
	        for(int i=5;i>=1;i--) {
	            for(int j=1;j<=i;j++) {
	                System.out.print("*");
	            }
	            for(int k=1;k<=((5-i)*2)+1;k++) {
	                System.out.print(" ");
	            }
	            for(int l=1;l<=i;l++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
//	        for(int m=2;m<=5;m++) {
//	            for(int n=1;n<=m;n++) {
//	                System.out.print("*");
//	            }
//	            for(int o=1;o<=((5-m)*2)+1;o++) {
//	                System.out.print(" ");
//	            }
//	            for(int p=1;p<=m;p++) {
//	                System.out.print("*");
//	            }
//	            System.out.println();
//	        }
	    }

}