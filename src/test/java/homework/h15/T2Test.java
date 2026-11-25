package homework.h15;

import static org.assertj.core.api.Assertions.assertThat;

import homework.h15.T2.TreeNode;
import org.junit.jupiter.api.Test;

public class T2Test {
    @Test
    public void calculatesRangeSumForExampleInput() {
        T2 solver = new T2();
        TreeNode root =
                new TreeNode(
                        10,
                        new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                        new TreeNode(15, null, new TreeNode(18)));

        assertThat(solver.rangeSumBST(root, 7, 15)).isEqualTo(32);
    }

    @Test
    public void returnsZeroForEmptyTreeAndHandlesOutOfRangeNodes() {
        T2 solver = new T2();
        assertThat(solver.rangeSumBST(null, 1, 10)).isEqualTo(0);

        TreeNode root = new TreeNode(5, new TreeNode(2), new TreeNode(12));
        assertThat(solver.rangeSumBST(root, 6, 10)).isEqualTo(0);
    }
}