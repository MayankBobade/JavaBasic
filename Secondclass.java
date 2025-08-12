import java.util.*;
public class Secondclass {
    
    public static void main(String args[]){ // S of string is capital
       System.out.println("hello world"); //S of system is also capital
       System.out.print("hello world");
       System.out.print("hello world\n");
       System.out.print("hello world\n");
       System.out.println("hello world");
       System.out.println("hello world");
       System.out.print("hello world in java \n again in java ");
       System.out.print("hello world in java \n \n again in java ");
       //system is a inbuild class  in java 
       

       int a=10; // a location/block in memeory will be named "a" and it will store an integer type value of 10
       int b=20; // a location/block in memory will be named "b" and it will store an integer type value of 20
       String name="tonystark";   // a block of memmory will be named as name and the string will be stored in in
       System.out.println(a);
       System.out.println(b);
       System.out.println(name);
       name="ironman";
       System.out.println(name);
       
    //    BODAMAS dosenot work in java,Java has it's own priority of operators
        //  * /  %  +,-
       int ans=a*b/a-b;
       int ans1=(a*b)/(a-b);
       System.out.println(ans);
       System.out.println(ans1);

    //   in Java we take input with help  of an inbuilt scanner class
    //   to use scan functionality in java we need to import a package called as java.utils.* 

      Scanner sc=new Scanner(System.in);
      //passing System.in to scanner class.
      String myName=sc.next();
      // now if I write mayank bobade in input,still only mayank will be taken in as input and not bobade,because next() function takes only one tocken try typing mayank bobade
      System.out.println(myName);

    //   if i want to take entire line as input,then we can use next line. try typing mayank bobade
      String FullName=sc.nextLine();
      System.out.println(FullName);
    //   similarly,nextInt() to input integers,nextfloat(),nextDouble(),......

}
}
//IMP
//what is the difference between System.out.print and System.out.println ?
//println completes the line and the next print statement is printed on next line. same for the \n,there is minor difference see the output.

// Java is a typed language,ie we need to specofy the type of variable before declarinng it
// there are two types of datatypes in java-Primitave and non premitive
// primitive data types-
// byte-1 byte/8bits(1 bit= one 0 or one 1)
// short
// char-2 bytes  //according to 64 bits system  
// boolean-1 byte
// int-4 byte
// long-8 byte
// float-4byte
// double-8byte


// non primitive datatypes
// arrays,strings,arraylist,hashmaps