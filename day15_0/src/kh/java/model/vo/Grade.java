package kh.java.model.vo;

public abstract class Grade {
	private String name;
	private String grade;
	private int point;
	
	public void setName(String name) {this.name = name;}
	public void setGrade(String grade) {this.grade = grade;}
	public void setPoint(int point) {this.point = point;}
	public String getName() {return this.name;}
	public String getGrade() {return this.grade;}
	public int getPoint() {return this.point;}
	public abstract double getInterest();
	public Grade() {}
	public Grade( String name, String grade, int point )
	{
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
}
