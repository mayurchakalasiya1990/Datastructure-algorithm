package org.dsf.queue;

public class ArrayCircularQueue {


    public double[] buf;          // Circular buffer
    public int      read, write;  // read and write pointers

    // Constructor
    public ArrayCircularQueue(int size)
    {
        buf = new double[size];    // Create array for circular buffer

        read = 0;                  // Initialized read & write pointers
        write = 0;
    }

    /* ====================================================
        enqueue(x ):
       ==================================================== */
    public void enqueue( double x )   throws Exception
    {
        if ( read == ( write + 1 ) % (buf.length) )
        {
            throw new Exception("Queue is full");
        }

        buf[write] = x;                 // Store x in buf at write pointer
        write = (write+1)%(buf.length); // Advance the write pointer
    }

    /* ====================================================
        dequeue():
       ==================================================== */
    public double dequeue( ) throws Exception
    {
        double r;   // Variable used to save the return value

        if ( read == write )
        {
            throw new Exception("Queue is empty");
        }

        r = buf[read];                 // Save return value
        read = (read+1)%(buf.length);  // Advance the read pointer

        return r;
    }

    /* ====================================================
       Convert all elems in the list into a string:

        Format:"v1,v2,v3,..."
       ==================================================== */
    public String toString()
    {
        String out;
        int i;

        out = "[";

        for ( i = read; ((i)%buf.length) != write; i++ )
        {
            out += buf[i];       // Concat next list element

            if ( ((i+1)%buf.length) != write )
                out += " , ";     // Not last elem: add a ","
        }

        out += "]";
        return out;
    }

    public static void main( String[] args )  throws Exception
    {
        ArrayCircularQueue myQ = new ArrayCircularQueue(10);
        double x;

        myQ.enqueue(1.0);
        System.out.println("enqueue(1.0): " + "myQ = " + myQ);
        myQ.enqueue(2.0);
        System.out.println("enqueue(2.0): " + "myQ = " + myQ);
        myQ.enqueue(3.0);
        System.out.println("enqueue(3.0): " + "myQ = " + myQ);

        System.out.println("\nBefore dequeue:");
        System.out.println("myQ = " + myQ);

        x = myQ.dequeue();
        System.out.println("x = " + x + ", myQ = " + myQ);
        x = myQ.dequeue();
        System.out.println("x = " + x + ", myQ = " + myQ);
        x = myQ.dequeue();
        System.out.println("x = " + x + ", myQ = " + myQ);
    }

}
