package org.milfist;

public class Utils {
	
	public static int sortByAgeDesc(Person a, Person b) {
		return a.getBirthday().compareTo(b.getBirthday());
	}
	
	public int sortByAgeUp(Person a, Person b) {
		return b.getBirthday().compareTo(a.getBirthday());
	}
	
}
