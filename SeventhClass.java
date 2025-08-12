import java.util.*;
public class SeventhClass {
    // void means it wont return anything
    // public and static are keywords which are written in front of our main class,we wiill be studying it in opps
    // the name of the function should not be like any java keyword
    public static int calculateSum(int a, int b){
        return a+b;
    }
    public static void printmyname(String name){
        System.out.println(name);
        return;  // no need to write the return statement inside the void function
    }
    public static void main(String[]args){
        //    functions are the block of code that takes input does some oerations on it and produces some output
        //  functions and methods are both the block of code that performs operation on a input and givesthe output,methods are called through objects pf the class and the functions are called directely
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printmyname(name);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("the sum of two numbers is :"+calculateSum(a,b));

        
    }   
}
