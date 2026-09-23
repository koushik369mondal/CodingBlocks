package CW.LinkedList.Day4;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class findMidOptimized {
    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        Node fourth = new Node(20);
        Node fifth = new Node(25);
        Node sixth = new Node(30);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        Node mid = findMiddle(head);
        if (mid != null) {
            System.out.println(mid.data);
        }
    }
}
