package programming;


/**
 * 1->2->3->4
 * 4->3->2->1
 */
public class Main {

    public static LinkNode reverseList(LinkNode node) {
        LinkNode ans = null;
        LinkNode next = null;
        while (node != null) {
            next = node.next;
            node.next = ans;
            ans = node;
            node = next;

        }
        return ans;
    }

    static int i = 1;

    public static LinkNode reverse(LinkNode head){
        int k = i++;
        System.out.println( k + " time enter recursive.");
        if (head == null || head.next == null){
            System.out.println( k + " time exit case 1 recursive." + head);
            return head;
        } else {
            LinkNode temp = head.next;
            System.out.println(k + " time middle case recursive." + temp);
            LinkNode newHead = reverse(head.next);
            System.out.println(k + " time middle exit case recursive." + temp);
            temp.next = head;
            head.next = null;
            System.out.println( k + " time exit case 2 recursive." + newHead);
            return newHead;
        }

    }

    public static void main(String[] args) {
        LinkNode n1 = new LinkNode(1);
        LinkNode n2 = new LinkNode(2);
        LinkNode n3 = new LinkNode(3);
        LinkNode n4 = new LinkNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        LinkNode ans2 = reverse(n1);
        while (ans2 != null){
            System.out.println(ans2);
            ans2 = ans2.next;
        }
}}
