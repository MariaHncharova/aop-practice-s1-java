package homework.h15;

import static org.assertj.core.api.Assertions.assertThat;

import homework.h15.T1.TreeNode;
import org.junit.jupiter.api.Test;
public class T1Test {
    @Test
    public void invertsBinaryTreeForExampleInput() {
        T1 solver = new T1();
        TreeNode root =
                new TreeNode(
                        4,
                        new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                        new TreeNode(7, new TreeNode(6), new TreeNode(9)));

        TreeNode inverted = solver.invertTree(root);

        assertThat(inverted.val).isEqualTo(4);
        assertThat(inverted.left.val).isEqualTo(7);
        assertThat(inverted.right.val).isEqualTo(2);
        assertThat(inverted.left.left.val).isEqualTo(9);
        assertThat(inverted.left.right.val).isEqualTo(6);
        assertThat(inverted.right.left.val).isEqualTo(3);
        assertThat(inverted.right.right.val).isEqualTo(1);
    }

    @Test
    public void returnsNullForEmptyTreeAndSingleNode() {
        T1 solver = new T1();
        assertThat(solver.invertTree(null)).isNull();

        TreeNode single = new TreeNode(1);
        TreeNode result = solver.invertTree(single);
        assertThat(result.val).isEqualTo(1);
        assertThat(result.left).isNull();
        assertThat(result.right).isNull();
    }
}