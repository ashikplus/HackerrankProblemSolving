package com.ashik.hackerrank;
import java.util.ArrayList;
import java.util.List;

public class ClimbingLeaderboard {
    public static List<Integer> climbingLeaderboard(List<Integer> scores, List<Integer> player) {
        List<Integer> playerRanks = new ArrayList<>();
        List<Integer> uniqueScores = new ArrayList<>();
        
        // Create a list of unique scores in descending order
        for (int score : scores) {
            if (uniqueScores.isEmpty() || score < uniqueScores.get(uniqueScores.size() - 1)) {
                uniqueScores.add(score);
            }
        }
        
        int index = uniqueScores.size() - 1;
        
        // Compare player's scores with the unique scores to determine ranks
        for (int playerScore : player) {
            while (index >= 0 && playerScore >= uniqueScores.get(index)) {
                index--;
            }
            playerRanks.add(index + 2); // Adding 2 because ranks start from 1
        }
        
        return playerRanks;
    }
    
    public static void main(String[] args) {
        List<Integer> scores = List.of(100, 90, 90, 80, 75, 60);
        List<Integer> playerScores = List.of(50, 65, 75, 90, 102);
        
        List<Integer> playerRanks = climbingLeaderboard(scores, playerScores);
        System.out.println(playerRanks); // Output: [6, 5, 4, 2, 1]
    }
}
