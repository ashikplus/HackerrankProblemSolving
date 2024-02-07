package com.ashik.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BombermanGame {

	public static List<String> bomberMan(int k, List<String> grid) {
		int n = grid.size();  //6
		int m = grid.get(0).length(); //7
		if (k == 1) {
			return grid;
		}
		if (k % 2 == 0) {
			return gridToList(createAllBombGrid(n, m));
		} else {
			char[][] result = blast(listToGrid(grid), n, m);
			if ((k / 2) % 2 == 0) {
				result = blast(result, n, m);
			}
			return gridToList(result);
		}
	}

	private static char[][] blast(char[][] grid, int n, int m) {
		char[][] result = createAllBombGrid(n, m);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] == 'O') {
					result[i][j] = '.';
					if (j + 1 < m) {
						result[i][j + 1] = '.';
					}
					if (j - 1 >= 0) {
						result[i][j - 1] = '.';
					}
					if (i + 1 < n) {
						result[i + 1][j] = '.';
					}
					if (i - 1 >= 0) {
						result[i - 1][j] = '.';
					}
				}
			}
		}
		return result;
	}

	private static char[][] createAllBombGrid(int n, int m) {
		char[][] result = new char[n][m];
		for (int i = 0; i < n; i++) {
			result[i] = new char[m];
			Arrays.fill(result[i], 'O');
		}
		return result;
	}

	private static char[][] listToGrid(List<String> list) {
		char[][] arr = new char[list.size()][list.get(0).length()];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i).toCharArray();
		}
		return arr;
	}

	private static List<String> gridToList(char[][] grid) {
		List<String> result = new ArrayList<>();
		for (char[] arr : grid) {
			result.add(new String(arr));
		}
		return result;
	}

	public static void main(String[] args) {
		List<String> grid = new ArrayList<>();
		grid.add("......."); // Add your grid here
		grid.add("...O..."); // Add your grid here
		grid.add("....O.."); // Add your grid here
		grid.add("......."); // Add your grid here
		grid.add("OO....."); // Add your grid here
		grid.add("OO....."); // Add your grid here

//		grid.add("...");
//		grid.add(".O.");
//		grid.add("...");

		List<String> result = bomberMan(19, grid);

		for (String row : result) {
			System.out.println(row);
		}
	}
}
