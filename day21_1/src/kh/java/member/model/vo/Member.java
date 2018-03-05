package kh.java.member.model.vo;

public class Member {
	
	private String id;
	private String password;
	private String name;
	private int age;
	private String phoneNum;
	public Member() {}
	public Member(String id, String password, String name, int age, String phoneNum) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum;
	}
	
	@Override
	public String toString()
	{
		return "���̵� : " + this.id + "\n"
				+ "��й�ȣ : " + this.password + 
				"\n�̸� : " + this.name + 
				"\n���� : " + this.age + 
				"\n�� ��ȣ : " + this.phoneNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	

}
