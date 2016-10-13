import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import otherclasses.Classroom;
import otherclasses.Student;

public class ClassroomTest {
	ArrayList<Student> students = new ArrayList<Student>();
	Classroom cr = new Classroom("Test16", "HT16", students);
	Student student1 = new Student("Danne", "Sjösten", 28, 'M', 8.2, 9.0, 6.0);

	@Test
	public void testclassRoomName() {
		cr.setClassroomName("Test17");
		assertEquals(cr.getClassroomName(), "Test17");
	}

	@Test
	public void testTerm() {
		cr.setClassroomTerm("VT17");
		assertEquals(cr.getClassroomTerm(), "VT17");
	}

	@Test
	public void testSetAndGetStudents() {
		cr.addANewStudent(student1);
		cr.setStudents(students);
		cr.getStudents();
		//assertArrayEquals(expecteds, actuals); ??
	}
	
	@Test
	public void testRemoveStudentFromArrayList() {
		Student student1 = new Student("Danne", "Sjösten", 28, 'M', 8.2, 9.0, 6.0);
		cr.removeAStudent(student1.getFirstName());
	}
	
	@Test
	public void testPrintRelatory() {
		Student student1 = new Student("Danne", "Sjösten", 28, 'M', 8.2, 9.0, 6.0);
		Student student2 = new Student("Danne", "Sjösten", 28, 'M', 8.2, 9.0, 6.0);
	cr.printFullRelatory();
	}
	
}
