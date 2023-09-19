package com.ashik.hackerrank;

import java.math.BigInteger;

public class ExtraLongFactorial {

	public static BigInteger fact(BigInteger number) {
		
		if(number == BigInteger.ZERO) {
			return BigInteger.ONE;
		}
		
		return number.multiply(fact(number.add(BigInteger.valueOf(-1))));
	}
	
	public static void main(String[] args) {
		
		BigInteger fact = ExtraLongFactorial.fact(BigInteger.valueOf(100));
		
		System.out.println(fact);
		
	}

}
