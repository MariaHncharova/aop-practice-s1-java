package h12;

// https://leetcode.com/problems/relative-sort-array/
public class T2 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] counts = new int[1001];
        for (int num : arr1) {
            counts[num]++;
        }

        int index = 0;
        for (int target : arr2) {
            while (counts[target] > 0) {
                arr1[index++] = target;
                counts[target]--;
            }
        }

        for (int value = 0; value < counts.length; value++) {
            while (counts[value] > 0) {
                arr1[index++] = value;
                counts[value]--;
            }
        }
        return arr1;
    }
}
