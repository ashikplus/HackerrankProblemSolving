package com.ashik.hackerrank;

public class ClimbingLeaderboardWithArray {
	public static int[] climbingLeaderboard(int[] scores, int[] player) {
	    int[] playerRanks = new int[player.length];
	    int[] uniqueScores = new int[scores.length];
	    int uniqueCount = 0;
	
	    for (int score : scores) {
	        if (uniqueCount == 0 || score < uniqueScores[uniqueCount - 1]) {
	            uniqueScores[uniqueCount++] = score;
	        }
	    }
	
	    int index = uniqueCount - 1;
	
	    for (int i = 0; i < player.length; i++) {
	        int playerScore = player[i];
	        while (index >= 0 && playerScore >= uniqueScores[index]) {
	            index--;
	        }
	        playerRanks[i] = index + 2; // 
	    }
	
	    return playerRanks;
	}
	
	public static void main(String[] args) {
	    int[] scores = {100, 90, 90, 80, 75, 60};
	    int[] playerScores = {50, 65, 77, 90, 102, 109, 160};
	
	    int[] playerRanks = climbingLeaderboard(scores, playerScores);
	    for (int rank : playerRanks) {
	        System.out.print(rank + " ");
	    }
	    // Output: 6 5 4 2 1 1 1
	}
	
}

