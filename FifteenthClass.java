import java.util.*;

public class FifteenthClass {
    public static void main(String[]args){
    // there are 4 major operations in bit manupulation
    // /GET,SET,CLEAR,UPDATE


    // GET BIT
    //  Q> get a third bit(ie position 2) of number 0101,ie decimal 5 to binary 0101
    // note the position is calculated from right to left
        // sol->first create a bit mask and then perform the AND operation with the original number
        // to create the bit mask , left shift 0001 ie decimal 1 by i(here 2 ) positions;
        // therefore bitmask 0100
        // now 0100 & 0101(original number)= if the output is non zero,then our bit value is 1 else if the outpuy is zero then our bit was 0
        int n=5;
        int pos=2;
        int bitmask=1;
        bitmask=bitmask<<pos;
        if((bitmask&n)==0){
           System.out.println("the bit was 0");
        }
        else{
            System.out.println("the bit was 1");
        }

    //SET BIT
    // bit mask and then OR operation    
    int setp=1; //uppdating second bit to 1
    int setbitmask=1;
    setbitmask=setbitmask<<setp;
    int newnumber=setbitmask|n;
    System.out.println("the new number after updating the bit is :"+newnumber);    

    // CLEAR BIT,SETTING THE BIT AS 0;
    // Q> clear the third bit ie postition 2   of a number 5;
    // sol-create a mask and perform the and operation with the negation of bitmask
    // data same as get bit
    bitmask=~ bitmask;
    int newnumber2=bitmask&n;
    System.out.println("the new number after the cear operation is:"+newnumber2);

    // UPDATE BIT: UPDATE THE SECOND BIT IE POSITION ONE OF A NUMBER 0101,NOW IF    UPDATE T0 0,THEN AND OPERATION WITH NEGATION OF MASK,ELSE IF TO 1,THEN OR WITH THE MASK
    // similair to operations operformed above.
    Scanner sc=new Scanner(System.in);
    System.out.println("enter if you need the bit to be 0 or 1");
    int oper=sc.nextInt();
    int newn=5;
    int newpos=1;
    int bitmaskU=1<<newpos;
    if(oper==1){
       int newnum=bitmaskU|newn;
       System.out.println("the new number after operation is : "+newnum);
    }
    else{
        bitmaskU=~bitmaskU;
        int newnum=bitmaskU&newn;
        System.out.println("the new nm affter operation is:"+newnum);


    }
        
    
}
}
