package homework.h05;

import java.util.Arrays;

// base
// https://leetcode.com/problems/squares-of-a-sorted-array/
public class T2 {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        return result;
    }
}
