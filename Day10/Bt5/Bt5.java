package Day10.Bt5;
import java.util.Stack;

public class Bt5 {
    public static void main(String[] args) {
        int[] array = {3, 5, 2, 8, 6}; // Mảng đầu vào
        System.out.println("Phần tử lớn nhất trong mảng là: " + findMaxElement(array));
    }

    public static int findMaxElement(int[] array) {
        Stack<Integer> stack = new Stack<>();

        // Duyệt qua từng phần tử trong mảng
        for (int num : array) {
            // Nếu stack rỗng hoặc phần tử đang xét lớn hơn phần tử trên đỉnh của stack
            if (stack.isEmpty() || num > stack.peek()) {
                stack.push(num);
            } else {
                // Ngược lại, lấy phần tử trên đỉnh của stack ra khỏi stack
                while (!stack.isEmpty() && stack.peek() > num) {
                    stack.pop();
                }
                stack.push(num);
            }
        }

        // Phần tử lớn nhất nằm trên đỉnh của stack
        return stack.peek();
    }
}