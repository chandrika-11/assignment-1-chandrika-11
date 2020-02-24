package linkedList;

import contacts.Contacts;

public class Node<C> {
    private Node<C> data;
    private Node<C> next;

    public Node(Contacts data) {
        this.data = data;
    }

    public Node(Node<C> data) {
    }

    public Contacts getData() {
        return data;
    }

    public void setData(Node<C> data) {
        this.data = data;
    }

    public Node<C> getNext() {
        return next;
    }

    public void setNext(Node<C> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }

}
