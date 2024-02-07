package com.ashik.hackerrank;
import java.util.Scanner;

public class AbsolutePermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] result = absolutePermutation(n, k);

            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            t--;
        }
    }

    static int[] absolutePermutation(int n, int k) {
        int[] result = new int[n];

        if (k == 0) {
            // If k is 0, return the natural permutation
            for (int i = 0; i < n; i++) {
                result[i] = i + 1;
            }
        } else if (n % (2 * k) != 0 || 2 * k > n) {
            // If it's not possible to create an absolute permutation
            for (int i = 0; i < n; i++) {
                result[i] = -1;
            }
        } else {
            // Generate the absolute permutation
            boolean toggle = true;
            for (int i = 0; i < n; i++) {
                if (toggle) {
                    result[i] = i + 1 + k;
                } else {
                    result[i] = i + 1 - k;
                }
                if ((i + 1) % k == 0) {
                    toggle = !toggle;
                }
            }
        }

        return result;
    }
}
