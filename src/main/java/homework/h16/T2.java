package homework.h16;

// https://leetcode.com/problems/find-the-town-judge/
public class T2 {
    public int findJudge(int totalPeople, int[][] trust) {
        if (trust.length < totalPeople - 1) {
            return -1;
        }
        int[] trustScores = new int[totalPeople + 1];
        for (int[] relation : trust) {
            trustScores[relation[0]]--;
            trustScores[relation[1]]++;
        }
        for (int i = 1; i <= totalPeople; i++) {
            if (trustScores[i] == totalPeople - 1) {
                return i;
            }
        }
        return -1;
    }
}