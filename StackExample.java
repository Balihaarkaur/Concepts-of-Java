public class StackExample {
    public static void main(String[] args) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: " + stack);
        
        int popped = stack.pop();
        System.out.println("Popped: " + popped);
        
        int peeked = stack.peek();
        System.out.println("Peeked: " + peeked);
        
        System.out.println("Final Stack: " + stack);
    }
}
