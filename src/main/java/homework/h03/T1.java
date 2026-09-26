package homework.h03;

// base
// https://leetcode.com/problems/roman-to-integer/
public class T1 {
public double average(int[] salary) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int sum = 0;

    for (int s : salary) {
        if (s < min) min = s;
        if (s > max) max = s;
        sum += s;
    }

    return (double) (sum - min - max) / (salary.length - 2);
   }
}