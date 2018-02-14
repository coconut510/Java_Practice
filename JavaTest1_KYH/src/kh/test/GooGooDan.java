package kh.test;

public class GooGooDan {
	public void googoo()
	{
		for(int i = 3; i<6;i++)
		{
			if(i%2==1)
			{
				System.out.printf("\n====%d´Ü Ãâ·Â====\n\n",i);
				for(int j = 1; j<10;j++)
				{
					System.out.printf("%d * %d = %d\n", i,j,i*j);
				}
			}
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
