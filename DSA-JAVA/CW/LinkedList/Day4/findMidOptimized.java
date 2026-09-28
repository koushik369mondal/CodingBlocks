package CW.LinkedList.Day4;

// leetcode - 876
public class findMidOptimized {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static int itrSearch(Node head, int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
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
            System.out.println("Middle element: " + mid.data);
        }

        int key = 20;
        int index = itrSearch(head, key);
        if (index != -1) {
            System.out.println("Key " + key + " found at index: " + index);
        } else {
            System.out.println("Key " + key + " not found");
        }
    }
}
