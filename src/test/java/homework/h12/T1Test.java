package homework.h12;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
    @Test
    public void returnsMismatchCountForExampleInputs() {
        T1 solver = new T1();
        assertThat(solver.heightChecker(new int[] {1, 1, 4, 2, 1, 3})).isEqualTo(3);
        assertThat(solver.heightChecker(new int[] {5, 1, 2, 3, 4})).isEqualTo(5);
        assertThat(solver.heightChecker(new int[] {1, 2, 3, 4, 5})).isEqualTo(0);
    }

    @Test
    public void returnsZeroForSingleElementOrEmptyArray() {
        T1 solver = new T1();
        assertThat(solver.heightChecker(new int[] {5})).isEqualTo(0);
        assertThat(solver.heightChecker(new int[] {})).isEqualTo(0);
    }
}