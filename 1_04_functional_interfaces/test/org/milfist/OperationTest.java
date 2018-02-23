package org.milfist;

import org.junit.Assert;
import org.junit.Test;

public class OperationTest {

	@Test
	public void getSumTest() {
		
		Integer num1 = 21;
		Integer num2 = 67;
		Operation op;
		
		OperationImpl o = new OperationImpl(num1, num2);
		op = o.getSum();
		
		Assert.assertEquals((Integer)op.operation(num1, num2), (Integer)(num1 + num2));
		
		op = o.getSubstraction();
		
		Assert.assertEquals((Integer)op.operation(num1, num2), (Integer)(num1 - num2));
		
	}
	
}
