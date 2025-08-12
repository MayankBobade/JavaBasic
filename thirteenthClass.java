import java.util.*;
public class thirteenthClass {
    //  because the strings are immutable in java so we use string builders in java
    // we cannnot mutate the strings in java because in java data is stored in memeory in two ways,first in stack memeory and secondly in heap memeory
    // so when we create the string the stack memory points to the location in heap memory
    // ex if we create string s="h",
    // and then we do s+e
    // and then s+h.....many times to make value of s =hello,
    // then each time a new string will be created in heap memory ex he,hel,... and the s will keep pointing to new location in the heap momory,instead of just updating the string at original location,
    // so this dosenot make sense as it increases both time and space comlplexity

    // stringbuilder does the mutation in heap memory a the original location itself.
    public static void main(String[]args){
        StringBuilder sb=new StringBuilder("tony");
        System.out.println(sb);

        //all other functions are as same as they are in strings
        System.out.println(sb.charAt(0));

        //setCharAt
        sb.setCharAt(0,'p');
        System.out.println(sb);

        //Insert
        sb.insert(3,'t');
        System.out.println(sb);

        // delete(starting index,ending index )
        sb.delete(2,4);
        System.out.println(sb);

        //insert at last-append
        sb.append('p');
        sb.append("p");
        System.out.println(sb);

        // length()
        System.out.println(sb.length());

        //reverse a string VERY IMP LOGIC
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;
            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);
            sb.setCharAt(i, backchar);
            sb.setCharAt(back, frontchar);
            System.out.println(sb);

        }

        // NUMBER SYSTEMS IN JAVA
        // BINARY ,OCTAL,HEXADECIMAL(MEMORY ADDRESS IS WRITTEN IN HEXADECIMAL,IE WITH BASE 16)
    }
}
