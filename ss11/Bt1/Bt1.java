package ss11.Bt1;

import java.util.HashMap;

public class Bt1 {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "apple", "orange", "banana", "apple"};

        HashMap<String, Integer> elementCountMap = new HashMap<>();
        for (String element : array) {
            if (elementCountMap.containsKey(element)) {
                elementCountMap.put(element, elementCountMap.get(element) + 1);
            } else {
                elementCountMap.put(element, 1);
            }
        }

        for (String key : elementCountMap.keySet()) {
            System.out.println(key + " xuất hiện " + elementCountMap.get(key) + " lần");
        }
    }
}
