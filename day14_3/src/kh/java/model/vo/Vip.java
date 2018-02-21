package kh.java.model.vo;

public class Vip {
	private String name;
	private String grade;
	private int point;
	
	public void setName(String name) {this.name = name;}
	public void setGrade(String grade) {this.grade = grade;}
	public void setPoint(int point) {this.point = point;}
	public String getName() {return this.name;}
	public String getGrade() {return this.grade;}
	public int getPoint() {return this.point;}
	public double getInterest() {return getPoint()*0.05;}

	public Vip()
	{
		
	}
	public Vip(String name, String grade, int point)
	{
		setName(name);
		setGrade(grade);
		setPoint(point);
	}
}
