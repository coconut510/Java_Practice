package kh.java.thread;

public class Table {
	public synchronized void dataPrint(int num)
	{
		System.out.println("dataPrint 메소드가 호출되었습니다. " + num);
		for(int i  = 1; i<=9;i++)
		{
			System.out.println(num+"x" + i + "=" + (num*i));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void dataPrint2(int num)
	{
		System.out.println("dataPrint 메소드가 호출되었습니다. " + num);
		synchronized(this) 
		{
			for(int i  = 1; i<=9;i++)
			{
				System.out.println(num+"x" + i + "=" + (num*i));
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
