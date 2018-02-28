package kh.java.object;

public class Student implements Cloneable {
	private String name;	
	private int age;
	private String addr;
	
	public Student() {}
	public Student(String name, int age, String addr)
	{
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (addr == null) {
			if (other.addr != null)
				return false;
		} else if (!addr.equals(other.addr))
			return false;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String toString()
	{
		return this.name + "\t\t" + this.age + "\t\t" + this.addr;
	}
	
	public void setName(String name) {this.name = name;}
	public void setAge(int age) {this.age = age;}
	public void setAddr(String addr) {this.addr = addr;}
	public String getName() {return this.name;}
	public int getAge() {return this.age;}
	public String getAddr() {return this.addr;}
}
