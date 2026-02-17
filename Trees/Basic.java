class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class Basic {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(6);
        preorderprint(root);
        System.out.println();
        inorderprint(root);
        System.out.println();
        postorderprint(root);
        System.out.println();
    }
    public static void preorderprint(TreeNode root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorderprint(root.left);
        preorderprint(root.right);
    }
    public static void inorderprint(TreeNode root){
        if(root==null) return;
        inorderprint(root.left);
        System.out.print(root.val+" ");
        inorderprint(root.right);
    }
    public static void postorderprint(TreeNode root){
        if(root==null) return;
        postorderprint(root.left);
        postorderprint(root.right);
        System.out.print(root.val+" ");
    }
}
