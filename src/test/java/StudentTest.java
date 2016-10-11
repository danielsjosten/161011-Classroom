import static org.junit.Assert.assertEquals;

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
		assertEquals(stud.getAge(), 1);
	}
	
	@Test
	public void testGender() {
		assertEquals(stud.getGender(), 'M');
	}
	
	@Test
	public void testFirstGrade() {
		stud.setFirstGrade(1);
	//assertEquals(stud.setSecondGrade(1), stud.getFirstGrade(), 1);
	

	}
	
	@Test
	public void testSecondGrade() {
		stud.setSecondGrade(2);
		stud.getSecondGrade();
		//assertEquals(stud.getSecondGrade(), 2.0);
		
	}
	
	@Test
	public void testThirdGrade() {
		stud.setThirdGrade(3);
		stud.getThirdGrade();
		//assertEquals(stud.getThirdGrade(), 3.0);
	}
	
	@Test
	public void testAverageGrade() {
		double average = stud.getFirstGrade() + stud.getSecondGrade() + stud.getThirdGrade()/3;
		stud.setAverageGrade(average);
		stud.getAverageGrade();
		
	}
	
	@Test
	public void testCalculateAverage1() {
		double average = stud.getFirstGrade() + stud.getSecondGrade() + stud.getThirdGrade()/3;
		stud.setAverageGrade(average);
		
		
		
	}
	
	@Test
	public void testHasClearedCourse() {
		stud.setAverageGrade(6);
		assertEquals(stud.hasClearedTheCourse(), true);
		stud.setAverageGrade(4);
		assertEquals(stud.hasClearedTheCourse(), false);
	}

}
