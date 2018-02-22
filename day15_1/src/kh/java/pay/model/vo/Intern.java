package kh.java.pay.model.vo;

public class Intern extends Employee {
	
	public Intern() {}
	public Intern(String name, String jobType, int salary)
	{
		super(name, jobType, salary);
	}
	@Override
	public double getTotalSalary() {return this.getSalary() * 0.8;}
}
