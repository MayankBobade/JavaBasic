import java.util.ArrayList;  // we can just write import java.util.*;
import java.util.Collections;
public class classTwentyfive {
public static void main(String[] args) {
    // array-continous locations of fixed size in the memeory ,we can store primitive data types as well as objects in array
    // arrayList-variable in size and stored in non-continous way in memory,we can only store objects in arrayList
    // array list is entirely maked inside heap memory
    // we can perform operations like-add,get,modify,delete,add in between,iteration and operations 
    // we will have to use class instead of primitive datatypes,like Integer for int,boolean for bool....
    ArrayList<Integer>list=new ArrayList<>();
    // ArrayList<Integer>List=new ArrayList<Integer>(); same as above|
    ArrayList<Boolean>list2=new ArrayList<>();
    ArrayList<String>list3=new ArrayList<>();

   //add elements
   list.add(1);
   list.add(2);
   list.add(5);
   //accessing the elements
   int element=list.get(0); // using indexes
   System.out.println(element);

//    add in between

list.add(1,10); // add(index,element to be added);

//set element/ipdating the value
list.set(1,100);
System.out.println(list);

// delete element
list.remove(3);
System.out.println(list);

// size
int size=list.size();
System.out.println(size);

// loops
for(int i=0;i<size;i++){
    System.out.print(list.get(i)+" ");
}
System.out.println();

// soorting
Collections.sort(list);
System.out.println(list);
}    
}
