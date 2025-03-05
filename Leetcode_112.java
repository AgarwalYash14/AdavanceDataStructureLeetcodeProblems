class Solution {
    public static boolean solve(TreeNode root, int targetSum, int sum) {
        if (root == null)
            return false;

        sum += root.val;

        if (root.left == null && root.right == null) {
            return sum == targetSum;
        }

        return solve(root.left, targetSum, sum) || solve(root.right, targetSum, sum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solve(root, targetSum, 0);
    }
}