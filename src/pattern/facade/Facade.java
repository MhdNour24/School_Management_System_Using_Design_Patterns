package pattern.facade;

import java.util.List;

import models.Student;
import models.Teacher;


public class Facade {
	
	List<Student> students;
	Teacher classTeacher;
	
	public Facade() {
		super();
	}
	public Facade(List<Student> students, Teacher classTeacher) {
		super();
		this.students = students;
		this.classTeacher = classTeacher;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public String getClassTeacherName() {
		return this.classTeacher.getName();
	}

}