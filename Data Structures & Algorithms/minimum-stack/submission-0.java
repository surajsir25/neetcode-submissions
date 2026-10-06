class MinStack {

    Deque<int[]> st;

    public MinStack() {
        st = new ArrayDeque<>();
    }
    
    public void push(int val) {
        int currentMin = st.isEmpty()? val: Math.min(val, st.peek()[1]);
        st.push(new int[]{val, currentMin});
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek()[0];
    }
    
    public int getMin() {
        return st.peek()[1];
    }
}
