package homework.h13;

import java.util.function.IntPredicate;

// https://leetcode.com/problems/first-bad-version/
public class T1 {
    private final IntPredicate badVersionChecker;

    public T1() {
        this(version -> false);
    }

    public T1(IntPredicate badVersionChecker) {
        this.badVersionChecker = badVersionChecker;
    }

    private boolean isBadVersion(int version) {
        return badVersionChecker.test(version);
    }

    public int firstBadVersion(int totalVersions) {
        int left = 1;
        int right = totalVersions;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}