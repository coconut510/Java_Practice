package kh.java.pay.model.vo;

public abstract class Employee {
	
	private String name;
	private String jobType;
	private int salary;
	private int timePay;
	public void setName(String name) {this.name = name;}
	public void setJobType(String jobType) {this.jobType = jobType;}
	public void setSalary(int salary) {this.salary = salary;}
	public void setTimePay(int timePay) {this.timePay = timePay;}
	public String getName() {return this.name;}
	public String getJobType() {return this.jobType;}
	public int getSalary() {return this.salary;}
	public int getTimePay() {return this.timePay;}
	public abstract double getTotalSalary();
	
	public Employee() {}
	public Employee(String name , String jobType, int salary)
	{
		this.name = name;
		this.jobType = jobType;
		this.salary = salary;
	}
	public Employee(String name , String jobType, int timePay, int salary)
	{
		this.name = name;
		this.jobType = jobType;
		this.salary = salary;
		this.timePay = timePay;
	}
}
