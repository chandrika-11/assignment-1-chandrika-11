package linkedList;

import contacts.Contacts;

public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        head = null;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public int insertInAlphabeticOrder(Node<Contacts> newNode) {
        int position = 1;
        if (head == null || head.toString().toLowerCase().compareTo(newNode.toString().toLowerCase()) > 0) {
            newNode.setNext((Node<Contacts>) head);
            setHead((Node<T>) newNode);
            return position;
        } else {
            Node<T> temp = head;
            while (temp.getNext() != null && temp.getNext().toString().toLowerCase().compareTo(newNode.toString().toLowerCase()) <= 0) {
                position++;
                temp = temp.getNext();
            }
            newNode.setNext((Node<Contacts>) temp.getNext());
            temp.setNext((Node<T>) newNode);
        }
        return ++position;
    }

    public Node<T> delete(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        } else {
            int pos = 1;
            if (position == 1) {
                Node<T> deletedHead = head;
                head = head.getNext();
                return deletedHead;
            }
            Node<T> temp = head;
            while (pos < position - 1) {
                temp = temp.getNext();
                pos += 1;
            }
            Node<T> deletedNode = temp.getNext();
            temp.setNext(temp.getNext().getNext());
            return deletedNode;
        }
    }


}


