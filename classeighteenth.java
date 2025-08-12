public class classeighteenth {
    public static void toi(int n,String s,String h,String d){
            if(n==1){
                System.out.println("transfer disk"+n+"from"+s+"to"+d);
                return;
            }
            toi(n-1,s,d,h);
             System.out.println("transfer disk"+n+"from"+s+"to"+d);
            toi(n-1,h,s,d) ;
            return;

    }
    public static void main(String[]args){
         int  n=4;
         toi(n,"S","H","D");
    }
}
    