package kh.project.exam;

import java.util.Random;

public class ExamFunc {
	public void example01(String[] args)
	{
		if(args.length>0)
		{
			for(int i = 0; i<Integer.parseInt(args[0]);i++)
			{
				System.out.println("Hello");
			}
		}
	}
	
	public void example02(String[] args)
	{
		if(args.length>0)
		{
			for(int i = 0; i<Integer.parseInt(args[1]);i++)
			{
				System.out.println(args[0]);
				try {
					Thread.sleep(Integer.parseInt(args[2]) * 1000);
				}  
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void example03(String[] args)
	{
		System.out.println("* " + args[1]);
		if(args.length>0)
		{
			switch(args[1])
			{
			case "+":
				System.out.println("Result " +(Integer.parseInt(args[0]) + Integer.parseInt(args[2])) );
				break;
			case "-":
				System.out.println("Result " + (Integer.parseInt(args[0]) - Integer.parseInt(args[2])) );
				break;
			case "x":
				System.out.printf("Result %d", (Integer.parseInt(args[0]) * Integer.parseInt(args[2])) );
				break;
			case "/":
				System.out.printf("Result %.2f" ,(double)Integer.parseInt(args[0]) / Integer.parseInt(args[2]) );
				break;
			}			
		}
	}
	
	public void example04(String[] args)
	{
		Random r = new Random();
		String comR = "";
		if(args.length>0)
		{		
			switch(r.nextInt(3))
			{
				case 0: comR = "바위"; break;					 					 
				case 1: comR = "가위"; break;									
				case 2: comR = "보"; break;									
			}
			
			System.out.println("============");
			System.out.printf("your is %s\n", args[0]);
			System.out.printf("com is %s\n", comR);
			System.out.println("============");
			if(comR.equals(args[0]))
			{
				System.out.println("Draw!");
			}
			else 
			{
				if((comR.equals("가위") && args[0].equals("바위")) ||
					(comR.equals("바위") && args[0].equals("보"))||
					(comR.equals("보") && args[0].equals("가위")))
					System.out.println("You Win!!");
					 
				else  System.out.println("Lose..");
			}
		}
	}
}