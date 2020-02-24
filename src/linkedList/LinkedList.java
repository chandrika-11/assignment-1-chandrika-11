package linkedList;

import contacts.Contacts;

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

    public int insertInAlphabeticOrder(Node<Contacts> newNode) {
        int position = 1;
        if (head == null || head.toString().toLowerCase().compareTo(newNode.toString().toLowerCase()) > 0) {
            newNode.setNext((Node<Contacts>) head);
            setHead((Node<C>) newNode);
            return position;
        } else {
            Node<C> temp = head;
            while (temp.getNext() != null && temp.getNext().toString().toLowerCase().compareTo(newNode.toString().toLowerCase()) <= 0) {
                position++;
                temp = temp.getNext();
            }
            newNode.setNext((Node<Contacts>) temp.getNext());
            temp.setNext((Node<C>) newNode);
        }
        return ++position;
    }


}


