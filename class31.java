import java.util.*;
public class class31 {
    public static void main(String []args){
        // Engueue=Add;
        // Dequeue=Remove;
        // front=Peek;


        // Queue<Integer>qu=new Queue<>(); WILL GIVE YOU A ERROR BECAUSE QUEUE IS A INTERFACE IN JAVA AND NOT A CLASS AND OBJECTS CAN ONLY BE MADE OF THE CLASS

         Queue<Integer>qu=new LinkedList<>();  // will work fine
         Queue<Integer>que=new ArrayDeque<>(); //this will also work fine ,but will create a double ended queue
        //  there is a bit difference between above two implementation regarding cache ,google it INTERVIEW
         qu.add(1);
         qu.add(2);
         qu.add(2);
         qu.add(3);
         qu.add(9);
         System.out.println(qu);
         qu.remove();
         qu.add(10);
         System.out.println(qu);
         qu.peek();
         System.out.println(qu.size());//size
         System.out.println(qu.peek());
    }
}
