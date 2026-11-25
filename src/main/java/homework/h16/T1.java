package homework.h16;

// https://leetcode.com/problems/flood-fill/
public class T1 {
    public int[][] floodFill(int[][] image, int startRow, int startCol, int newColor) {
        int originalColor = image[startRow][startCol];
        if (originalColor != newColor) {
            fillDepthFirst(image, startRow, startCol, originalColor, newColor);
        }
        return image;
    }

    private void fillDepthFirst(
            int[][] image, int row, int col, int originalColor, int newColor) {
        if (row < 0
                || row >= image.length
                || col < 0
                || col >= image[0].length
                || image[row][col] != originalColor) {
            return;
        }
        image[row][col] = newColor;
        fillDepthFirst(image, row - 1, col, originalColor, newColor);
        fillDepthFirst(image, row + 1, col, originalColor, newColor);
        fillDepthFirst(image, row, col - 1, originalColor, newColor);
        fillDepthFirst(image, row, col + 1, originalColor, newColor);
    }
}