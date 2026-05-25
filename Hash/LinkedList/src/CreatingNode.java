public class CreatingNode {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node head = null;

    static void addFirst(int d) {
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        addFirst(10);
        addFirst(20);
        addFirst(30);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
