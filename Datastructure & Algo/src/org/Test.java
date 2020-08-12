package org;

class A{

    private void run(){
        System.out.println("Run from A");
    }

}

class B extends A{
    public void run(){
        System.out.println("Run from A");
    }
}


public class Test {
    public static void main(String[] args) {
        A b=new B();
        //System.out.println(b.);

        System.out.println(null instanceof A);
    }

}
