package TreeTask;
import java.util.*;
class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode(int value){
        this.value=value;
        left=right=null;
    }
}
public class Orders {
    public void preorder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.value+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }
    public void postorder(TreeNode root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value+" ");
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.left.right.left=new TreeNode(8);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        root.right.right.left=new TreeNode(9);
        root.right.right.right=new TreeNode(10);
        Orders tree=new Orders();
        System.out.print("PreOrder Traversal : ");
        tree.preorder(root);
        System.out.println();
        System.out.print("InOrder Traversal : ");
        tree.inorder(root);
        System.out.println();
        System.out.print("PostOrder Traversal : ");
        tree.postorder(root);
    }
}
