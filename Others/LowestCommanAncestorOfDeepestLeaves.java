class LowestCommanAncestorOfDeepestLeaves {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return helper(root).node;
    }

    // Helper class to return both depth and node
    private class Result {
        int depth;
        TreeNode node;

        Result(int depth, TreeNode node) {
            this.depth = depth;
            this.node = node;
        }
    }

    private Result helper(TreeNode root) {
        if (root == null) return new Result(0, null);

        Result left = helper(root.left);
        Result right = helper(root.right);

        if (left.depth == right.depth) {
            return new Result(left.depth + 1, root);
        } else if (left.depth > right.depth) {
            return new Result(left.depth + 1, left.node);
        } else {
            return new Result(right.depth + 1, right.node);
        }
    }
}
