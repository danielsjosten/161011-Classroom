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
	
	@Test
	public void testAverageGrade() {
		double average = stud.getFirstGrade() + stud.getSecondGrade() + stud.getThirdGrade()/3;
		stud.setAverageGrade(average);
		assertEquals(stud.getAverageGrade(), average, 0.000001);
		
	}
	
	@Test
	public void testCalculateAverage1() {
		double sum = stud.getFirstGrade() +stud.getSecondGrade() +stud.getThirdGrade();
		double average = sum /3;
		stud.setAverageGrade(average);
		assertEquals(stud.calculateAverage(), average, 0.000001);
	}
	
	@Test
	public void testHasClearedCourse() {
		stud.setAverageGrade(6);
		assertEquals(stud.hasClearedTheCourse(), true);
		stud.setAverageGrade(4);
		assertEquals(stud.hasClearedTheCourse(), false);
	}
	


}
