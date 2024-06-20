package testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import models.Person;
import models.Student;
import models.Teacher;
import pattern.iterator.StudentArrayListIterator;
import pattern.facade.Facade;
import pattern.factory.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class StudentArrayListIteratorTest {
	int i=0;
	ArrayList<Object> items = new ArrayList<Object>();
	PersonFactory pFactoryIterator = new PersonFactory();
	StudentArrayListIterator iterator = new StudentArrayListIterator();
    @BeforeEach
    public void setUp() {
		while(i <= 2)
		{
			Person temp = pFactoryIterator.getObject("Student");
			temp.setId(i);
			items.add(temp);
			i++;
		}
		Person temp = pFactoryIterator.getObject("teacher");
		temp.setId(i);
		items.add(temp);

        
        iterator.setItems(items);

    }

    @Test
    public void testHasNext() {

        assertTrue(iterator.hasNext());
        iterator.next();
        assertTrue(iterator.hasNext()); 
        iterator.next();
        assertTrue(iterator.hasNext());
        iterator.next();
        assertTrue(iterator.hasNext()); 
        iterator.next();
        assertTrue(iterator.hasNext());
        iterator.next();
    }


}