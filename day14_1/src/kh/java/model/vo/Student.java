package kh.java.model.vo;

public class Student {
	private String name;
	private int age;
	private String addr;
	public void setName(String name) {this.name = name;}
	public void setAge(int age) {this.age = age;}
	public void setAddr(String addr) {this.addr = addr;}
	public String getName() {return this.name;}
	public int getAge() {return this.age;}
	public String getAddr() {return this.addr;}
	public Student() {}
	public Student(String name, int age, String addr)// 오버로딩으로 만들기.
	{
		setName(name);
		setAge(age);
		setAddr(addr);
	}
}
