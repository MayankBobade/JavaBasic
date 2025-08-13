import java.util.HashSet;
import java.util.Iterator;;
public class class34 {
    // insert/add,  search/contains,   delete/remove  all in O(1) TC where as in arrays we requireO(1),O(n),o(n) and in sorted array O(n),O(log n),O(n)
    // set contains only unique elements
    // it has no sequence of elements and has no garuntee of sequence over iteration
    // similair to cpp's unordered_set
  public static void main(String[]args){
      HashSet<Integer>set=new HashSet<>();  //creating the hashset
      //insert
      set.add(2);
      set.add(1);
      set.add(5);
      set.add(8);
      set.add(8);
      set.add(8);
      set.add(8);
      System.out.println(set);
      
      if(set.contains(5)){
        System.out.println("set contains 5");
      }
      set.remove(5);
      if(!set.contains(5)){
        System.out.println("set dosenot contains 5");
      }
    //   IMPORTANT

    //   iterator in set IMP
    // first import Iterator in code,done at top
    

    Iterator it=set.iterator();  //creating the iterator that will iterate over the values in the set
    // hasNext();next();
    // hasnext-if iteragor is at last of the set,then it will return false;
    // look at implementation below rto nderstand the working of next

    while(it.hasNext()){
        System.out.print(it.next()+"*");
    }


  }
}
