package com.ashik.hackerrank;

public class NonDivisibleSubset {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};
		
		int k = 1;
		int sizeOfSubArr = 0;
		int[] subArr = new int[k];
		
		for(int i=0; i<arr.length; i++) {
			
			subArr[arr[i] % k]++;
		}
		
		sizeOfSubArr = Math.min(arr[0], 1);
		
		for(int i=1; i<k/2+1; i++) {
			
			if(i != k-i) {
				sizeOfSubArr+=Math.max(subArr[i], subArr[k-i]);
			}else {
				sizeOfSubArr+=Math.min(subArr[i], 1);
			}
			
		}
		
		System.out.println("Size of sub array "+sizeOfSubArr);

	}

}
