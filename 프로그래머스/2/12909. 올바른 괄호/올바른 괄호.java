import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] ch = s.toCharArray();
        Stack st = new Stack();
        for (char c : ch){
            if(c=='('){
                st.push(c);
            }else{
                if(st.empty()){
                    return false;
                }
                st.pop();
            }
        }
        
        System.out.println(st.empty());

        return st.empty();
    }
}