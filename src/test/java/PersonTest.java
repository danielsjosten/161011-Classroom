import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {
	
	Person p = new Person("Daniel", "Sjösten", 30, 'M');

	@Test
	public void testConstructorNames() {
		p.setFirstName("Daniel");
		assertEquals(p.getFirstName().equals("Daniel"),true);
		
		p.setLastName("Sjösten");
		assertEquals(p.getLastName().equals("Sjösten"), true);
	}
	@Test
	public void testAge() {
		p.setAge(29);
		assertEquals(p.getAge(), 29);
		
		p.setGender('M');
		assertEquals(p.getGender(), 'M');
	}

}
