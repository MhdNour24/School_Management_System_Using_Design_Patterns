package main;
import java.util.*;

import models.Person;
import models.Student;
import models.Teacher;
import pattern.facade.Facade;
import pattern.factory.PersonFactory;
import pattern.iterator.StudentArrayListIterator;
public class SchoolManagementMain {
	
	private static Scanner scan;
	public static void main(String[] args) {
		PersonFactory pFactoryIterator = new PersonFactory();
		
		int i=0;
		ArrayList<Object> personList = new ArrayList<Object>();
		while(i <= 5)
		{
			Person temp = pFactoryIterator.getObject("Student");
			temp.setId(i);
			personList.add(temp);
			System.out.println("Added Student : "+temp.getId());
			i++;
		}
		while(i <= 8)
		{
			Person temp = pFactoryIterator.getObject("teacher");
			temp.setId(i);
			personList.add(temp);
			System.out.println("Added teacher : "+temp.getId());
			i++;
		}
		System.out.println("Size Of Array List : "+personList.size());
		
		StudentArrayListIterator iterator = new StudentArrayListIterator();
		iterator.setItems(personList);
		
		while(iterator.hasNext())
		{
			System.out.println(" Id : "+ ((Person)iterator.next()).getId());
		}

		
	}

}
