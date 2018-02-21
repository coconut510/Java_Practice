package kh.java.run;

import kh.java.controller.StuMgr;
import kh.java.model.vo.Student;

public class TestMain {

	public static void main(String[] args) {
		StuMgr m = new StuMgr();
		m.insertStudent(new Student("홍길동", 20, "경기도"));
		m.insertStudent(new Student("김말똥", 30, "인천"));
		m.insertStudent(new Student("고길동", 40, "서울"));
		m.viewAllStudent();
		m.deleteStudent("고길동");
		m.viewAllStudent();
	}

}
