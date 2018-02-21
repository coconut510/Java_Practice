package kh.java.model;

public class Student {
	private int number;
	private String name;
	private int age;
	private String addr;
	private char gender;
	private double grade;
	
	public void setNumber(int number) {this.number = number;}
	public void setName(String name) {this.name = name;}
	public void setAge(int age) {this.age = age;}
	public void setAddr(String addr) {this.addr = addr;}
	public void setGender(char gender) {this.gender = gender;}
	public void setGrade(double grade) {this.grade = grade;}
	public int getNumber() {return this.number;}
	public String getName() {return this.name;}
	public int getAge() {return this.age;}
	public String getAddr() {return this.addr;}
	public char getGender() {return this.gender;}
	public double getGrade() {return this.grade;}
}
