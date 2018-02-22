package kh.java.model.vo;

public class Gold extends Grade{

	public Gold() {}
	public Gold( String name, String grade, int point )
	{
		super(name, grade, point);
	}
	@Override
	public double getInterest() {return this.getPoint() * 0.03;}
}
