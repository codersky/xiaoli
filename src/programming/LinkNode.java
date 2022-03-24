package programming;

public class LinkNode {

    int value;
    LinkNode next;

    public LinkNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "LinkNode{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
