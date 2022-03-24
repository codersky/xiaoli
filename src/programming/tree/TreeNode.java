package programming.tree;

public class TreeNode {


    int value = 0;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    public static void preTraverse(TreeNode node){

        if(node == null){
            return;
        }

        System.out.print(node.value);
        preTraverse(node.left);
        preTraverse(node.right);

    }

    public static void middleTraverse(TreeNode node){
        if(node == null){
            return;
        }
        middleTraverse(node.left);
        System.out.print(node.value);
        middleTraverse(node.right);
    }

    public static void suffixTraverse(TreeNode node){
        if(node == null){
            return;
        }
        suffixTraverse(node.left);
        suffixTraverse(node.right);
        System.out.print(node.value);
    }

    /**
     *         3
     *      -1   5
     *     3 7  8 9
     *
     *    to calculate the max sum of the path
     */
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        TreeNode node1 = new TreeNode(-1);
        TreeNode node2 = new TreeNode(5);

        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(8);
        TreeNode node6 = new TreeNode(9);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        preTraverse(root);
        System.out.println();
        middleTraverse(root);
        System.out.println();
        suffixTraverse(root);
    }
}


