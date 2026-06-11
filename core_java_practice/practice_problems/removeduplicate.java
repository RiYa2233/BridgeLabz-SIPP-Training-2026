package practice_problems;
import java.util.HashMap;
import java.util.Map;

public class removeduplicate {
    public static void main(String[] args) {
        int[] arr={11,20,20,32,33,11};
        Map<Integer,Boolean> map=new HashMap<>();;
        for (int num : arr) {

            map.put(num, true);

        }
        for (int key : map.keySet()) {
            System.out.print(key + " ");
        }
    }
}
