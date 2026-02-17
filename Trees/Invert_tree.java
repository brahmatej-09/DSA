public class Invert_tree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.right.left = new TreeNode(6);
        print(root);
        System.out.println();
        invert(root);
        print(root);
    }
    public static TreeNode invert(TreeNode root){
        if(root==null) return null;
        if(root.left==null && root.right==null) return root;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
        return root;
    }
    public static void print(TreeNode root){
        if(root==null) return;
        System.out.print(root.val+" ");
        print(root.left);
        print(root.right);
    }
}
