package homework.h13;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
    @Test
    public void returnsFirstBadVersionForExampleInputs() {
        T1 firstSolver = new T1(version -> version >= 4);
        assertThat(firstSolver.firstBadVersion(5)).isEqualTo(4);

        T1 secondSolver = new T1(version -> version >= 1);
        assertThat(secondSolver.firstBadVersion(1)).isEqualTo(1);
    }

    @Test
    public void handlesLastVersionBeingBad() {
        T1 solver = new T1(version -> version >= 10);
        assertThat(solver.firstBadVersion(10)).isEqualTo(10);
    }
}
