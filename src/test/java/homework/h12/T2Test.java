package homework.h12;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
    @Test
    public void sortsArrayRelativeToSecondArrayForExamples() {
        T2 solver = new T2();
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        assertThat(solver.relativeSortArray(arr1, arr2))
                .containsExactly(2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19);

        int[] secondArr1 = {28, 6, 22, 8, 44, 17};
        int[] secondArr2 = {22, 28, 8, 6};
        assertThat(solver.relativeSortArray(secondArr1, secondArr2))
                .containsExactly(22, 28, 8, 6, 17, 44);
    }

    @Test
    public void handlesSingleElementBoundary() {
        T2 solver = new T2();
        assertThat(solver.relativeSortArray(new int[] {0}, new int[] {0})).containsExactly(0);
    }
}
