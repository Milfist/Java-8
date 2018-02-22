package org.milfist;

public class Problem {

	private Double a;
	private Double b;
	
	public Problem(Double a, Double b) {
		this.a = a;
		this.b = b;
	}
	
	// A class that supports the interface is not necessary.
	public Double getResult() {
		return MathOperations.pow(a, b);
	}
	
}
