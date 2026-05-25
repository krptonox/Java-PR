import java.util.*;
public class LinkList {

    private Node head;
    private Node tail;
    private int size;

    public LinkList(){
        this.size = 0;
    }

    public void inserlast(int val){
        if(tail == null){
            insertfirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertmiddle(int val,int index){
        if(index == 0){
            insertfirst(val);
            return;
        }
        if(index == size){
            inserlast(val);
            return;
        }

        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;

    }

    public int deletefirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deletelast(){
        if(size<=1){
            return deletefirst();
        }
        Node secondlast = get(size - 2);
        int value = tail.value;
        tail = secondlast;
        tail.next = null;
        return value;
    }

    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }
    public void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
         size++;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

   private class Node{
         private int value;
         private Node next;

         public Node(int value){
             this.value = value;
         }
         public Node(int value,Node next){
             this.value = value;
             this.next = next;
         }
   }

    static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertfirst(3);
        list.insertfirst(9);
        list.insertfirst(4);
        list.insertfirst(5);

        list.inserlast(10);
        System.out.println(list.deletefirst());
        System.out.println(list.deletelast());
        list.insertmiddle(11,3);

        list.display();
    }
}
