class Stack{
    int maxSize;
    char[] stack;
    int top;

    Stack(int size){
        maxSize = size;
        stack = new char[maxSize];
        top = -1;
    }
    //push
    void push(char val){
        if(top == maxSize - 1){
            System.out.println("Stack is Overflow");}
        else{
            stack[++top] = val;
        }
    }
    //pop
    char pop(){
        if(top == -1){
            System.out.println("Stack is Underflow");
            return '#';
        }
        else{
            return stack[top--];
        }
    }

    //peek
    char peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return '#';
        }
        else{
            return stack[top];
        }
    }

    boolean isEmpty() {
        return top == -1;
    }

}
public class vAlidParenthisis{
    static void main(String args[]) {

    }
}
