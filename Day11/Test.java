package Day11;


import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> customers = new HashMap<>();
        customers.put("John", 30);
        customers.put("Mike", 28);
        customers.put("Bill", 32);
        customers.put("Maria", 27);

        Set<String> keys = customers.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key + ": " + customers.get(key));
        }
//
//        System.out.println(customers);
//
//        for (Map.Entry<String,Integer> entry: customers.entrySet()){
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println("Key: " + key + ": " + value);
//        }
        System.out.println(customers.size());
        System.out.println("key is " + customers.containsKey("John"));
        System.out.println(customers.isEmpty());

        customers.remove("Maria");
        System.out.println(customers.size());
        System.out.println(customers.keySet());
        System.out.println(customers.values());


        System.out.println(customers.get("John"));
    }


}
