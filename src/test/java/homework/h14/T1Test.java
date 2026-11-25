package homework.h14;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
    @Test
    public void removesAdjacentDuplicatesForExampleInputs() {
        T1 solver = new T1();
        assertThat(solver.removeDuplicates("abbaca")).isEqualTo("ca");
        assertThat(solver.removeDuplicates("azxxzy")).isEqualTo("ay");
    }

    @Test
    public void handlesEmptyStringAndAllDuplicates() {
        T1 solver = new T1();
        assertThat(solver.removeDuplicates("")).isEqualTo("");
        assertThat(solver.removeDuplicates("abba")).isEqualTo("");
        assertThat(solver.removeDuplicates("a")).isEqualTo("a");
    }
}
