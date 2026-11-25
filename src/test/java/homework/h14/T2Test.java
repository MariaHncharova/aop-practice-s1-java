package homework.h14;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
    @Test
    public void behavesLikeFifoQueueForExampleOperations() {
        T2 queue = new T2();
        assertThat(queue.empty()).isTrue();

        queue.push(1);
        queue.push(2);
        assertThat(queue.peek()).isEqualTo(1);
        assertThat(queue.pop()).isEqualTo(1);
        assertThat(queue.empty()).isFalse();
        assertThat(queue.pop()).isEqualTo(2);
        assertThat(queue.empty()).isTrue();
    }
}
