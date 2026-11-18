package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
    @Test
    public void returnsMissingNumberForExampleInputs() {
        T1 solver = new T1();
        assertThat(solver.missingNumber(new int[] {3, 0, 1})).isEqualTo(2);
        assertThat(solver.missingNumber(new int[] {0, 1})).isEqualTo(2);
        assertThat(solver.missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
    }

    @Test
    public void returnsZeroWhenZeroIsMissing() {
        T1 solver = new T1();
        assertThat(solver.missingNumber(new int[] {1})).isEqualTo(0);
    }
}
