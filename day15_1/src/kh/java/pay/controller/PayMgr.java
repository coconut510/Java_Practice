package kh.java.pay.controller;

import kh.java.pay.model.vo.Employee;

public class PayMgr {
	private Employee[] e = new Employee[10];
	private int index = 0;
	public void insertData(Employee e)
	{
		this.e[index++] = e;
	}
	public void showData()
	{
		System.out.println("<<===============��� ���===============>>");
		System.out.println("�̸�\t\t�з�\t\t�޿�");
		for(int i = 0; i<index;i++)
		{
			System.out.printf("%s\t\t%s\t\t%.0f\n", e[i].getName(), e[i].getJobType(), e[i].getTotalSalary());
		}
	}
}
