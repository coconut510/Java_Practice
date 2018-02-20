package kh.getset.test;

public class Student {
	private String name;
	private int age = -1;
	private String addr = "������ �����ϴ�.";
	private String hobby = "����.";
	
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
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %s\n", age<0?age:"������ �����ϴ�.");
		System.out.printf("�ּ� : %s\n", addr);
		System.out.printf("��� : %s\n\n", hobby);
	}
}
