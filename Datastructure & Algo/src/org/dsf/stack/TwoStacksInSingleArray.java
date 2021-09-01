package org.dsf.stack;

public class TwoStacksInSingleArray {
    int MAX=1000;
    int top1=-1,top2=MAX;
    int[] a=new int[MAX];

    int size1(){
        return top1+1;
    }

    int size2(){
        return (MAX-top2);
    }

    boolean isEmpty1(){
        if(top1==-1){
            return true;
        }
        return false;
    }

    boolean isEmpty2(){
        if(top2==MAX){
            return true;
        }
        return  false;
    }

    void push1(int x){
        if(top1+1==top2){
            System.out.println("Stack overFlow for Q1");
        }else{
            a[++top1]=x;
        }
    }
    void push2(int x){
        if(top1==top2+1){
            System.out.println("Stack overFlow for Q2");
        }else{
            a[--top2]=x;
        }
    }
    int peek1(){
        int x=-1;
        if(top1>=0){
            x=a[top1];
        }
        return x;
    }

    int peek2(){
        int x=-1;
        if(top2<MAX){
            x=a[top2];
        }
        return x;
    }

    int pop1(){
        int x=-1;
        if(top1>=0){
            x=a[top1--];
        }else{
            System.out.println("Stack underFlow for Q1");
        }
        return x;
    }
    int pop2(){
        int x=-1;
        if(top2<MAX){
            x=a[top2++];
        }else{
            System.out.println("Stack underFlow for Q2");
        }
        return x;
    }
    void display1(){
        if(top1==-1){
            System.out.println("Q1 is Empty.");
        }else{
            System.out.println("Q1 Display:");
            for (int i = 0; i <=top1; i++) {
                System.out.println(a[i]);
            }
        }

    }

    void display2(){

        if(top2==MAX){
            System.out.println("Q2 is Empty.");
        }else{
            System.out.println("Q2 Display:");
            for (int i = MAX-1; i >=top2; i--) {
                System.out.println(a[i]);
            }
        }

    }

    public static void main(String[] args) {
        TwoStacksInSingleArray dStack=new TwoStacksInSingleArray();

        dStack.pop1();
        dStack.pop2();
        dStack.push1(1);
        dStack.push2(100);
        dStack.push2(200);
        System.out.println("Peek1: "+dStack.peek1());
        System.out.println("Peek2: "+dStack.peek2());
        dStack.pop2();
        dStack.push2(100000);
        dStack.push2(1000);
        dStack.push2(2000);

        dStack.display1();
        dStack.display2();
        System.out.println("Size1: "+dStack.size1());
        System.out.println("Size2: "+dStack.size2());

    }
}
