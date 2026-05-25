public class ArrayToLinkedListPart2 {
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    static Node arrTolink(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static String checkNumber(Node head, int val){
        Node temp = head;
        while(temp!=null){
            if(val==temp.data){
                return "True";
            }
            temp=temp.next;
        }
        return "False";
    }

    static int lent(Node head){
        int cnt = 0;

        Node temp = head;

        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,};
        Node head = arrTolink(arr);

        Node temp = head;
        for(int i=0;i<arr.length;i++){
            System.out.println(temp.data);
            temp = temp.next;
        }

        System.out.println("Length of LinkList "+lent(head));

        System.out.println(checkNumber(head,9));
    }
}
