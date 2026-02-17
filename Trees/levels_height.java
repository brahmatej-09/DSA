public class levels_height {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(8);
        root.left.left.left = new TreeNode(7);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(6);
        int l = level(root);
        System.out.println(l);
    }
    public static int level(TreeNode root) {
        if(root==null) return 0;
        return(Math.max(1+level(root.left),1+level(root.right)));
    }
    
}
