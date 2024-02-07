package com.ashik.hackerrank;

import java.io.IOException;

public class EmasSuperComputer {

	private static int twoPluses(String[] grid) {

		int total_rows = grid.length;

		int total_cols = grid[0].length();

		int square_1 = 0;

		int square_2 = 0;

		char arr[][] = new char[total_rows][total_cols];

		int max1 = 1;

		int max2 = Integer.MIN_VALUE;

		for (int i = 0; i < total_rows; i++) {
			for (int j = 0; j < total_cols; j++) {
				arr[i][j] = grid[i].charAt(j);
			}
		}

		for (int i = 1; i < total_rows - 1; i++) {
			for (int j = 1; j < total_cols - 1; j++) {

				int position = 1;
				int result = 0;

				while (i - position >= 0 && i + position < total_rows && j - position >= 0 && j + position < total_cols
						&& arr[i - position][j] == 'G' && arr[i][j - position] == 'G' && arr[i][j + position] == 'G'
						&& arr[i + position][j] == 'G') {

					arr[i][j] = 'v';
					arr[i - position][j] = 'v';
					arr[i + position][j] = 'v';
					arr[i][j - position] = 'v';
					arr[i][j + position] = 'v';

					result = result + 4;
					position = position + 1;

				}
				
				result = result + 1;

				square_1 = Math.max(Math.max(max1, max2), result);

				if (square_1 == max1) {
					square_2 = Math.max(max2, result);
				}

				if (square_1 == max2) {
					square_2 = Math.max(max1, result);
				}

				if (square_1 == result) {
					square_2 = Math.max(max2, max1);
				}

				max1 = square_1;
				max2 = square_2;
			}
		}
		return max1 * max2;
	}

	public static void main(String[] args) throws IOException {

		String[] grid = { "GGGBGG", "GBGBBB", "GGGGGG", "BBGGGG", "BBGGGG" };
		
		
		
		
		
		
		
		int result = twoPluses(grid);
		System.out.println(result);
	}

}
