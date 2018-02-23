package kh.java.point.model.vo;

public abstract class Grade {
//	private static String[] cArr = new String[10];
//	private int index = 0;
	private String name;
	private String grade;
	private int point;
	
	public Grade() {}
	public Grade(String name, String grade, int point)
	{
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
//	public void getCArr(String cName) {Grade.cArr[index++] = cName;}	
	public void setName(String name) {this.name = name;}
	public void setGrade(String grade) {this.grade = grade;}
	public void setPoint(int point) {this.point = point;}
	public String getName() {return this.name;}
	public String getGrade() {return this.grade;}
	public int getPoint() {return this.point;}
//	public int getCArrLength() {return this.index;}
	public abstract double getInterest();
}
