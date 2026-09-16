package CW.LinkedList.Day3;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class findMid {
    public static void main(String[] args) {

        Node head = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        Node fourth = new Node(20);
        Node fith = new Node(25);
        Node sixth = new Node(30);


        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fith;
        fith.next = sixth;

        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        
        current = head;
        for(int i =0; i< count/2; i++){
            current = current.next;
        }
        System.out.println(current.data);
    }
}
