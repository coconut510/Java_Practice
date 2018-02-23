package kh.java.point.model.vo;

public class Gold extends Grade{
	public Gold() {}
	public Gold(String name , String grade, int point)
	{
		super(name,grade, point);
	}
	@Override
	public double getInterest() { return getPoint()*0.05; }

}
