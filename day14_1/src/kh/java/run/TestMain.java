package kh.java.run;

import kh.java.controller.StuMgr;
import kh.java.model.vo.Student;

public class TestMain 
{
	public static void main(String[] args) 
	{
		StuMgr m = new StuMgr();
		m.insertStudent(new Student("ȫ�浿", 20, "��⵵"));
		m.insertStudent(new Student("�踻��", 30, "��õ"));
		m.insertStudent(new Student("��浿", 40, "����"));
		m.insertStudent(new Student("��浿", 50, "������"));
		m.insertStudent(new Student("��û��", 29, "�Ⱦ��"));
		m.insertStudent(new Student("������", 33, "��û��"));
		m.insertStudent(new Student("��ϵ�", 54, "�����"));
		m.insertStudent(new Student("��浿", 23, "���ȱ�"));		
		m.viewAllStudent();
	}
}
