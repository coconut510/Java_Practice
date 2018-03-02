package student.vo;


public class Student implements Comparable {
	private int classNumber;
	private String name;
	private int age;
	private String address;
	private double grade;
	public Student() {}
	
	@Override
	public String toString()
	{
		return this.classNumber + "\t\t\t" + this.name + "\t\t\t" + this.age
				+ "\t\t\t" + this.address+ "\t\t\t" + this.grade;
	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public int compareTo(Object s) {
		return this.classNumber - ((Student)s).classNumber;
		// return (this.name.compareTo(arg0.getName());// 문자 오름차수.
	}
}
