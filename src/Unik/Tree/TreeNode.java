package Unik.Tree;

public class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Solution {
    int ret = Integer.MAX_VALUE;

    public int findSecondMinimumValue(TreeNode root) {
        if(root == null) return -1;
        DFS(root);
        return ret==Integer.MAX_VALUE?-1:ret;
    }

    void DFS(TreeNode root) {
        if(root == null) return;
        if(root.left != null && root.left.val == root.val)
            DFS(root.left);
        if(root.right != null && root.right.val == root.val)
            DFS(root.right);
        if(root.right != null && root.right.val > root.val)
            ret = Math.min(ret, root.right.val);
        if(root.left != null && root.left.val > root.val)
            ret = Math.min(ret, root.left.val);
    }

    public static void main(String[] args) {

    }
}
