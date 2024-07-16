package src.ss10.Bt6;

import java.util.LinkedList;
import java.util.Queue;

public class Bt6 {
    public static void main(String[] args) {
        int[] array = {3, 5, 2, 8, 6}; // Mảng đầu vào
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + findMinElement(array));
    }

    public static int findMinElement(int[] array) {
        Queue<Integer> queue = new LinkedList<>();

        // B2: Duyệt qua từng phần tử trong mảng và đưa chúng vào queue
        for (int num : array) {
            queue.add(num);
        }

        // B3: Lấy phần tử đầu tiên trong queue ra
        int minElement = queue.poll();

        // B4: So sánh phần tử đó với các phần tử khác trong queue
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            int current = queue.poll();
            if (current < minElement) {
                queue.add(minElement);
                minElement = current;
            } else {
                queue.add(current);
            }
        }

        return minElement;
    }
}
