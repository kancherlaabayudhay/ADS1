import java.util.PriorityQueue;
import java.util.Collections;

public class Priority2{
    public static void main(String[]args){
        PriorityQueue <Integer> pp= new PriorityQueue<Integer>(Collections.reverseOrder());
        pp.add(2);
        pp.add(9);
        pp.add(8);
        pp.add(34);
        System.out.println(pp);
    }
}