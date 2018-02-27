package org.milfist;

public class Utils {
	public static int compareByAge(Person a, Person b) {
		return a.getBirthday().compareTo(b.getBirthday());
	}
}
