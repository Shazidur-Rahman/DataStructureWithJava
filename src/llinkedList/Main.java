package llinkedList;

class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        // System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6, 1);
        sLL.insertInLinkedList(7, 3);
        sLL.insertInLinkedList(8, 4);
        sLL.insertInLinkedList(9, 0);
        sLL.traverseSinglyLinkedList();
        sLL.deleteSLL();
        sLL.traverseSinglyLinkedList();


        System.out.println("________________________________DoublyLInkedList______________________________________");


        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(1);
        dll.insertDLL(2, 0);
        dll.insertDLL(3, 1);
        dll.insertDLL(4, 7);
        dll.traverseDLL();
        dll.deleteDLL();
        dll.traverseDLL();

    }
}

