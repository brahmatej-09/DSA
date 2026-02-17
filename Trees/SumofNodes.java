public class SumofNodes {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(6);
        int sum = NodesSum(root);
        System.out.println(sum);
    }
    public static int NodesSum(TreeNode root){
        if(root==null) return 0;
        return root.val+NodesSum(root.left)+NodesSum(root.right);
    }

}
