package linkedList;

public class Node {
    private Node data;
    private Node next;

    public Node(Node data) {
        this.data = data;
    }

    public Node getData() {
        return data;
    }

    public void setData(Node data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }

}
