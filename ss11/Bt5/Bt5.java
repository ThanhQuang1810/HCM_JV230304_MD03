package ss11.Bt5;

import java.util.NavigableSet;
import java.util.TreeMap;

public class Bt5 {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7, 6};
        TreeMap<Integer,Integer>tree= new TreeMap<>();
        for(Integer e : array){
            tree.put(e, 0);
        }
        for (Integer key  : tree.keySet()){
            System.out.println("Key "+key );
        }

        System.out.println("Phần tử nhỏ nhất trong tree map : "+tree.firstKey());
        System.out.println("Phần tử lơn thứ 2 trong tree map : "+tree.lowerKey(tree.lastKey()));

        NavigableSet<Integer> integers =  tree.descendingKeySet();
        while (!integers.isEmpty()){
            System.out.println(integers.pollFirst());
        }
    }
}
// Random random = new Random();
//        List<Integer> randomList =
//                Stream.generate(() -> random.nextInt(50))
//                        .limit(50)
//                        .toList();// thuật toán random 100 số ngẫu nhiên từ 0- 1000