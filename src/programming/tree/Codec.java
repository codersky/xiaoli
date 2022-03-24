package programming.tree;

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        if(root == null){
            return "x";
        }
        String left = serialize(root.left);
        String right = serialize(root.right);

        return root.value + "," + left + "," + right;

        
    }

    // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//        for(int i = 0; i < data.toCharArray().length; i++){
//
//        }
//        return null;
//    }

    /**
     *         3
     *      -1   5
     *     3   8 9
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
//        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        System.out.println(new Codec().serialize(root));
    }
}