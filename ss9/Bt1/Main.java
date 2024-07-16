package ss9.Bt1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo một List số nguyên
        List<Integer> list1 = new ArrayList<>();

        // Yêu cầu người dùng nhập số lượng phần tử trong danh sách (tối đa 10 phần tử)
        System.out.print("Nhập số lượng phần tử trong danh sách (tối đa 10): ");
        int size = scanner.nextInt();

        // Giới hạn số lượng phần tử tối đa là 10
        size = Math.min(size, 10);

        // Nhập các phần tử vào danh sách
        System.out.println("Nhập các phần tử của danh sách:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            list1.add(scanner.nextInt());
        }

        // In list số nguyên ban đầu
        System.out.println("Danh sách ban đầu: " + list1);

        // Tìm và in ra phần tử có giá trị lớn nhất
        int maxElement = Collections.max(list1);
        System.out.println("Phần tử có giá trị lớn nhất: " + maxElement);

        // Đảo ngược vị trí các phần tử trong danh sách
        Collections.reverse(list1);
        System.out.println("Danh sách sau khi đảo ngược: " + list1);

        // Sắp xếp các phần tử trong danh sách theo giá trị tăng dần
        Collections.sort(list1);
        System.out.println("Danh sách sau khi sắp xếp tăng dần: " + list1);

        // Tạo một danh sách thứ hai và thêm một vài phần tử
        List<Integer> list2 = new ArrayList<>();
        list2.add(55);
        list2.add(23);
        list2.add(88);

        // Sao chép các phần tử trong danh sách 2 sang danh sách 1
        list1.addAll(list2);
        System.out.println("Danh sách sau khi sao chép từ danh sách 2: " + list1);


    }
}

