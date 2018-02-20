package kh.getset.test;

public class TestClass {
	private static int count = 0;
	public TestClass()
	{
		increCount();
	}
	public void setCount(int count)
	{
		this.count = count;
	}
	public int getCount()
	{
		return this.count;
	}
	public void increCount()
	{
		this.count++;
	}
}

