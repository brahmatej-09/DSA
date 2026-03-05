public class Same_Tree {
    public static void main(String[] args) {
        // -------- Tree 1 --------
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        // -------- Tree 2 --------
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        // call your function here
        boolean ans = isSameTree(root1, root2);

        System.out.println(ans);
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        return false;
    }
}
