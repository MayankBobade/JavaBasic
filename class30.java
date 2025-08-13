import java.util.Stack;
public class class30 {
    public static void main(String[]args){
    Stack<Integer> st=new Stack<>();  //push(),pop(),peek(),isEmpty()
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    
    while(!st.isEmpty()){ //isEmpty()
System.out.println(st.peek());  //st.peek() to see the top element;
st.pop();
    }
}
}
