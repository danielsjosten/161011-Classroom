import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import otherclasses.Classroom;
import otherclasses.Student;

public class ClassroomTest {
	
	private ArrayList<Student> student;
	Classroom cr = new Classroom("Test16", "HT16", student);

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
	public void testStudent() {
		student.add
		assertEquals(stud.getAge(), 29);
		//assertEquals(stud.getAge(), 1);
	}
	
	@Test
	public void testGender() {
		assertEquals(stud.getGender(), 'M');
	}
	
	@Test
	public void testFirstGrade() {
		stud.setFirstGrade(1);
		assertEquals(stud.getFirstGrade(), 1, 0.00001);

	}
	
	@Test
	public void testSecondGrade() {
		stud.setSecondGrade(2);
		assertEquals(stud.getSecondGrade(), 2, 0.000001);
			}
	
	@Test
	public void testThirdGrade() {
		stud.setThirdGrade(3);
		assertEquals(stud.getThirdGrade(), 3, 0.000001);
	}

}
