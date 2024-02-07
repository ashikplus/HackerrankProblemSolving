package com.ashik.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrganizingContainers {

	public static void main(String[] args) {
		
//		int[][] containers = { {0, 2, 1}, {1, 1, 1}, {2, 0, 0} };
		
		List<List<Integer>> container = new ArrayList<>();
		
		List<Integer> container1 = new ArrayList<>();
		container1.add(0);
		container1.add(2);
		container1.add(1);
		List<Integer> container2 = new ArrayList<>();
		container2.add(1);
		container2.add(1);
		container2.add(1);
		List<Integer> container3 = new ArrayList<>();
		container3.add(2);
		container3.add(0);
		container3.add(0);
		
		container.add(container1);
		container.add(container2);
		container.add(container3);
		
		
		int[] containerSize = new int[container.size()];
		int[] containerBall = new int[container.size()];
		int i = 0;
		
		for(List<Integer> containerSizes : container) {
			int j = 0;
			for(int size : containerSizes) {
				containerSize[i] += size;
				containerBall[j] += size;
				j++;
			}
			i++;
		}
		
		Arrays.sort(containerSize);
		Arrays.sort(containerBall);
		
		if(Arrays.equals(containerSize, containerBall)) {
			System.out.println("Possible... ");
		}else {
			System.out.println("Imposible... ");
		}
		
		for(int j=0; j<containerSize.length; j++) {
			System.out.println(containerBall[j]);
			
		}
		
	}

}
