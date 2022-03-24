package programming.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeCodec {

    public String serialize(TreeNode node){
        if(node == null){
            return "#";
        }
        String l = serialize(node.left);
        String r = serialize(node.right);

        // inOrder
        return node.value + "" + l + r;
    }

    int i = 0;
    public TreeNode deserialize(String str){
        String node = str.split("")[i++];
        if ("#".equals(node))
            return null;
        TreeNode root = new TreeNode(Integer.valueOf(node));
        root.left = deserialize(str);
        root.right = deserialize(str);
        return root;
    }

    public TreeNode deserializeDebug(String str, int k){
        System.out.println(k);
        String node = str.split("")[k];
        if ("#".equals(node))
            return null;
        TreeNode root = new TreeNode(Integer.valueOf(node));
        root.left = deserializeDebug(str, ++k);
        root.right = deserializeDebug(str, ++k);
        return root;
    }

    public TreeNode deserializeRecursive(String str){
        Queue<String> queue = new LinkedList<>();
        for(String nodeStr: str.split("")){
            queue.add(nodeStr);
        }

        TreeNode node = preOrderDeserialize(queue);
        return node;
    }

    private TreeNode preOrderDeserialize(Queue<String> nodes){
        String node = nodes.poll();
        if("#".equals(node)){
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(node));
        root.left = preOrderDeserialize(nodes);
        root.right = preOrderDeserialize(nodes);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);

        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;


System.out.println(new BinaryTreeCodec().deserialize(new BinaryTreeCodec().serialize(root)));
System.out.println(new BinaryTreeCodec().deserializeRecursive(new BinaryTreeCodec().serialize(root)));
    }

}
