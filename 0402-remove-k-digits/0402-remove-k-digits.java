import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            char c = num.charAt(i);
            
            while (!st.isEmpty() && k > 0 && st.peek() > c) {
                st.pop();
                k--;
            }
            

            if (!st.isEmpty() || c != '0') {
                st.push(c);
            }
        }

        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        if (st.isEmpty()) {
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        
        
        sb.reverse();
        
        return sb.toString();
    }
}