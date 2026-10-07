package homework.h04;

// base
// https://leetcode.com
public class T2 {
    public int findComplement(int num) {
        int todo = num;
        int bit = 1;

        while (todo > 0) {
            num = num ^ bit;
            bit <<= 1;
            todo >>= 1;
        }

        return num;
    }
}
