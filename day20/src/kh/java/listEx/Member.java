package kh.java.listEx;

public class Member implements Comparable {
	private int number;
	private String name;
	private int age;
	private String addr;
	public Member() {}
	public Member(String name, int age, String addr)
	{
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	@Override
	public String toString()
	{
		return "학번 : " + this.number + " / 이름 : " + this.name + " / 나이 : " + this.age + " / 주소 : " + this.addr  ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public int compareTo(Object arg0) {
		return this.number - ((Member)arg0).number;
		// return (this.name.compareTo(arg0.getName());// 문자 오름차수.
	}
}
