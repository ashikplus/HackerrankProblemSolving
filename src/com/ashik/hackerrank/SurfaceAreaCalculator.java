package com.ashik.hackerrank;
public class SurfaceAreaCalculator {
    public static int calculateSurfaceArea(int[][] A) {
        int H = A.length;
        int W = A[0].length;
        System.out.println("H "+H);
        System.out.println("W "+W);
        int area = 2 * H * W;  // Top and bottom faces

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int height = A[i][j];

                // Calculate front and back faces
                area += (i == 0) ? height : Math.max(0, height - A[i - 1][j]);
                area += (i == H - 1) ? height : Math.max(0, height - A[i + 1][j]);
                area += (j == 0) ? height : Math.max(0, height - A[i][j - 1]);
                area += (j == W - 1) ? height : Math.max(0, height - A[i][j + 1]);
            }
        }

        return area;
    }

    public static void main(String[] args) {
//        int[][] grid = {
//            {1, 3, 4},
//            {2, 2, 3},
//            {1, 2, 4}
//        };
    	
        int[][] grid = { {1, 1, 2}, {1, 1, 1} };
//        int[][] grid = { {1, 2, 2} };

        int surfaceArea = calculateSurfaceArea(grid);
        System.out.println("Total Surface Area: " + surfaceArea);
    }
}
