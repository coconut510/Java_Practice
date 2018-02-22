package kh.java.pay.model.vo;

public class Permanent extends Employee{
	public Permanent() {}
	public Permanent(String name, String jobType, int salary)
	{
		super(name, jobType, salary);
	}
	@Override
	public double getTotalSalary() {return this.getSalary();}
}
