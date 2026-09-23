package CW.LinkedList.Day3;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class findLastEle {
    public static void main(String[] args) {
        Node head = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);

        head.next = second;
        second.next = third;

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
}
