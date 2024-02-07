package com.ashik.hackerrank;

import java.util.Arrays;
import java.util.List;

public class GridSearch2 {

	public static void main(String[] args) {
		
		List<String> gridList = Arrays.asList("111111111111111","111111111111111","111111111111111","111111011111111","111111111111111","111111111111111","101010101010101");
		
		List<String> patternList = Arrays.asList("11111","11111","11111","11110");
		
		int j=0;
		int track=0;
		int k = 0;
		Integer index = null;

		outerLoop:
		for (int i = 0; i < gridList.size() - patternList.size(); i++) {
			
			k=i;
			while(gridList.get(k).contains(patternList.get(j))) {
				track++;
				
				if(index == null) {
					index = gridList.get(k).indexOf(patternList.get(j));
				}else {
					Integer nextIndex = gridList.get(k).indexOf(patternList.get(j));
					if(index != nextIndex) {
						break;
					}
				}
				
				if(patternList.size() == track) {
					System.out.println("yes");
					break outerLoop;
				}
				j++;
				k++;
			}
			track = 0;
			j = 0;
			index = null;
		}
		System.out.println("No");
	}

}
