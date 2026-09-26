package homework.h02;

// base
// // https://leetcode.com/problems/divide-two-integers/
public class T2 {
    public boolean isSameAfterReversals(int num) {
        if (num == 0) return true;
        return num % 10 != 0;
    }
}
