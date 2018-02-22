package kh.java.model.vo;

public class VVip extends Grade {

	public VVip() {}
	public VVip( String name, String grade, int point )
	{
		super(name, grade, point);
	}
	@Override
	public double getInterest() {return this.getPoint() * 0.2;}

}
