package Day11.Bt4;

import java.util.HashMap;

public class Bt4 {
    public static void main(String[] args) {
        // Khai báo và khởi tạo HashMap gốc và tạo dữ liệu
        HashMap<String, String> originalMap = new HashMap<>();
        originalMap.put("1", "Java");
        originalMap.put("2", "Python");
        originalMap.put("3", "C++");
        originalMap.put("4", "JavaScript");

        // Khai báo một HashMap mới
        HashMap<String, String> newMap = new HashMap<>();

        // Sử dụng phương thức putAll() để sao chép tất cả các phần tử từ HashMap gốc vào HashMap mới
        newMap.putAll(originalMap);

        // Hiển thị HashMap gốc và HashMap mới
        System.out.println("Original HashMap: " + originalMap);
        System.out.println("New HashMap: " + newMap);

        // Kiểm tra xem phần tử có tồn tại trong HashMap hay không
        String keyToCheck = "2";
        boolean isKeyPresent = newMap.containsKey(keyToCheck);

        // In kết quả kiểm tra
        if (isKeyPresent) {
            System.out.println("Key \"" + keyToCheck + "\" exists in the HashMap.");
        } else {
            System.out.println("Key \"" + keyToCheck + "\" does not exist in the HashMap.");
        }

    }
}