import java.util.*;
class StackArray{
    int maxSize;
    int[] stack;
    int top;

    //constructor
    StackArray(int size){
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    //push operation
    void push(int val){
        if(top == maxSize-1){
            System.out.println("Stack is Overflow");
        } else{
            stack[++top] = val;
            System.out.println(val+" pushed");
        }
    }
    //Pop operation
    int pop(){
        if(top == -1){
            System.out.println("Stack is Underflow");
            return -1;
        }
        else{
            return stack[top--];
        }
    }

    //Peek Element
    int peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            return stack[top];
        }
    }

    //check if empty
    boolean isEmpty(){
        return top == -1;
    }

}
public class StackUsingArray {
    static void main(String[] args) {

        StackArray s = new StackArray(5);
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        System.out.println("peek element is "+s.peek());
        System.out.println("Poped element is "+s.pop());
        System.out.println("Is Stack Empty "+s.isEmpty());

        System.out.println(s);
    }
}
