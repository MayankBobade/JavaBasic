public class TenthClass {
    public static void main(String[]arg){
    //    defining a array in java->  type[] arrayName=new type[size];
    // int [] marks=new int[3];  
    // or
    int marks[]=new int[3];
    marks[0]=97;
    marks[1]=98;
    marks[2]=95;
    // if we dont give this values to the indexes pf the qarray and ty to print them ,we will get ),because java automatically initialises the array values will null or 0 or defaut values like 0 for int 0.0 for double or float,false for boolean values ,ie values are initialised with default values instead of garbage values

    // how to find the size of the array??
    // nums.length thats it Not even closing brackets()
    for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]);
    }
    }
}
