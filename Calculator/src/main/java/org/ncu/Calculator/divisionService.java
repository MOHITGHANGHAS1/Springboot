package org.ncu.Calculator;

public class divisionService implements MathService {
     
	public int operate(int x, int y) {
		int z=x/y ;
		System.out.println(z);
		return z;
	}
}
