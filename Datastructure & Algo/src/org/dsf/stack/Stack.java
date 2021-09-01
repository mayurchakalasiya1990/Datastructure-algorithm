package org.dsf.stack;


/*
Methods in Stack class

Object push(Object element) : Pushes an element on the top of the stack.
Object pop() : Removes and returns the top element of the stack.
               An ‘EmptyStackException’ exception is thrown if we call pop() when the invoking stack is empty.
Object peek() : Returns the element on the top of the stack, but does not remove it.
boolean empty() : It returns true if nothing is on the top of the stack. Else, returns false.
int search(Object element) : It determines whether an object exists in the stack. If the element is found,
                            it returns the position of the element from the top of the stack. Else, it returns -1.

 */
public class Stack<I extends Number> {

    static  final int MAX=1000;
    int top;
    int[] a =new int[MAX];


    Stack(){
        top=-1;
    }

    boolean isEmpty(){
        return top<0;
    }

    boolean push(int i){
        if(a.length<MAX){
            System.out.println("Stack overflow...");
            return false;
        }else{
            a[++top]=i;
            System.out.println(i+" Pushed in Stack... ");
        }
        return true;
    }

    int pop(){
        int x=0;
        if(top<0){
            System.out.println("Stack Underflow...");
        }else{
            x=a[top--];
            System.out.println(x+" Popped from Stack...");
        }
        return x;
    }

    int peek(){
        int x=0;
        if(top<0){
            System.out.println("Stack Underflow...");
        }else{
            x=a[top];
        }
        return x;
    }

    void display(){
        System.out.println("Display Stack Value...");
        for (int i = 0; i <=top ; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Stack<Number> s = new Stack<Number>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        s.display();
        s.push(100);
        s.push(200);
        s.push(300);
        s.display();
    }

}
