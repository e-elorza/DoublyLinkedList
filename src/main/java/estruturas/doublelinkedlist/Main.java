package estruturas.doublelinkedlist;

public class Main {
    static void main() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.insertValue(2);
        doublyLinkedList.insertValue(5);
        doublyLinkedList.printValues();
        doublyLinkedList.deleteValue(2);
        doublyLinkedList.printValues();
    }
}
