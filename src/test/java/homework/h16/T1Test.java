package homework.h16;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
    @Test
    public void fillsConnectedPixelsForExampleInputs() {
        T1 solver = new T1();
        int[][] firstImage = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] firstExpected = {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};
        assertThat(solver.floodFill(firstImage, 1, 1, 2)).isDeepEqualTo(firstExpected);

        int[][] secondImage = {{0, 0, 0}, {0, 0, 0}};
        int[][] secondExpected = {{0, 0, 0}, {0, 0, 0}};
        assertThat(solver.floodFill(secondImage, 0, 0, 0)).isDeepEqualTo(secondExpected);
    }

    @Test
    public void handlesSinglePixelImage() {
        T1 solver = new T1();
        int[][] singlePixel = {{5}};
        assertThat(solver.floodFill(singlePixel, 0, 0, 9)).isDeepEqualTo(new int[][] {{9}});
    }
}