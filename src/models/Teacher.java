package models;

import java.util.List;
import java.util.Set;

public class Teacher extends Person  {
	
	protected List<Student> students ;
	protected String qualification;
	protected int numberOfStudents;
	

	public Teacher(int i) {
		this.id = i;
	}

	@Override
	public long getAmount() {
		return this.amount;
	}

	@Override
	public void setAmount(long salary) {
		this.amount = salary;
	}
	

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	

}
