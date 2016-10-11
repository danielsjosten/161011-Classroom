import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Student;

public class StudentTest {

	
	Student stud = new Student("Daniel", "Sjösten", 29, 'M', 1, 2, 3);
	Student stud1 = new Student("Kalle", "Sjösten", 28, 'M');
	
	
	@Test
	public void testFirstName() {
		assertEquals(stud.getFirstName(), "Daniel");
	}
	
	@Test
	public void testLastName() {
		assertEquals(stud.getLastName(), "Sjösten");
	}
	
	@Test
	public void testAge() {
		assertEquals(stud.getAge(), 29);
	}
	
	@Test
	public void testGender() {
		assertEquals(stud.getGender(), 'M');
	}
	
	@Test
	public void testFirstGrade() {
	stud.setFirstGrade(1);
	stud.getFirstGrade();
		assertEquals(stud.getSecondGrade(), stud.getFirstGrade());

	}
	
	@Test
	public void testSecondGrade() {
		stud.setSecondGrade(2);
		stud.getSecondGrade();
		assertEquals(stud.getSecondGrade(), 2.0);
		
	}
	
	@Test
	public void testThirdGrade() {
		stud.setThirdGrade(3);
		stud.getThirdGrade();
		assertEquals(stud.getThirdGrade(), 3.0);
	}
	
//	@Test
//	public void testThirdGrade() {
//		assertEquals(stud.getThirdGrade(), 3.0);
//	}

}
