package linkedList;


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

    public int insertInAlphabeticOrder(Node<T> newNode) {
        int position = 1;
        if (head == null || head.toString().toLowerCase().compareTo(newNode.toString().toLowerCase()) > 0) {
            newNode.setNext((Node<T>) head);
            setHead((Node<T>) newNode);
            return position;
        } else {
            Node<T> temp = head;
            while (temp.getNext() != null && temp.getNext().toString().toLowerCase().compareTo(newNode.toString().toLowerCase()) <= 0) {
                position++;
                temp = temp.getNext();
            }
            newNode.setNext((Node<T>) temp.getNext());
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

    public Node<T> getNode(int position) {
        int count = 0;
        if (head == null) {
            return null;
        }
        Node<T> temp = head;
        while (temp != null) {
            count++;
            if (count == position) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    //returns a list of nodes which match partially or completely to the given string//
    public LinkedList<T> search(String name) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        } else {
            LinkedList<T> searchedResult = new LinkedList<T>();
            Node<T> temp = head;
            int flag = 0;
            while (temp != null) {
                if (temp.toString().toLowerCase().contains(name.toLowerCase())) {
                    searchedResult.insertInAlphabeticOrder(new Node<T>(temp.getData()));
                    flag = 1;
                }
                temp = temp.getNext();
            }
            if (flag == 0) {
                return null;
            }
            return searchedResult;
        }
    }

}


