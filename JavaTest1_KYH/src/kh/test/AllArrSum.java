package kh.test;

public class AllArrSum {
	public void sumResult()
	{
		int [][] array =  {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}}; 
		int sum = 0;
		int arrCount = 0;
		for(int i = 0; i<array.length;i++)
		{
			for(int j = 0; j<array[i].length;j++)
			{
				sum += array[i][j];
				arrCount+=1;
			}
		}
		
		System.out.printf("ÇÕ°è : %d\n", sum );
		System.out.printf("Æò±Õ : %.3f\n",(double) sum/arrCount );
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
