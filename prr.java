import java.util.PriorityQueue;

public class prr {
    public static void main(String[] args) {
        PriorityQueue <Integer> q = new PriorityQueue<>();
        q.add(1);
        q.add(2);
        q.add(10);
        q.add(23);
        q.add(34);

        System.out.println(q);
        q.poll();   
        System.out.println(q);
        q.poll();
        System.out.println(q);
        q.remove(34);
        System.out.println(q);
    }
}
