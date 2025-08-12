import java.util.*;

public class ThirdClass {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);  //creating an object of scanner class
    //   int age=sc.nextInt();
    //   if(age<18){
    //     System.out.println("you are below 18 years of age");
    //   }
    //   else if(age>18&& age<60){
    //     System.out.println("you are allowed");
    //  }
    //  else{
    //     System.out.println("you are above 60");
    //  }

    //  System.out.println("enter the number for switch case");
     int s=sc.nextInt();
     switch(s){
        case 1:System.out.println("Namaste");
        break;
        case 2:System.out.println("Hello");
        break;
        default: System.out.println("bonjour");
     }
    }
    
    
}
