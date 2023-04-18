package No104_MaximumDepthOfBinaryTree;

public class Test {
    public static void main(String[] args) {

    }
    public class Solution {
        public int maxDepth(TreeNode root) {
            if (root.right != null) {
                return maxDepth(root.right) + 1;
            }
            else if (root.left != null) {
                return maxDepth(root.left) + 1;
            }
            return maxDepth(root);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}