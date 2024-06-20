package models;

public class Student extends Person {
	
	protected Teacher classTeacher;
    protected int classStandard;
    protected char section;
    
	public Student(int i) {
		this.id = i;
	}

	@Override
	public long getAmount() {
		return this.amount;
	}

	@Override
	public void setAmount(long fees) {
		this.amount = fees;
	}
	

	public Teacher getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(Teacher classTeacher) {
		this.classTeacher = classTeacher;
	}

	public int getClassStandard() {
		return classStandard;
	}

	public void setClassStandard(int classStandard) {
		this.classStandard = classStandard;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}
	
}

