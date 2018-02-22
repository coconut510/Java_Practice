package kh.java.pay.model.vo;

public class PartTime  extends Employee{
	private int pay ;
	public PartTime() {}
	public PartTime(String name, String jobType,int timePay, int salary)
	{
		super(name, jobType, salary);
		this.pay = timePay;
	}
	@Override
	public double getTotalSalary() {return 	this.pay * this.getSalary();}
}
