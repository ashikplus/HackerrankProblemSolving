package com.ashik.hackerrank;

public class Encryption {

	public static void main(String[] args) {

		String str = "chillout";
		StringBuilder stringBuilder = new StringBuilder();

		String value = str.replace(" ", "");

		int length = value.length();

		double sqrt = Math.sqrt(length);

		int sqrtFloor = (int) Math.floor(sqrt);

		int sqrtCeil = (int) Math.ceil(sqrt);

		if (sqrtFloor * sqrtCeil < length) {
			sqrtFloor++;
		}

		for (int i = 0; i < sqrtCeil; i++) {
			int j = i;
			while (j < length) {
				char c = value.charAt(j);
				stringBuilder.append(c);
				j += sqrtCeil;
			}
			stringBuilder.append(" ");

		}

		System.out.print(stringBuilder + " ");

	}

}
