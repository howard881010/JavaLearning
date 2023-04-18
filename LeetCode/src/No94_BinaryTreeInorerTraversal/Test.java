package No94_BinaryTreeInorerTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {


    }

    public class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> rs = new ArrayList<>();
            if (root == null) return rs;
            TreeNode cur = root;
            Stack<TreeNode> s = new Stack<>();
            while (cur != null || !s.isEmpty()) {
                if (cur != null) {
                    s.push(cur);
                    cur = cur.left;
                } else {
                    TreeNode node = s.peek();
                    s.pop();
                    rs.add(node.val);
                    cur = node.right;
                }

            }
            return rs;
        }
    }

    public class TreeNode {
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
}
