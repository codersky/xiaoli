package programming.tree;



public class TreeTraverse {

    int ans = 0;
    
    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Node(int value) {
            this.value = value;
        }
    }

    public int maxPathSum(Node root){
        maxGain(root);
        return ans;

    }

    public int maxGain(Node node){

        if(node == null){
            return 0;
        }

        int leftGain = Math.max(maxGain(node.left), 0);
        int rightGain = Math.max(maxGain(node.right), 0);

        int totalOfPath = node.value + leftGain + rightGain;
        System.out.println(String.format("node: %s, leftGain: %s, rightGain %s", node.value, leftGain, rightGain));
        ans = Math.max(ans, totalOfPath);

        return node.value + Math.max(leftGain, rightGain);

    }



    /**
     *         300
     *      -100 -500
     *     3 7  8 9
     *
     *    to calculate the max sum of the path
     */
    public static void main(String[] args) {

        Node root = new Node(300);

        Node node1 = new Node(-100);
        Node node2 = new Node(-500);

        Node node3 = new Node(3);
        Node node4 = new Node(7);
        Node node5 = new Node(8);
        Node node6 = new Node(9);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        System.out.println(new TreeTraverse().maxPathSum(root));



    }

}
