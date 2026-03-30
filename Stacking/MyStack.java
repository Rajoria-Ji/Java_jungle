import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();

        st.push(5);
        st.push(6);
        st.push(7);
        st.push(20);

     
        while(!st.isEmpty()){
            if(st.peek() == 7) {
            System.out.println("True");
            break;
        }        
        st.pop();
    }
}
}