package src.ss14;
import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        boolean validInput = false;

        // Nhập số thứ nhất
        while (!validInput) {
            System.out.print("Nhập số nguyên thứ nhất: ");
            try {
                number1 = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Giá trị không hợp lệ. Vui lòng nhập lại.");
        }
    }
        // Đặt lại biến để kiểm tra đầu vào thứ hai

        validInput = false;

        // Nhập số thứ hai
        while (!validInput) {
            System.out.print("Nhập số nguyên thứ hai: ");
            try {
                number2 = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Giá trị không hợp lệ. Vui lòng nhập lại.");
            }
        }

        // Tính tổng và hiển thị kết quả
        int sum = number1 + number2;
        System.out.println("Tổng của hai số là: " + sum);

        // Kết thúc chương trình
        scanner.close();
    }
}
