package testing;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import models.Student;
import models.Teacher;
import pattern.facade.Facade;
import pattern.factory.PersonFactory;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FacadeTesting {

    private Facade facade;
    private List<Student> students;
    private Teacher classTeacher;

    @BeforeEach
    public void setUp() {

    	classTeacher = new Teacher(1);
        classTeacher.setName("AhmetArifHoca");

        students = new ArrayList<>();
        Student student1 = new Student(1);
        student1.setName("Ali");
        Student student2 = new Student(2);
        student2.setName("Muhammed");

        students.add(student1);
        students.add(student2);

        facade = new Facade(students, classTeacher);
    }

    @Test
    public void testGetStudents() {
        List<Student> studentList = facade.getStudents();
        assertNotNull(studentList);
        assertEquals(2, studentList.size());
        assertEquals("Ali", studentList.get(0).getName());
        assertEquals("Muhammed", studentList.get(1).getName());
    }
    
    @Test
    public void testgetClassTeacherName()
    {
    	String teacherName = classTeacher.getName() ;
    	assertEquals("Ahmet", teacherName);
    }

}
