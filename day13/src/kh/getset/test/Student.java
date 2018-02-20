package kh.getset.test;

public class Student {
	private String name;
	private int age = -1;
	private String addr = "정보가 없습니다.";
	private String hobby = "없음.";
	
	public Student(String name, int age, String addr, String hobby)
	{
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.hobby = hobby;
	}
	
	public Student(String name, int age, String addr)
	{
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	 
	public Student(String name)
	{
		this.name = name;
	}
	
	public void printData()
	{
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %s\n", age<0?age:"정보가 없습니다.");
		System.out.printf("주소 : %s\n", addr);
		System.out.printf("취미 : %s\n\n", hobby);
	}
}
