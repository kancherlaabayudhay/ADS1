import java.util.HashMap;
import java.util.Map;

public class an {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -1, 3, 2};
        int[] r = NonRepeating(arr);
        if (r.length == 0) {
            System.out.println("no repeating element.");
        } else {
            System.out.println(" non-repeating element is " + r[0]);
        }
    }

    public static int[] NonRepeating(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (int n : arr) {
            if (map.get(n) == 1) {
                return new int[]{n};
            }
        }

        return new int[0];
    }
}