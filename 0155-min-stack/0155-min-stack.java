class MinStack {
    private Stack<Long> st;
    private long mini;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int value) {
        long val = (long) value;
        if (st.isEmpty()) {
            mini = val;
            st.push(val);
            return;
        }
        
        if (val >= mini) {
            st.push(val);
        } else {
           
            st.push(2L * val - mini);
            mini = val;
        }
    }
    
    public void pop() {
        if (st.isEmpty()) return;
        long curr = st.pop();
        
        if (curr < mini) {
           
            mini = 2L * mini - curr;
        }
    }
    
    public int top() {
        long curr = st.peek();
        if (curr < mini) {
            
            return (int) mini;
        }
        return (int) curr;
    }
    
    public int getMin() {
        return (int) mini;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */