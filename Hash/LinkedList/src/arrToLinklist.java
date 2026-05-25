public class arrToLinklist {
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

     static Node head = null;

    static void addFirst(int d){
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
    }

    static Node arrToLinkList(int arr[]){
        Node head1 = new Node(arr[0]);
        Node mover = head1;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head1;
    }

    public static void main(String[] args) {
        addFirst(2);
        addFirst(3);
        addFirst(4);
        addFirst(5);
        addFirst(6);

        Node temp = head;
        int count = 0;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            count++;
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println(count+" "+"length of linkList");

        int[] arr = {12,23,45,45,23,54,5,243,45};
        Node head1 = arrToLinkList(arr);
        System.out.println(head1.data);

        Node temp1 = head1;
        while(temp1!=null){
            System.out.print(temp1.data + " -> ");
            temp1 = temp1.next;
        }
        System.out.println("null");
    }
}
