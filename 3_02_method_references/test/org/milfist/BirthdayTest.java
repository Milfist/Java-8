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
	public void methodReferencesDescendingOrder() {
		
		List<Person> list = this.getPersonList();
		
		Collections.sort(list, Utils::sortByAgeDesc);
		
		list.forEach((person)-> System.out.println(person.getBirthday()));
		
	}
	
	@Test
	public void methodReferencesAscendingOrder() {
		
		List<Person> list = this.getPersonList();
			
		Utils utils = new Utils();
		
		Collections.sort(list, utils::sortByAgeUp);
		
		list.forEach((person)-> System.out.println(person.getBirthday()));
		
	}
	
	private List<Person> getPersonList() {
		
		Person p1 = createPerson("Miguel", LocalDate.of (1982, Month.JANUARY, 1), Sex.MALE, "m@m.es");
		Person p2 = createPerson("Ramona", LocalDate.of (1986, Month.DECEMBER, 14), Sex.FEMALE, "r@r.es");
		
		List<Person> list = new ArrayList<Person>();
		
		list.add(p1);
		list.add(p2);
		
		return list;
	}
	
	private Person createPerson(String name, LocalDate birthday, Sex sex, String mail) {
		return new Person(name, birthday, sex, mail);
	}
	
}
