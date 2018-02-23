package kh.java.stdmng.student.vo;

public class Student {
	private String name;
	private int age;
	private String addr;
	private int kor;
	private int eng;
	private int math;
	public Student() {}
	public void setName(String name) {this.name = name;}
	public void setAge(int age) {this.age = age;}
	public void setAddr(String addr) {this.addr = addr;}
	public void setKor(int kor) {this.kor = kor;}
	public void setEng(int eng) {this.eng = eng;}
	public void setMath(int math) {this.math = math;}
	public String getName() {return this.name;}
	public int getAge() {return this.age;}
	public String getAddr() {return this.addr;}
	public int getKor() {return this.kor;}
	public int getEng() {return this.eng;}
	public int getMath() {return this.math;}	
	public int getSum() {return  this.kor + this.eng + this.math;}
	public double getAvr() {return getSum()/3;}
	public String getGrade() 
	{
		int tempNum = (int)getAvr()/10;
		switch(tempNum)
		{
			case 10 : return "S등급";
			case 9 : return "A등급";
			case 8 : return "B등급";
			case 7 : return "C등급";
			case 6 : return "D등급";
			case 5 : return "E등급";
			default : return "F등급";
		}

	}
}

