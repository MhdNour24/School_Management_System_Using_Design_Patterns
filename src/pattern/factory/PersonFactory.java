package pattern.factory;

import models.AdminSingleton;
import models.Person;
import models.Student;
import models.Teacher;
import models.Worker;

public class PersonFactory {
	static int i = 0;
	public Person getObject(String name) {
		
		if(name.equalsIgnoreCase("student"))
		{
			return new Student(i++);
		}
		else if(name.equalsIgnoreCase("Teacher"))
		{
			return new Teacher(i++);
		}
		else if(name.equalsIgnoreCase("worker"))
		{
			return new Worker(i++);
		}
		else if(name.equalsIgnoreCase("Admin"))
		{
			return AdminSingleton.INSTANCE.getInstance();
		}
		else
			return null;
	}
}
