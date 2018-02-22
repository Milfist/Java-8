package org.milfist;

import org.junit.Test;

import org.junit.Assert;

public class TestM {

	@Test
	public void test() {
		
		Double num1 = 2.0;
		Double num2 = 3.0;
		
		Problem p = new Problem(num1, num2);		

		Assert.assertEquals((Double)Math.pow(num1, num2), p.getResult());
		
	}
}
