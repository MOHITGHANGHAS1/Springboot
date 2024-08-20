package org.ncu.Calculator;

public class SubtractionService implements MathService {
	public int operate(int x, int y) {
		int z=x-y ;
		System.out.println(z);
		return z;
	}
}
