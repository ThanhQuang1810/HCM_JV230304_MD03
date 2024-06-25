package Day11.Bt2;

import java.util.ArrayList;
import java.util.HashMap;

public class Bt2 {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "apple", "orange", "banana", "apple","minhanh"};

        HashMap<String, Integer> elementCountMap = new HashMap<>();
        for (String element : array) {
            if (elementCountMap.containsKey(element)) {
                elementCountMap.put(element, elementCountMap.get(element) + 1);
            } else {
                elementCountMap.put(element, 1);
            }
        }
        ArrayList<String> arr = new ArrayList<>();
        for (String key : elementCountMap.keySet()) {
            if (elementCountMap.get(key) == 1) {
               arr.add(key);
            }
        }
        System.out.println(arr);
    }
}