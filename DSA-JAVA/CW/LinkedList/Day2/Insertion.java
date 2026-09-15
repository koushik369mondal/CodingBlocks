package CW.LinkedList.Day2;

public class Insertion {
    Node head;

    public void insertBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtRandom(int data, int index) {
        if (index == 0) {
            insertBegin(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) return;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Insertion list = new Insertion();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(40);

        list.insertBegin(5);
        list.insertAtRandom(30, 3);

        list.printList();
    }
}
