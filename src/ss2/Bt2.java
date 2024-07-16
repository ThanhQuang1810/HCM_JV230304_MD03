package src.ss2;

import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số mà bạn muốn");
        int number = scanner.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Số vừa nhập đã chia hết cho 3 và 5");
        } else if (number % 3 == 0 && number % 5 != 0) {
            System.out.println("Số vừa nhập chỉ chia hết cho 3");
        } else if (number % 5 == 0 && number % 3 != 0) {
            System.out.println("Số vừa nhập chỉ chia hết cho 5");
        } else if (number % 3 != 0 && number % 5 != 0) {
            System.out.println("Số vừa nhập không chia hết cho 3 và 5");
        }
    }
}