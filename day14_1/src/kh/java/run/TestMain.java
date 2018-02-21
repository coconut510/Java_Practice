package kh.java.run;

import kh.java.controller.StuMgr;
import kh.java.model.vo.Student;

public class TestMain 
{
	public static void main(String[] args) 
	{
		StuMgr m = new StuMgr();
		m.insertStudent(new Student("홍길동", 20, "경기도"));
		m.insertStudent(new Student("김말똥", 30, "인천"));
		m.insertStudent(new Student("고길동", 40, "서울"));
		m.insertStudent(new Student("김길동", 50, "강원도"));
		m.insertStudent(new Student("삼청동", 29, "안양시"));
		m.insertStudent(new Student("석수동", 33, "충청도"));
		m.insertStudent(new Student("상암동", 54, "서울시"));
		m.insertStudent(new Student("김길동", 23, "만안구"));		
		m.viewAllStudent();
	}
}
