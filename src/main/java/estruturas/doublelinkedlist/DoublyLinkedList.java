package estruturas.doublelinkedlist;

public class DoublyLinkedList {

    Node begin;
    Node tail;

    public DoublyLinkedList() {
        this.begin = null;
        this.tail = null;
    }

    public void insertValue(int value){
        if (begin == null){
            begin = new Node(value);
            tail = begin;
            return;
        }

        Node newNode = new Node(value);
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void printValues() {
        Node currentNode = begin;

        while (currentNode != null) {
            System.out.print(currentNode.value + " <=> ");
            currentNode = currentNode.next;
        }

        System.out.print("null");
        System.out.println("\n");
    }

    public int getSize(){
        int size = 0;
        Node currentNode = begin;
        while (currentNode != null) {
            size+=1;
            currentNode = currentNode.next;
        }
        return size;
    }

    public void deleteValue(int value){
        Node currentNode = begin;

        if (begin == null){
            return;
        }

        if (begin.value == value){
            if (begin.next == null){
                begin = null;
                tail = null;
                return;
            }
            begin.next.prev = null;
            begin = begin.next;
            return;
        }

        while (currentNode != null){
            if (currentNode.value == value){
                if (currentNode.next == null){
                    Node prevNode = currentNode.prev;
                    currentNode.prev.next = null;
                    currentNode.prev = null;
                    tail = prevNode;
                    return;
                }
                currentNode.prev.next = currentNode.next;
                currentNode.next.prev = currentNode.prev;
                return;
            }
            currentNode = currentNode.next;
        }
    }
}
