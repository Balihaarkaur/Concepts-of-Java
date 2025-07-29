import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.addFirst(5);
        list.addLast(30);
        list.remove(1);

        for (int val : list) {
            System.out.println(val + " ");
        }
    }
}
