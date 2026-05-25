class StackLL {
    //It is a refrence pointer stores address of top of the stack
    Node top;

    //Node class declaration
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Here in push newNode is created and, it is pointing to it;s next to current top , and then we marked top as new top
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }


    //Here we have to mark the next node as top
    int pop() {
        if (top == null) {
            System.out.println("Underflow");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    //just point data at top
    int peek() {
        if (top == null) {
            System.out.println("Empty");
            return -1;
        }
        return top.data;
    }

    //check if top equal to empty or not
    boolean isEmpty() {
        return top == null;
    }
}
public class StackUsinglinklist {

    static void main(String args[]) {
        StackLL st = new StackLL();
//    StackLL.Node st1 = new StackLL.Node(11);
//    StackLL.Node st2 = new StackLL.Node(12);

        st.push(10);
        st.push(12);
        st.push(14);
        st.push(15);

        StackLL.Node temp = st.top;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }

        System.out.println("Removed top element from the stack "+st.pop());
        System.out.println("Removed 2nd top element from the stack "+st.pop());
        System.out.println("Peek element is "+st.peek());


    }

}
