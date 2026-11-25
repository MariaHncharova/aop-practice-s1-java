package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
    @Test
    public void returnsMajorityElementForExampleInputs() {
        T2 solver = new T2();
        assertThat(solver.majorityElement(new int[] {3, 2, 3})).isEqualTo(3);
        assertThat(solver.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
    }

    @Test
    public void returnsSingleElementForSingleItemArray() {
        T2 solver = new T2();
        assertThat(solver.majorityElement(new int[] {1})).isEqualTo(1);
    }
}
