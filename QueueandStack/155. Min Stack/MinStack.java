class MinStack {

    List<Integer> stack; 
    int size;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int x) {
        stack.add(x);
    }
    
    public void pop() {
        if(!isEmpty()){
            stack.remove(stack.size() -1);    
        }
        
    }
    
    public int top() {
        if(!isEmpty()){
            return stack.get(stack.size() - 1);
        }else{
            return -1;
        }
    }
    
    public int getMin() {
        if(isEmpty()){
            return  -1;
        }
        List<Integer> list = new ArrayList<>(stack);
        Collections.sort(list);
        return list.get(0);
    }
    
    private boolean isEmpty(){
        return stack.size() == 0;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */