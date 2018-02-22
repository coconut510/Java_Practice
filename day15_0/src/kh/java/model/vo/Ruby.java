package kh.java.model.vo;

public class Ruby extends Grade {
	public Ruby() {}
	public Ruby(String name, String grade, int point)
	{
		super(name, grade, point);
	}
	
	@Override
	public double getInterest() {return this.getPoint() * 0.3;}
}
