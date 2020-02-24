package linkedList;

public class Node<T> {
    private Node<T> data;
    private Node<T> next;

    public Node(Node data) {
        this.data = data;
    }

    public Node(Node<T> data) {
    }

    public Node<T> getData() {
        return data;
    }

    public void setData(Node<T> data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }

}
