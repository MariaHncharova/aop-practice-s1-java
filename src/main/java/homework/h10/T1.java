package homework.h10;

// https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/
public class T1 {
    public char kthCharacter(int k) {
        if (k == 1) {
            return 'a';
        }
        int length = 1;
        while (length < k) {
            length *= 2;
        }
        length /= 2;

        char originalChar = kthCharacter(k - length);
        return (char) (originalChar == 'z' ? 'a' : originalChar + 1);
    }
}