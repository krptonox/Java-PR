//create a Node class , which help you to make nOde Object
class Node2{
    int data;
    Node2 next;

    Node2(int d){
        data = d;
        next = null;
    }
}
public class creatingNodePart2 {
    static void main() {
        //we have created a Node object using class Node , which take two,parameter data & address , but defaultly next address is null
        Node2 x = new Node2(4);
        System.out.println(x.data);
    }
}
