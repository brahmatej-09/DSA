public class SizeOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(0);

        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(0);
        int s = size(root);
        System.out.println(s);
    }
    public static int size(TreeNode root) {
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    
}
