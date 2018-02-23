package kh.java.point.model.vo;

public class Vip extends Grade {
	public Vip() {}
	public Vip(String name , String grade, int point)
	{
		super(name,grade, point);
	}
	@Override
	public double getInterest() { return getPoint()*0.1; }

}
