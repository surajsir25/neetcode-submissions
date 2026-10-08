class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String c: tokens){
            if(c.equals("+")){
                stack.push(stack.pop() + stack.pop());
            } else if(c.equals("-")) {
                int val1 = stack.pop();
                stack.push(stack.pop() - val1);
            } else if(c.equals("*")) {
                stack.push(stack.pop()*stack.pop());
            } else if(c.equals("/")) {
                int val1 = stack.pop();
                stack.push(stack.pop()/val1);
            } else {
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }
}
