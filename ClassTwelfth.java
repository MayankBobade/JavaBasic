public class ClassTwelfth {
    // note strings in jjava are immutable  
    public static void main(String[]args){
        String firstname="tony";
        String lastname="stark";
        String fullname=firstname+" "+lastname;
        String comname=firstname+"@"+lastname;
                                // this @ and " " will be deleted from the  memory of the program as soon as this line is runned
        System.out.println(fullname);
        System.out.println(fullname.length());  // .lenght() gives the length of the string
        System.out.println(comname);
        //charAt method
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));  // str.charAt(i) is used to access the variable of the string at perticular index

        }


        // String CompareTo function
        //strings are compared on basis of first different character in the string as weights increasing from a to z
        // hello>cello
        // aahello>aabello
        // if s1>s2 returns posivive value
        // s1==s2 returns 0
        // s1<s2 returns negative value
        if(firstname.compareTo(lastname)==0){ //if we just write firstname==lastname,it will look working fine but it might fail in some testcases, like where the data in the strin gs are same but there locations in the memory are different
            //ex if(new String("tony")==new String("tony")) // in this case the ideal  answer should be true but == operator will return flase
            System.out.println("the strings are equla in length");
        }
        else{
            System.out.println("both strings are not equla in lenght");
        }


        //substrings=smaller contigious part of the string
        String sentence="my name is tony";
        String subs=sentence.substring(11,sentence.length());//ending index can avoided if we want the substring till the last char
        System.out.println(subs);

        // integer to string and string to integer
          String s1 = "123";
          int num = Integer.parseInt(s1); // Converts "123" to integer 123

          String s2="true";
          boolean s3=Boolean.parseBoolean(s2);

          
          String s4="3.14";
          double num5=Double.parseDouble(s4);

          System.err.println(num);
          System.out.println(s3);
          System.out.println(num5);





    }
}
//note that sc is an object ogf the scanner class 