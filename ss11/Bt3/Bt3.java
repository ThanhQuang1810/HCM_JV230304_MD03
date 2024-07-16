package ss11.Bt3;

import java.util.*;

public class Bt3 {
    public static void main(String[] args) {
        // B1: Khai báo một HashMap và thêm các phần tử vào
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 5);
        hashMap.put("Two", 2);
        hashMap.put("Three", 8);
        hashMap.put("Four", 1);
        hashMap.put("Five", 6);
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());

entryList.sort((e1,e2)-> e1.getValue()-e2.getValue());
      for(Map.Entry<String, Integer> entry : entryList){
          System.out.println(entry.getKey() + ": " + entry.getValue());
      }


    }
}
