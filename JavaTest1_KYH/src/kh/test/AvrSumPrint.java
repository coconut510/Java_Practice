package kh.test;

public class AvrSumPrint {
	public void asPrint()
	{
		int i= 1;
		double sum = 0;
		double avr = 0;
		while(i<101)
		{
			sum +=i;
			i+=1;
		}
		
		System.out.printf("ÇÕ°è : %.0f\n", sum);
		System.out.printf("Æò±Õ : %.1f\n", sum/100);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
