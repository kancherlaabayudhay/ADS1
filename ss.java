
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class ss {
    public static void main(String[] args) {
       Queue <Integer> q = new LinkedList<>() ;
        q.offer(12);
        q.offer(13);
        q.offer(22);
        q.offer(33);
        q.offer(44);
        q.offer(55);
        q.offer(66);
        q.offer(77);
        q.offer(88);
        q.offer(99);
        System.out.println(q);
        Stack<Integer> s = new Stack<Integer>();
        while( q.size()>0){
            s.push(q.poll());
        }
        while (s.size()>0){
            q.offer(s.pop());
            System.out.println(q);
        }

  

       };
       
    
    
}
