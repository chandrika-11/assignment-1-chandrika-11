package linkedList;

public class LinkedList<C> {
    private Node<C> head;

    public LinkedList() {
        head = null;
    }

    public Node<C> getHead() {
        return head;
    }

    public void setHead(Node<C> head) {
        this.head = head;
    }


}


