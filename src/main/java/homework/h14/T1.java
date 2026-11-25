package homework.h14;

// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public class T1 {
    public String removeDuplicates(String input) {
        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int lastIndex = stack.length() - 1;

            if (lastIndex >= 0 && stack.charAt(lastIndex) == currentChar) {
                stack.deleteCharAt(lastIndex);
            } else {
                stack.append(currentChar);
            }
        }
        return stack.toString();
    }
}