package student.controller;

import java.util.ArrayList;
import java.util.Collections;

import student.vo.Student;

public class StudentController {
	private ArrayList<Student> s = new ArrayList<Student>();	
	public ArrayList<Student> selectAll()
	{
		Collections.sort(s);
		return s;
	}
	
	public Student selectOne(int classNumber)
	{		
		Student tempStu = null;
		for(int i = 0; i<s.size();i++)
		{
			if(s.get(i).getClassNumber() == classNumber)
			{
				tempStu = s.get(i);
				break;
			}
		}
		return tempStu;
	}
	
	public boolean insertStudent(Student s)
	{
		return this.s.add(s);
	}
	
	
	public void updateStudent(Student oldStudent, Student newStudent)
	{
		s.set(s.indexOf(oldStudent), newStudent);
	}
	
	public void deleteStudent(int classNumber)
	{
		s.remove(classNumber);
	}
}