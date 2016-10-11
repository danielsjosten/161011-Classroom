import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {
	
	Person p = new Person("Daniel", "Sj�sten", 30, 'M');

	@Test
	public void testConstructorNames() {
		p.setFirstName("Daniel");
		assertEquals(p.getFirstName().equals("Daniel"),true);
		
		p.setLastName("Sj�sten");
		assertEquals(p.getLastName().equals("Sj�sten"), true);
	}
	@Test
	public void testAge() {
		p.setAge(29);
		assertEquals(p.getAge(), 29);
		
		p.setGender('M');
		assertEquals(p.getGender(), 'M');
	}

}
