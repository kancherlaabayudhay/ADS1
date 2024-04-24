import java.util.PriorityQueue;

import java.util.Scanner;
import java.util.Collections;

public class Priority3 {
    public static void main(String[] args) {
        PriorityQueue <Integer> qe = new PriorityQueue<Integer> (Collections.reverseOrder());
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =0;i<n; i++){
            qe.offer(sc.nextInt());
            if (i<2){
                System.out.println(-1);
            }
            else{
                int first=qe.poll();
                int second=qe.poll();
                int third = qe.poll();
                int res = first*second*third;
                System.out.println(res);     
                qe.offer(first);
                qe.offer(second);
                qe.offer(third);
            }
       

        }
       
    }
    
}
