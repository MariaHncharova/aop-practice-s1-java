package homework.h13;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
    @Test
    public void returnsMaximumCountForExampleInputs() {
        T2 solver = new T2();
        assertThat(solver.maximumCount(new int[] {-2, -1, -1, 1, 2, 3})).isEqualTo(3);
        assertThat(solver.maximumCount(new int[] {-3, -2, -1, 0, 0, 1, 2})).isEqualTo(3);
        assertThat(solver.maximumCount(new int[] {5, 20, 66, 1314})).isEqualTo(4);
    }

    @Test
    public void returnsZeroForAllZerosOrEmptyArray() {
        T2 solver = new T2();
        assertThat(solver.maximumCount(new int[] {0, 0, 0})).isEqualTo(0);
        assertThat(solver.maximumCount(new int[] {})).isEqualTo(0);
    }
}
