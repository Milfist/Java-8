package org.milfist;

public class OperationImpl {

	private Integer a;
	private Integer b;

	public OperationImpl(Integer a, Integer b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public Operation getSum() {		
		return (a, b) -> a + b;		
	}
	
	public Operation getSubstraction() {		
		return (a, b) -> a - b;		
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}
}
