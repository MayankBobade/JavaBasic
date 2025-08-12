import java.util.LinkedList;
public class classTwentySeventh {
    // linkedlist using collections
    public static void main(String[]args){
        LinkedList<String>list=new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("linkedlist"); // or just list.add would work
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
System.out.println();
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(0); //removing using index
        System.out.println(list);
    }
}
