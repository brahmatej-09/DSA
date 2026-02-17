public class ProductofNodes {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(0);

        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(0);
        int product = NodesProduct(root);
        System.out.println(product);
        int product_0 = NodesProduct_0(root);
        System.out.println(product_0);
    }
    public static int NodesProduct(TreeNode root){
        if(root==null) return 1;
        return root.val*NodesProduct(root.left)*NodesProduct(root.right);
    }
    public static int NodesProduct_0(TreeNode root){
        if(root==null) return 1;
        if(root.val==0) return 1;
        return root.val*NodesProduct_0(root.left)*NodesProduct_0(root.right);
    }
    
}
