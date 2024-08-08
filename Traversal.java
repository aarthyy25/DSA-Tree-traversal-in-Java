
class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode(int value){
        this.value=value;
        left=right=null;
    }
}
public class Traversal{
    public void PostOrder(TreeNode root){
        if(root==null){
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.value+" ");
    }
    public void PreOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.value+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public void InOrder(TreeNode root){
        if(root==null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.value+" ");
        InOrder(root.right);
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.left.right=new TreeNode(9);
        root.left.left.right.left=new TreeNode(1);
        root.right=new TreeNode(5);
        root.right.left=new TreeNode(7);
        root.right.right=new TreeNode(6);
        root.right.right.left=new TreeNode(8);

        Traversal tree=new Traversal();

        System.out.print("Postorder Traversal: ");
        tree.PostOrder(root);
        System.out.println();
        System.out.print("Preorder Traversal: ");
        tree.PreOrder(root);
        System.out.println();
        System.out.print("Inorder Traversal: ");
        tree.InOrder(root);
    }
}