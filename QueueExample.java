import java.util.LinkedList;
import java.util.Queue;

public class QueueExample{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
    
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("Front: " + queue.peek());
        System.out.println("Removed:"+ queue.poll());
        
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());

        }
    }
}
