public class DeleteLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    static Node addNum(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static Node removeHead(Node head){
        if(head==null) return head;
        head = head.next;
        return head;
    }

    static Node removeTail(Node head){
        if(head==null || head.next == null) return head;
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    static Node removeKth(Node head,int k){
        if(head == null) return null;
        if(k == 1){
            head = head.next;
            return head;
        }
        int cnt = 1;
        Node temp  = head;
        Node prev = null;
        while(temp!=null){
            if(cnt==k){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
            cnt++;
        }
        return head;
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Node head = addNum(arr);
        Node temp = head;
        for(int i=0;i<arr.length;i++){
            System.out.println(temp.data);
            temp = temp.next;
        }
        head = removeHead(head);
        System.out.println(head.data);
        System.out.println("Removing Tail ---..>>");

        head = removeTail(head);
        Node temp1 = head;
        while(temp1 != null){
            System.out.println(temp1.data);
            temp1 = temp1.next;
        }
        System.out.println("Removing kth Element");
        head = removeKth(head,2);
        Node temp2 = head;
        while(temp2 != null){
            System.out.println(temp2.data);
            temp2=temp2.next;
        }
    }
}
