package CW.LinkedList.Day1;

public class ArrayToList {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
