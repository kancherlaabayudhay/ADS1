import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Object> l1=new ArrayList<>();
        l1.add("VIKRANTH");
        l1.add("BHAKAR");
        l1.add("JITHYA");
        l1.add(23);
        l1.add(23.099);
        System.out.println("Name at index 0:" + l1.get(0));
         System.out.println(l1);
         l1.remove(2);
         System.out.println(l1);
         l1.set(1,"AJAY");
         System.out.println("Name of the list:"+l1);
         System.out.println("Name at the index1:" + l1.get(1));
         System.out.println("Name at index 4:"+l1.remove(4));
       


         }

    }

