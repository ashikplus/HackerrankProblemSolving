package com.ashik.hackerrank;

import java.util.Arrays;
import java.util.List;

public class GridSearch {

	public static void main(String[] args) {
		
		List<String> gridList = Arrays.asList("456712","567245","123667","781288");
		
		List<String> patternList = Arrays.asList("45","67");
		
		int j=0;
		int i=0;
		while (!gridList.get(i).contains(patternList.get(j))) {
			if(i == gridList.size() - patternList.size()) {
				System.out.println("No");
				break;
			}
			i++;
		}
		int l = 1;
		for (int k = i + 1; k < gridList.size(); k++) {

			if (patternList.size() > l) {
				if (!gridList.get(k).contains(patternList.get(l))) {
					System.out.println("No");
					break;
				}

			}else {
				System.out.println("yes");
				break;
			}
			l++;
		}
		System.out.println("Yes");
//		System.out.println(gridList.get(0));
	}

}
