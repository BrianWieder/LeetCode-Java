package MergeTwoBinaryTrees;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeTwoBinaryTreesTest {

    MergeTwoBinaryTrees sol;

    @BeforeEach
    void setUp() {
        sol = new MergeTwoBinaryTrees();
    }

    @Test
    void mergeTrees() {
        TreeNode tree1 =
                new TreeNode(1,
                        new TreeNode(
                                3,
                                new TreeNode(5),
                                null
                        ),
                        new TreeNode(2)
                );
        TreeNode tree2 =
                new TreeNode(
                        2,
                        new TreeNode(1, null, new TreeNode(4)),
                        new TreeNode(3, null, new TreeNode(7))
                );

        TreeNode expected =
                new TreeNode(
                        3,
                        new TreeNode(
                                4,
                                new TreeNode(5),
                                new TreeNode(4)
                        ),
                        new TreeNode(
                                5,
                                null,
                                new TreeNode(7)
                        )
                );

        assertEquals(expected, sol.mergeTrees(tree1, tree2));
    }
}