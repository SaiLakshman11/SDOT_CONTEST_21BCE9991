//1
public class MyQueue {
    private Stack<Integer> Stack1, Stack2;

    public MyQueue() {
        Stack1 = new Stack<>();
        Stack2 = new Stack<>();
    }

    private void check() {
        if (Stack2.isEmpty()) {
            while (!Stack1.isEmpty()) {
                Stack2.push(Stack1.peek());
                Stack1.pop();
            }
        }
    }

    public void push(int x) {
        Stack1.push(x);
    }

    public int pop() {
        check();
        return Stack2.pop();
    }

    public int peek() {
        check();
        return Stack2.peek();
    }

    public boolean empty() {
        return Stack1.isEmpty() && Stack2.isEmpty();
    }
}


/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */