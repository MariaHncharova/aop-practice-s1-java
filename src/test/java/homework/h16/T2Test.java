package homework.h16;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
    @Test
    public void findsTownJudgeForExampleInputs() {
        T2 solver = new T2();
        assertThat(solver.findJudge(2, new int[][] {{1, 2}})).isEqualTo(2);
        assertThat(solver.findJudge(3, new int[][] {{1, 3}, {2, 3}})).isEqualTo(3);
        assertThat(solver.findJudge(3, new int[][] {{1, 3}, {2, 3}, {3, 1}})).isEqualTo(-1);
    }

    @Test
    public void handlesSinglePersonAndEmptyTrustArray() {
        T2 solver = new T2();
        assertThat(solver.findJudge(1, new int[][] {})).isEqualTo(1);
        assertThat(solver.findJudge(2, new int[][] {})).isEqualTo(-1);
    }
}