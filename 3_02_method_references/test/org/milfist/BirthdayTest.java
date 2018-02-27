package org.milfist;


import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.milfist.Person.Sex;

public class BirthdayTest {

	@Test
	public void methodReferences() {
		
		Person p1 = new Person("Miguel", LocalDate.of (1982, Month.JANUARY, 1), Sex.MALE, "m@m.es");
		Person p2 = new Person("Ramona", LocalDate.of (1986, Month.DECEMBER, 14), Sex.FEMALE, "r@r.es");
		
		List<Person> list = new ArrayList<Person>();
		
		list.add(p1);
		list.add(p2);
		
		Collections.sort(list, Utils::compareByAge);
		
	}
	

	
}
