package problemsolving.recursion;

import com.sun.source.tree.Tree;

public class TreesEqual {
    static class TreeNode{
        int key;
        TreeNode left;
        TreeNode right;
        public TreeNode(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    static boolean areTreesEqual(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null) return true;
        return root1.key==root2.key && areTreesEqual(root1.left,root2.left) && areTreesEqual(root1.right,root2.right);
    }

    public static void main(String[] args) {
        TreeNode root1=new TreeNode(4);
        root1.left=new TreeNode(2);
        root1.left.left=new TreeNode(1);
        root1.left.right=new TreeNode(3);
        root1.right=new TreeNode(6);
        root1.right.left=new TreeNode(5);
        root1.right.right=new TreeNode(7);

        TreeNode root2=new TreeNode(4);
        root2.left=new TreeNode(2);
        root2.left.left=new TreeNode(1);
        root2.left.right=new TreeNode(3);
        root2.right=new TreeNode(6);
        root2.right.left=new TreeNode(5);
        root2.right.right=new TreeNode(7);

        System.out.println(areTreesEqual(root1,root2));
    }

}
