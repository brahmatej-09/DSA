public class Max_in_Tree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(0);

        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(0);
        int min = Min(root);
        int max = Max(root);
        System.out.println(min);
        System.out.println(max);
    }
    public static int Min(TreeNode root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(Min(root.left),Min(root.right)));
    }
    public static int Max(TreeNode root) {
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(Max(root.left),Max(root.right)));
    }
    
}
