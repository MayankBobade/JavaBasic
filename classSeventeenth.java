public class classSeventeenth {
    //fibonacchi using recursion
    public static void fibo(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        fibo(b,c,n-1); // not a,b,n-1
    }

    // print x^n using max recursive stack height of log n //A VERY GOOD LOGIC KEEP IN MIND ,ITS VERY USEFUL
    public static int calpow(int x,int n){
        if(n==0 ){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return calpow(x,n/2)*calpow(x,n/2);
        }
        else{
            return calpow(x,n/2)*calpow(x,n/2)*x;
        }
    }
    public static void main(String[]args){
         int a=0;int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int n=10;
        fibo(a,b,n);
        System.out.println();
        int sum=calpow(2,5);
        System.out.println(sum);
    }
    
}
